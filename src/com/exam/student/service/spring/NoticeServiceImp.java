package com.exam.student.service.spring;

import java.util.List;

import com.exam.student.dao.INoticeDao;
import com.exam.student.model.Notice;
import com.exam.student.service.INoticeService;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 考试通知业务实现
 * @version 1.0
 */

public class NoticeServiceImp implements INoticeService {
	public INoticeDao noticeDao;

	@Override
	public List<Notice> findAll() throws Exception {
		return noticeDao.findAll();
	}
	public List findByName(String kw) throws Exception {
		return noticeDao.findByName(kw);
	}
	public Notice findByPrimaryKey(String pk) throws Exception {
		return noticeDao.findByPrimaryKey(pk);
	}

	public void setNoticeDao(INoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
}

