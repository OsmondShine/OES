package com.exam.util;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-13
 * @description 本工具类主要提供数据加密：含MD5
 * @version 1.0
 */

public class SecurityUtil {
	// 用jdk实现:MD5
	public static String jdkMD5(String src)
	{
		try 
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] md5Bytes = md.digest(src.getBytes());
			System.out.println("JDK MD5:" + Hex.encodeHexString(md5Bytes));
			return Hex.encodeHexString(md5Bytes);
		} catch (Exception e) {
			System.out.println("MD5消息摘要失败！");
			e.printStackTrace();
		}
		return null;
	}
}

