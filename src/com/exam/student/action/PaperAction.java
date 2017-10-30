package com.exam.student.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.exam.student.model.QuestionBank;
import com.exam.student.model.Record;
import com.exam.student.model.Score;
import com.exam.student.model.Student;
import com.exam.student.service.INoticeService;
import com.exam.student.service.IQuestionBankService;
import com.exam.student.service.IRecordService;
import com.exam.student.service.IScoreService;
import com.exam.student.service.ISubjectService;
import com.exam.util.GenerateQuestionUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 本类主要用于生成试卷、判卷、保存成绩
 * @version 1.0
 */

public class PaperAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private INoticeService noticeService;
	private IRecordService recordService;
	private IQuestionBankService questionBankService;
	private IScoreService scoreService;
	private ISubjectService subjectService;
	private Record record;

	public void setNoticeService(INoticeService noticeService) {
		this.noticeService = noticeService;
	}
	public void setRecordService(IRecordService recordService) {
		this.recordService = recordService;
	}
	public void setQuestionBankService(IQuestionBankService questionBankService) {
		this.questionBankService = questionBankService;
	}
	public void setScoreService(IScoreService scoreService) {
		this.scoreService = scoreService;
	}
	public void setSubjectService(ISubjectService subjectService) {
		this.subjectService = subjectService;
	}
	@SuppressWarnings("unused")
	//生成试卷
	public String createNewPaper(){
		try {
			//依据试卷编号查询试卷记录集
			List<Record> recordList = recordService.findByName(record.getFdPno());
			//gquList用于保存组织后的选择题(保存当前试卷信息，当前只有选择题)
			List<GenerateQuestionUtil> gquList = new ArrayList<GenerateQuestionUtil>();
			//qbList用于保存每次抽取的试题
			List<QuestionBank> qbList = new ArrayList<QuestionBank>();
			//qbLists用于保存每次抽取的试题列表
			List<List<QuestionBank>> qbLists = new ArrayList<List<QuestionBank>>();
			//循环试卷记录列表，依据记录抽取试题
			for (Record record: recordList){
				qbList = questionBankService.findByName(record);
				qbLists.add(qbList);
			}
			//循环遍历试题列表集合
			for (List<QuestionBank> lists:qbLists){
				//循环试题列表，组织选择题(当前默认只有选择题)
				for (QuestionBank list :qbList){
					//创建选择题封装对象
					GenerateQuestionUtil gqu = new GenerateQuestionUtil();
					//重新封装试题编号
					gqu.setFdQno(list.getFdQno());
					//重新封装试题题干
					gqu.setQuestion(list.getFdQuestion());
					//重新封装试题分值
					gqu.setScore(list.getFdScore());
					//重新封装试题标准答案
					gqu.setStandardAnswer(list.getFdAnswer());
					//将所得选择题内容以&分割
					String[] options = list.getFdContent().split("&");
					//重新封装选择题选项ABCD
					gqu.setOptionA(options[0]);
					gqu.setOptionB(options[1]);
					gqu.setOptionC(options[2]);
					gqu.setOptionD(options[3]);
					//将封装对象存入列表
					gquList.add(gqu);
				}
			}
			//将列表存入request域中
			ServletActionContext.getRequest().setAttribute("record", recordList.get(0));
			//将试卷信息存入session，以便于后期系统判卷
			ActionContext.getContext().getSession().put("gquList", gquList);
			//返回视图
			return "createNewPaper";
		} catch (Exception e) {
			System.out.println("创建试卷失败！");
			e.printStackTrace();
		}
		return NONE;
	}
	//交卷 自动判卷 统分 保存成绩信息
	public String handIn() {
		@SuppressWarnings("unchecked")
		//获取当前试卷信息
		List<GenerateQuestionUtil> gquList = (List<GenerateQuestionUtil>) ActionContext.getContext().getSession().get("gquList");
		//获取试卷名称
		String recordFdPname = ServletActionContext.getRequest().getParameter("recordFdPname");
		HttpServletRequest request = ServletActionContext.getRequest();
		//定义成绩变量，用于保存成绩
		Score score = new Score();
		//定义统分器
		int counter =0;
		//循环遍历试卷列表
		for (GenerateQuestionUtil gqul: gquList){
			//获取学生答案
			String stuAnswer = request.getParameter("option" + gqul.getFdQno());
			//将学生答案与标准答案比对
			if (gqul.getStandardAnswer().equals(stuAnswer)){
				counter += gqul.getScore();
			}
		}
		//将学生信息保存到成绩中
		score.setStudent(getCurrentUser());
		//保存试卷名
		score.setFdRemark(recordFdPname);
		//保存试卷得分
		score.setFdScore(counter);
		try {
			//保存成绩
			scoreService.add(score);	
		} catch (Exception e) {
			System.out.println("保存成绩失败！");
			e.printStackTrace();
		}
		return "handIn";
	}
	
	public void setRecord(Record record) {
		this.record = record;
	}
	//获取当前登录用户
	private Student getCurrentUser(){
		return (Student) ActionContext.getContext().getSession().get("student");
	}
}

