package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Manage_005fNotes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/adminzone/../generalComponents/metaTags.jsp");
    _jspx_dependants.add("/adminzone/../Bootstrap/Bootstrap_Links.jsp");
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
      out.write("        <title>MANAGE NOTES</title>\n");
      out.write("        ");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" >\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Arvo\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <link href=\"admin_css/gridForm.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <link href=\"admin_css/a_Manage_Notes.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"../js/a_Manage_Notes.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
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
      out.write("            <h1>UPLOAD NOTES</h1>\n");
      out.write("            <form action=\"../upload\" method=\"post\" enctype=\"multipart/form-data\" class=\"grid-outer\">\n");
      out.write("                <div class=\"grid-container\">\n");
      out.write("                    <div class=\"grid-item\">Department:</div>\n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <select onchange=\"getSub1(this.value)\" name=\"department\" required=\"\">\n");
      out.write("                            <option value=\"\">Select Department</option>\n");
      out.write("                            <option value=\"CE\">Civil Engg.</option>\n");
      out.write("                            <option value=\"EL\">Electronics Engg.</option>\n");
      out.write("                            <option value=\"EE\">Electrical Engg.</option>\n");
      out.write("                            <option value=\"AS\">Applied Sciences</option>\n");
      out.write("                            <option value=\"CSE_IT\">CSE/IT</option>\n");
      out.write("                            <option value=\"ME\">Mechanical Engg.</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Subject:</div>\n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <select id=\"sub\" name=\"subject\" required=\"\">\n");
      out.write("                            <option value=\"\">Select Subject</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Title:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input type=\"text\" name=\"title\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Description:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <textarea style=\"text-transform:none;\" name=\"description\" required=\"\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Select File:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input name=\"myfile\" type=\"file\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item btn1\"><input type=\"submit\" value=\"upload\" /></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <h1 id=\"mn\">MANAGE NOTES<span class=\"glyphicon glyphicon-arrow-down\"></span></h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"select\">\n");
      out.write("            <select onchange=\"getSub2(this.value)\" name=\"department\" required=\"\">\n");
      out.write("                <option value=\"\">Select Department</option>\n");
      out.write("                <option value=\"CE\">Civil Engg.</option>\n");
      out.write("                <option value=\"EL\">Electronics Engg.</option>\n");
      out.write("                <option value=\"EE\">Electrical Engg.</option>\n");
      out.write("                <option value=\"AS\">Applied Sciences</option>\n");
      out.write("                <option value=\"CSE_IT\">CSE/IT</option>\n");
      out.write("                <option value=\"ME\">Mechanical Engg.</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"select\">\n");
      out.write("            <select id=\"sub2\" name=\"subject\" onchange=\"getNotes(this.value)\" required=\"\">\n");
      out.write("                <option value=\"\">Select Subject</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"../js/notesSearch.js\" type=\"text/javascript\"></script>\n");
      out.write("        <div class=\"row\"><input type=\"search\" id=\"searchBar\" onkeyup=\"searchNotes()\" placeholder=\"SEARCH\"/></div>\n");
      out.write("        <table id=\"gr1\" border=\"0\" cellspacing=\"0\" class=\"table table-dark \">\n");
      out.write("            <thead>\n");
      out.write("                <tr class=\"rh\">\n");
      out.write("                        <th>FILE</th>\n");
      out.write("                        <th>TITLE</th>\n");
      out.write("                        <th>DESCRIPTION</th>\n");
      out.write("                        <th>SUBJECT</th>\n");
      out.write("                        <th>DOWNLOAD</th>\n");
      out.write("                        <th>DELETE</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
 } 
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
