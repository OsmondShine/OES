package com.exam.base;

import java.util.List;

import com.exam.student.model.PageBean;
import com.exam.util.QueryHelper;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-21
 * @description 通用基类DAO接口
 * @version 1.0
 */

public interface IBaseDao<T> {
	  //添加
	  public void add(T t) throws Exception;
	  //删除
	  public void delete(String pk) throws Exception;
	  //更新
	  public void update(T t) throws Exception;
	  //查询所有
	  public List<T> findAll() throws Exception;
	  //依据主键查询对象
	  public T findByPrimaryKey(String pk) throws Exception;
	  //依据多个主键查询对象列表
	  List findByPrimaryKeys(String[] pks) throws Exception;
	  //获取分页对象
	  PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper) throws Exception;
}

