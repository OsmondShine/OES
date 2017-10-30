package com.exam.student.action;

import java.util.List;
import java.util.Set;

import javax.jws.WebMethod;

import org.apache.struts2.ServletActionContext;

import com.exam.student.model.Student;
import com.exam.student.model.Subject;
import com.exam.student.service.IStudentService;
import com.exam.student.service.ISubjectService;
import com.exam.util.SecurityUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 学生ACTION 模型驱动用法，接收不到参数？
 * @version 1.0
 */

public class StudentAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private IStudentService studentService;
	private ISubjectService subjectService;
	private Student student = new Student();
	private String subjectChecked;
	private String keywords;
	private Subject subject;
	private String param;

	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}
	public void setSubjectService(ISubjectService subjectService) {
		this.subjectService = subjectService;
	}

	/*注册考试科目*/
	public String addSubjects(){
		try {
			
			//依据用户所选择的科目主键查询对应的科目信息
			Subject subject = subjectService.findByPrimaryKey(subjectChecked);
			//获取当前session中的学生信息
			Student student =  (Student) ActionContext.getContext().getSession().get("student");
			//获取当前所选科目
			Set<Subject> set = student.getFdSelectedSubjects();
			//将set中不含的科目加入
			if(!set.contains(subject)){
	  			set.add(subject);
			}
			student.setFdSelectedSubjects(set);
			studentService.update(student);
			return "addSubjects";
		} catch (Exception e) {
			System.out.println("添加科目失败！");
			e.printStackTrace();
		}
		return NONE;
	}
	/*学生注册基本信息*/
	public String register() {
		try {
			//获取密码并使用MD5进行加密
			String pwd = SecurityUtil.jdkMD5(student.getFdPassword());
			//将密文设入密码
			student.setFdPassword(pwd);
			studentService.add(this.student);
			return "register";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return NONE;
	}
	/*学生修改基本信息*/
	public String update(){
		try {
			//获取密码并使用MD5进行加密
			String pwd = SecurityUtil.jdkMD5(student.getFdPassword());
			//将密文设入密码
			student.setFdPassword(pwd);
			studentService.update(student);
			return "update";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return NONE;
	}
	/*学生登录*/
	@WebMethod
	public String login(){
		try {
			//获取密码并使用MD5进行加密
			String pwd = SecurityUtil.jdkMD5(student.getFdPassword());
			//将密文设入密码
			student.setFdPassword(pwd);
			student = studentService.login(student);
			if (student != null){
				ActionContext.getContext().getSession().put("student", student);
				return "login";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "loginFailure";
	}
	/*学生退出登录*/
	public String deleteSession(){
		try {
			ActionContext.getContext().getSession().remove("student");
			return "logout";
		} catch (Exception e) {
			System.out.println("session为空！");
			e.printStackTrace();
		}
		return NONE;
	}
	/*学生修改信息查询*/
	public String preUpdate(){
		try {
			student = studentService.findByPrimaryKey(student.getFdId());
			
			return "preUpdate";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return NONE;
	}
	public String deleteSubject(){
		try {
			studentService.deleteSubject(student.getFdId(),subject.getFdId());
			String path = findSubjectList();
			return path;
//			return "deleteSubject";
		} catch (Exception e) {
			System.out.println("删除科目失败！");
			e.printStackTrace();
		}
		return NONE;
	}
	public String findSubjectList(){
		List<Subject> subjectList = null;

		try {
			//依据页面所传关键字查询，若关键字为空则全查
			if ("".equals(keywords.trim()) || null ==keywords){
				subjectList = studentService.findAll(student.getFdId());
				
			}else {
				//若关键字不为空，则依据关键字查询
				subjectList = studentService.findByName(student.getFdId(), keywords);
			}
			ServletActionContext.getRequest().setAttribute("subjectList", subjectList);
			//依据页面链接的参数确定返回的视图
			if ("find".equals(param)){
				return "findList";
			}else {
				return "findAdd";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return NONE;
	}

	public void setSubjectChecked(String subjectChecked) {
		this.subjectChecked = subjectChecked;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
