<%@page import="mypack.DbManager"%>
<%@page import="java.io.File"%>

<%
    String filename=request.getParameter("filename");
    String path = getServletContext().getRealPath("/notes/" + filename);
    File delfile = new File(path); //""+request.getContextPath() + "/notes/" + filename
    if(delfile.exists()){
        if(delfile.delete())
        {
            DbManager db = new DbManager();
            String query = "delete from notes where filename='"+filename+"'";
            if(db.executeNonQuery(query)){
                out.print("<script>alert('Notes deleted successfully');window.location.href='../adminzone/Manage_Notes.jsp';</script>");
            }else{
                out.print("<script>alert('File deleted successfully but \nSomething went wrong while deleting notes record from database');window.location.href='../adminzone/Manage_Notes.jsp';</script>");
            }
        }
        else{
            out.print("<script>alert('Something went wrong: File exists but cannot be deleted');window.location.href='../adminzone/Manage_Notes.jsp';</script>");
        }
    }
    else
    {
     out.print("<script>alert('file does not exists');window.location.href='../adminzone/Manage_Notes.jsp';</script>");
    }
%>