package com.exam.student.service;

import java.util.List;

import com.exam.student.model.Subject;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-17
 * @description 科目管理业务接口
 * @version 1.0
 */

public interface ISubjectService {
	//删除指定科目
	public abstract Boolean delete(String fdId) throws Exception;
	//查询所有科目
	public abstract List<Subject> findAll(String pk) throws Exception;
	//依据主键查询科目
	public abstract Subject findByPrimaryKey(String pk) throws Exception;
	//依据关键字查询科目
	public abstract List<Subject> findByName(String keyword) throws Exception;
}

