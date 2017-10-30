<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<style type="text/css">
table.persontable {
	font-family: verdana, arial, sans-serif;
	font-size: 11px;
	color: #333333;
	border-width: 1px;
	border-color: #666666;
	cxs border-collapse: collapse;
}

table.persontable th {
	text-align: center;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}

table.persontable td {
	text-align: center;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}
</style>


<hmtl>   
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教师添加页</title>
<body>
<form action="itemBank_add" method="post">
	<div align="center">
		<table border="1" class="persontable">
			<thead>
				<tr><!--
					<th style="width: 200px;">
						试题编号
					</th>
					--><th style="width: 200px;">
						题类ID
					</th>
					<th style="width: 200px;">
						题干
					</th>
					<th style="width: 200px;">
						试题内容
					</th>
					<th style="width: 200px;">
						答案
					</th>
					<th style="width: 200px;">
						难度
					</th>

				</tr>
			</thead>
			<% for(int i=0;i<10;i++) { %>
			<tr><!--
				<td>
					<input type="text" name="qnos" />
				</td>
				--><td>
					<input type="text" name="typeids" />
				</td>
				<td>
					<input type="text" name="questions" />
				</td>
				<td>
					<input type="text" name="contents" />
				</td>
				<td>
					<input type="text" name="answers" />
				</td>
				<td>
					<input type="text" name="difficulties" />
				</td>
			</tr>
				<%} %>
		</table>
		<button type="submit">批量添加</button>
		</form>
		<button type="submit"><a href="itemBankQuery.jsp">返回</a></button>

	</div>
</body>
</hmtl>
