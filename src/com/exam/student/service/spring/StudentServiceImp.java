package com.exam.student.service.spring;

import java.util.List;

import com.exam.student.dao.IStudentDao;
import com.exam.student.model.Student;
import com.exam.student.model.Subject;
import com.exam.student.service.IStudentService;
/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 学生信息业务实现
 * @version 1.0
 */
public class StudentServiceImp implements IStudentService{
	private IStudentDao studentDao;

	public void setStudentDao(IStudentDao studentDao)throws Exception {
		this.studentDao = studentDao;
	}
	//注册 
	@Override
	public Boolean add(Student student)throws Exception {
		studentDao.add(student);
		return true;
	}
	//学生修改信息
	@Override
	public Boolean update(Student student) throws Exception {
		studentDao.update(student);
		return true;
	}
	
	@Override
	public Student login(Student student)throws Exception {
		System.out.println("StudentServiceImp 中的 login方法执行了！");
		return studentDao.login(student);
	}

	@Override
	public List<Subject> findAll(String pk) throws Exception {
		return studentDao.findAll(pk);
	}
	@Override
	public Student findByPrimaryKey(String pk)throws Exception {
		studentDao.findByPrimaryKey(pk);
		return null;
	}

	@Override
	public List<Subject> findByName(String pk, String name) throws Exception {
		return studentDao.findByName(pk, name);
	}

	@Override
	public Boolean deleteSubject(String stuPk, String subPk) throws Exception {
		return studentDao.deleteSubject(stuPk,subPk);
	}
}
