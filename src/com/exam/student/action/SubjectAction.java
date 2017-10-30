package com.exam.student.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.exam.student.model.Student;
import com.exam.student.model.Subject;
import com.exam.student.service.ISubjectService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-17
 * @description 科目操作ACTION
 * @version 1.0
 */

public class SubjectAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private ISubjectService subjectService;
	private String keywords;
	private Subject subject;
	private String param;

	public void setSubjectService(ISubjectService subjectService) {
		this.subjectService = subjectService;
	}

	public String delete(){
		try {
			//依据主键删除科目
			subjectService.delete(subject.getFdId());
			//获取当前登录用户信息
			Student student = (Student) ActionContext.getContext().getSession().get("student");
			//查询所有用户未注册的科目
			List<Subject>  subjectList2 = subjectService.findAll(student.getFdId());
			//查询结果添加到request域中
			ServletActionContext.getRequest().setAttribute("subjectList", subjectList2);
			//返回视图
			return "delete";
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return NONE;
	}
	public String findSubjectList(){
		List<Subject> subjectList;
		Student student = (Student) ActionContext.getContext().getSession().get("student");
		
		try {
			//依据页面所传关键字查询，若关键字为空则全查
			if ("".equals(keywords.trim()) || null ==keywords){
				subjectList = subjectService.findAll(student.getFdId());
				
			}else {
				//若关键字不为空，则依据关键字查询
				subjectList = subjectService.findByName(keywords);
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

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public void setParam(String param) {
		this.param = param;
	}
}

