package com.exam.base;

import java.lang.reflect.ParameterizedType;
import java.util.Date;

import org.hibernate.SessionFactory;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-17
 * @description 
 * @version 1.0
 */

public class Test extends Date{
	private SessionFactory sessionFactory;
	Class clazz;
	
	public Test(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		System.out.println("111");
		this.clazz = (Class) pt.getActualTypeArguments()[0];
		System.out.println("clazz:"+clazz);
		sessionFactory.close();
	}
	
	public static void main(String[] args) {

		new Test().test();

		}



		public void test(){

		System.out.println(super.getClass().getSimpleName());

		}

}

