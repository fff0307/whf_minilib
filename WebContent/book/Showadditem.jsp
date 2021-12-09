<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="minilib.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String message=(String)request.getAttribute("message");
Title book=(Title)request.getAttribute("onebook");
String isbn=book.getIsbn();
String title=book.getTitle();
String authors=book.getAuthors();
String pressid=book.getPressid();
%>
<center>
<p>已成功添加书目：
<p>isbn号：<%= isbn%>
<p>书名：<%= title%>
<p>作者：<%= authors%>
<p>pressid：<%= pressid%>
</p>
</body>
</html>