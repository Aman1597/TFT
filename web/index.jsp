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

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" >
<link href="https://fonts.googleapis.com/css?family=Arvo" rel="stylesheet">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

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