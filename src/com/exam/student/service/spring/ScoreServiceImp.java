package com.exam.student.service.spring;

import java.util.List;

import com.exam.student.dao.IScoreDao;
import com.exam.student.model.Score;
import com.exam.student.service.IScoreService;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 
 * @version 1.0
 */

public class ScoreServiceImp implements IScoreService {
	private IScoreDao scoreDao;

	public void setScoreDao(IScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public Boolean add(Score score) throws Exception {
		scoreDao.add(score);
		return true;
	}
	
	@Override
	public List<Score> findAll() throws Exception {
		return scoreDao.findAll();
	}

	@Override
	public List<Score> findByName(String kw) throws Exception {
		return scoreDao.findByName(kw);
	}
}

