package com.exam.student.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.exam.student.model.Record;
import com.exam.student.service.IRecordService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-27
 * @description 
 * @version 1.0
 */

public class RecordAction extends ActionSupport{
	private IRecordService recordService;
	private Record record = new Record();

	public IRecordService getRecordService() {
		return recordService;
	}

	public void setRecordService(IRecordService recordService) {
		this.recordService = recordService;
	}
	//添加试卷
	public String create(){
 		try {
			recordService.add(record);
			return "create";
//			String path = find();
//			return path;
		} catch (Exception e) {
			System.out.println("添加试卷失败！");
			e.printStackTrace();
		}
		return NONE;
	}
	//删除试卷
		public String delete(){
			String path = null;
			try {
				recordService.delete(record.getFdPno());
				path =find();
			} catch (Exception e) {
				System.out.println("删除失败！");
				e.printStackTrace();
			}
			return path;
		}
		//查询试卷
		public String find() {
			String pName = ServletActionContext.getRequest().getParameter("kw").trim();
			List<Record> listRecord = null;
			try {
				if ("".equals(pName) || null == pName){
					listRecord = recordService.findAll();
				}else{
					listRecord = recordService.findByName(pName);
				}
			} catch (Exception e) {
				System.out.println("查找试卷失败！");
				e.printStackTrace();
			}
			ServletActionContext.getRequest().setAttribute("listRecord", listRecord);
			return "find";
			}

		public Record getRecord() {
			return record;
		}

		public void setRecord(Record record) {
			this.record = record;
		}
}

