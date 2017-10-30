package com.exam.student.service.spring;

import java.util.List;

import com.exam.student.dao.ISubjectDao;
import com.exam.student.model.Subject;
import com.exam.student.service.ISubjectService;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-17
 * @description 
 * @version 1.0
 */

public class SubjectServiceImp implements ISubjectService {
	private ISubjectDao subjectDao;
	
	public void setSubjectDao(ISubjectDao subjectDao) {
		this.subjectDao = subjectDao;
	}

	@Override
	public Boolean delete(String fdId) throws Exception {
		subjectDao.delete(fdId);
		return true;
	}

	public List<Subject> findAll(String pk) throws Exception {
		return subjectDao.findAll(pk);
	}

	@Override
	public Subject findByPrimaryKey(String pk) throws Exception {
		return subjectDao.findByPrimaryKey(pk);
	}

	@Override
	public List<Subject> findByName(String keyword) throws Exception {
		return subjectDao.findByName(keyword);
	}
}

