package com.exam.test;

import java.util.HashSet;
import java.util.Set;

import com.exam.student.model.Subject;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-3-27
 * @description 
 * @version 1.0
 */

public class TestSet {
	public static void main(String[] args) {
		Set<Subject> set = new HashSet();
		Subject subject1 = new Subject();
		Subject subject2 = new Subject();
		
		subject1.setFdId("111");
		subject1.setFdCname("OS");
		subject1.setFdCno("SE001");
		subject1.setFdHierarchyId("222");
		
		subject2.setFdId("111");
		subject2.setFdCname("OS");
		subject2.setFdCno("SE001");
		subject2.setFdHierarchyId("222");
		
		set.add(subject1);
		set.add(subject2);
		
		System.out.println(subject1.equals(subject2));
		System.out.println(set);
		
	}

}

