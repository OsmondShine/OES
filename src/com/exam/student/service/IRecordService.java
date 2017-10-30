package com.exam.student.service;

import java.util.List;

import com.exam.student.model.Record;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 试卷记录业务接口
 * @version 1.0
 */

public interface IRecordService {
	//删除试卷记录
	public abstract boolean add(Record record) throws Exception;
	//删除试卷记录
	public abstract boolean delete(String pk) throws Exception;
	//查询所有试卷记录
	public abstract List<Record> findAll() throws Exception;
	//依据主键查询试卷记录
	public abstract Record findByPrimaryKey(String pk) throws Exception;
	//依据关键字查询试卷记录
	public abstract List<Record> findByName(String kw) throws Exception;

}

