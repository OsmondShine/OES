package com.exam.student.service;

import java.util.List;

import com.exam.student.model.Notice;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 
 * @version 1.0
 */

public interface INoticeService {
	//查询所有通知
	public abstract List<Notice> findAll() throws Exception;
	//依据主键查询通知
	public abstract Notice findByPrimaryKey(String pk) throws Exception;
	//依据关键字查询
	public abstract List<Notice> findByName(String kw) throws Exception;

}

