<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'logup.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css.css">

	
	<style type="text/css">
	  .denglu{
        width: 165px;
        height: 36px;
        background-image: url(./images/logup_zhuce_v1.jpg);
        margin-left: 120px;
        margin-top: 20px;
      }
      .wenben1{
        width: 270px;
        height: 35px;
        background-color: #dedede;
        margin-left: 130px;
        margin-top: 85px;

      }
      .wenben2{
        width: 270px;
        height: 35px;
        background-color: #dedede;
        margin-left: 130px;
        margin-top: 28px;
       
      }
      .wenben3{
        width: 270px;
        height: 35px;
        background-color: #dedede;
        margin-left: 130px;
        margin-top: 24px;
        
      }
      .bodybox{
        width: 1200px;
        height: 580px;
        background-image: url(./images/logup_v1.jpg);
        margin: 20px auto;

      }
      .usernamepassword{
        width: 50px;
        height: 40px;
      }
      .login{
        float: left;
        margin-left: 662px;
        margin-top: 162px;
      }
      .logup{
        margin-left: 350px;
        margin-top: 22px;
        font
      }
	</style>
  </head>
  
  <body>
  
     
   	<div class="bodybox">
      <div class="login" >
      
        <form class="index" action="dologup.jsp" method="post">
          <table>
            <tr>
              <td  class="usernamepassword"></td>
              <td><input type="text" class="wenben1" name="Upusername" value=""></td>
            </tr>
            <tr>
              <td class="usernamepassword"></td>
              <td><input type="password" class="wenben2" name="Uppassword" value=""></td>
            </tr>
            <tr>
              <td class="usernamepassword"></td>
              <td><input type="password" class="wenben3" name="UppasswordAgain" value=""></td>
            </tr>
            <tr>
              <td colspan="2"><input type="submit" class="denglu" name="" value=""></td>
            </tr>
          </table>
        </form>
        <!-- 
        <div class="logup">
          <a href="logup.jsp" style="color:#405c71">免费注册</a> 
        </div>
         -->
      </div>

    </div>
  
  
  
  <!-- 
  <h1>注册界面</h1>
    <div>
    	     <form action="dologup.jsp" name = "loginFrom" method="post">
     	<table>
     		<tr>
     			<td>账号</td>
     			<td><input type="text" name = "Upusername" value="请输入账号"> </td>
     		</tr>
     		<tr>
     			<td>密码</td>
     			<td><input type	="password"  name = "Uppassword" value="请输入密码"> </td>
     		</tr>
     		<tr>
     			<td>重新输入密码</td>
     			<td><input type	="password"  name = "UppasswordAgain" value="请输入密码"> </td>
     		</tr>
     		<tr>
        	     <td colspan="2"><input type="submit" value="注册"></td>
      	    </tr>
     	</table>
     </form> 
    </div>
  </body>
  
   -->
</html>
