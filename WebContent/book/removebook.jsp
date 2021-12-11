<%@ page language="java" contentType="text/html; charset=UTF-8"
	import = "java.util.*,minilib.vo.*"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书列表</title>
</head>
<body>
<style>
			a{
				text-decoration: none;
			}
   			  a:LINK {
       			 color: #393D49;
    		}
    		a:HOVER {
        		color: #5FB878;
   			}
   			.a2{
   			    background-color:#f2f2f2;
				margin-left:2px;
				border:1px solid orange;
				}
				.div1{
				margin-left:500px;
				}
</style>


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
												出版社
											</div>
										</td>
										
									</tr>
									
<c:forEach items="${requestScope.pg.pageData}" var="a" varStatus="status" >
										
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
															${a.pressid}
														</div>
													</td>
													
												</tr>
				</c:forEach>

</table>
<br/>
<div class="div1">
<a href="dividebooksManageTitlesAction.action?curPage=${pg.firstPage}" class="a2">首页</a>
<a href="dividebooksManageTitlesAction.action?curPage=${pg.currentPage - 1}" class="a2">上一页</a>
<a href="dividebooksManageTitlesAction.action?curPage=${pg.currentPage + 1}" class="a2">下一页</a>
<a href="dividebooksManageTitlesAction.action?curPage=${pg.lastPage}" class="a2">尾页</a>
当前第${pg.currentPage}页/共${pg.totalPage}页
</div>
</body>
</html>