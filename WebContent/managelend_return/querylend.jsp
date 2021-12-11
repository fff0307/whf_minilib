<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
   <link rel="stylesheet" href="../layui/css/layui.css">
    <title>小型图书资料管理系统注册页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body >
    <script src="../layui/layui.js"></script>
<style type="text/css">
			body
			{
				background-image: url("../main/55.jpg"); 
				margin-left: 400px;
				margin-top:80px;
				background-size:cover;
			}	
			.p1{
				color:white;
			}
		</style>	


<form class="layui-form layui-form-pane" action="querylendManagelendAction.action" method="post" name="frm">

  <div class="layui-form-item">
    <label class="layui-form-label">请输入：</label>
    <div class="layui-input-inline">
      <input type="text" name="user.username" required lay-verify="required" placeholder="请输入借阅者姓名" autocomplete="off" class="layui-input">
    </div>
  </div>

   <button class="layui-btn" lay-submit lay-filter="formDemo"  type="submit" value="确认查找" name="register ">立即查找</button>
   <button type="reset" class="layui-btn layui-btn-primary" value="重新填写" >重新填写</button>
  <br/><br/>
</form>
  </body>
</html>