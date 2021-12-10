<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" href="../layui/css/layui.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
			body
			{
				background-image: url("../main/3.jpg"); 
				background-size:cover;
				margin-left: 430px;
				margin-top:80px;
			}	
			h1{
				margin-left:80px;
			}
			.p1,h1{
				color:white;
			}
</style>
</head>
<body>
<script src="../layui/layui.js"></script>
<script type="text/javascript">
 layui.use(['layer', 'form'], function(){
	  var layer = layui.layer
	  ,form = layui.form;
	  layer.msg('操作前需要验证您的管理员身份');
	});
</script>
<h1>管理员登录</h1><br/><br/>
	<form class="layui-form layui-form-pane" action="useridentity3usermanageAction.action" method="post" name="frm">
 		 <p class="p1">小型图书资料管理系统-版本_0.1.0 2021年10月7日<br/><br/>
  <div class="layui-form-item">
    <label class="layui-form-label">用户名</label>
    <div class="layui-input-inline">
      <input type="text" name="user.username" required lay-verify="required" placeholder="请输入管理员名称" autocomplete="off" class="layui-input">
    </div>
    
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">登录密码</label>
    <div class="layui-input-inline">
      <input type="password" name="user.password" required lay-verify="required" placeholder="请输入管理员密码" autocomplete="off" class="layui-input">
    </div>
    
  </div>


   <button class="layui-btn" lay-submit lay-filter="formDemo"  type="submit" value="确认登录" name="login ">立即登录</button>
   <button type="reset" class="layui-btn layui-btn-primary" value="重新填写" >重新填写</button>
  <br/><br/>
  <p class="p1"> Copyright@ 2009-2021 版权所有 辽宁师范大学
   </form>
  </body>
</html>