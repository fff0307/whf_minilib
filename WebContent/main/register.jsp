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
 	<script type="text/javascript">
 layui.use(['layer', 'form'], function(){
	  var layer = layui.layer
	  ,form = layui.form;
	  layer.msg('欢迎注册本系统');
	});
</script>

<style type="text/css">
			body
			{
				background-image: url("77.jpg"); 
				margin-left: 200px;
				margin-top:50px;
				background-size:cover;
			}	
			.p1{
				color:white;
			}
		</style>	


<form class="layui-form layui-form-pane" action="register.action" method="post" name="frm">
    <p class="p1">小型图书资料管理系统-版本_0.1.0 2021年10月7日<br/><br/>
  <div class="layui-form-item">
    <label class="layui-form-label">用户id</label>
    <div class="layui-input-inline">
      <input type="text" name="user.userid" required lay-verify="required" placeholder="请输入id号码" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">用户名</label>
    <div class="layui-input-inline">
      <input type="text" name="user.username" required lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">登录密码</label>
    <div class="layui-input-inline">
      <input type="password" name="user.password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">手机号码</label>
    <div class="layui-input-inline">
      <input type="text" name="user.userphonenumber" required lay-verify="required" placeholder="请输入手机号码" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>
	<div class="layui-form-item">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-block">
      <input type="radio" name="user.usersex" value="男" title="男">
      <input type="radio" name="user.usersex" value="女" title="女" checked>
    </div>
  </div>

   <button class="layui-btn" lay-submit lay-filter="formDemo"  type="submit" value="确认注册" name="register ">立即注册</button>
   <button type="reset" class="layui-btn layui-btn-primary" value="重新填写" >重新填写</button>
   <a href="login.jsp">已有账户？直接登录</a>
  <br/><br/>
   <p class="p1">Copyright@ 2009-2021 版权所有 辽宁师范大学
</form>
  </body>
</html>