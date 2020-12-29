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
        <meta name="viewport" content="width-device-width , initial-scale=1, user-scalable=yes">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MANAGE ALUMNI</title>
        <link href="../Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
        <link href="admin_css/gridForm.css" rel="stylesheet" type="text/css"/>
        <script src="../js/alumniSearch.js" rel="javascript" type="text/javascript"></script>
        <style>
            body{
                grid-template-rows: 10vh 90vh auto;
            }
            .form-outer{
                grid-template-rows: 20% 65% 15%;
            }
            .grid-outer{
                padding: 0 0 14% 0;
            }
            .grid-container{
                padding: 2% 2% 3% 2%;
            }
            .grid-item input[type="text"]{
                text-transform: capitalize;
            }
            .grid-item input[type="email"]{
                text-transform: none;
            }
            .grid-item input[type="file"]{
                border:none;
                font-size: 1.8rem;
            }
            .btn1{
                padding: 5.5% 0 4% 0;
            }
            .grid-container1{
                display: grid;
                grid-template-columns: 1fr 1fr 1fr;
                grid-column-gap: 2%;
                margin: 0 3% 1% 3%;
                padding: 0 2% 3.2% 2%;
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
            .batchNo
            {
                margin: 3% 3% 1% 3%;
                display: grid;
                grid-template-columns: 225px 0% auto;
                background-color: white;
                box-shadow: -5px 5px 13px 0px grey;
            }
            #div1
            {
                height: 6vh; 
                line-height: 6vh;
                text-align: center;
                background-color: grey;// whitesmoke;
                color: white;// whitesmoke;//grey;
                font-weight: bold;
                font-size: 2.4rem;
            }
            #triangle{
                height: 0px;
                border-top: 3vh solid transparent;
                border-right: 0px solid transparent;
                border-bottom: 3vh solid transparent;
                border-left: 6vh solid grey;// whitesmoke;
                border-left: collapse;
            }
            @media screen and (max-width: 650px){
                .grid-container1{
                    grid-template-columns: 1fr !important;// auto !important;
                    padding-bottom: 6% !important;
                }
            }
            @media screen and (max-width: 1050px){
                .grid-container1{
                    grid-template-columns: 1fr 1fr;
                    padding: 0 3% 4% 3%;
                    grid-column-gap: 3%;
                }
            }
            body .row{
                margin: 5vh 0 3vh 0;
            }
        </style>
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
                        if(rs.getString(5)==null){
                        %>
                        <h3 class="key">NA</h3>
                        <%
                        }else{
                        %>
                        <h3 class="key"><%=rs.getString(5)%></h3>
                        <% } %>
                        <h3><a href="../codes/deleteAlumni.jsp?filename=<%=rs.getString(5)%>">DELETE</a></h3>
                    </div>
                    <% } %>
                </div>
                <% } %>
            </div>
        </div>

    </body>
</html>
<% } %>