
<%@page import="mypack.DbManager"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="generalComponents/metaTags.jsp" %>
<title>Our Alumni</title>

<%@include file="Bootstrap/Bootstrap_Links.jsp" %>
    <link rel="stylesheet" href="css/front1.css">
    <link rel="stylesheet" href="css/alumni.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Goldman:wght@700&display=swap" rel="stylesheet">
    <script src="js/alumniSearch.js" rel="javascript" type="text/javascript"></script>
    </head>
    <body>
    
  <%@include file="generalComponents/head.jsp"%>
        <%@include file="generalComponents/navbar.jsp"%>
         
          <div class="gal2"><h1>Our Alumni</h1></div>
          <div class="row"><input type="search" id="searchBar" onkeyup="searchAlumni()" placeholder="SEARCH"/></div>
        <%
            DbManager db = new DbManager();
            String q = "select distinct batch from alumni order by batch desc";
            ResultSet rss = db.selectQuery(q);
            while(rss.next())
            {
                int batch = rss.getInt(1);

        %>
        <div class="row batchLabel">

            <div id="div1"><%=rss.getInt(1)%></div>
            <div id="triangle"></div>
            
        </div>
        <div class="row alumniContainer">            
            <%
                String query = "select * from alumni where batch = '"+batch+"'";
                ResultSet rs = db.selectQuery(query);

                while(rs.next())
                {
            %>
            <div class="column">
              <div class="alu">
                <img src="<%=request.getContextPath() + "/AlumniImages/" + rs.getString(6)%>" alt="Image Unavailable">
                <div class="cont">
                    <h2 class="key"><%=rs.getString(2)%></h2>
                    <h5 class="title t2 key"><%=rs.getString(3)%></h5>
                    <p class="title t1 key">Batch:&nbsp; <%=rs.getInt(4)%></p>
                    <%
                        if(rs.getString(5)== null || rs.getString(5).equalsIgnoreCase("null")){
                    %>
                    <p class="title t1 key x"><m class="mailIcon">&#9993;</m>:&nbsp; NA</p>
                    <%
                        }else{
                    %>
                    <p class="title t1 key x"><m class="mailIcon">&#9993;</m>:&nbsp; <%=rs.getString(5)%></p>
                    <% } %>
                </div>
              </div>
            </div>
            <%  } %>
            
        </div>
            <% } %>
          <div style="height: 10vh;"></div>
        <%@include file="generalComponents/foot.jsp"%>
        
        
    </body>
</html>