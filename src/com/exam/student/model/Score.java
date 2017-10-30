package com.exam.student.model;
/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 考生成绩实体类
 * @version 1.0
 */
public class Score {
	//主键ID
	private String fdId;
	//学生对象
	private Student student;
	//科目对象
	private Subject subject;
	//考试成绩
	private Integer fdScore;
	//备注
	private String fdRemark;
	
	public String getFdId() {
		return fdId;
	}
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Integer getFdScore() {
		return fdScore;
	}
	public void setFdScore(Integer fdScore) {
		this.fdScore = fdScore;
	}
	public String getFdRemark() {
		return fdRemark;
	}
	public void setFdRemark(String fdRemark) {
		this.fdRemark = fdRemark;
	}
	@Override
	public String toString() {
		return "主键ID：" + fdId + "	学生对象姓名：" + student.getFdName()
				+ "	成绩：" + fdScore + "	备注：" + fdRemark;
	}
	
	
}
