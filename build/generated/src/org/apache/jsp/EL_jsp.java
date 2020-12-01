package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class EL_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta name=\"viewport\" content=\"width-device-width , initial-scale=1, user-scalable=yes\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE-edge\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Electronics Engineering</title>\n");
      out.write("        <script src=\"Bootstrap/js/bootstrap-v4.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"Bootstrap/css/bootstrap-v3.3.7.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Bootstrap/css/bootstrap-v4.2.1.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/table.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h1>Electronics &nbsp;Engineering &nbsp;Department</h1>\n");
      out.write("    <div class=\"select\">\n");
      out.write("        <select name=\"subject\" onchange=\"getNotes(this.value)\" required=\"\">\n");
      out.write("\n");
      out.write("            <option value=\"\">Select Subject</option>\n");
      out.write("            ");

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
                PreparedStatement ps=con.prepareStatement("select subject from subjects where department = 'EL'");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
            
      out.write("\n");
      out.write("            <option>");
      out.print(rs.getString(1));
      out.write("</option>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </select>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <table id=\"gr1\" border=\"0\" cellspacing=\"0\" class=\"table table-dark \">\n");
      out.write("        <thead>\n");
      out.write("            <tr class=\"rh\">\n");
      out.write("                    <th>FILE</th>\n");
      out.write("                    <th>TITLE</th>\n");
      out.write("                    <th>DESCRIPTION</th>\n");
      out.write("                    <th>SUBJECT</th>\n");
      out.write("                    <th>DOWNLOAD</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function getNotes(sub){\n");
      out.write("            $.ajax({\n");
      out.write("\n");
      out.write("                url: 'ResponseNotes.jsp',\n");
      out.write("                type: 'POST',\n");
      out.write("                data: { datapost : sub},\n");
      out.write("                success: function(result){\n");
      out.write("                    $('#gr1').html(result);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    </script>        \n");
      out.write("</body>\n");
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
