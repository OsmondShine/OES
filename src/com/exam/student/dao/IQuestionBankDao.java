package com.exam.student.dao;

import java.util.List;

import com.exam.base.IBaseDao;
import com.exam.student.model.QuestionBank;
import com.exam.student.model.Record;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 题库DAO接口
 * @version 1.0
 */

public interface IQuestionBankDao extends IBaseDao<QuestionBank>{
	//查询所有试题
	public abstract List<QuestionBank> findAll() throws Exception;
	//依据关键字查询试题
	public abstract List<QuestionBank> findByName(Record record) throws Exception;
	//依据主键查询试题
	public abstract QuestionBank findByPrimaryKey(String pk) throws Exception;

}

