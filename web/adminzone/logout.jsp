<%-- 
    Document   : logout
    Created on : 2 May, 2019, 12:23:57 PM
    Author     : Aman Deep
--%>

<%
    session.invalidate();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
        <script>
            function logout()
            {
                window.history.forward();
                window.setTimeout("alert('You have successfully logged out');window.location.href='../index.jsp'",1000);
            }
        </script>
    </head>
    <body onload="logout()" bgcolor="black">
        <h1 style="color: white;">Logging out please wait...</h1>
    </body>
</html>