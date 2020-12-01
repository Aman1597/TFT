<%-- 
    Document   : Add_Subject
    Created on : 16 Aug, 2020, 2:09:46 AM
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width-device-width , initial-scale=1, user-scalable=yes">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
        <link href="admin_css/gridForm.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="admin_navbar.jsp"%> 
        <div class="form-outer">
            <h1>ADD SUBJECT</h1>
            <form action="../codes/addSubjectCode.jsp" method="post" class="grid-outer">
                <div class="grid-container">
                    <div class="grid-item">Department:</div>
                    <div class="grid-item">
                        <select name="department" required="">
                            <option value="">Select Department</option>
                            <option value="CE">Civil Engg.</option>
                            <option value="EL">Electronics Engg.</option>
                            <option value="EE">Electrical Engg.</option>
                            <option value="AS">Applied Sciences</option>
                            <option value="CSE_IT">CSE/IT</option>
                            <option value="ME">Mechanical Engg.</option>
                        </select>
                    </div>
                    <div class="grid-item">Subject:</div>  
                    <div class="grid-item">
                        <input type="text" name="subject" required=""/>
                    </div>
                    <div class="grid-item btn1"><input type="submit" value="Add" /></div>
                </div>
            </form>
        </div>
    </body>
</html>
<% } %>

