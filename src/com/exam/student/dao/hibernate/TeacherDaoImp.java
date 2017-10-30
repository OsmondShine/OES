package com.exam.student.dao.hibernate;

import org.hibernate.Query;

import com.exam.base.BaseDaoImp;
import com.exam.student.dao.ITeacherDao;
import com.exam.student.model.Teacher;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-27
 * @description 
 * @version 1.0
 */

public class TeacherDaoImp extends BaseDaoImp<Teacher> implements ITeacherDao {

	@Override
	public Teacher login(Teacher teacher) throws Exception {
		String hql = "from Teacher t where t.fdTno = ? and t.fdPassword = ?";
		Query query = getSessionFactory().openSession().createQuery(hql);
		query.setParameter(0, teacher.getFdTno());
		query.setParameter(1, teacher.getFdPassword());
			
		return (Teacher) query.uniqueResult();
	}

}

