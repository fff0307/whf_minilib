<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*"
	import="minilib.struts.code.*"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
body{
background-image:url("backp1.jpg");
background-size:cover;
text-align:center

}
</style>
<style type="text/css">
			.layui-form-item
			{
				margin-left: 340px;
			}	
		</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加图书</title>
<link rel="stylesheet" href="../layui/css/layui.css">
</head>

<body>
 <script src="../layui/layui.js"></script>
${message} 
<!--  通过通配符方式 访问路径中要包含要访问的方法-->
<form class="layui-form layui-form-pane" action="addTitleManageTitlesAction.action" method="post" name="frm">
<!--  
图书类别：
<select name="book.typeid">
	<!-- JSTL之核心C标签  -->
	<!--  <c:forEach items="${requestScope.booktype}" var="booktype" varStatus = "status" >
	<option value ="${booktype.codeid}">${booktype.codename} </option>
	</c:forEach>
</select>-->
    <br/><br/>
  <div class="layui-form-item">
    <label class="layui-form-label">ISBN号</label>
    <div class="layui-input-inline">
      <input type="text" name="onebook.isbn" required lay-verify="required" placeholder="请输入ISBN号" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">书名</label>
    <div class="layui-input-inline">
      <input type="text" name="onebook.title" required lay-verify="required" placeholder="请输入书名" autocomplete="off" class="layui-input">
    </div>
  </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">作者</label>
    <div class="layui-input-inline">
      <input type="text" name="onebook.authors" required lay-verify="required" placeholder="请输入作者名" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">pressid</label>
    <div class="layui-input-inline">
      <input type="text" name="onebook.pressid" required lay-verify="required" placeholder="请输入pressid" autocomplete="off" class="layui-input">
    </div>
  </div>
   <button class="layui-btn layui-btn-warm" lay-submit lay-filter="formDemo"  type="submit" value="确认添加" name="add ">立即添加</button>
   <button type="reset" class="layui-btn layui-btn-warm" value="重新填写" >重新填写</button>
  <br/><br/>
   Copyright@ 2009-2021 版权所有 辽宁师范大学
</form>





</body>
</html>