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

<%@include file="Bootstrap/Bootstrap_Links.jsp" %>
<link rel="stylesheet" href="css/front1.css">
<link href="css/notification.css" rel="stylesheet" type="text/css"/>

<script src="js/notificationSearch.js" type="text/javascript"></script>
</head>
<body>
    <%@include file="generalComponents/head.jsp"%>
    <%@include file="generalComponents/navbar.jsp"%>
    <div class="content">
        <h1 id="h0">Notifications</h1>
        <div class="row"><input type="search" id="searchBar" onkeyup="searchNotification()" placeholder="SEARCH"/></div>
        <table class="table" style="text-align: center;" border="0" cellspacing="0">
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
            <tr class="tr">
                <td class="key"><%=n%></td>
                <td class="key"><%=rs.getString(2)%></td>
                <td class="key"><%=rs.getString(3)%></td>
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
