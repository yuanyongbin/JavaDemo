<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="dao.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dologup.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
  		request.setCharacterEncoding("utf-8");
  		ItemsDao items = new ItemsDao();  		
  		if(items.boolLogup(request.getParameter("Upusername"))){
  			
  	 %>
  	 	你已经注册了，直接登录<hr>
  	   	是否登录：<a href="index.jsp">登录界面</a>	
  	 	
  	  <% 
  	  	}else if(!(request.getParameter("Uppassword").equals(request.getParameter("UppasswordAgain")))){	
  	  %>
  	  	两次出入的密码不一样，请重新输入<hr>
  	  	是否返回登录界面:<a href="logup.jsp">注册界面</a>
  	  <% 	
  	  	}else{
  	  		Updateuser update = new Updateuser();
  	  		update.updateusers(request.getParameter("Upusername"),request.getParameter("Uppassword"));
  	   %>
  	   	注册成功<hr>
  	   	是否登录：<a href="index.jsp">登录界面</a>	
  	   <%
  	   	}
  	    %>
  </body>
</html>
