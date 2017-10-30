package com.exam.util;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-29
 * @description 用于将从数据库抽取的选择题的题干和选项对应上
 * @version 1.0
 */

public class GenerateQuestionUtil {
	//试题编号
	private String fdQno;
	//题干
	private String question;
	//试题分值
	private int score;
	//A选项
	private String optionA;
	//B选项
	private String optionB;
	//C选项
	private String optionC;
	//D选项
	private String optionD;
	//标准答案
	private String standardAnswer;
	
	public String getFdQno() {
		return fdQno;
	}
	public void setFdQno(String fdQno) {
		this.fdQno = fdQno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getStandardAnswer() {
		return standardAnswer;
	}
	public void setStandardAnswer(String standardAnswer) {
		this.standardAnswer = standardAnswer;
	}
	@Override
	public String toString() {
		return "题干：" + question + "	"
				+ optionA + "	" + optionB + "	" + optionC
				+ "	" + optionD;
	}
}

