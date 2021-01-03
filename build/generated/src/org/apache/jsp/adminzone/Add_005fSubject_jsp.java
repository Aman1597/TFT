package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Add_005fSubject_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/adminzone/../generalComponents/metaTags.jsp");
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

if(session.getAttribute("id")==null)
{
    response.sendRedirect("../login.jsp");
}
else
{

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("<meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
      out.write("\n");
      out.write("        <title>ADD SUBJECT</title>\n");
      out.write("        <link href=\"../Bootstrap/css/bootstrap-v3.3.7.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../Bootstrap/css/bootstrap-v4.2.1.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"admin_css/gridForm.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        <div class=\"form-outer\">\n");
      out.write("            <h1>ADD SUBJECT</h1>\n");
      out.write("            <form action=\"../codes/addSubjectCode.jsp\" method=\"post\" class=\"grid-outer\">\n");
      out.write("                <div class=\"grid-container\">\n");
      out.write("                    <div class=\"grid-item\">Department:</div>\n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <select name=\"department\" required=\"\">\n");
      out.write("                            <option value=\"\">Select Department</option>\n");
      out.write("                            <option value=\"CE\">Civil Engg.</option>\n");
      out.write("                            <option value=\"EL\">Electronics Engg.</option>\n");
      out.write("                            <option value=\"EE\">Electrical Engg.</option>\n");
      out.write("                            <option value=\"AS\">Applied Sciences</option>\n");
      out.write("                            <option value=\"CSE_IT\">CSE/IT</option>\n");
      out.write("                            <option value=\"ME\">Mechanical Engg.</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Subject:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input type=\"text\" name=\"subject\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item btn1\"><input type=\"submit\" value=\"Add\" /></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
 } 
      out.write('\n');
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
