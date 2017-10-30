package com.exam.student.dao.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.exam.base.BaseDaoImp;
import com.exam.student.dao.IRecordDao;
import com.exam.student.model.Record;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 试卷记录DAO实现
 * @version 1.0
 */

public class RecordDaoImp extends BaseDaoImp<Record> implements IRecordDao {
	/* (non-Javadoc)
	 * @see com.exam.base.BaseDaoImp#delete(java.lang.String)
	 */
	@Override
	public void delete(String pk) {
		String hql = "delete from Record r where r.fdId =?";
		Query query = getSession().createQuery(hql);
		query.setString(0, pk);
		query.executeUpdate();
		return;
	}

	/* (non-Javadoc)
	 * @see com.exam.student.dao.IRecordDao#findByName(java.lang.String)
	 */
	@Override
	public List<Record> findByName(String kw) throws Exception {
		String sql = "select * from record where fd_pno like ? or fd_pname like ?";
		Query query = getSession().createSQLQuery(sql).addEntity(Record.class);
		query.setParameter(0, "%"+kw+"%");
		query.setParameter(1, "%"+kw+"%");
		List<Record> list = query.list();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.exam.base.BaseDaoImp#findByPrimaryKey(java.lang.String)
	 */
	@Override
	public Record findByPrimaryKey(String pk) {
		String hql = "from Record r where r.fdPno =:fdPno";
		Query query = getSession().createQuery(hql);
		return (Record) query.uniqueResult();
	}
}

