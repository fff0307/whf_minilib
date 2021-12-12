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
				background-image: url("../main/55.jpg"); 
				margin-left: 200px;
				margin-top:50px;
				background-size:cover;
			}	
			.p1{
				color:white;
			}
		</style>	


<form class="layui-form layui-form-pane" action="" method="post" name="frm">
  <div class="layui-form-item">
    <label class="layui-form-label">借阅者姓名</label>
    <div class="layui-input-inline">
      <input type="text" name="user.userid" required lay-verify="required" placeholder="请输入id号码" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">isbn</label>
    <div class="layui-input-inline">
      <input type="text" name="title.isbn" required lay-verify="required" placeholder="请输入借阅者姓名" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">书名</label>
    <div class="layui-input-inline">
      <input type="password" name="title.title" required lay-verify="required" placeholder="请输入书名" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">作者</label>
    <div class="layui-input-inline">
      <input type="text" name="title.authors" required lay-verify="required" placeholder="请输入作者名" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>
	<div class="layui-form-item">
    <label class="layui-form-label">出版社</label>
    <div class="layui-input-inline">
      <input type="text" name="title.pressid" required lay-verify="required" placeholder="请输入出版社" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>

	<div class="layui-form-item">
    <label class="layui-form-label">借阅时间</label>
    <div class="layui-input-inline">
      <input type="text" name="title.lendtime" required lay-verify="required" placeholder="请输入借阅时间" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">数字、字母</div>
  </div>
   <button class="layui-btn" lay-submit lay-filter="formDemo"  type="submit" value="确认添加" name="add">立即添加</button>
   <button type="reset" class="layui-btn layui-btn-primary" value="重新填写" >重新填写</button>
   
  <br/><br/>
   
</form>
  </body>
</html>