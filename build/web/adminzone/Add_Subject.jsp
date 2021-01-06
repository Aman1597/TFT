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
        <%@include file="../generalComponents/metaTags.jsp" %>
        <title>ADD SUBJECT</title>
        <%@include file="../Bootstrap/Bootstrap_Links.jsp" %>
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

