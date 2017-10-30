package com.exam.base;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.exam.student.model.PageBean;
import com.exam.util.GenericsUtils;
import com.exam.util.QueryHelper;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-21
 * @description 
 * @version 1.0
 */

public class BaseDaoImp<T> extends HibernateDaoSupport implements IBaseDao<T> {
	protected Class className;
	protected Class getClassName(){
		className = GenericsUtils.getSuperClassGenricType(getClass());
		return className;
	}
	
	public Session getSession(){
		return getSessionFactory().getCurrentSession();
	}
	public void closeSession(){
		getSession().close();
	}
	public void add(T t) {
		getHibernateTemplate().save(t);
	}
	public T findByPrimaryKey(String pk) {
		System.out.println("findByPrimaryKey所用session:" + getSession());
		T t = (T) getSession().get(getClassName(), pk);
		return t;
	}
	public void delete(String pk) {
		Object obj = findByPrimaryKey(pk);
		if (obj != null){
			getSession().delete(obj);
		}
	}
	public void update(T t) {
		getSession().merge(t);
	}


	public List<T> findAll() {
		System.out.println(getClassName().getSimpleName());
		String hql = "from " + getClassName().getSimpleName();
		List<T> list = getSession().createQuery(hql).list();
		return list;
	}
	public List<T> findByPrimaryKeys(String[] pks) {
		String hql = "from " + getClassName().getSimpleName() + "where id in(:ids)";
		Query query = getSession().createQuery(hql);
		query.setParameter("ids", pks);
		List<T> list = query.list();
		return list;
	}
	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		System.out.println("-------> DaoSupportImpl.getPageBean( int pageNum, int pageSize, QueryHelper queryHelper )");
			// 参数列表
			List<Object> parameters = queryHelper.getParameters();
			// 查询本页的数据列表
			Query listQuery = getSession().createQuery(queryHelper.getListQueryHql()); // 创建查询对象
			if (parameters != null) { // 设置参数
				for (int i = 0; i < parameters.size(); i++) {
					listQuery.setParameter(i, parameters.get(i));
				}
			}
			listQuery.setFirstResult((pageNum - 1) * pageSize);
			listQuery.setMaxResults(pageSize);
			List list = listQuery.list(); // 执行查询
			// 查询总记录数量
			Query countQuery = getSession().createQuery(queryHelper.getCountQueryHql());
			if (parameters != null) { // 设置参数
				for (int i = 0; i < parameters.size(); i++) {
					countQuery.setParameter(i, parameters.get(i));
				}
			}
			Long count = (Long) countQuery.uniqueResult(); // 执行查询
			System.out.println(pageNum);
			System.out.println(pageSize);
			System.out.println(count.intValue());

			return new PageBean(pageNum, pageSize, count.intValue(), list);
	}
}

