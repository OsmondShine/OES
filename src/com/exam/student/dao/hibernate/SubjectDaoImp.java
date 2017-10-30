package com.exam.student.dao.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.exam.base.BaseDaoImp;
import com.exam.student.dao.ISubjectDao;
import com.exam.student.model.Subject;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-17
 * @description 
 * @version 1.0
 */

public class SubjectDaoImp extends BaseDaoImp<Subject> implements ISubjectDao{

	@SuppressWarnings("unchecked")
	public List<Subject> findAll(String pk) {
		String sql = "select * from subject where fd_id not in (select subject_id from student_subject where student_id = ?);";
		Query query = getSession().createSQLQuery(sql).addEntity(Subject.class);
		query.setParameter(0, pk);
		return query.list();
	}

	@Override
	public List<Subject> findByName(String keyword) throws Exception {
		String hql = "from Subject sub where sub.fdCname like :fdCname";
		Query query = getSessionFactory().openSession().createQuery(hql);
		query.setParameter("fdCname", "%"+keyword+"%");
		
		return (List<Subject>) query.list();
	}
}

