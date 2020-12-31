package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DbManager;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MANAGE ALUMNI</title>\n");
      out.write("        <link href=\"../Bootstrap/css/bootstrap-v3.3.7.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../Bootstrap/css/bootstrap-v4.2.1.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"admin_css/gridForm.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"../js/alumniSearch.js\" rel=\"javascript\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                grid-template-rows: 10vh 90vh auto;\n");
      out.write("            }\n");
      out.write("            .form-outer{\n");
      out.write("                grid-template-rows: 20% 65% 15%;\n");
      out.write("            }\n");
      out.write("            .grid-outer{\n");
      out.write("                padding: 0 0 14% 0;\n");
      out.write("            }\n");
      out.write("            .grid-container{\n");
      out.write("                padding: 2% 2% 3% 2%;\n");
      out.write("            }\n");
      out.write("            .grid-item input[type=\"text\"]{\n");
      out.write("                text-transform: capitalize;\n");
      out.write("            }\n");
      out.write("            .grid-item input[type=\"email\"]{\n");
      out.write("                text-transform: none;\n");
      out.write("            }\n");
      out.write("            .grid-item input[type=\"file\"]{\n");
      out.write("                border:none;\n");
      out.write("                font-size: 1.8rem;\n");
      out.write("            }\n");
      out.write("            .btn1{\n");
      out.write("                padding: 5.5% 0 4% 0;\n");
      out.write("            }\n");
      out.write("            .grid-container1{\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: 1fr 1fr 1fr;\n");
      out.write("                grid-column-gap: 2%;\n");
      out.write("                margin: 0 3% 1% 3%;\n");
      out.write("                padding: 0 2% 3.2% 2%;\n");
      out.write("                background-color: white;\n");
      out.write("                box-shadow: 0 10px 15px 5px grey;\n");
      out.write("            }\n");
      out.write("            .grid-item2{\n");
      out.write("                display: grid;\n");
      out.write("                place-items:center;\n");
      out.write("                background-color: white;\n");
      out.write("                margin-top: 8%;\n");
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
      out.write("            .batchNo\n");
      out.write("            {\n");
      out.write("                margin: 3% 3% 1% 3%;\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: 225px 0% auto;\n");
      out.write("                background-color: white;\n");
      out.write("                box-shadow: -5px 5px 13px 0px grey;\n");
      out.write("            }\n");
      out.write("            #div1\n");
      out.write("            {\n");
      out.write("                height: 6vh; \n");
      out.write("                line-height: 6vh;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: grey;// whitesmoke;\n");
      out.write("                color: white;// whitesmoke;//grey;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 2.4rem;\n");
      out.write("            }\n");
      out.write("            #triangle{\n");
      out.write("                height: 0px;\n");
      out.write("                border-top: 3vh solid transparent;\n");
      out.write("                border-right: 0px solid transparent;\n");
      out.write("                border-bottom: 3vh solid transparent;\n");
      out.write("                border-left: 6vh solid grey;// whitesmoke;\n");
      out.write("                border-left: collapse;\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 650px){\n");
      out.write("                .grid-container1{\n");
      out.write("                    grid-template-columns: 1fr !important;// auto !important;\n");
      out.write("                    padding-bottom: 6% !important;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 1050px){\n");
      out.write("                .grid-container1{\n");
      out.write("                    grid-template-columns: 1fr 1fr;\n");
      out.write("                    padding: 0 3% 4% 3%;\n");
      out.write("                    grid-column-gap: 3%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            body .row{\n");
      out.write("                margin: 5vh 0 3vh 0;\n");
      out.write("            }\n");
      out.write("            .grid-item2 .mailIcon{\n");
      out.write("                //font-weight:  bold;\n");
      out.write("                //font-size: 2rem;\n");
      out.write("                //font-family: fantasy;\n");
      out.write("                font-family: 'Goldman', cursive;//inherit;//sans-serif;\n");
      out.write("                background-image: linear-gradient(225deg, #FFE53B, #FF2525, #21D4FD, #B721FF);//, #21D4FD, #B721FF);\n");
      out.write("                //text-shadow: -2px 2px 2px ;\n");
      out.write("                //font-stretch: condensed;\n");
      out.write("                -webkit-background-clip: text;\n");
      out.write("                -webkit-text-fill-color: transparent;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Goldman:wght@700&display=swap\" rel=\"stylesheet\">\n");
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
      out.write("                    <div class=\"grid-item\">Email:</div>  \n");
      out.write("                    <div class=\"grid-item\">\n");
      out.write("                        <input type=\"email\" name=\"email\"/>\n");
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
      out.write("        <div class=\"row\"><input type=\"search\" id=\"searchBar\" onkeyup=\"searchAlumni()\" placeholder=\"SEARCH\"/></div>\n");
      out.write("        \n");
      out.write("        <div class=\"table-outer1\">\n");
      out.write("            <div class=\"grid-outer1\">\n");
      out.write("                ");

                    DbManager db = new DbManager();
                    String q = "select distinct batch from alumni order by batch desc";
                    ResultSet rss = db.selectQuery(q);
                    while(rss.next())
                    {
                        int batch = rss.getInt(1);
                    
                
      out.write("\n");
      out.write("                <div class=\"batchNo batchLabel\">\n");
      out.write("                    <div id=\"div1\">");
      out.print(rss.getInt(1));
      out.write("</div>\n");
      out.write("                    <div id=\"triangle\"></div>                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid-container1 alumniContainer\">\n");
      out.write("                    ");

                        String query = "select * from alumni where batch = '"+batch+"'";
                        ResultSet rs= db.selectQuery(query);

                        while(rs.next())
                        {
                    
      out.write("\n");
      out.write("                    <div class=\"grid-item2 column\">\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath() + "/AlumniImages/" + rs.getString(6));
      out.write("\" />\n");
      out.write("                        <h2 class=\"key\">");
      out.print(rs.getString(2));
      out.write("</h2>\n");
      out.write("                        <h3 class=\"key\">");
      out.print(rs.getString(3));
      out.write("&nbsp; &nbsp;Batch:&nbsp; ");
      out.print(rs.getInt(4));
      out.write("</h3>\n");
      out.write("                        ");

                        if(rs.getString(5)== null || rs.getString(5).equalsIgnoreCase("null")){
                        
      out.write("\n");
      out.write("                        <h3 class=\"key\"><m class=\"mailIcon\">M</m>:&nbsp; NA</h3>\n");
      out.write("                        ");

                        }else{
                        
      out.write("\n");
      out.write("                        <h3 class=\"key\"><m class=\"mailIcon\">M</m>:&nbsp;");
      out.print(rs.getString(5));
      out.write("</h3>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        <h3><a href=\"../codes/deleteAlumni.jsp?filename=");
      out.print(rs.getString(6));
      out.write("\">DELETE</a></h3>\n");
      out.write("                    </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </div>                                  <!--<img class=\"mailIcon\" src=\"../image/mail_icon.png\" /><m class=\"mailIcon\">M</m>-->\n");
      out.write("        </div>\n");
      out.write("\n");
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
