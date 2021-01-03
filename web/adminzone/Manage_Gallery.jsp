<%-- 
    Document   : Manage_Gallery
    Created on : 19 Aug, 2020, 11:07:55 AM
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../generalComponents/metaTags.jsp" %>
        <title>MANAGE GALLERY</title>
        <link href="../Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
        <link href="admin_css/gridForm.css" rel="stylesheet" type="text/css"/>
        <link href="admin_css/a_Manage_Gallery.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="admin_navbar.jsp"%> 
        <div class="form-outer">
            <h1>UPLOAD IMAGE</h1>
            <form action="../GalleryUpload" method="post" enctype="multipart/form-data" class="grid-outer">
                <div class="grid-container">
                    <div class="grid-item">Select &nbsp;Image &nbsp;File:</div>  
                    <div class="grid-item">
                        <input type="file" name="imgFile" required=""/>
                    </div>
                    <div class="grid-item btn1"><input type="submit" value="upload" /></div>
                </div>
            </form>
            <h1>MANAGE GALLERY<span class="glyphicon glyphicon-arrow-down"></span></h1>
        </div>
        
        <div class="table-outer1">
            <div class="grid-outer1">
                <div class="grid-container1">
                    <%
                       DbManager db = new DbManager();
                       
                       String query = "select * from gallery order by uploaddate desc";
                       ResultSet rs= db.selectQuery(query);
                       
                       while(rs.next())
                       {
                    %>
                    <div class="grid-item2">
                        <img src="<%=request.getContextPath() + "/GalleryImages/" + rs.getString(2)%>" />
                        <h2>Upload Date: <%=rs.getString(3)%></h2>
                        <h2><a href="../codes/deleteGalleryImages.jsp?filename=<%=rs.getString(2)%>">DELETE</a></h2>
                    </div>
                    <% } %>
                </div>
            </div>
        </div>
    </body>
</html>
<% } %>
