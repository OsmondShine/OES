package com.exam.student.model;
/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 试题信息实体类
 * @version 1.0
 */
public class QuestionBank {
	//主键ID
	private String fdId;
	//试题编号
	private String fdQno;
	//题型
	private QuestionType questionType;
	//试题难度
	private Integer fdDifficulty;
	//题干
	private String fdQuestion;
	//试题内容
	private String fdContent;
	//标准答案
	private String fdAnswer;
	//试题分数
	private Integer fdScore;
	
	public String getFdId() {
		return fdId;
	}
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}
	public String getFdQno() {
		return fdQno;
	}
	public void setFdQno(String fdQno) {
		this.fdQno = fdQno;
	}
	public QuestionType getQuestionType() {
		return questionType;
	}
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}
	public Integer getFdDifficulty() {
		return fdDifficulty;
	}
	public void setFdDifficulty(Integer fdDifficulty) {
		this.fdDifficulty = fdDifficulty;
	}
	public String getFdQuestion() {
		return fdQuestion;
	}
	public void setFdQuestion(String fdQuestion) {
		this.fdQuestion = fdQuestion;
	}
	public String getFdContent() {
		return fdContent;
	}
	public void setFdContent(String fdContent) {
		this.fdContent = fdContent;
	}
	public String getFdAnswer() {
		return fdAnswer;
	}
	public void setFdAnswer(String fdAnswer) {
		this.fdAnswer = fdAnswer;
	}
	public Integer getFdScore() {
		return fdScore;
	}
	public void setFdScore(Integer fdScore) {
		this.fdScore = fdScore;
	}
	@Override
	public String toString() {
		return "主键：" + fdId + "	试题编号：" + fdQno
				+ "	试题类型：" + questionType + "	试题难度："
				+ fdDifficulty + "	题干：" + fdQuestion + "	试题内容："
				+ fdContent + "	试题答案：" + fdAnswer + " 试题分值：" + fdScore;
	}
}
