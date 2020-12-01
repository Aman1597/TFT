package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Manage_005fGallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                padding: 3% 0 17.5% 0;\n");
      out.write("            }\n");
      out.write("            .grid-container{\n");
      out.write("                grid-template-columns: 100% ;\n");
      out.write("                grid-gap: 2%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .grid-item:nth-child(even){\n");
      out.write("                place-items:center;\n");
      out.write("            }\n");
      out.write("            .btn1{\n");
      out.write("                grid-column: 1;\n");
      out.write("                padding: 3% 0 3% 0;\n");
      out.write("            }\n");
      out.write("            .grid-item input[type=\"file\"]{\n");
      out.write("                border:none;\n");
      out.write("                width: 24%;// 52%;\n");
      out.write("                font-size: 1.8rem;\n");
      out.write("            }\n");
      out.write("            .grid-container1{\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: auto auto auto;\n");
      out.write("                grid-gap: 5% 2%;\n");
      out.write("                margin: 0 3% 0 3%;\n");
      out.write("                padding: 2% 3% 0% 3%;//0 1.5% 0 1.5%;\n");
      out.write("                background-color: white;//smoke;\n");
      out.write("                box-shadow: 0 10px 15px 5px grey;\n");
      out.write("            }\n");
      out.write("            .grid-item2{\n");
      out.write("                display: grid;\n");
      out.write("                place-items:center;\n");
      out.write("                background-color: white;\n");
      out.write("                box-shadow: 0 10px 15px 0px grey;\n");
      out.write("            }\n");
      out.write("            .grid-item2:hover{\n");
      out.write("                box-shadow: 0 20px 30px 10px grey;\n");
      out.write("            }\n");
      out.write("            .grid-item2 img{\n");
      out.write("                height: 30em;\n");
      out.write("                width: 30em;\n");
      out.write("                margin: 4% 0 2% 0;\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 650px){\n");
      out.write("                .grid-container1{\n");
      out.write("                    grid-template-columns: auto !important;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 1050px){\n");
      out.write("                .grid-container1{\n");
      out.write("                    grid-template-columns: auto auto;\n");
      out.write("                    padding: 0 3% 0 3%;\n");
      out.write("                    grid-column-gap: 3%;\n");
      out.write("                }\n");
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
      out.write("            <h1>UPLOAD IMAGE</h1>\n");
      out.write("            <form action=\"../GalleryUpload\" method=\"post\" enctype=\"multipart/form-data\" class=\"grid-outer\">\n");
      out.write("                <div class=\"grid-container\">\n");
      out.write("                    <div class=\"grid-item\">Select &nbsp;Image &nbsp;File:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input type=\"file\" name=\"imgFile\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item btn1\"><input type=\"submit\" value=\"upload\" /></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <h1>MANAGE GALLERY<span class=\"glyphicon glyphicon-arrow-down\"></span></h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"table-outer1\">\n");
      out.write("            <div class=\"grid-outer1\">\n");
      out.write("                <div class=\"grid-container1\">\n");
      out.write("                    ");

                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
                       PreparedStatement ps=con.prepareStatement("select * from gallery order by uploaddate desc");
                       ResultSet rs=ps.executeQuery();
                       while(rs.next())
                       {
                    
      out.write("\n");
      out.write("                    <div class=\"grid-item2\">\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath() + "/GalleryImages/" + rs.getString(2));
      out.write("\" />\n");
      out.write("                        <h2>Upload Date: ");
      out.print(rs.getString(3));
      out.write("</h2>\n");
      out.write("                        <h2>DELETE</h2>\n");
      out.write("                    </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
