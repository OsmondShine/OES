package com.exam.student.dao.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.exam.base.BaseDaoImp;
import com.exam.student.dao.IScoreDao;
import com.exam.student.model.Score;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 
 * @version 1.0
 */

public class ScoreDaoImp extends BaseDaoImp<Score>  implements IScoreDao{

	
	@Override
	public List<Score> findByName(String kw) throws Exception {
		String hql = "from Score score left join fetch score.student where score.student.fdId =:fdId ";
		Query query = getSession().createQuery(hql);
		query.setParameter("fdId", kw);
		List<Score> list = query.list();
		return list;
	}

}

