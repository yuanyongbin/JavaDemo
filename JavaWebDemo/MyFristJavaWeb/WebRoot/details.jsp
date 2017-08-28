<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="entity.Detail"%>
<%@ page import="dao.DetailDAO"%>
<%@ page import= "java.util.ArrayList" %>
<%@ page import= "java.util.Iterator" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'details.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style media="screen">
		div{
			margin: auto;
			width:660px;
		}
	
	</style>

  </head>
  
  <body>
   	 <div>	 
   		 <% 
   		 	String str = request.getParameter("id");
   		 	DetailDAO detailDao = new DetailDAO();
   		 	ArrayList<Detail> list =detailDao.getAllList();
   		 	Iterator<Detail> it = list.iterator();
   		 	while(it.hasNext()) {
   		 		Detail det = new Detail();
   		 		det = it.next();
   		 		if(det.getId().equals(str)){
   		 %>		
   		 		<h1>
   		 			
   		 		</h1>
   		 		<p>
   		 			<%=det.getContent()%>
   		 		</p>
   		 		
   		 <%		
   		 		}
   		 	}
   		  %>
   	 </div>  
   		  
  </body>
</html>
