<%@page import="java.io.File"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
    String filename=request.getParameter("filename");
    String path = getServletContext().getRealPath("/notes/" + filename);
    File delfile = new File(path); //""+request.getContextPath() + "/notes/" + filename
    if(delfile.delete())
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb","root","");
    PreparedStatement ps=con.prepareStatement("delete from notes where filename='"+filename+"'");
    ps.executeUpdate();
    out.print("<script>alert('file deleted successfully');window.location.href='../adminzone/Manage_Notes.jsp';</script>");
    }
    else
    {
     out.print("<script>alert('file does not exists');window.location.href='../adminzone/Manage_Notes.jsp';</script>");
    }
%>