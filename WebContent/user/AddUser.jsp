<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
   <link rel="stylesheet" href="../layui/css/layui.css">
    <title>小型图书资料管理系统添加用户页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body >
<style type="text/css">
			body
			{
				margin-left: 200px;
				margin-top:20px;
			}	
</style>	


<form class="layui-form layui-form-pane" action="register.action" method="post" name="frm">
<p>请输入用户信息：<br/><br/>
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

   <button class="layui-btn" lay-submit lay-filter="formDemo"  type="submit" value="确认添加" name="register ">立即注册</button>
   <button type="reset" class="layui-btn layui-btn-primary" value="重新填写" >重新填写</button>
  <br/><br/>
   
</form>
  </body>
</html>