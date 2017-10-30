package com.exam.student.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 学生信息实体类
 * @version 1.0
 */

public class Student {
	//主键ID
	private String fdId;
	//学号
	private String fdSno;
	//姓名
	private String fdName;
	//密码
	private String fdPassword;
	//专业班级
	private String fdClass;
	//性别
	private String fdSexuality;
	//权限级别
	private Integer fdRight;
	//所选科目
	private Set<Subject> fdSelectedSubjects = new HashSet<Subject>();
	
	public String getFdId() {
		return fdId;
	}
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}
	public Student() {
		super();
	}
	public String getFdSno() {
		return fdSno;
	}
	public void setFdSno(String fdSno) {
		this.fdSno = fdSno;
	}
	public String getFdName() {
		return fdName;
	}
	public void setFdName(String fdName) {
		this.fdName = fdName;
	}
	public String getFdPassword() {
		return fdPassword;
	}
	public void setFdPassword(String fdPassword) {
		this.fdPassword = fdPassword;
	}
	public String getFdClass() {
		return fdClass;
	}
	public void setFdClass(String fdClass) {
		this.fdClass = fdClass;
	}
	public String getFdSexuality() {
		return fdSexuality;
	}
	public void setFdSexuality(String fdSexuality) {
		this.fdSexuality = fdSexuality;
	}
	public Integer getFdRight() {
		return fdRight;
	}
	public void setFdRight(Integer fdRight) {
		this.fdRight = fdRight;
	}
	public Set<Subject> getFdSelectedSubjects() {
		return fdSelectedSubjects;
	}
	public void setFdSelectedSubjects(Set<Subject> fdSelectedSubjects) {
		this.fdSelectedSubjects = fdSelectedSubjects;
	}
	@Override
	public String toString() {
		return "学号：" + fdSno +"	姓名：" + fdName +"	密码：" +fdPassword + "	专业班级：" + fdClass + "	性别：" + fdSexuality + "	权限级别：" + fdRight + "	所选科目：" + fdSelectedSubjects;
	}
	//重写set中的equals方法
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
//	@Override
//	public boolean equals(Object obj) {
//		Student student = (Student)obj;
//		return this.fdId == student.fdId && this.fdName == student.fdName && this.fdClass == student.fdClass && this.fdPassword == student.fdPassword && this.fdPassword 
//	}
	
	
}
