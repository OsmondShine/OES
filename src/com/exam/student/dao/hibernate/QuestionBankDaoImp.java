package com.exam.student.dao.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.exam.base.BaseDaoImp;
import com.exam.student.dao.IQuestionBankDao;
import com.exam.student.model.QuestionBank;
import com.exam.student.model.Record;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 
 * @version 1.0
 */

public class QuestionBankDaoImp extends BaseDaoImp<QuestionBank> implements IQuestionBankDao {

	public List<QuestionBank> findByName(Record record) throws Exception {
		String sql = "select * from question_bank qb where fd_type_id = ? order by rand() limit ?";
		Query query = getSession().createSQLQuery(sql).addEntity(QuestionBank.class);
		query.setParameter(0, record.getQuestionType());
		query.setParameter(1, record.getFdNums());
		List<QuestionBank> list = query.list();
		return list;
	}
}

