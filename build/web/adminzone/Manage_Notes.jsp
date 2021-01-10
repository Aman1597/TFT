<%-- 
    Document   : uploadform
    Created on : 28 Mar, 2019, 1:11:54 AM
    Author     : Aman Deep
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
        <title>MANAGE NOTES</title>
        <%@include file="../Bootstrap/Bootstrap_Links.jsp" %>
        <link href="admin_css/gridForm.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="admin_css/a_Manage_Notes.css" rel="stylesheet" type="text/css"/>
        <script src="../js/a_Manage_Notes.js" type="text/javascript"></script>
        
    </head>
    <body>
        <%@include file="admin_navbar.jsp"%> 
        <div class="form-outer">
            <h1>UPLOAD NOTES</h1>
            <form action="../upload" method="post" enctype="multipart/form-data" class="grid-outer">
                <div class="grid-container">
                    <div class="grid-item">Department:</div>
                    <div class="grid-item">
                        <select onchange="getSub1(this.value)" name="department" required="">
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
                        <select id="sub" name="subject" required="">
                            <option value="">Select Subject</option>
                        </select>
                    </div>
                    <div class="grid-item">Title:</div>  
                    <div class="grid-item">
                        <input type="text" name="title" required=""/>
                    </div>
                    <div class="grid-item">Description:</div>  
                    <div class="grid-item">
                        <textarea style="text-transform:none;" name="description" required=""></textarea>
                    </div>
                    <div class="grid-item">Select File:</div>  
                    <div class="grid-item">
                        <input name="myfile" type="file" required=""/>
                    </div>
                    <div class="grid-item btn1"><input type="submit" value="upload" /></div>
                </div>
            </form>
            <h1 id="mn">MANAGE NOTES<span class="glyphicon glyphicon-arrow-down"></span></h1>
        </div>
        
        <div class="select">
            <select onchange="getSub2(this.value)" name="department" required="">
                <option value="">Select Department</option>
                <option value="CE">Civil Engg.</option>
                <option value="EL">Electronics Engg.</option>
                <option value="EE">Electrical Engg.</option>
                <option value="AS">Applied Sciences</option>
                <option value="CSE_IT">CSE/IT</option>
                <option value="ME">Mechanical Engg.</option>
            </select>
        </div>
        
        
        <div class="select">
            <select id="sub2" name="subject" onchange="getNotes(this.value)" required="">
                <option value="">Select Subject</option>
            </select>
        </div>
        
        
        <script src="../js/notesSearch.js" type="text/javascript"></script>
        <div class="row"><input type="search" id="searchBar" onkeyup="searchNotes()" placeholder="SEARCH"/></div>
        <table id="gr1" border="0" cellspacing="0" class="table table-dark ">
            <thead>
                <tr class="rh">
                    <th>FILE</th>
                    <th>TITLE</th>
                    <th>DESCRIPTION</th>
                    <th>SUBJECT</th>
                    <th>DEPT.</th>
                    <th>DOWNLOAD</th>
                    <th>DELETE</th>
                </tr>
            </thead>
        </table>
        
    </body>
</html>
<% } %>