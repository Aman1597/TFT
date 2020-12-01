package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class CE_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Civil Engineering</title>\r\n");
      out.write("        <script src=\"Bootstrap/js/bootstrap-v4.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"Bootstrap/css/bootstrap-v3.3.7.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"Bootstrap/css/bootstrap-v4.2.1.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/table.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <h1>Civil &nbsp;Engineering</h1>\r\n");
      out.write("    <div class=\"select\">\r\n");
      out.write("        <select name=\"subject\" onchange=\"getNotes(this.value)\" required=\"\">\r\n");
      out.write("\r\n");
      out.write("            <option value=\"\">Select Subject</option>\r\n");
      out.write("            ");

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
                PreparedStatement ps=con.prepareStatement("select subject from subjects where department = 'CE'");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
            
      out.write("\r\n");
      out.write("            <option>");
      out.print(rs.getString(1));
      out.write("</option>\r\n");
      out.write("            ");
 }
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <table id=\"gr1\" border=\"0\" cellspacing=\"0\" class=\"table table-dark \">\r\n");
      out.write("        <thead>\r\n");
      out.write("            <tr class=\"rh\">\r\n");
      out.write("                    <th>FILE</th>\r\n");
      out.write("                    <th>TITLE</th>\r\n");
      out.write("                    <th>DESCRIPTION</th>\r\n");
      out.write("                    <th>SUBJECT</th>\r\n");
      out.write("                    <th>DOWNLOAD</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function getNotes(sub){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("\r\n");
      out.write("                url: 'ResponseNotes.jsp',\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                data: { datapost : sub},\r\n");
      out.write("                success: function(result){\r\n");
      out.write("                    $('#gr1').html(result);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    </script>        \r\n");
      out.write("</body>\r\n");
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
