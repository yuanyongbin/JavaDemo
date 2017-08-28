<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="entity.List"%>
<%@ page import="dao.ListDAO"%>
<%@ page import= "java.text.SimpleDateFormat" %>
<%@ page import= "java.util.Date;" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style media="screen">
		table,tr,th,td {
 			 border-collapse:collapse;
 			 margin:0; padding:0;
		}
      .population{
        width: 957px;
        height: 410px;
        background-color: #FFF0DD;
        border-color: #FAD4CB;
        border: 1px solid #F5D5CA;
      }
      .tableNew{
        background-color: #FFFFFF;
        border: 1px solid #F5D3C9;
        margin: 11px 5px ;
        width: 917px;
        height: 340px;

      }
      .box{
        width: 940px;
        height: 360px;
        margin-left: 5px;
        border: 1px solid #F6D3CF;
        background-color: #FFFFFF;
        clear: both;
      }
      .population{
        margin-top: 100px;
        margin: auto;
      }
      .xinwenz{
        float: left;
        background-color: #FDE2C4;
        border-top: 1px solid #EAC291;
        border-left: 1px solid #EAC291;
        border-right: 1px solid #EAC291;
        width: 96px;
        height: 34px;
        margin-top: 6px;
        text-align:center;
        line-height:34px;
        margin-left: 6px;
      }

      .dianji{
        float: left;
        background-color: #FDE2C4;
        border-top: 1px solid #EAC291;
        border-left: 1px solid #EAC291;
        border-right: 1px solid #EAC291;
        width: 96px;
        height: 34px;
        margin-top: 6px;
        text-align:center;
        line-height:34px;
        margin-left: 6px;
      }
      table td{
        border: 1px solid #F3F3F3;
      }
      .con{
      	text-align:center;
      }
      table th{
        border: 1px solid #F3F3F3;
      }
      

    </style>
  </head>
  
  <body>
  
  <div class="population">

      <div class="xinwenz">
        <span>新闻总排行</span>
      </div>
      <div class="dianji">
        点击量排行
      </div>
      <div class="box">
        <table class="tableNew">
          <tr>
            <th>序号</th>
            <th>新闻标题</th>
            <th>媒体</th>
            <th>时间</th>
          </tr>
          <% 
               ListDAO listDao = new ListDAO(); 
               ArrayList<List> list = listDao.getAllList();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<10;i++)
	               {
	                  List listN = list.get(i);
	               	  SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
					  String s = sdf.format(listN.getDate());
           %>   
          <tr>
               <td class = "con"><%=i + 1 %></td>
               <td><a href="details.jsp?id=<%=listN.getId()%>"><%=listN.getTitle() %></a></td>
               <td class = "con"><%=listN.getMedia() %></td>
               <td class = "con"><%=s %></td>
             </tr>
          
			<%
                   }
              } 
          %>
        </table>
      </div>
    </div>
  </body>
</html>
