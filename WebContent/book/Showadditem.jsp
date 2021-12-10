<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="minilib.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
			body
			{
				background-image: url("../main/44.jpg"); 
				background-size:cover;
				margin-top:200px;
			}
			p{
			color:white;
			}
</style>
<center>
<p>已成功添加书目：
<p>isbn号：${onebook.isbn}
<p>书名：${onebook.title}
<p>作者：${onebook.authors}
<p>pressid：${onebook.pressid}
</p>
</body>
</html>