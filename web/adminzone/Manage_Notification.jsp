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
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width-device-width , initial-scale=1, user-scalable=yes">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Notification</title>
        <link href="../Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
        <link href="admin_css/gridForm.css" rel="stylesheet" type="text/css"/>
        <style>
            body{
                grid-template-rows: 10vh 90vh auto;
            }
            .form-outer{
                grid-template-rows: 20% 65% 15%;
            }
            .grid-outer{
                padding: 3% 0 17.5% 0;
            }
            .grid-container{
                grid-template-columns: 100% ;
                grid-gap: 2%;
            }
            
            .grid-item:nth-child(even){
                place-items:center;
            }
            .grid-item input{
                text-transform: none;
            }
            .btn1{
                grid-column: 1;
                padding: 0 0 5% 0;
            }
        </style>
    </head>
    <body>
        <%@include file="admin_navbar.jsp"%> 
        
        <div class="form-outer">
            <h1>UPLOAD NOTIFICATION</h1>
            <form action="../codes/uploadnotificationcode.jsp" method="post" class="grid-outer">
                <div class="grid-container">
                    <div class="grid-item" style="padding-top: 2%;">Enter Notification Text:</div>  
                    <div class="grid-item" style="align-items:start;padding-top: 2%;">
                        <input type="text" name="notificationtext" placeholder="" required=""/>
                    </div>
                    <div class="grid-item btn1"><input type="submit" value="Upload" /></div>
                </div>
            </form>
            <h1>MANAGE NOTIFICATION<span class="glyphicon glyphicon-arrow-down"></span></h1>
        </div>

        <div class="table-outer1">
            <div class="grid-outer1">
                <div class="grid-container1">
                    <div class="grid-item1 rh">NOTIFICATION</div>
                    <div class="grid-item1 rh">POSTED DATE</div>
                    <div class="grid-item1 rh">DELETE</div>
                    <%
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
                       PreparedStatement ps=con.prepareStatement("select * from notification order by id desc");
                       ResultSet rs=ps.executeQuery();
                       while(rs.next())
                       {
                    %>
                    <div class="grid-item1"><%=rs.getString(2)%></div>
                    <div class="grid-item1"><%=rs.getString(3)%></div>
                    <div class="grid-item1"><a href="../codes/deletenotification.jsp?id=<%=rs.getInt(1)%>">Delete</a></div>
                    <% } %>
                </div>
            </div>
        </div>        

    </body>
</html>
<% } %>
