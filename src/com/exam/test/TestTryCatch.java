package com.exam.test;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-13
 * @description 
 * @version 1.0
 */

public class TestTryCatch {
	public static void main(String[] args) {
		System.out.println(a());
	}
		public static int a(){
			int a = 1;
			try{
				return a;
			}catch(Exception e){
				e.printStackTrace();
			}
				a +=5;
				return a;
		}
		
	}
		


