package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

//if(session.getAttribute("id")==null)
//{
//    response.sendRedirect("../login.jsp");
//}
//else
//{

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Display Records</title>\n");
      out.write("    <style>\n");
      out.write("        h3\n");
      out.write("        {\n");
      out.write("            float: left;\n");
      out.write("            width: 25%;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 0;\n");
      out.write("            margin-bottom: 40px;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even)\n");
      out.write("        {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h3><a href=\"uploadform.jsp\">Upload Notes</a></h3><h3><a href=\"uploadnotification.jsp\">Manage Notification</a></h3><h3><a href=\"logout.jsp\">Home</a></h3><h3><a href=\"logout.jsp\">Logout</a></h3>\n");
      out.write("\t<center>\n");
      out.write("\t\t<h1>All Notes</h1><br/><br/>\n");
      out.write("\t\t<table style=\"width:100%;text-align: center;\" border=\"1\" cellspacing=\"0\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>File</th>\n");
      out.write("                                <th>Title</th>\n");
      out.write("\t\t\t\t<th>Description</th>\n");
      out.write("\t\t\t\t<th>Subject</th>\n");
      out.write("                                <th>Download</th>\n");
      out.write("                                <th>Delete</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        ");

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb","root","");
                            PreparedStatement ps=con.prepareStatement("select filename,title,description,subject from notes");
                            ResultSet rs=ps.executeQuery();
                            while(rs.next())
                            {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"display: flex;align-items: center;\"><img src=\"../image/pdf.png\" height=\"27\" width=\"40\"/>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                            <td><a target=\"_blank\" href=\"");
      out.print(request.getContextPath() + "/notes/" + rs.getString(1));
      out.write("\">Download</a></td>\n");
      out.write("                            <td><a href=\"../codes/deletenotes.jsp?filename=");
      out.print(rs.getString(1));
      out.write("\">Delete</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t</center>\n");
      out.write("</body>\n");
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
