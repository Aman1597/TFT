package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class uploadform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

//if(session.getAttribute("id")==null)
//{
//    response.sendRedirect("../login.jsp");
//}
//else
//{

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Upload Notes</title>\n");
      out.write("        <script src=\"../Bootstrap/js/bootstrap-v4.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"../Bootstrap/css/bootstrap-v3.3.7.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../Bootstrap/css/bootstrap-v4.2.1.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"admin_css/gridForm.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                grid-template-rows: 10vh 90vh 10vh 10vh auto;\n");
      out.write("            }\n");
      out.write("            .form-outer{\n");
      out.write("                grid-template-rows: 16.5% 68.5% 15%;//85%;\n");
      out.write("                grid-template-columns: 34%;\n");
      out.write("            }\n");
      out.write("            .grid-outer{\n");
      out.write("                padding: 0 0 8% 0;\n");
      out.write("            }\n");
      out.write("            .btn1{\n");
      out.write("                padding: 5% 0 3% 0;\n");
      out.write("            }\n");
      out.write("            .grid-item textarea{\n");
      out.write("                height:60%;\n");
      out.write("            }\n");
      out.write("            .grid-item textarea:focus{\n");
      out.write("                border: 0.5px solid white;\n");
      out.write("            }\n");
      out.write("            .grid-item input[type=\"file\"]{\n");
      out.write("                border:none;\n");
      out.write("                font-size: 1.8rem;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .select{\n");
      out.write("                width: inherit;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .select select{\n");
      out.write("                font-family: serif;\n");
      out.write("                background:rgba(8, 36, 69, 0.98);\n");
      out.write("                font-size: 1.8rem;\n");
      out.write("                padding: 0 1% 0 1%;\n");
      out.write("                height: 70%;\n");
      out.write("                width: 20%;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 1050px) {\n");
      out.write("                .form-outer {\n");
      out.write("                    grid-template-columns: 60%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
      out.write("   <li class=\"nav-item active\">  \n");
      out.write("\n");
      out.write("   <a class=\"nav-link\" href=\"#\">Upload Notes <span class=\"glyphicon glyphicon-circle-arrow-up\"></span></a>\n");
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
      out.write("    <a  class=\"nav-link\" href=\"#\">Manage Notes <span class=\"glyphicon glyphicon-list-alt\"></span></a>  \n");
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
      out.write("                            \n");
      out.write("                            <option value=\"\">Select Subject</option>\n");
      out.write("                            \n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Title:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input type=\"text\" name=\"title\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Description:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <textarea name=\"description\" required=\"\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item\">Select File:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input name=\"myfile\" type=\"file\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid-item btn1\"><input type=\"submit\" value=\"upload\" /></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <h1>MANAGE NOTES<span class=\"glyphicon glyphicon-arrow-down\"></span></h1>\n");
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
      out.write("        <div class=\"select\">\n");
      out.write("            <select id=\"sub2\" name=\"subject\" onchange=\"getNotes(this.value)\" required=\"\">\n");
      out.write("\n");
      out.write("                <option value=\"\">Select Subject</option>\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
      out.write("        <script>\n");
      out.write("            function getSub1(dept){\n");
      out.write("                $.ajax({\n");
      out.write("\n");
      out.write("                    url: 'ResponseSub.jsp',\n");
      out.write("                    type: 'POST',\n");
      out.write("                    data: { datapost : dept},\n");
      out.write("                    success: function(result){\n");
      out.write("                        $('#sub').html(result);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            function getSub2(dept){\n");
      out.write("                $.ajax({\n");
      out.write("\n");
      out.write("                    url: 'ResponseSub.jsp',\n");
      out.write("                    type: 'POST',\n");
      out.write("                    data: { datapost : dept},\n");
      out.write("                    success: function(result){\n");
      out.write("                        $('#sub2').html(result);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            function getNotes(sub){\n");
      out.write("                $.ajax({\n");
      out.write("\n");
      out.write("                    url: 'ResponseNotes.jsp',\n");
      out.write("                    type: 'POST',\n");
      out.write("                    data: { datapost : sub},\n");
      out.write("                    success: function(result){\n");
      out.write("                        $('#gr1').html(result);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
// } 
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
