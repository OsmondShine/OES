package com.exam.student.service;

import java.util.List;

import com.exam.student.model.Student;
import com.exam.student.model.Subject;

/*学生业务接口
 * 
 */
public interface IStudentService {
	//学生注册
	public Boolean add(Student student) throws Exception;
	//学生信息更新
	public Boolean update(Student student) throws Exception;
	//学生登录 
	public Student login(Student student) throws Exception;
	//依据学生主键查询所选科目
	public List<Subject> findAll(String pk) throws Exception;
	//依据学生主键和关键字查询科目
	public abstract List<Subject> findByName(String pk, String name) throws Exception;
	//依据主键查询学生
	public Student findByPrimaryKey(String pk) throws Exception;
	//依据主键删除所注册科目
	public abstract Boolean deleteSubject(String stuPk, String subPk) throws Exception;
}
