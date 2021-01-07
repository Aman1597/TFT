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
  <%@include file="generalComponents/metaTags.jsp" %>
  <title>Gallery</title>
  <%@include file="Bootstrap/Bootstrap_Links.jsp" %>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">

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
<%@include file="generalComponents/head.jsp"%> 
<%@include file="generalComponents/navbar.jsp"%>
    
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
    <%@include file="generalComponents/foot.jsp"%>
</div>

        
</body>
</html>
