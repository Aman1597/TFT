
<%@page import="mypack.DbManager"%>
<%@page import="java.sql.ResultSet"%>
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
    <link rel="stylesheet" href="css/alumni.css">
    </head>
    <body>
    
  <%@include file="head.jsp"%>
        <%@include file="navbar.jsp"%>
         
          <div class="gal2"><h1>Our Alumni</h1></div>
        
        
        <div class="row">
            
            <%
                DbManager db = new DbManager();
                String query = "select * from alumni order by batch desc" ;
                ResultSet rs = db.selectQuery(query);

                while(rs.next())
                {
            %>
            <div class="column">
              <div class="alu">
                <img src="<%=request.getContextPath() + "/AlumniImages/" + rs.getString(5)%>" alt="Image Unavailable">
                <div class="cont">
                  <h2><%=rs.getString(2)%></h2>
                  <h5 class="title t2"><%=rs.getString(3)%></h5>
                  <p class="title t1">Batch:&nbsp; <%=rs.getInt(4)%></p>
                </div>
              </div>
            </div>
            <%  } %>
            
        </div>
          <%@include file="foot.jsp"%>
        
        
    </body>
</html>