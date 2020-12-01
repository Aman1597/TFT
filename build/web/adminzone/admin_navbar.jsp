<nav class="navbar navbar-expand-md navbar-dark sticky-top">  
<div class="container-fluid">  

<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#mynav">  
<span class="navbar-toggler-icon"></span></button>  

<div class="collapse navbar-collapse" id="mynav">  
<ul class="navbar-nav ml-auto">  
     
     <li class="nav-item" >  

    <a  class="nav-link" href="Manage_Notification.jsp">Manage Notification <span class="glyphicon glyphicon-bell"></span></a>  
    </li>
    <li class="nav-item " >  

        <a  class="nav-link" href="Add_Subject.jsp">Add Subject <span class="glyphicon glyphicon-book"></span></a>  
    </li>  

      
      <li class="nav-item " >  

    <a  class="nav-link" href="Manage_Notes.jsp">Manage Notes <span class="glyphicon glyphicon-list-alt"></span></a>  
    </li>  
    
    <li class="nav-item" >  

    <a  class="nav-link" href="Manage_Alumni.jsp">Manage Alumni <span class="glyphicon glyphicon-king"></span></a>  
    </li>  
      <li class="nav-item" >  

    <a  class="nav-link" href="Manage_Gallery.jsp">Manage Gallery <span class="glyphicon glyphicon-picture"></span></a>  
    </li> 
    
    <li class="nav-item" >  

    <a  class="nav-link" href="logout.jsp">Logout <span class="glyphicon glyphicon-off"></span></a>  
    </li>  
    </ul>  
 </div></div></nav>  
<script>
    
    var btns=document.getElementsByClassName("nav-item");
    var b=document.getElementsByClassName("nav-link");
    var curlocation = location.href;
    
    for (var i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function() {
            var current = document.getElementsByClassName("active");
            current[0].className = current[0].className.replace(" active", "");
            this.className += " active";
        });
        btns[i].classList.remove("active");
        if(b[i].href == curlocation){
            btns[i].classList.add("active");
        }
    }
    var cur = document.getElementsByClassName("active");
    if(cur[0]==null)
    {
        btns[0].classList.add("active");
    }
</script>
