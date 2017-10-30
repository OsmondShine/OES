package com.exam.student.service.spring;

import com.exam.student.dao.ITeacherDao;
import com.exam.student.model.Teacher;
import com.exam.student.service.ITeacherService;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-27
 * @description 
 * @version 1.0
 */

public class TeacherServiceImp implements ITeacherService{

	private ITeacherDao teacherDao;
	
	@Override
	public Teacher login(Teacher teacher) throws Exception {
		return (Teacher) teacherDao.login(teacher);
	}

	public ITeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(ITeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
}

