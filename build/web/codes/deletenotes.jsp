<%@page import="mypack.DbManager"%>
<%@page import="java.io.File"%>

<%
    String filename=request.getParameter("filename");
    String path = getServletContext().getRealPath("/notes/" + filename);
    File delfile = new File(path); //""+request.getContextPath() + "/notes/" + filename
    if(delfile.delete())
    {
    DbManager db = new DbManager();
    String query = "delete from notes where filename='"+filename+"'";
    db.executeNonQuery(query);
    out.print("<script>alert('file deleted successfully');window.location.href='../adminzone/Manage_Notes.jsp';</script>");
    }
    else
    {
     out.print("<script>alert('file does not exists');window.location.href='../adminzone/Manage_Notes.jsp';</script>");
    }
%>