package com.exam.student.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.exam.student.dao.INoticeDao;
import com.exam.student.model.Notice;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 考试通知DAO实现
 * @version 1.0
 */

public class NoticeDaoImp extends HibernateDaoSupport implements INoticeDao {
	
	@SuppressWarnings("unchecked")
	public List<Notice> findByName(String kw) throws Exception {
		String hql = "from Notice notice where notice.fdNoticeTitle like :fdNoticeTitle";
		Query query = getSessionFactory().openSession().createQuery(hql);
		query.setParameter("fdNoticeTitle", "%"+kw+"%");
		
		return (List<Notice>) query.list();
	}
	public Notice findByPrimaryKey(String pk) throws Exception {
		String hql = "from Notice notice where notice.fdNoticeId =:fdNoticeId";
		Query query = getSessionFactory().openSession().createQuery(hql);
		
		return (Notice) query.setParameter(0, pk);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findAll() throws Exception {
		String hql = "from Notice";
		Query query = getSessionFactory().openSession().createQuery(hql);
		
		return (List<Notice>) query.list();
	}
}

