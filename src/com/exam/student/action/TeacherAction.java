package com.exam.student.action;

import com.exam.student.model.Teacher;
import com.exam.student.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-27
 * @description 
 * @version 1.0
 */

public class TeacherAction extends ActionSupport{
	private Teacher teacher;
	private ITeacherService teacherService;

	public void setTeacherService(ITeacherService teacherService) {
		this.teacherService = teacherService;
	}

	private String login() {
		try {
			teacherService.login(teacher);
			return "login";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return NONE;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}

