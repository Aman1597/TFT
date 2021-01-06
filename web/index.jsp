<%-- 
    Document   : index
    Created on : 28 Mar, 2019, 6:54:26 PM
    Author     : Aman Deep
--%>

<%@page import="mypack.DbManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="generalComponents/metaTags.jsp" %>
<title>TFT</title>

<%@include file="Bootstrap/Bootstrap_Links.jsp" %>
<!--<link href="Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
<link href="Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
<script src="Bootstrap/js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
<script src="Bootstrap/js/popper.min.js" type="text/javascript"></script>
<script src="Bootstrap/js/bootstrap-v4.2.1.min.js" type="text/javascript"></script>
<link href="Bootstrap/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>-->

<link rel="stylesheet" href="css/front1.css">
</head>
<body>
    <%@include file="generalComponents/head.jsp"%>
    <%@include file="generalComponents/navbar.jsp"%>    
    
<div class="content">
    <% 
        DbManager db = new DbManager();
        String query = "select notificationtext from notification order by id desc";
        ResultSet rs = db.selectQuery(query);        
        if(rs.next())
        {
    %>
    <marquee class="mrq"><%=rs.getString(1)%></marquee>
    <% 
        }
        else
        {
    %>
    <marquee class="mrq">Latest Notification...</marquee>
    <% 
        }
    %>
    <%@include file="generalComponents/carouselSlider.jsp" %>
    <br/><br/>

    <%@include file="generalComponents/departmentSection.jsp" %>
    
    <%@include file="generalComponents/foot.jsp"%>
    
</div> 
</body>
</html>