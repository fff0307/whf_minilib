<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="../layui/css/layui.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询图书</title>
</head>
<body>
<script src="../layui/layui.js"></script>

<style type="text/css">
			body
			{
				background-image: url("../main/55.jpg"); 
				margin-left: 400px;
				margin-top:80px;
				background-size:cover;
				}
</style>

<form class="layui-form layui-form-pane" action="findTitleBynameManageTitlesAction.action" method="post" name="frm">
  <div class="layui-form-item">
    <label class="layui-form-label">精确查找</label>
    <div class="layui-input-inline">
      <input type="text" name="context" required lay-verify="required" placeholder="请输入要查找的书籍名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">按书名查找</div>
   <button class="layui-btn layui-btn-normal  layui-btn-sm" lay-submit lay-filter="formDemo"  type="submit" value="开始查找" name="submit">开始查找</button>
   </div>
</form>

<form class="layui-form layui-form-pane" action="findTitleMultivariateManageTitlesAction.action" method="post" name="frm">
  <div class="layui-form-item">
    <label class="layui-form-label">模糊查找</label>
    <div class="layui-input-inline">
      <input type="text" name="Multivariate" required lay-verify="required" placeholder="任意输入图书相关信息" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">多元素查找</div>
   <button class="layui-btn layui-btn-normal  layui-btn-sm" lay-submit lay-filter="formDemo"  type="submit" value="开始查找" name="submit">开始查找</button>
   </div>
</form>
</body>
</html>