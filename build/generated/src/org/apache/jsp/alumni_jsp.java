package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.DbManager;
import java.sql.ResultSet;

public final class alumni_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/generalComponents/metaTags.jsp");
    _jspx_dependants.add("/generalComponents/head.jsp");
    _jspx_dependants.add("/generalComponents/navbar.jsp");
    _jspx_dependants.add("/generalComponents/foot.jsp");
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
      out.write("\n");
      out.write("<title>Our Alumni</title>\n");
      out.write("\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" >\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Arvo\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/front1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/alumni.css\">\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("  ");
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
      out.write("        ");
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
      out.write(" </div></div></nav>\n");
      out.write("<script src=\"js/nav_Active_Menu.js\"></script>\n");
      out.write("\n");
      out.write("         \n");
      out.write("          <div class=\"gal2\"><h1>Our Alumni</h1></div>\n");
      out.write("        ");

            DbManager db = new DbManager();
            String q = "select distinct batch from alumni order by batch desc";
            ResultSet rss = db.selectQuery(q);
            while(rss.next())
            {
                int batch = rss.getInt(1);

        
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"column\">\n");
      out.write("                <div id=\"div1\">");
      out.print(rss.getInt(1));
      out.write("</div>\n");
      out.write("                <div id=\"triangle\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">            \n");
      out.write("            ");

                String query = "select * from alumni where batch = '"+batch+"'";
                ResultSet rs = db.selectQuery(query);

                while(rs.next())
                {
            
      out.write("\n");
      out.write("            <div class=\"column\">\n");
      out.write("              <div class=\"alu\">\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath() + "/AlumniImages/" + rs.getString(5));
      out.write("\" alt=\"Image Unavailable\">\n");
      out.write("                <div class=\"cont\">\n");
      out.write("                  <h2>");
      out.print(rs.getString(2));
      out.write("</h2>\n");
      out.write("                  <h5 class=\"title t2\">");
      out.print(rs.getString(3));
      out.write("</h5>\n");
      out.write("                  <p class=\"title t1\">Batch:&nbsp; ");
      out.print(rs.getInt(4));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            ");
  } 
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("          ");
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
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
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
