package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/foot.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("<title>TFT</title>\n");
      out.write("\n");
      out.write("<!--<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" >\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Arvo\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">-->\n");
      out.write("\n");
      out.write("<link href=\"Bootstrap/css/bootstrap-v3.3.7.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Bootstrap/css/bootstrap-v4.2.1.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"Bootstrap/js/jquery-3.3.1.slim.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"Bootstrap/js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"Bootstrap/js/bootstrap-v4.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"Bootstrap/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/front1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .capt h3\n");
      out.write("    {\n");
      out.write("        \n");
      out.write("    font-size:2vw;;\n");
      out.write("   /* font-family:sans-serif;*/\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-bottom:0vw;\n");
      out.write("    color:#082445;\n");
      out.write("    text-align: center;\n");
      out.write("        overflow:hidden;\n");
      out.write(" \n");
      out.write("    white-space: nowrap;\n");
      out.write("    margin:0;//-1.5em;\n");
      out.write("    animation: none;//typing 4.5s steps(40,end),blinking-cursor .5s step-end infinite;\n");
      out.write("    }\n");
      out.write("    .ans\n");
      out.write("    {\n");
      out.write("        display: flex;\n");
      out.write("        align-items: center;\n");
      out.write("        justify-content: center;\n");
      out.write("        margin-left: 4%;\n");
      out.write("    }\n");
      out.write("</style>   \n");
      out.write("<div class=\"row\" style=\"margin:3em 0 3em 0\">\n");
      out.write("    <div class=\"col-sm-1 ans\">\n");
      out.write("        <img src=\"image/knit.jpeg\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-9 \">\n");
      out.write("        <div class=\"capt\">\n");
      out.write("             <h3>Kamla Nehru Institute Of Technology, Sultanpur</h3><br/>\n");
      out.write("             <h1>Technical Education Council</h1><br/>\n");
      out.write("             <h3>Unfolding the concepts of Engineering</h3>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("  ");
      out.write("\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark sticky-top\">  \n");
      out.write("<div class=\"container-fluid\">  \n");
      out.write("\n");
      out.write("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#mynav\">  \n");
      out.write("<span class=\"navbar-toggler-icon\"></span></button>  \n");
      out.write("\n");
      out.write("<div class=\"collapse navbar-collapse\" id=\"mynav\">  \n");
      out.write("<ul class=\"navbar-nav ml-auto\">  \n");
      out.write("   <li class=\"nav-item active\">  \n");
      out.write("\n");
      out.write("   <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"glyphicon glyphicon-home\"></span></a>\n");
      out.write("    </li>  \n");
      out.write("     <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"notification.jsp\">Notification <span class=\"glyphicon glyphicon-bell\"></span></a>  \n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item \" >  \n");
      out.write("\n");
      out.write("        <a  class=\"nav-link\" href=\"AboutUs.jsp\">About Us <span class=\"glyphicon glyphicon-flag\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item \" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"index.jsp#4\">Departments <span class=\"glyphicon glyphicon-circle-arrow-down\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"alumni.jsp\">Alumni <span class=\"glyphicon glyphicon-king\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("      <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"Gallery.jsp\">Gallery <span class=\"glyphicon glyphicon-picture\"></span></a>  \n");
      out.write("    </li> \n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"#5\">Contact us  <span class=\"glyphicon glyphicon-earphone\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("    <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"login.jsp\">Admin <span class=\"glyphicon glyphicon-user\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("    </ul>  \n");
      out.write(" </div></div></nav>  \n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    var btns=document.getElementsByClassName(\"nav-item\");\n");
      out.write("    var b=document.getElementsByClassName(\"nav-link\");\n");
      out.write("    var curlocation = location.href;\n");
      out.write("    \n");
      out.write("    for (var i = 0; i < btns.length; i++) {\n");
      out.write("        btns[i].addEventListener(\"click\", function() {\n");
      out.write("            var current = document.getElementsByClassName(\"active\");\n");
      out.write("            current[0].className = current[0].className.replace(\" active\", \"\");\n");
      out.write("            this.className += \" active\";\n");
      out.write("        });\n");
      out.write("        btns[i].classList.remove(\"active\");\n");
      out.write("        if(b[i].href == curlocation){\n");
      out.write("            btns[i].classList.add(\"active\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    var cur = document.getElementsByClassName(\"active\");\n");
      out.write("    if(cur[0]==null)\n");
      out.write("    {\n");
      out.write("        btns[0].classList.add(\"active\");\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div class=\"content\">\n");
      out.write("    ");
 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
        PreparedStatement ps=con.prepareStatement("select notificationtext from notification order by id desc");
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
    
      out.write("\n");
      out.write("    <marquee class=\"mrq\">");
      out.print(rs.getString(1));
      out.write("</marquee>\n");
      out.write("    ");
 
        }
        else
        {
    
      out.write("\n");
      out.write("    <marquee class=\"mrq\">Notifications...</marquee>\n");
      out.write("    ");
 
        }
    
      out.write("\n");
      out.write("<div class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"5000\" id=\"an\">\n");
      out.write("\n");
      out.write("      <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#an\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#an\" data-slide-to=\"1\"></li>\n");
      out.write("        <li data-target=\"#an\" data-slide-to=\"2\"></li>\n");
      out.write("   </ol>\n");
      out.write("<div class=\"carousel-inner\" >\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"carousel-item active\" >\n");
      out.write("<img src=\"image/2.jpg\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div class=\"carousel-caption\">\n");
      out.write("   \n");
      out.write("     <h1>\"Education is not the learning of facts,<br/>\n");
      out.write("         but the training of the mind to think”<br/>\n");
      out.write("     ~ Albert Einstein\n");
      out.write("     </h1>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"carousel-item \">\n");
      out.write("    <img src=\"image/1.jpg\" alt=\"loading...\">\n");
      out.write("    <div class=\"carousel-caption\">\n");
      out.write("     <h1>\"An investment in knowledge <br/>\n");
      out.write("always pays the best interest”<br/>\n");
      out.write("</h1>\n");
      out.write("        <br/>\n");
      out.write("     <h3>~ Ben Franklin\n");
      out.write("</h3>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("    <img src=\"image/3.jpg\" alt=\"loading...\">\n");
      out.write("        \n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("     <h1>\"If a child can’t learn the way we teach, <br/>\n");
      out.write("maybe we should teach the way they learn”</h1><br/>\n");
      out.write("     <h3>~ Ignacio Estrada\n");
      out.write("</h3>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("<a href=\"#an\" class=\"carousel-control-next\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("    </a>\n");
      out.write("    <a href=\"#an\" class=\"carousel-control-prev\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("    </a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br/>\n");
      out.write("    <br/>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("      <div class=\" deptimg\"> \n");
      out.write("      <div class=\"dept\" id=\"4\">\n");
      out.write("    <h1>Our Departments</h1>\n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\" >\n");
      out.write("     <div class=\"col-sm-4 anshika\"><a href=\"CE.jsp\" style=\"color: #d9e3d7\">\n");
      out.write("    <img src=\"image/civil.png\" alt=\"mathematics\" class=\"a1\">\n");
      out.write("     <div class=\"text\" id=\"41\">\n");
      out.write("         <h2>Civil<br/>Engineering</h2>\n");
      out.write("     </div></a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("     <div class=\"col-sm-4 anshika\"><a href=\"CSE_IT.jsp\" style=\"color: #d9e3d7\">\n");
      out.write("    <img src=\"image/c.png\" class=\"a1\">\n");
      out.write("   <div class=\"text\" id=\"42\">\n");
      out.write("       <h2>CSE/IT</h2>\n");
      out.write("   </div></a></div>\n");
      out.write("     <div class=\"col-sm-4 anshika\" ><a href=\"EE.jsp\" style=\"color: #d9e3d7\">\n");
      out.write("    <img src=\"image/electrical.png\"  class=\"a1\">\n");
      out.write("      <div class=\"text\" id=\"43\">\n");
      out.write("    <h2>Electrial<br/>Engineering</h2>\n");
      out.write("      </div></a></div>\n");
      out.write("     <div class=\"col-sm-4 anshika\"><a href=\"EL.jsp\" style=\"color: #d9e3d7\">\n");
      out.write("    <img src=\"image/electronics.png\" alt=\"mathematics\" class=\"a1\">\n");
      out.write("     <div class=\"text\" id=\"41\">\n");
      out.write("         <h2>Electronics<br/>Engineering</h2>\n");
      out.write("     </div></a>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"col-sm-4 anshika\"><a href=\"ME.jsp\" style=\"color: #d9e3d7\">\n");
      out.write("    <img src=\"image/mechanics.png\"  class=\"a1\">\n");
      out.write("  <div class=\"text\" id=\"44\">\n");
      out.write("    <h2>Mechanical<br/>Engineering</h2>\n");
      out.write("  </div></a></div>\n");
      out.write("    \n");
      out.write("     <div class=\"col-sm-4 anshika\"><a href=\"AS.jsp\" style=\"color: #d9e3d7\">\n");
      out.write("    <img src=\"image/maths.png\" alt=\"mathematics\" class=\"a1\">\n");
      out.write("     <div class=\"text\" id=\"41\">\n");
      out.write("         <h2>Applied<br/>Sciences</h2>\n");
      out.write("     </div></a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      out.write("    \t   <div class=\"top\" id=\"5\" >\n");
      out.write("\t\t<div id=\"meee\">\n");
      out.write("            <div  class=\"c1\"><a name=\"whatever\"><br />Get In Touch</a></div>\n");
      out.write("\t\t<hr style=\"border-top-color: aliceblue\" align=\"left\" width=\"10%\" margin-left=\"100px\"/>\n");
      out.write("\t<br />\n");
      out.write("\t\t<div class=\"c2\">Shivam Tiwari\n");
      out.write("\t\t\t<br />\n");
      out.write("\t\t\tStudent Representative,TEC\n");
      out.write("\t\t\t<br />\n");
      out.write("\t\t\tContact No: xxxxxxxxxx\n");
      out.write("\t\t\t<br />\n");
      out.write("                        Copyright &copy; &nbsp; to TEC, KNIT Sultanpur\n");
      out.write("                        <br/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"break\"></div>\n");
      out.write("\t\t<div class=\"follow\"><br />Follow  Us</div>\n");
      out.write("\t\t<hr style=\"border-top-color: aliceblue\"align=\"left\"width=\"10%\">\n");
      out.write("                <div class=\"try\">\n");
      out.write("\t\t<a href=\"https://www.facebook.com\" class=\"fa fa-facebook\"></a>\n");
      out.write("\t\t<a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("\t\t<a href=\"https://twitter.com/login\" class=\"fa fa-twitter\"></a>\n");
      out.write("\t\t<a href=\"https://www.youtube.com/\" class=\"fa fa-youtube\"></a><br />\n");
      out.write("                </div><br/>\n");
      out.write("                        <br/>\n");
      out.write("                <div class=\"c2\" style=\"margin-left: 0 ;\">&nbsp;Developed By: &nbsp;Aman Deep and Ayush Pandey</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </div> \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
