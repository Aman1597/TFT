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
            .btn1{
                grid-column: 1;
                padding: 3% 0 3% 0;
            }
            .grid-item input[type="file"]{
                border:none;
                width: 24.4%;// 52%;
                font-size: 1.8rem;
            }
            .grid-container1{
                display: grid;
                grid-template-columns: auto auto auto;
                grid-column-gap: 2%;
                margin: 0 3% 1% 3%;
                padding: 0 2% 2.5% 2%;
                background-color: white;
                box-shadow: 0 10px 15px 5px grey;
            }
            .grid-item2{
                display: grid;
                place-items:center;
                background-color: white;
                margin-top: 8%;
                box-shadow: 0 10px 15px 0px grey;
            }
            .grid-item2:hover{
                box-shadow: 0 20px 30px 10px grey;
            }
            .grid-item2 img{
                height: 30em;
                width: 30em;
                margin: 4% 0 2% 0;
            }
            @media screen and (max-width: 650px){
                .grid-container1{
                    grid-template-columns: auto !important;
                }
                .grid-item input[type="file"]{
                    width: 60% !important;
                }
            }
            @media screen and (max-width: 1050px){
                .grid-container1{
                    grid-template-columns: auto auto;
                    padding: 0 3% 0 3%;
                    grid-column-gap: 3%;
                }
                .grid-item input[type="file"]{
                    width: 45%;
                }
            }
        </style>
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
