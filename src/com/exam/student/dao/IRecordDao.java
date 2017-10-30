package com.exam.student.dao;

import java.util.List;

import com.exam.base.IBaseDao;
import com.exam.student.model.Record;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 试卷记录DAO接口
 * @version 1.0
 */

public interface IRecordDao extends IBaseDao<Record>{
	//依据关键字查询试卷记录
	public abstract List<Record> findByName(String kw) throws Exception;
}

