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
<html><head><title></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <script language="JavaScript" type="text/JavaScript">
  	function showMenu(id){
  		var menu = "menu_" + id;
  		var item=document.getElementById(menu);
  		for(i=1;i<=4;i++){
  			document.getElementById("menu_0" + i).style.display="none";
  		}
  		item.style.display = "block";
  	}
  	
  </script>
<style type="text/css">
			table
			{
				color:white;
			}	
			a{
				text-decoration: none;
			}
			 a:VISITED {
       		 	color: #1E9FFF;
   			 }
   			  a:LINK {
       			 color: #393D49;
    		}
    		a:HOVER {
        		color: #5FB878;
   			}
   			td{
   			width:200px;
   			}
		</style>
</head>

<body>
  <!--  -->
  <table border="1" bgcolor="#FFB800" width="100%" class="layui-table">
  <tr>
  	<td onClick="showMenu('01');" align="center">读者功能</td>
  </tr>
  </table>
  <table border="1" id="menu_01" style="display:block;" bgcolor="#f0f0f0" width="100%" class="layui-table">
  	<tr><td align="center"><a href="../book/QueryBook.jsp" target="main" title="查询图书">查询图书</a></td></tr>
   <tr><td align="center"><a href="dividebooks2ManageTitlesAction.action" target="main" title="查看全部图书">查看全部图书</a></td></tr>
   <tr><td align="center"><a href="lendbookManageTitlesAction.action" target="main" title="查询图书">借书</a></td></tr>
   <tr><td align="center"><a href="returnbookManageTitlesAction.action" target="main" title="查看全部图书">还书</a></td></tr>

  </table>
  
  <!-- -->
  <table border="1" bgcolor="#FFB800" width="100%" class="layui-table"><tr>
  <td  onClick="showMenu('02');" align="center">管理借阅</td>
  </tr></table>
  <table border="1" id="menu_02" style="display:none;" bgcolor="#f0f0f0" width="100%" class="layui-table">
    <tr><td align="center"><a href="../managelend_return/addlend.jsp" target="main" title="添加借书">添加借书记录</a></td></tr>
    <tr><td align="center"><a href="../managelend_return/querylend.jsp" target="main" title="查询借书">查询借书记录</a></td></tr>
  </table>


  <!--  -->
  <table border="1" bgcolor="#FFB800" width="100%" class="layui-table"><tr>
  <td onClick="showMenu('03');" align="center">管理图书</td>
  </tr></table>
  <table border="1" id="menu_03" style="display:none;" bgcolor="#f0f0f0" width="100%" class="layui-table">
   <tr><td align="center" ><a href="../book/checkidentity.jsp" target="main" title="增加图书">增加图书</a></td></tr>
    <tr><td align="center" ><a href="../book/checkidentity2.jsp" target="main" title="增加图书">删除图书</a></td></tr>
   
  </table>
  
  <!-- -->  
  <table border="1" bgcolor="#FFB800" width="100%" class="layui-table"><tr>
  <td  onClick="showMenu('04');" align="center">管理用户</td>
  </tr></table>
  <table border="1" id="menu_04" style="display:none;" bgcolor="#f0f0f0" width="100%" class="layui-table">
    <tr width="100%" ><td align="center"><a href="../user/checkidentity.jsp" target="main" title="增加用户" width="100%">增加用户</a></td></tr>
    <tr><td align="center"><a href="../user/checkidentity2.jsp" target="main" title="查询用户">查询用户</a></td></tr>
    <tr><td align="center"><a href="../user/checkidentity3.jsp" target="main" title="查看全部用户">删除用户</a></td></tr>
  </table>

</body>

</html>
