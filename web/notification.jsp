<%-- 
    Document   : notification
    Created on : 28 Apr, 2019, 3:40:34 AM
    Author     : Aman Deep
--%>

<%@page import="mypack.DbManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="generalComponents/metaTags.jsp" %>
<title>Notification</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" >
<link href="https://fonts.googleapis.com/css?family=Arvo" rel="stylesheet">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/front1.css">

<style>
    body
    {
        background-color: whitesmoke;
        //font-family:sans-serif;
    }
    .content
    {
        margin: 0 auto 0 auto;
        width: 99%;
        //padding-bottom: 100px;
    }
    #table{
        margin-bottom: 6vh;
    }
    table tr
    {
        font-size: 18px;
        height: 50px;
        border-bottom: 1px solid;
    }
    th{ 
        background-color: rgba(8, 36, 69, 0.98); 
        color: white;
    }
    #h0
    {
    font-size:35px;
    letter-spacing: 2px;
    font-weight:bold;
    margin-top: 5vh;//0.72em;
    margin-bottom:7vh; //1em;
    color:#082445;
    text-align: center;
    }
    tr:nth-child(odd)
    {
        background: white;//#f2f2f2;
    }
    @media screen and (min-width: 601px) {
        #h0 {
          font-size: 60px;//4vw;
        }
    }
    body .row{
        margin-bottom: 10vh;
    }
    body .row input[type="search"]{
        margin: 0 auto;
        border-radius: 3vw;
        outline: none;
        padding: 0 1.5vw;
        font-size: 1.2vw;
        padding-bottom: 0.45vh;
        height: 6.5vh;
        border: none;// 2px solid grey;
        box-shadow: 0 0 10px grey;
        line-height: calc(6.5vh + 4px);//6.5vh;
        width: 50vw;//calc(100vw - 7rem);
    }
</style>
<script src="js/notificationSearch.js" type="text/javascript"></script>
</head>
<body>
    <%@include file="generalComponents/head.jsp"%>
    <%@include file="generalComponents/navbar.jsp"%>
    <div class="content">
        <h1 id="h0">Notifications</h1>
        <div class="row"><input type="search" id="searchBar" onkeyup="searchNotification()" placeholder="SEARCH"/></div>
        <table class="table" id="table" style="text-align: center;" border="0" cellspacing="0">
            <tr>
                <th style="width: 17%;">S.No.</th>
                <th>NOTIFICATIONS</th>
                <th>POSTED DATE</th>
            </tr>
            <%
               int n=1;
               DbManager db = new DbManager();
               String query = "select * from notification order by id desc";
               ResultSet rs = db.selectQuery(query);
               while(rs.next())
               {  
            %>
            <tr>
                <td><%=n%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
            </tr>
            <% 
               n++;
               } 
            %>
        </table>
        <%@include file="generalComponents/foot.jsp"%>
    </div>
    
</body>
</html>
