package com.exam.student.dao;

import com.exam.student.model.Teacher;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-27
 * @description 
 * @version 1.0
 */

public interface ITeacherDao {
	//教师登录
	public abstract Teacher login(Teacher teacher) throws Exception;

}

