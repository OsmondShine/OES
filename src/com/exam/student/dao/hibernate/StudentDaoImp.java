package com.exam.student.dao.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.exam.base.BaseDaoImp;
import com.exam.student.dao.IStudentDao;
import com.exam.student.model.Student;
import com.exam.student.model.Subject;

public class StudentDaoImp extends BaseDaoImp<Student> implements IStudentDao{
	
	public Student login(Student student) throws Exception {
		String hql = "from Student student where student.fdSno = ? and student.fdPassword = ?";
		Query query = null;
	
		query = getSessionFactory().openSession().createQuery(hql);
		query.setParameter(0, student.getFdSno());
		query.setParameter(1, student.getFdPassword());
			
		return (Student) query.uniqueResult();
	}
	
	@Override
	public void update(Student student) {
		String sql = "delete from student_subject where student_id = ?";
		Query query = getSession().createSQLQuery(sql);
		query.setParameter(0, student.getFdId());
		query.executeUpdate();
		super.update(student);
	}
	public List<Subject> findAll(String pk) {
		String hql = "select fdSelectedSubjects from Student student where student.fdId =:fdId";
		Query query = getSession().createQuery(hql);
		System.out.println("当前学生主键：" + pk);
		query.setParameter("fdId", pk);
		return query.list();
	}

	@Override
	//使用hibernate中的SQL查询
	public List<Subject> findByName(String pk, String name) throws Exception {
		String sql = " select * from subject sub inner join student_subject stu_sub on sub.fd_id= stu_sub.subject_id where stu_sub.student_id = ? and stu.fd_cname like ? ";
		Query query = getSession().createSQLQuery(sql).addEntity(Subject.class);
		query.setParameter(0, pk);
		query.setParameter(1, "%" + name + "%");
		List<Subject> list = query.list();
		return list;
	}


	public Boolean deleteSubject(String stuPk, String subPk) throws Exception {
		String sql = "delete from student_subject where student_id = ? and subject_id = ?;";
		Query query = getSession().createSQLQuery(sql);
		query.setParameter(0, stuPk);
		query.setParameter(1, subPk);
		query.executeUpdate();
		return true;
	}
}
