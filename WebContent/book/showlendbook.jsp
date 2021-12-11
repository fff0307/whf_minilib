<%@ page language="java" contentType="text/html; charset=UTF-8"
	import = "java.util.*,minilib.vo.*"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书列表</title>
</head>
<style>
h1{
color:#fba661;
}
</style>
<body>

<h1>我的借阅记录</h1>
<table width="100%" border="0" cellspacing="1" cellpadding="0" >
			                      <tr bgcolor="#fba661" height="25">
				                        <td width="10%" bgcolor= "#fba661">
											<div align="center">
												ISBN
											</div>
										</td>
										<td width="13%" bgcolor="#fba661">
											<div align="center">
												书名
											</div>
										</td>
										<td width="12%" bgcolor="#fba661">
											<div align="center">
												作者
											</div>
										</td>
										<td width="13%" bgcolor="#fba661">
											<div align="center">
												借阅时间
											</div>
										</td>
									</tr>
<c:forEach items="${requestScope.lendlist}" var="a" varStatus="status" >
										
												<tr bgcolor="#f3f3f3" height="25">
													<td width="10%">
														<div align="center">
															${a.isbn}
														</div>
													</td>
													<td width="13%">
														<div align="center">
															${a.title}
														</div>
													</td>
													<td width="12%">
														<div align="center">
															${a.authors}
														</div>
													</td>
													<td width="12%">
														<div align="center">
															${a.lendtime}
														</div>
													</td>
													
												</tr>
				</c:forEach>

</table>
<br/>



</body>
</html>