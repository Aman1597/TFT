package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Manage_005fAlumni_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/adminzone/admin_navbar.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../Bootstrap/css/bootstrap-v3.3.7.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../Bootstrap/css/bootstrap-v4.2.1.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"admin_css/gridForm.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                grid-template-rows: 10vh 90vh auto;\n");
      out.write("            }\n");
      out.write("            .form-outer{\n");
      out.write("                grid-template-rows: 20% 65% 15%;\n");
      out.write("            }\n");
      out.write("            .grid-outer{\n");
      out.write("                padding: 3% 0 35% 0;\n");
      out.write("            }\n");
      out.write("            .grid-container{\n");
      out.write("                padding: .5% 2% 1% 2%;\n");
      out.write("            }\n");
      out.write("            .grid-item input[type=\"text\"]{\n");
      out.write("                text-transform: capitalize;\n");
      out.write("            }\n");
      out.write("            .grid-item input[type=\"file\"]{\n");
      out.write("                border:none;\n");
      out.write("                font-size: 1.8rem;\n");
      out.write("            }\n");
      out.write("            .btn1{\n");
      out.write("                padding: 5.5% 0 4% 0;\n");
      out.write("            }\n");
      out.write("            ::placeholder{\n");
      out.write("                text-transform: none;\n");
      out.write("                font-size: 1.8rem;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("   <a class=\"nav-link\" href=\"#\">Home <span class=\"glyphicon glyphicon-home\"></span></a>\n");
      out.write("    </li>  \n");
      out.write("     <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"Manage_Notification.jsp\">Manage Notification <span class=\"glyphicon glyphicon-bell\"></span></a>  \n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item \" >  \n");
      out.write("\n");
      out.write("        <a  class=\"nav-link\" href=\"Add_Subject.jsp\">Add Subject <span class=\"glyphicon glyphicon-book\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item \" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"#\">Upload Notes <span class=\"glyphicon glyphicon-list-alt\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"#\">Manage Alumni <span class=\"glyphicon glyphicon-king\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("      <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"#\">Manage Gallery <span class=\"glyphicon glyphicon-picture\"></span></a>  \n");
      out.write("    </li> \n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"logout.jsp\">Logout <span class=\"glyphicon glyphicon-off\"></span></a>  \n");
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
      out.write(" \n");
      out.write("        <div class=\"form-outer\">\n");
      out.write("            <h1>ADD &nbsp;ALUMNI</h1>\n");
      out.write("            <form action=\"../AlumniUpload\" method=\"post\" enctype=\"multipart/form-data\" class=\"grid-outer\">\n");
      out.write("                <div class=\"grid-container\">\n");
      out.write("                    <div class=\"grid-item\">Name:</div>\n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input type=\"text\" name=\"name\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Branch:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <select name=\"branch\" required=\"\">\n");
      out.write("                            <option value=\"\">Select Branch</option>\n");
      out.write("                            <option value=\"CE\">CE</option>\n");
      out.write("                            <option value=\"EL\">EL</option>\n");
      out.write("                            <option value=\"EE\">EE</option>\n");
      out.write("                            <option value=\"IT\">IT</option>\n");
      out.write("                            <option value=\"CSE\">CSE</option>\n");
      out.write("                            <option value=\"ME\">ME</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"grid-item\">Batch:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input type=\"number\" name=\"batch\" placeholder=\"Passout Year (eg. 2020)\" required=\"\"/>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"grid-item\">Alumni Pic:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input name=\"imgFile\" type=\"file\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item btn1\"><input type=\"submit\" value=\"Add\" /></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <h1>MANAGE ALUMNI<span class=\"glyphicon glyphicon-arrow-down\"></span></h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            ");

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
                PreparedStatement ps=con.prepareStatement("select * from alumni order by batch desc");
                ResultSet rs=ps.executeQuery();
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
      out.write("                  <h4>DELETE</h4>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            ");
  } 
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
