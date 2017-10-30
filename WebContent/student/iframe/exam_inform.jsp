<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>考试通知</title>
		<link rel="stylesheet" href="../css/iframe.css" />
		
		<style>
.table {
	border-collapse: collapse;
}
.input1{width: 300px;height: 25px;outline: none;padding-left: 5px;}
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
	height: 120px
}
</style>
	</head>
	<body>
		<div class="title">
			考试通知
		</div>
		<form class="table" action="notice_findNotices" method="post">
			<label>
				搜索：
			</label>
			<input class="input1" type="text" name="findNotices" class="text" placeholder="请输入通知标题">
			<button style="width: 50px height: 30px" type="submit">
				查询
			</button>
		</form>
		<table class="table">
			<tbody>
				<tr>
					<th width=190>
						试卷编号
					</th>
					<th width=246>
						通知标题
					</th>
					<th width=368>
						内容
					</th>
					<th width=168>
						发布时间
					</th>
					<th width=168>
						失效时间
					</th>
					<th width=168>
						操作
					</th>
					<c:forEach items="${noticesList}" var="list">
						<tr>
							<td id="td">
								${list.fdNoticeId }
							</td>
							<td id="td">
								${list.fdNoticeTitle }
							</td>
							<td id="td">
								${list.fdNoticeContent }
							</td>
							<td id="td">
								${list.fdStartTime }
							</td>
							<td id="td">
								${list.fdEndTime }
							</td>
							<td id="td">
								<!--<button type="submit" style="margin-left:37px;">
									--><a href="paper_createNewPaper?record.fdPno=${list.fdNoticeId } ">参加考试</a> 
									
								<!--</button>
							--></td>
						</tr>
				 </c:forEach>
			</tbody>
		</table>
	</body>
</html>
