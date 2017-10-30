package com.exam.student.dao;

import java.util.List;

import com.exam.base.IBaseDao;
import com.exam.student.model.Subject;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-17
 * @description 科目管理DAO接口
 * @version 1.0
 */

public interface ISubjectDao extends IBaseDao<Subject>{
	//查询未选科目
	public List<Subject> findAll(String pk) throws Exception;
	//依据关键字查询
	public abstract List<Subject> findByName(String keyword) throws Exception;
}

