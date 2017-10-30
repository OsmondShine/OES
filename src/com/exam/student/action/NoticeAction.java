package com.exam.student.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.exam.student.model.Notice;
import com.exam.student.service.INoticeService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 本类主要用于查询考试通知
 * @version 1.0
 */

public class NoticeAction extends ActionSupport {
	//findNotices用于保存搜索关键字
	private String findNotices;
	private INoticeService noticeService;

	public void setNoticeService(INoticeService noticeService) {
		this.noticeService = noticeService;
	}
	//查询通知
	public String findNotices(){
		//定义列表，用于存放通知
		List<Notice> noticesList;
		//搜索内容去空格
		String notices = findNotices.trim();
		try {
			if ("".equals(notices)){
				//搜索内容为空，默认全查询
				noticesList = noticeService.findAll();
			}else{
				//搜索内容不为空，依据关键字匹配通知标题查询
				noticesList = noticeService.findByName(notices);
			}
			//通知列表存入request域中
			ServletActionContext.getRequest().setAttribute("noticesList", noticesList);
			//返回视图
			return "notice";
		} catch (Exception e) {
			System.out.println("查询考试通知失败！");
			e.printStackTrace();
		}
		return NONE;
	}

	public void setFindNotices(String findNotices) {
		this.findNotices = findNotices;
	}
}

