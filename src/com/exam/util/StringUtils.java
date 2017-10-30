package com.exam.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String工具�?
 * @author bigpig
 * @version 1.0
 * @date 2014/12/14
 */
public class StringUtils {
	
	/**
	 * 校验字符串是否为�?
	 * @param str
	 * @return boolean 
	 */
	public static boolean isEmpty(String str) {
		if(null == str || "".equals(str)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 格式化日期转换为字符�?
	 * @param date
	 * @return
	 */
	public static String fmtDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	
	/**
	 * 将数组转换成逗号分隔的字符串
	 * @param ar
	 * @return String
	 */
	public static String parseArrayToStr(String[] ar) {
		if(ar == null || ar.length == 0) return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i] + ",");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}
