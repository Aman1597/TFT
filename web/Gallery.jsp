<%-- 
    Document   : Gallery
    Created on : 27 Apr, 2019, 9:04:43 PM
    Author     : Aman Deep
--%>

<%@page import="mypack.DbManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Gallery</title>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<script src="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">


<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" >


<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">


<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/Gallery.css">
<link rel="stylesheet" href="css/front1.css">
<script src="http://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
<script>
    $(document).ready(function(){
        $(".fancybox").fancybox({
            openEffect: "none",
            closeEffect: "none"
        });

        $(".zoom").hover(function(){

            $(this).addClass('transition');
        }, function(){

            $(this).removeClass('transition');
        });
    });

</script>
</head>
<body>
<%@include file="head.jsp"%> 
    <%@include file="navbar.jsp"%>
    
    <div class="content">
        
        
        
         <div class="gal2"><h1>Gallery</h1></div>
    <div class="row gal1">

        <%
            DbManager db = new DbManager();
            String query = "select * from gallery order by uploaddate desc" ;
            ResultSet rs = db.selectQuery(query);
           
            while(rs.next())
            {
        %>
                    
        <div class="col-lg-3 col-md-4 col-xs-6 thumb">
            <a href="<%=request.getContextPath() + "/GalleryImages/" + rs.getString(2)%>" class="fancybox" rel="ligthbox">
                <img  src="<%=request.getContextPath() + "/GalleryImages/" + rs.getString(2)%>" class="zoom img-fluid "  alt="">
            </a>
        </div>
        
        <% } %>   

    </div>
    <%@include file="foot.jsp"%>
        
</div>

        
</body>
</html>
