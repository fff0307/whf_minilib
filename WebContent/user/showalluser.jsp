<%@ page language="java" contentType="text/html; charset=UTF-8"
	import = "java.util.*,minilib.vo.*"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
<table width="100%" border="0" cellspacing="1" cellpadding="0" >
			                      <tr bgcolor="#fba661" height="25">
				                        <td width="10%" bgcolor= "#fba661">
											<div align="center">
												用户id
											</div>
										</td>
										<td width="13%" bgcolor="#fba661">
											<div align="center">
												用户名
											</div>
										</td>
										<td width="12%" bgcolor="#fba661">
											<div align="center">
												用户密码
											</div>
										</td>
										<td width="13%" bgcolor="#fba661">
											<div align="center">
												用户性别
											</div>
										</td>
										<td width="13%" bgcolor="#fba661">
											<div align="center">
												用户电话
											</div>
										</td>
										<td width="13%" bgcolor="#fba661">
											<div align="center">
												管理用户
											</div>
										</td>
									</tr>
									
<c:forEach items="${requestScope.allUsers}" var="a" varStatus="status" >
										
												<tr bgcolor="#f3f3f3" height="25">
													<td width="10%">
														<div align="center">
															${a.userid}
														</div>
													</td>
													<td width="13%">
														<div align="center">
															${a.username}
														</div>
													</td>
													<td width="12%">
														<div align="center">
															${a.password}
														</div>
													</td>
													<td width="12%">
														<div align="center">
															${a.usersex}
														</div>
													</td>
													<td width="12%">
														<div align="center">
															${a.userphonenumber}
														</div>
													</td>
													<td width="12%">
														<div align="center">
															<a href="removeuserusermanageAction.action?removeuserid=${a.userid}">移除用户</a>
														</div>
													</td>
												</tr>
				</c:forEach>

</table>
</body>
</html>