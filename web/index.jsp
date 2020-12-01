<%-- 
    Document   : index
    Created on : 28 Mar, 2019, 6:54:26 PM
    Author     : Aman Deep
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width-device-width , initial-scale=1, user-scalable=yes">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<title>TFT</title>

<!--<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" >
<link href="https://fonts.googleapis.com/css?family=Arvo" rel="stylesheet">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">-->

<link href="Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
<link href="Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
<script src="Bootstrap/js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
<script src="Bootstrap/js/popper.min.js" type="text/javascript"></script>
<script src="Bootstrap/js/bootstrap-v4.2.1.min.js" type="text/javascript"></script>
<link href="Bootstrap/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

<link rel="stylesheet" href="css/front1.css">
</head>
<body>
    <%@include file="head.jsp"%>
    <%@include file="navbar.jsp"%>    
    
<div class="content">
    <% 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
        PreparedStatement ps=con.prepareStatement("select notificationtext from notification order by id desc");
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
    %>
    <marquee class="mrq"><%=rs.getString(1)%></marquee>
    <% 
        }
        else
        {
    %>
    <marquee class="mrq">Notifications...</marquee>
    <% 
        }
    %>
<div class="carousel slide" data-ride="carousel" data-interval="5000" id="an">

      <ol class="carousel-indicators">
    <li data-target="#an" data-slide-to="0" class="active"></li>
        <li data-target="#an" data-slide-to="1"></li>
        <li data-target="#an" data-slide-to="2"></li>
   </ol>
<div class="carousel-inner" >
    
    
    <div class="carousel-item active" >
<img src="image/2.jpg">



 <div class="carousel-caption">
   
     <h1>"Education is not the learning of facts,<br/>
         but the training of the mind to think”<br/>
     ~ Albert Einstein
     </h1>

</div>
</div>
    <div class="carousel-item ">
    <img src="image/1.jpg" alt="loading...">
    <div class="carousel-caption">
     <h1>"An investment in knowledge <br/>
always pays the best interest”<br/>
</h1>
        <br/>
     <h3>~ Ben Franklin
</h3>
</div>
</div>


    <div class="carousel-item">
    <img src="image/3.jpg" alt="loading...">
        
        <div class="carousel-caption">
     <h1>"If a child can’t learn the way we teach, <br/>
maybe we should teach the way they learn”</h1><br/>
     <h3>~ Ignacio Estrada
</h3>
</div>
    </div>
    </div>
<a href="#an" class="carousel-control-next" data-slide="next">
    <span class="carousel-control-next-icon"></span>
    </a>
    <a href="#an" class="carousel-control-prev" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
    </a>
</div>

<br/>
    <br/>

    
    
    
    
      <div class=" deptimg"> 
      <div class="dept" id="4">
    <h1>Our Departments</h1>
    </div> 


<div class="row" >
     <div class="col-sm-4 anshika"><a href="CE.jsp" style="color: #d9e3d7">
    <img src="image/civil.png" alt="mathematics" class="a1">
     <div class="text" id="41">
         <h2>Civil<br/>Engineering</h2>
     </div></a>
    </div>
    

     <div class="col-sm-4 anshika"><a href="CSE_IT.jsp" style="color: #d9e3d7">
    <img src="image/c.png" class="a1">
   <div class="text" id="42">
       <h2>CSE/IT</h2>
   </div></a></div>
     <div class="col-sm-4 anshika" ><a href="EE.jsp" style="color: #d9e3d7">
    <img src="image/electrical.png"  class="a1">
      <div class="text" id="43">
    <h2>Electrial<br/>Engineering</h2>
      </div></a></div>
     <div class="col-sm-4 anshika"><a href="EL.jsp" style="color: #d9e3d7">
    <img src="image/electronics.png" alt="mathematics" class="a1">
     <div class="text" id="41">
         <h2>Electronics<br/>Engineering</h2>
     </div></a>
    </div>
     <div class="col-sm-4 anshika"><a href="ME.jsp" style="color: #d9e3d7">
    <img src="image/mechanics.png"  class="a1">
  <div class="text" id="44">
    <h2>Mechanical<br/>Engineering</h2>
  </div></a></div>
    
     <div class="col-sm-4 anshika"><a href="AS.jsp" style="color: #d9e3d7">
    <img src="image/maths.png" alt="mathematics" class="a1">
     <div class="text" id="41">
         <h2>Applied<br/>Sciences</h2>
     </div></a>
    </div>
</div>

    </div>
    
    
    
    
    
    
    
    
    
    
    
    <%@include file="foot.jsp"%>
    
    </div> 
    


    
   
</body>
</html>