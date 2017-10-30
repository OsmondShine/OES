<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>题库管理</title>
	<link href="css_paper/view.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<h1 class="h1">题库管理</h1>
		<h2 class="h2">ITEMBANK MANAGEMENT</h2>

		<table class="table">
			<tr class="tr thead">
				<td style="width:5%;position:relative;"></td>
				<td style="width:75%;position:relative; text-align:left;">试题列表</td>
				<td style="width:20%;position:relative;">
					<button type="button" name="button" value="添加试题" style="height:30px;width:100%"><a href="itemBankAdd.jsp" style="text-decoration: none;">添加试题</a></button>
				
				</td>
			</tr>
		</table>
		<table class="table">
			<tr >
				<th>ID</th>
				<th>试题类型</th>
				<th>题干</th>
				<th>试题内容</th>
				<th>答案</th>
				<th>难度</th>
				<th>操作</th>
			</tr>
		<c:forEach items="${iBPage}" var="list">
    	<tr>
    		<td>${list.qno }</td>
    		<td>${list.typeid }</td>
    		<td>${list.question }</td>
    		<td>${list.content }</td>
    		<td>${list.answer }</td>
    		<td>${list.difficulty }</td>
				<td>
					<button type="button" style="width:40%; position:relative;"><a href="itemBank_PreUpdate?itemBank.qno=${list.qno }" style="text-decoration: none;">修改</a></button>
					<button type="button" style="width:40%; position:relative;"><a href="itemBank_delete?itemBank.qno=${list.qno }" style="text-decoration: none;">删除</a></button>
				</td>
			</tr>
		</c:forEach>
		</table>
			<div style="text-align: center">
				共
				<s:property value="intRowCount" />
				记录&nbsp;&nbsp; 第
				<s:property value="pageNow" />
				页&nbsp;&nbsp;
				<s:url id="url_pre" value="itemBank_find.action">
					<s:param name="pageNow" value="pageNow-1"></s:param>
				</s:url>

				<s:url id="url_next" value="itemBank_find.action">
					<s:param name="pageNow" value="pageNow+1"></s:param>
				</s:url>
				<s:iterator value="Newss" status="status">
					<s:url id="url" value="itemBank_find.action">
						<s:param name="pageNow" value="pageNow" />
					</s:url>
				</s:iterator>
				<s:if test="pageNow==1">
									最前一页
								</s:if>
				<s:else>
					<s:a href="%{url_pre}">上一页</s:a>
				</s:else>
				<s:if test="pageNow==k">
									最后一页
								</s:if>
				<s:else>
					<s:a href="%{url_next}">下一页</s:a>
				</s:else>
			</div>

		<form class="table" action="itemBank_find" method="post">
			<label>搜索：</label>
			<input class="input1" type="text" name="kw1">
			<button style="width:50px">查询</button>
		</form>
	</div>
</body>
</html>