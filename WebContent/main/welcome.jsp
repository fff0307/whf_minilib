<!-- 
/***********************************************************
*                         
*                           
* 项目名称：          
* 子系统名：     
* 功能名称： 
* 完成人员：         
* 完成时间：         
*               
*                 
************************************************************/
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>欢迎页面</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
   </head>
  <body>

    <div class="layui-carousel" id="test1">
  		<div carousel-item>
   			 <div><img src="1.jpg"></div>
    		 <div><img src="2.jpg"></div>
    		 <div><img src="3.jpg"></div>
  		</div>
	</div>
	<br/><br/><br/><br/>
	<center>
 	<p>尊敬的用户，欢迎您光临本图书管理系统</p>
 	</center>
<script src="../layui/layui.js"></script>
<script>
layui.use('carousel', function(){
  var carousel = layui.carousel;
  //建造实例
  carousel.render({
    elem: '#test1'
    ,width: '100%'
    ,height:'200px'//设置容器宽度
    ,arrow: 'always' //始终显示箭头
    //,anim: 'updown' //切换动画方式
  });
});
</script>
    
    
    
    
    
    
    
  </body>
</html>