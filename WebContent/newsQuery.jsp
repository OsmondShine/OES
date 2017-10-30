<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>试题管理</title>
	<link href="css_paper/view.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<h1 class="h1">通知管理</h1>
		<h2 class="h2">NEWS MANAGEMENT</h2>

		<table class="table">
			<tr class="tr thead">
				<td style="width:5%;position:relative;"></td>
				<td style="width:75%;position:relative; text-align:left;">通知列表</td>
				<td style="width:20%;position:relative;">
					<button type="button" name="button" value="添加通知" style="height:30px;width:100%"><a style="text-decoration: none;" href="newsAdd.jsp" >添加通知</a></button>
				</td>
			</tr>
		</table>
		<table class="table">
			<tr >
		    	<th>公告编号</th>
		        <th>公告标题</th>
		        <th>内容</th>
		        <th>发布时间</th>
		        <th>失效时间</th>
		        <th>修改</th>
			</tr>
			<c:forEach items="${listNews}" var="list">
			<tr>
	 			<td>${list.newsId }</td>
	    		<td>${list.newsTitle }</td>
	    		<td>${list.newsContent }</td>
	    		<td>${list.startTime }</td>
	    		<td>${list.endTime }</td>
				<td>
					<button type="submit"><a href="teacher_newsPreUpdate?news.newsId=${list.newsId }" style="text-decoration: none;">修改</a></button>
					<button type="submit"><a href="teacher_newsDelete?news.newsId=${list.newsId }" style="text-decoration: none;">删除</a></button>
				</td>
			</tr>
			 </c:forEach>
		</table>

		<form class="table" action="teacher_newsQuery" method="post">
			<label>搜索：</label>
			<input class="input1" type="text" name="kw">
			<button style="width:50px" type="submit">查询</button>
		</form>
	</div>
</body>
</html>