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
    <link rel="stylesheet" href="css/AboutUs.css">
    </head>
    <body>
    
  <%@include file="head.jsp"%>
        <%@include file="navbar.jsp"%>
       
        <div class="content">
                
         <div class="gal2"><h1>About Us</h1></div>
        </div>
          <div class="row" >


        <div class="col-lg-3 col-md-4 col-xs-12" >
            <div class="tab">
                
            <button class="btn "  onclick="aboutus(event, 'description1') " id="first">Director's word</button>
                        <button class="btn "  onclick="aboutus(event, 'description4') " id="first">CSA Chairman's word</button>

      <button class="btn "  onclick="aboutus(event, 'description5') " id="first">Convener's word</button>
              <button class="btn " onclick="aboutus(event, 'description2')" >Our Aim</button>
              <button class="btn"  onclick="aboutus(event, 'description3')" >History</button>
                 
            </div>
                
              </div>
            
            
            <div class="col-lg-9 col-md-8 col-xs-12">
            
            <div id="description1" class="ds">
          
            <ul>
                
                <li>
               <h2>Albert Einstein described two types of scientific theories: "Constructive theories" and "principle theories". Constructive theories are constructive models for phenomena: for example, kinetic energy. Principle theories are empirical generalisations such as Newton's laws of motion.[8]
                    </h2> 
                   
</li>
                </ul>
            </div>
            
            
            
                <div id="description4" class="ds">
          
            <ul>
                
                <li>
               <h2>The harder you work for something, the greater you’ll feel when you achieve it.</h2> 
                   
</li>
                </ul>
            </div>
                        <div id="description5" class="ds">
          
            <ul>
                
                <li>
               <h2> Success doesn’t just find you. You have to go out and get it.</h2> 
                   
</li>
                </ul>
            </div>
            
                   <div id="description2" class="ds">
            <ul>
                <li>
               <h2> Technical Education Council aims to usher the budding technocrats for their career so that they can venture into many avenues . This enables them to shrewd about their future endeavour and plays an imperative role in enhancing their
personality.</h2>
</li>
                <li>
 <h2>             
TEC involves the coming together of personnel of diverse field and essence but alike ardent to teach the students. All the members of TFT have meticulous knowledge of their field and hoards the affable way of teaching.
They all excel in their field and keep potential to give reverential stuffs to them.</h2>
</li>
                <li><h2>TEC arranges classes for first year students for subjects like maths , C language, electrical which they find appalling because of the sudden overburden of syllabus and content as they come here from different background and some
students find it difficult to adjust and accommodate according to syllabus and subjects . To lighten their burden and boosting the tyros in getting misicible
with the condition or situation , we accord these classes after first -sessional and with time slot in morning and evening and too taking in care of girl’s hostel
timing , accomplish their stuff before second- sessional. Also we arrange classes for second year students in subjects like SOM, Data Structure ,JAVA.</h2></li>
               </ul>
            </div>
            
            
            
            
            

                       <div id="description3" class="ds">
                <ul>
                    <li>
                   <h2> In 2011, Manish from electronics branch and Himani from compuer science
engineering felt the need of fresh students and also with motto of communicating the additional stuffs like robotics, advance languages and all.They conceive the idea of Teach For Technocrats to make all the above stuffs
available at a single place.</h2>
                  </li>
                    <li>

                        <h2>We teach students in very amicable manner and also students find it very productive . We tend to impart not only knowledge but the etiquettes that are
essential for a professional .</h2>
    </li>
                 </ul>
                </div>
            
      <!----- <div id="description4" class="ds">
          
            <ul>
                
                <li>
               <h2>Tim Berners-Lee invented the World Wide Web in 1989, about 20 years after the first connection was established over what is today known as the Internet. At the time, Tim was a software engineer at CERN, the large particle physics laboratory near Geneva, Switzerland.</h2> 
                   
</li>
                </ul>
            </div> -->
            
              </div>
              
              
              
                    
                    
              </div>
          
        
        
        

        
        
        
        
        
        
        <br/>
        <br/>
        <br/>
        
        
        
 <%@include file="foot.jsp"%>   
        
        
        
        
        
        
        
        
        <script>
        
        function aboutus(evt, name){
            var i,tab,links;
        tab=document.getElementsByClassName("ds");
             
            for(i=0;i<tab.length;i++){
                tab[i].style.display= "none";
            }
            links=document.getElementsByClassName("btn");
            for(i=0;i<links.length;i++){
                links[i].className=links[i].className.replace("active", "");
            
            }
document.getElementById(name).style.display="block";
            evt.currentTarget.className+=" active";
        }
        document.getElementById("first").click();
        </script>
    </body>
</html> 