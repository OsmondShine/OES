package com.exam.student.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.exam.student.model.Score;
import com.exam.student.service.IScoreService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-16
 * @description 本类主要用于查询学生成绩
 * @version 1.0
 */

public class ScoreAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private IScoreService scoreService;

	public void setScoreService(IScoreService scoreService) {
		this.scoreService = scoreService;
	}
	//查询对应学生成绩
	public String findMyScore(){
		try {
			//接收表单提交的学生主键参数
			String stuPk = (String) ServletActionContext.getRequest().getParameter("studentFdId");
			//定义列表，用于保存学生成绩
			List<Score> scoresList= new ArrayList<Score>();
			//依据主键查询对应学生成绩
			scoresList = scoreService.findByName(stuPk);
			//将查询结果存入request域中
			ServletActionContext.getRequest().setAttribute("scoresList", scoresList);
			//返回视图
			return "findScore";
		} catch (Exception e) {
			System.out.println("查询学生成绩失败！");
			e.printStackTrace();
		}
		return NONE;
	}
}

