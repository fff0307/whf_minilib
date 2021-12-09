<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询图书</title>
</head>
<body>
<center>
<form method="post" action="findTitleBynameManageTitlesAction.action">
	<p>按书名精确查找：
	<input type="text" name="context" id="context" value="">
	<input type="submit" name="submit" value="查询图书">
</form>

<p><p><p><p>
<form method="post" action="findTitleMultivariateManageTitlesAction.action">
	<p>多元素模糊查找：
	<input type="text" name="Multivariate" id="Multivariate" value="">
	<input type="submit" name="submit" value="查询图书">
</form>
</center>
</body>
</html>