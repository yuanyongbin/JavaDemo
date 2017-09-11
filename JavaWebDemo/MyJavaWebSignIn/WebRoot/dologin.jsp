<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import = "dao.*" %>
<%@ page import = "entity.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dologin.jsp' starting page</title>
    
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
  		User user = new User();
  		ItemsDao items = new ItemsDao();  		
  		if((items.boolLogin(request.getParameter("username"),request.getParameter("password")))){
  			
  	 %>
  	 	欢迎<%=request.getParameter("username") %>进入图图的部落，这里有激情的小电影，好听的歌曲，和你想要的一切。<br>
  	 	<a>小电影</a><br>
  	 	<a>歌曲</a><br>
  	 	<input type="text" value="你还想要什么呢？我可以为你添加各种功能">
  	 	
  	 <% 
  	 	}else if(!(items.boolLogup(request.getParameter("username")))){
  	  %>
  	  
  	  	没有你的注册信息，请先注册<hr>
  	  	是否返回到注册界面：<a href="logup.jsp">注册界面</a>
  	  <% 
  	  	}else{
  	  %>
  	  	密码错误，请重新登录.<hr>
  	  	是否返回到登录界面：<a href="index.jsp">登录界面</a>
  	  <% 
  	  	}
  	   %>
  </body>
</html>
