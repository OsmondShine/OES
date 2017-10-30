package com.exam.student.model;

import java.util.Date;
/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-15
 * @description 考试通知实体类
 * @version 1.0
 */
public class Notice {
	//主键ID
	private String fdId;
	//通知编号
	private String fdNoticeId;
	//通知标题
	private String fdNoticeTitle;
	//通知内容
	private String fdNoticeContent;
	//通知生效时间
	private Date fdStartTime;
	//通知失效时间
	private Date fdEndTime;
	
	public String getFdId() {
		return fdId;
	}
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}
	public String getFdNoticeId() {
		return fdNoticeId;
	}
	public void setFdNoticeId(String fdNoticeId) {
		this.fdNoticeId = fdNoticeId;
	}
	public String getFdNoticeTitle() {
		return fdNoticeTitle;
	}
	public void setFdNoticeTitle(String fdNoticeTitle) {
		this.fdNoticeTitle = fdNoticeTitle;
	}
	public String getFdNoticeContent() {
		return fdNoticeContent;
	}
	public void setFdNoticeContent(String fdNoticeContent) {
		this.fdNoticeContent = fdNoticeContent;
	}
	public Date getFdStartTime() {
		return fdStartTime;
	}
	public void setFdStartTime(Date fdStartTime) {
		this.fdStartTime = fdStartTime;
	}
	public Date getFdEndTime() {
		return fdEndTime;
	}
	public void setFdEndTime(Date fdEndTime) {
		this.fdEndTime = fdEndTime;
	}
}
