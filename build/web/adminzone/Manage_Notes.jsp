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
        <meta name="viewport" content="width-device-width , initial-scale=1, user-scalable=yes">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Notes</title>
        <script src="../Bootstrap/js/bootstrap-v4.2.1.min.js" type="text/javascript"></script>
        <link href="../Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
        <link href="admin_css/gridForm.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <style>
            body{
                grid-template-rows: 10vh 90vh 10vh 10vh auto;
            }
            .form-outer{
                grid-template-rows: 16.5% 68.5% 15%;//85%;
                grid-template-columns: 34%;
            }
            .grid-outer{
                padding: 0 0 8% 0;
            }
            .btn1{
                padding: 5% 0 3% 0;
            }
            .grid-item textarea{
                height:60%;
            }
            .grid-item textarea:focus{
                border: 0.5px solid white;
            }
            .grid-item input[type="file"]{
                border:none;
                font-size: 1.8rem;
            }
            
            .select{
                width: inherit;
                text-align: center;
            }
            .select select{
                font-family: serif;
                background:rgba(8, 36, 69, 0.98);
                font-size: 1.8rem;
                padding: 0 1% 0 1%;
                height: 70%;
                width: 20%;
                border: none;
            }
            @media screen and (max-width: 1050px) {
                .form-outer {
                    grid-template-columns: 60%;
                }
            }
        </style>
        
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
        
        <table id="gr1" border="0" cellspacing="0" class="table table-dark ">
            <thead>
                <tr class="rh">
                        <th>FILE</th>
                        <th>TITLE</th>
                        <th>DESCRIPTION</th>
                        <th>SUBJECT</th>
                        <th>DOWNLOAD</th>
                        <th>DELETE</th>
                </tr>
            </thead>
        </table>
        <script>
            function getSub1(dept){
                $.ajax({

                    url: 'ResponseSub.jsp',
                    type: 'POST',
                    data: { datapost : dept},
                    success: function(result){
                        $('#sub').html(result);
                    }
                });
            }
            function getSub2(dept){
                $.ajax({

                    url: 'ResponseSub.jsp',
                    type: 'POST',
                    data: { datapost : dept},
                    success: function(result){
                        $('#sub2').html(result);
                    }
                });
            }
            function getNotes(sub){
                $.ajax({

                    url: 'ResponseNotes.jsp',
                    type: 'POST',
                    data: { datapost : sub},
                    success: function(result){
                        $('#gr1').html(result);
                    }
                });
            }
        </script>
        
        
    </body>
</html>
<% } %>