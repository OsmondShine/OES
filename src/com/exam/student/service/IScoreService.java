package com.exam.student.service;

import java.util.List;

import com.exam.student.model.Score;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 成绩业务接口
 * @version 1.0
 */

public interface IScoreService {
	//保存成绩
	public abstract Boolean add(Score score) throws Exception;
	//查询所有成绩
	public abstract List<Score> findAll() throws Exception;
	//依据关键字查询成绩
	public abstract List<Score> findByName(String kw) throws Exception;
	
	

}

