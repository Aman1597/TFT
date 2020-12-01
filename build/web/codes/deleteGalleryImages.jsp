<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.File"%>
<%
    String filename=request.getParameter("filename");
    String path = getServletContext().getRealPath("/GalleryImages/" + filename);
    File delfile = new File(path);
    if(delfile.delete())
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb","root","");
    PreparedStatement ps=con.prepareStatement("delete from gallery where imgname='"+filename+"'");
    ps.executeUpdate();
    out.print("<script>alert('file deleted successfully');window.location.href='../adminzone/Manage_Gallery.jsp';</script>");
    }
    else
    {
     out.print("<script>alert('file does not exists');window.location.href='../adminzone/Manage_Gallery.jsp';</script>");
    }
%>