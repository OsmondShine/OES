package com.exam.student.dao;

import java.util.List;

import com.exam.base.IBaseDao;
import com.exam.student.model.Student;
import com.exam.student.model.Subject;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 学生DAO接口
 * @version 1.0
 */

public interface IStudentDao extends IBaseDao<Student>{
	//学生登录
	public abstract Student login(Student student) throws Exception;
	//依据学生主键查询所选科目
	public abstract List<Subject> findAll(String pk) throws Exception;
	//依据学生主键和关键字查询科目
	public abstract List<Subject> findByName(String pk, String name) throws Exception;
	//依据主键删除所注册科目
	public abstract Boolean deleteSubject(String stuPk, String subPk) throws Exception;
}
