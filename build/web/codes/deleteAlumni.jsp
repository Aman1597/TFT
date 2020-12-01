<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.File"%>
<%
    String filename=request.getParameter("filename");
    String path = getServletContext().getRealPath("/AlumniImages/" + filename);
    File delfile = new File(path);
    if(delfile.delete())
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb","root","");
    PreparedStatement ps=con.prepareStatement("delete from alumni where imgname='"+filename+"'");
    ps.executeUpdate();
    out.print("<script>alert('Alumni deleted successfully');window.location.href='../adminzone/Manage_Alumni.jsp';</script>");
    }
    else
    {
     out.print("<script>alert('file does not exists');window.location.href='../adminzone/Manage_Alumni.jsp';</script>");
    }
%>