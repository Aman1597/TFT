package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.DbManager;
import java.sql.ResultSet;

public final class notification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
      out.write("\n");
      out.write("<title>Notification</title>\n");
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
      out.write("\n");
      out.write("<style>\n");
      out.write("    body\n");
      out.write("    {\n");
      out.write("        background-color: whitesmoke;\n");
      out.write("        //font-family:sans-serif;\n");
      out.write("    }\n");
      out.write("    .content\n");
      out.write("    {\n");
      out.write("        margin: 0 auto 0 auto;\n");
      out.write("        width: 99%;\n");
      out.write("        //padding-bottom: 100px;\n");
      out.write("    }\n");
      out.write("    #table{\n");
      out.write("        margin-bottom: 6vh;\n");
      out.write("    }\n");
      out.write("    table tr\n");
      out.write("    {\n");
      out.write("        font-size: 18px;\n");
      out.write("        height: 50px;\n");
      out.write("        border-bottom: 1px solid;\n");
      out.write("    }\n");
      out.write("    th{ \n");
      out.write("        background-color: rgba(8, 36, 69, 0.98); \n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("    #h0\n");
      out.write("    {\n");
      out.write("    font-size:35px;\n");
      out.write("    letter-spacing: 2px;\n");
      out.write("    font-weight:bold;\n");
      out.write("    margin-top: 5vh;//0.72em;\n");
      out.write("    margin-bottom:7vh; //1em;\n");
      out.write("    color:#082445;\n");
      out.write("    text-align: center;\n");
      out.write("    }\n");
      out.write("    tr:nth-child(odd)\n");
      out.write("    {\n");
      out.write("        background: white;//#f2f2f2;\n");
      out.write("    }\n");
      out.write("    @media screen and (min-width: 601px) {\n");
      out.write("        #h0 {\n");
      out.write("          font-size: 60px;//4vw;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    body .row{\n");
      out.write("        margin-bottom: 10vh;\n");
      out.write("    }\n");
      out.write("    body .row input[type=\"search\"]{\n");
      out.write("        margin: 0 auto;\n");
      out.write("        border-radius: 3vw;\n");
      out.write("        outline: none;\n");
      out.write("        padding: 0 1.5vw;\n");
      out.write("        font-size: 1.2vw;\n");
      out.write("        padding-bottom: 0.45vh;\n");
      out.write("        height: 6.5vh;\n");
      out.write("        border: none;// 2px solid grey;\n");
      out.write("        box-shadow: 0 0 10px grey;\n");
      out.write("        line-height: calc(6.5vh + 4px);//6.5vh;\n");
      out.write("        width: 50vw;//calc(100vw - 7rem);\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<script src=\"js/notificationSearch.js\" type=\"text/javascript\"></script>\n");
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
      out.write(" </div></div></nav>\n");
      out.write("<script src=\"js/nav_Active_Menu.js\"></script>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h1 id=\"h0\">Notifications</h1>\n");
      out.write("        <div class=\"row\"><input type=\"search\" id=\"searchBar\" onkeyup=\"searchNotification()\" placeholder=\"SEARCH\"/></div>\n");
      out.write("        <table class=\"table\" id=\"table\" style=\"text-align: center;\" border=\"0\" cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <th style=\"width: 17%;\">S.No.</th>\n");
      out.write("                <th>NOTIFICATIONS</th>\n");
      out.write("                <th>POSTED DATE</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

               int n=1;
               DbManager db = new DbManager();
               String query = "select * from notification order by id desc";
               ResultSet rs = db.selectQuery(query);
               while(rs.next())
               {  
            
      out.write("\n");
      out.write("            <tr class=\"tr\">\n");
      out.write("                <td class=\"key\">");
      out.print(n);
      out.write("</td>\n");
      out.write("                <td class=\"key\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td class=\"key\">");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 
               n++;
               } 
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");
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
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
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
