package com.exam.student.dao;

import java.util.List;

import com.exam.base.IBaseDao;
import com.exam.student.model.Score;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 成绩DAO接口
 * @version 1.0
 */

public interface IScoreDao extends IBaseDao<Score>{
	//查询所有成绩
	public abstract List<Score> findAll() throws Exception;
	//依据关键字查询成绩
	public abstract List<Score> findByName(String kw) throws Exception;
	//依据主键查询成绩
	public abstract Score findByPrimaryKey(String pk) throws Exception;

}

