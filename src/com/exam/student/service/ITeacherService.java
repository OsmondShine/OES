package com.exam.student.service;

import com.exam.student.model.Teacher;

/*学生业务接口
 * 
 */
public interface ITeacherService {

	//教师登录 
	public abstract Teacher login(Teacher teacher) throws Exception;
}
