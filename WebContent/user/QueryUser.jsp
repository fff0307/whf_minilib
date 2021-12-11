<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
   <link rel="stylesheet" href="../layui/css/layui.css">
  </head>
  <body >
<style type="text/css">
			body
			{
				 background-image: url("../main/44.jpg");
			    background-size:cover;
				margin-left: 480px;
				margin-top:80px;
			}
			.p1{
			color:white;
			}	
</style>	
<form class="layui-form layui-form-pane" action="queryusermanageAction.action" method="post" name="frm">
<p class="p1">请输入用户id：<br/><br/>
  <div class="layui-form-item">
    <label class="layui-form-label">用户id</label>
    <div class="layui-input-inline">
      <input type="text" name="user.userid" required lay-verify="required" placeholder="请输入id号码" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>
  
   <button class="layui-btn" lay-submit lay-filter="formDemo"  type="submit" value="确认查找" name="register ">立即查找</button>
   <button type="reset" class="layui-btn layui-btn-primary" value="重新填写" >重新填写</button>
  <br/><br/>
   
</form>
  </body>
</html>