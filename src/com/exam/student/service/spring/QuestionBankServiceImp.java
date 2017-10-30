package com.exam.student.service.spring;

import java.util.List;

import com.exam.student.dao.IQuestionBankDao;
import com.exam.student.model.QuestionBank;
import com.exam.student.model.Record;
import com.exam.student.service.IQuestionBankService;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-29
 * @description 
 * @version 1.0
 */

public class QuestionBankServiceImp implements IQuestionBankService {
	private IQuestionBankDao questionBankDao;

	@Override
	public List<QuestionBank> findByName(Record record) throws Exception {
		return questionBankDao.findByName(record);
	}

	public void setQuestionBankDao(IQuestionBankDao questionBankDao) {
		this.questionBankDao = questionBankDao;
	}
}

