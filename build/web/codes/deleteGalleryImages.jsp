<%@page import="mypack.DbManager"%>
<%@page import="java.io.File"%>
<%
    String filename=request.getParameter("filename");
    String path = getServletContext().getRealPath("/GalleryImages/" + filename);
    File delfile = new File(path);
    if(delfile.delete())
    {
    DbManager db = new DbManager();
    String query = "delete from gallery where imgname='"+filename+"'";
    db.executeNonQuery(query);
    out.print("<script>alert('file deleted successfully');window.location.href='../adminzone/Manage_Gallery.jsp';</script>");
    }
    else
    {
     out.print("<script>alert('file does not exists');window.location.href='../adminzone/Manage_Gallery.jsp';</script>");
    }
%>