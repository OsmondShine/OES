<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>查询成绩</title>
		<link rel="stylesheet" href="../css/iframe.css" />
		<style>
			.table{
	   
	    border-collapse: collapse; 
}
table th {
    padding: 3px;
    height: 15px;
    vertical-align: middle;
    text-align: center;
    background-color: #efefef;
    border: 1px solid #c3c3c3;
    border-collapse: collapse;    
}

table td {
    padding: 3px;
    height: 15px;
    vertical-align: middle;
    border: 1px solid #c3c3c3;
    border-collapse: collapse;
    height:35px    
}
		</style>
	</head>
	<body>
		<div class="title">
			查询成绩
		</div><!--
		<form class="table" action="score_studentQueryAll" method="post">
			<label>搜索：</label>
			<input class="input1" type="text" name="kw">
			<button style="width:50px">查询</button>
		</form>
		--><table class="table">
				<tr>
					<th width=190>学号</th>
					<th width=246>姓名</th>
					<th	width=368>试卷名</th>
					<th	width=168>成绩</th>
					
				</tr>
			<c:forEach items="${scoresList}" var="list">
			<tr>
	 	 		<td id="td">${list.student.fdSno }</td>
	    		<td id="td">${list.student.fdName }</td>  
	    		<td id="td">${list.fdRemark }</td>
	    		<td id="td">${list.fdScore }</td>
			</tr>
			 </c:forEach>
		</table>
	</body>
</html>
