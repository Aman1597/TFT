<%-- 
    Document   : uploadnotification
    Created on : 19 Apr, 2019, 4:23:42 PM
    Author     : Aman Deep
--%>

<%
if(session.getAttribute("id")==null)
{
    response.sendRedirect("../login.jsp");
}
else
{
%>
<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DbManager"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../generalComponents/metaTags.jsp" %>
        <title>MANAGE NOTIFICATION</title>
        <link href="../Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
        <link href="admin_css/gridForm.css" rel="stylesheet" type="text/css"/>
        <link href="admin_css/a_notification.css" rel="stylesheet" type="text/css"/>
        <script src="../js/notificationSearch.js" type="text/javascript"></script>
    </head>
    <body>
        <%@include file="admin_navbar.jsp"%> 
        
        <div class="form-outer">
            <h1>UPLOAD NOTIFICATION</h1>
            <form action="../codes/uploadnotificationcode.jsp" method="post" class="grid-outer">
                <div class="grid-container">
                    <div class="grid-item">Enter Notification Text:</div>  
                    <div class="grid-item">
                        <input type="text" name="notificationtext" required=""/>
                    </div>
                    <div class="grid-item btn1"><input type="submit" value="Upload" /></div>
                </div>
            </form>
            <h1>MANAGE NOTIFICATION<span class="glyphicon glyphicon-arrow-down"></span></h1>
        </div>
        <div class="row"><input type="search" id="searchBar" onkeyup="searchNotification()" placeholder="SEARCH"/></div>
        <div class="table-outer1">
            <div class="grid-outer1">
                <div class="grid-container1">
                    <div class="grid-item1 rh">NOTIFICATION</div>
                    <div class="grid-item1 rh">POSTED DATE</div>
                    <div class="grid-item1 rh">DELETE</div>
                </div>
                <%
                   DbManager db = new DbManager();
                   String query = "select * from notification order by id desc";
                   ResultSet rs= db.selectQuery(query);
                   while(rs.next())
                   {
                %>
                <div class="grid-container1 tr">
                    <div class="grid-item1 key"><%=rs.getString(2)%></div>
                    <div class="grid-item1 key"><%=rs.getString(3)%></div>
                    <div class="grid-item1"><a href="../codes/deletenotification.jsp?id=<%=rs.getInt(1)%>">Delete</a></div>
                </div>
                <% } %>
            </div>
        </div>        

    </body>
</html>
<% } %>
