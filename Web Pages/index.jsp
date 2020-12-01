<%-- 
    Document   : index
    Created on : 27 Mar, 2019, 12:11:41 PM
    Author     : Aman Deep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width-device-width , initial-scale=1, user-scalable=yes">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<title>TFT</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" >
<link href="https://fonts.googleapis.com/css?family=Arvo" rel="stylesheet">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/front1.css">

</head>
<body>
    
    <div class="row" style="margin:3em 0 3em 0">
 <div class="col-sm-2 ans">
    <img src="image/logo.jpg">
    </div>
     <div class="col-sm-10 ans">
         <div class="capt"><h1>Teach For Technocrats</h1></div>
     </div>
    </div>
<nav class="navbar navbar-expand-md navbar-dark sticky-top">  
<div class="container-fluid">  
<a class="navbar-brand" href="#"> <i class="fa fa-Heart "></i></a>  
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#mynav">  
<span class="navbar-toggler-icon"></span></button>  

<div class="collapse navbar-collapse" id="mynav">  
<ul class="navbar-nav ml-auto">  
   <li class="nav-item active" >  

   <a class="nav-link" href="#">Home <span class="glyphicon glyphicon-home"></span></a>
    </li>  
     <li class="nav-item" >  

    <a  class="nav-link" href="#">Notification</a>  
    </li>
    <li class="nav-item " >  

    <a  class="nav-link" href="#">About Us</a>  
    </li>  

      <li class="nav-item" >  
<div class="dropdown dept">
<a  class="nav-link" data-toggle="dropdown">Department<span class="caret"></span></a>  
      <ul class="dropdown-menu m1">
      <li><a href="#41">Department 1</a></li>
       <li><a href="#42">Department 2</a></li>
          <li><a href="#43">Department 3</a></li>
        <li><a href="#44">Department 4</a></li>
            <li><a href="#4">Department 5</a></li>
      </ul>
      </div>
    </li>  
    <li class="nav-item" >  

    <a  class="nav-link" href="#">Alumni</a>  
    </li>  
    <li class="nav-item" >  

    <a  class="nav-link" href="#5">Connect us  <span class="glyphicon glyphicon-earphone	
                "></span></a>  
    </li>  
    <li class="nav-item" >  

    <a  class="nav-link" href="login.jsp">Admin Login</a>  
    </li>  
    </ul>  
 </div></div></nav> 

    
    
    
    
    
<div class="content">
    <marquee class="mrq">important notification.........</marquee>
<div class="carousel slide" data-ride="carousel" data-interval="4000" id="an">

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
    <h1>Our Department</h1>
    </div> 


<div class="row" style="margin:3em 0 em 0">
 <div class="col-sm-3 anshika">
    <img src="image/maths.png" alt="mathematics" class="a1">
     <div class="text" id="41">
         <h2><a href="#">Engineering Mathematics</a></h2>
     </div>
    </div>
     <div class="col-sm-3 anshika">
    <img src="image/c.png" class="a1">
   <div class="text" id="42">
       <h2><a href="www.google.com">Concept of C programming</a></h2>
     </div></div>
     <div class="col-sm-3 anshika" >
    <img src="image/electrical.png"  class="a1">
      <div class="text" id="43">
    <h2>Electrial</h2>
     </div></div>
     <div class="col-sm-3 anshika">
    <img src="image/mechanics.png"  class="a1">
  <div class="text" id="44">
    <h2>Mechanics</h2>
     </div></div>
</div>

    </div>
    
    
    
    
    
    
    
    
    
    
    
    
    	   <div class="top" id="5" >
		<div id="meee">
            <div  class="c1"><a name="whatever"><br />Get In Touch</a></div>
		<hr style="border-top-color: aliceblue" align="left" width="10%" margin-left="100px"/>
	<br />
		<div class="c2">Shivam _____
			<br />
			Stuent Representative,TFT
			<br />
			Contact No: xxxxxxxxxx
			<br />
		</div>
		</div>
		<div class="break"></div>
		<div class="follow"><br />Follow  Us</div>
		<hr style="border-top-color: aliceblue"align="left"width="10%">
			<div class="try">
		<a href="https://www.facebook.com" class="fa fa-facebook"></a>
		<a href="#" class="fa fa-instagram"></a>
		<a href="https://twitter.com/login" class="fa fa-twitter"></a>
		<a href="https://www.youtube.com/" class="fa fa-youtube"></a><br />
			</div>
    </div>
    
    </div> 
    


    
   
</body>



