package com.exam.student.service;

import java.util.List;

import com.exam.student.model.QuestionBank;
import com.exam.student.model.Record;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-29
 * @description 题库业务接口
 * @version 1.0
 */

public interface IQuestionBankService {
	//依据试卷记录查询试题
	public abstract List<QuestionBank> findByName(Record record) throws Exception;

}

