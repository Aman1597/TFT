<%-- 
    Document   : Manage_Alumni
    Created on : 29 Aug, 2020, 7:08:31 PM
    Author     : AMAN DEEP
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
        <title>MANAGE ALUMNI</title>
        <%@include file="../Bootstrap/Bootstrap_Links.jsp" %>
        <link href="admin_css/gridForm.css" rel="stylesheet" type="text/css"/>
        <script src="../js/alumniSearch.js" rel="javascript" type="text/javascript"></script>
        <link href="admin_css/a_Manage_Alumni.css" rel="stylesheet" type="text/css"/>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Goldman:wght@700&display=swap" rel="stylesheet">
    </head>
    <body>
        <%@include file="admin_navbar.jsp"%> 
        <div class="form-outer">
            <h1>ADD &nbsp;ALUMNI</h1>
            <form action="../AlumniUpload" method="post" enctype="multipart/form-data" class="grid-outer">
                <div class="grid-container">
                    <div class="grid-item">Name:</div>
                    <div class="grid-item">
                        <input type="text" name="name" required=""/>
                    </div>
                    <div class="grid-item">Branch:</div>  
                    <div class="grid-item">
                        <select name="branch" required="">
                            <option value="">Select Branch</option>
                            <option value="CE">CE</option>
                            <option value="EL">EL</option>
                            <option value="EE">EE</option>
                            <option value="IT">IT</option>
                            <option value="CSE">CSE</option>
                            <option value="ME">ME</option>
                        </select>
                    </div>  
                    <div class="grid-item">Batch:</div>  
                    <div class="grid-item">
                        <input type="number" name="batch" placeholder="Passout Year (eg. 2020)" required=""/>
                    </div>  
                    <div class="grid-item">Email:</div>  
                    <div class="grid-item">
                        <input type="email" name="email"/>
                    </div>  
                    <div class="grid-item">Alumni Pic:</div>  
                    <div class="grid-item">
                        <input name="imgFile" type="file" required=""/>
                    </div>
                    <div class="grid-item btn1"><input type="submit" value="Add" /></div>
                </div>
            </form>
            <h1>MANAGE ALUMNI<span class="glyphicon glyphicon-arrow-down"></span></h1>
        </div>
        
        <div class="row"><input type="search" id="searchBar" onkeyup="searchAlumni()" placeholder="SEARCH"/></div>
        
        <div class="table-outer1">
            <div class="grid-outer1">
                <%
                    DbManager db = new DbManager();
                    String q = "select distinct batch from alumni order by batch desc";
                    ResultSet rss = db.selectQuery(q);
                    while(rss.next())
                    {
                        int batch = rss.getInt(1);
                    
                %>
                <div class="batchNo batchLabel">
                    <div id="div1"><%=rss.getInt(1)%></div>
                    <div id="triangle"></div>                    
                </div>
                <div class="grid-container1 alumniContainer">
                    <%
                        String query = "select * from alumni where batch = '"+batch+"'";
                        ResultSet rs= db.selectQuery(query);

                        while(rs.next())
                        {
                    %>
                    <div class="grid-item2 column">
                        <img src="<%=request.getContextPath() + "/AlumniImages/" + rs.getString(6)%>" />
                        <h2 class="key"><%=rs.getString(2)%></h2>
                        <h3 class="key"><%=rs.getString(3)%>&nbsp; &nbsp;Batch:&nbsp; <%=rs.getInt(4)%></h3>
                        <%
                        if(rs.getString(5)== null || rs.getString(5).equalsIgnoreCase("null")){
                        %>
                        <h3 class="key"><m class="mailIcon">&#9993;</m>:&nbsp; NA</h3>
                        <%
                        }else{
                        %>
                        <h3 class="key"><m class="mailIcon">&#9993;</m>:&nbsp;<%=rs.getString(5)%></h3>
                        <% } %>
                        <h3><a href="../codes/deleteAlumni.jsp?filename=<%=rs.getString(6)%>">DELETE</a></h3>
                    </div>
                    <% } %>
                </div>
                <% } %>
            </div>                                  
        </div>

    </body>
</html>
<% } %>