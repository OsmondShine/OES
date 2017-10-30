package com.exam.student.model;

import java.sql.Time;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 试卷记录实体类
 * @version 1.0
 */

public class Record {
	//主键ID
	private String fdId;
	//试卷编号
	private String fdPno;
	//试卷名称
	private String fdPname;
	//考试时间
	private Time fdTime;
	//题型
	private QuestionType questionType;
	//出卷教师
	private Teacher teacher;
	//试题分值
	private Integer fdScore;
	//试题总数
	private Integer fdNums;
	//简单题数
	private Integer fdEasyNums;
	//中难题数
	private Integer fdMiddNums;
	//难题数
	private Integer fdDiffNums;
	
	public String getFdId() {
		return fdId;
	}
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}
	public String getFdPno() {
		return fdPno;
	}
	public void setFdPno(String fdPno) {
		this.fdPno = fdPno;
	}
	public String getFdPname() {
		return fdPname;
	}
	public void setFdPname(String fdPname) {
		this.fdPname = fdPname;
	}
	public Time getFdTime() {
		return fdTime;
	}
	public void setFdTime(Time fdTime) {
		this.fdTime = fdTime;
	}
	public QuestionType getQuestionType() {
		return questionType;
	}
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Integer getFdScore() {
		return fdScore;
	}
	public void setFdScore(Integer fdScore) {
		this.fdScore = fdScore;
	}
	public Integer getFdNums() {
		return fdNums;
	}
	public void setFdNums(Integer fdNums) {
		this.fdNums = fdNums;
	}
	public Integer getFdEasyNums() {
		return fdEasyNums;
	}
	public void setFdEasyNums(Integer fdEasyNums) {
		this.fdEasyNums = fdEasyNums;
	}
	public Integer getFdMiddNums() {
		return fdMiddNums;
	}
	public void setFdMiddNums(Integer fdMiddNums) {
		this.fdMiddNums = fdMiddNums;
	}
	public Integer getFdDiffNums() {
		return fdDiffNums;
	}
	public void setFdDiffNums(Integer fdDiffNums) {
		this.fdDiffNums = fdDiffNums;
	}
}
