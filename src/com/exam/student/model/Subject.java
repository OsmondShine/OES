package com.exam.student.model;

import java.util.HashSet;
import java.util.Set;


/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 科目信息实体类
 * @version 1.0
 */
public class Subject {
	//主键ID
	private String fdId;
	//科目编号
	private String fdCno;
	//科目名称
	private String fdCname;
	//层级ID
	private String fdHierarchyId;
	//选择科目的学生
	private Set<Student> students = new HashSet<Student>();
	
	public Subject() {
		super();
	}
	
	/**
	 * @param fdId
	 * @param fdCno
	 * @param fdCname
	 * @param fdHierarchyId
	 * @param students
	 */
	public Subject(String fdId, String fdCno, String fdCname,
			String fdHierarchyId, Set<Student> students) {
		super();
		this.fdId = fdId;
		this.fdCno = fdCno;
		this.fdCname = fdCname;
		this.fdHierarchyId = fdHierarchyId;
	}

	public String getFdId() {
		return fdId;
	}

	public void setFdId(String fdId) {
		this.fdId = fdId;
	}

	public String getFdCno() {
		return fdCno;
	}

	public void setFdCno(String fdCno) {
		this.fdCno = fdCno;
	}

	public String getFdCname() {
		return fdCname;
	}

	public void setFdCname(String fdCname) {
		this.fdCname = fdCname;
	}

	public String getFdHierarchyId() {
		return fdHierarchyId;
	}

	public void setFdHierarchyId(String fdHierarchyId) {
		this.fdHierarchyId = fdHierarchyId;
	}
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "科目名：" + fdCname + ", 科目编号：" + fdCno + ", 层级ID：" + fdHierarchyId;
	}
	@Override
	//重写set中的equals方法
	public boolean equals(Object obj){
		Subject subject = (Subject)obj; 
		return subject.fdId == this.fdId && subject.fdCno == this.fdCno && subject.fdCname == this.fdCname && subject.fdHierarchyId == this.fdHierarchyId ;
		
	}
	//重写set中的hashCode方法
	public int hashCode(){
		return (this.fdId + this.fdCno + this.fdCname + this.fdHierarchyId).hashCode();
	}
}
