package com.exam.student.model;
/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 教师信息实体类
 * @version 1.0
 */
public class Teacher {
	//主键ID
	private String fdId;
	//教师编号
	private String fdTno;
	//教师名称
	private String fdName;
	//密码
	private String fdPassword;
	//性别
	private Integer fdSexuality;
	//权限级别
	private Integer fdRight;
	
	public String getFdId() {
		return fdId;
	}
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}
	public String getFdTno() {
		return fdTno;
	}
	public void setFdTno(String fdTno) {
		this.fdTno = fdTno;
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
	public Integer getFdSexuality() {
		return fdSexuality;
	}
	public void setFdSexuality(Integer fdSexuality) {
		this.fdSexuality = fdSexuality;
	}
	public Integer getFdRight() {
		return fdRight;
	}
	public void setFdRight(Integer fdRight) {
		this.fdRight = fdRight;
	}
}
