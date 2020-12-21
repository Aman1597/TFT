<%@page import="mypack.DbManager"%>
<%@page import="java.io.File"%>
<%
    String filename=request.getParameter("filename");
    String path = getServletContext().getRealPath("/AlumniImages/" + filename);
    File delfile = new File(path);
    if(delfile.delete())
    {
    DbManager db = new DbManager();
    String query = "delete from alumni where imgname='"+filename+"'";
    db.executeNonQuery(query);
    
    out.print("<script>alert('Alumni deleted successfully');window.location.href='../adminzone/Manage_Alumni.jsp';</script>");
    }
    else
    {
     out.print("<script>alert('file does not exists');window.location.href='../adminzone/Manage_Alumni.jsp';</script>");
    }
%>