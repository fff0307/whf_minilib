<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*,minilib.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <link rel="stylesheet" href="../layui/css/layui.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <script src="../layui/layui.js"></script>
<% 
	User user=(User)request.getAttribute("user");
%>
<table class="layui-table lay-even lay-skin="line" lay-size="lg">
  <thead>
    <tr>
      <th>用户id</th>
      <th>用户名</th>
      <th>用户密码</th>
      <th>用户性别</th>
      <th>用户电话</th>
    </tr> 
  </thead>
  <tbody>
    <tr>
      <td><%= user.getUserid() %></td>
      <td><%= user.getUsername() %></td>
      <td><%= user.getPassword() %></td>
      <td><%= user.getUsersex() %></td>
      <td><%= user.getUserphonenumber() %></td>
    </tr>
  </tbody>
</table>
</body>
</html>