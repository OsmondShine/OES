package com.exam.student.service.spring;

import java.util.List;

import com.exam.student.dao.IRecordDao;
import com.exam.student.model.Record;
import com.exam.student.service.IRecordService;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 试卷记录业务实现
 * @version 1.0
 */

public class RecordServiceImp implements IRecordService {
	private IRecordDao recordDao;

	public boolean add(Record record) throws Exception {
		recordDao.add(record);
		return true;
	}
	
	@Override
	public boolean delete(String pk) throws Exception {
		recordDao.delete(pk);
		return true;
	}
	@Override
	public List<Record> findAll() throws Exception {
		return recordDao.findAll();
	}

	
	@Override
	public Record findByPrimaryKey(String pk) throws Exception {
		return recordDao.findByPrimaryKey(pk);
	}

	@Override
	public List<Record> findByName(String kw) throws Exception {
		return recordDao.findByName(kw);
	}
	
	public void setRecordDao(IRecordDao recordDao) {
		this.recordDao = recordDao;
	}
}

