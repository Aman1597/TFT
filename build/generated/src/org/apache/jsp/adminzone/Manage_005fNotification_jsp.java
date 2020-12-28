package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DbManager;
import java.util.Date;

public final class Manage_005fNotification_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

if(session.getAttribute("id")==null)
{
    response.sendRedirect("../login.jsp");
}
else
{

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
      out.write("        <title>MANAGE NOTIFICATION</title>\n");
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
      out.write("            .grid-item input{\n");
      out.write("                text-transform: none;\n");
      out.write("            }\n");
      out.write("            .btn1{\n");
      out.write("                grid-column: 1;\n");
      out.write("                padding: 0 0 5% 0;\n");
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
      out.write("     \n");
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
      out.write("    <a  class=\"nav-link\" href=\"Manage_Notes.jsp\">Manage Notes <span class=\"glyphicon glyphicon-list-alt\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"Manage_Alumni.jsp\">Manage Alumni <span class=\"glyphicon glyphicon-king\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("      <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"Manage_Gallery.jsp\">Manage Gallery <span class=\"glyphicon glyphicon-picture\"></span></a>  \n");
      out.write("    </li> \n");
      out.write("    \n");
      out.write("    <li class=\"nav-item\" >  \n");
      out.write("\n");
      out.write("    <a  class=\"nav-link\" href=\"logout.jsp\">Logout <span class=\"glyphicon glyphicon-off\"></span></a>  \n");
      out.write("    </li>  \n");
      out.write("    </ul>  \n");
      out.write(" </div></div></nav>  \n");
      out.write("<script src=\"../js/nav_Active_Menu.js\"></script>");
      out.write(" \n");
      out.write("        \n");
      out.write("        <div class=\"form-outer\">\n");
      out.write("            <h1>UPLOAD NOTIFICATION</h1>\n");
      out.write("            <form action=\"../codes/uploadnotificationcode.jsp\" method=\"post\" class=\"grid-outer\">\n");
      out.write("                <div class=\"grid-container\">\n");
      out.write("                    <div class=\"grid-item\" style=\"padding-top: 2%;\">Enter Notification Text:</div>  \n");
      out.write("                    <div class=\"grid-item\" style=\"align-items:start;padding-top: 2%;\">\n");
      out.write("                        <input type=\"text\" name=\"notificationtext\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item btn1\"><input type=\"submit\" value=\"Upload\" /></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <h1>MANAGE NOTIFICATION<span class=\"glyphicon glyphicon-arrow-down\"></span></h1>\n");
      out.write("        </div>\n");
      out.write("        <!--<div class=\"row\"><input type=\"search\" id=\"searchBar\" onkeyup=\"searchNotification()\" placeholder=\"SEARCH\"/></div>-->\n");
      out.write("        <div class=\"table-outer1\">\n");
      out.write("            <div class=\"grid-outer1\">\n");
      out.write("                <div class=\"grid-container1\">\n");
      out.write("                    <div class=\"grid-item1 rh\">NOTIFICATION</div>\n");
      out.write("                    <div class=\"grid-item1 rh\">POSTED DATE</div>\n");
      out.write("                    <div class=\"grid-item1 rh\">DELETE</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid-container1\">\n");
      out.write("                    ");

                       DbManager db = new DbManager();
                       String query = "select * from notification order by id desc";
                       ResultSet rs= db.selectQuery(query);
                       while(rs.next())
                       {
                    
      out.write("\n");
      out.write("                    <div class=\"grid-item1\">");
      out.print(rs.getString(2));
      out.write("</div>\n");
      out.write("                    <div class=\"grid-item1\">");
      out.print(rs.getString(3));
      out.write("</div>\n");
      out.write("                    <div class=\"grid-item1\"><a href=\"../codes/deletenotification.jsp?id=");
      out.print(rs.getInt(1));
      out.write("\">Delete</a></div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
 } 
      out.write('\n');
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
