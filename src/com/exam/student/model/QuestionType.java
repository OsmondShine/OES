package com.exam.student.model;
/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 题型信息实体类
 * @version 1.0
 */
public class QuestionType {
	//主键ID
	private String fdId;
	//题型编号
	private String fdTypeId;
	//题型名称
	private String fdTypeName;
	
	public String getFdId() {
		return fdId;
	}
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}
	public String getFdTypeId() {
		return fdTypeId;
	}
	public void setFdTypeId(String fdTypeId) {
		this.fdTypeId = fdTypeId;
	}
	public String getFdTypeName() {
		return fdTypeName;
	}
	public void setFdTypeName(String fdTypeName) {
		this.fdTypeName = fdTypeName;
	}
	@Override
	public String toString() {
		return "主键：" + fdId + "	题型ID：" + fdTypeId
				+ "	题型名称：" + fdTypeName;
	}
	
	
}
