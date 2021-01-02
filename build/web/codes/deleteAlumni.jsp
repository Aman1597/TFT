<%@page import="mypack.DbManager"%>
<%@page import="java.io.File"%>
<%
    String filename=request.getParameter("filename");
    String path = getServletContext().getRealPath("/AlumniImages/" + filename);
    File delfile = new File(path);
    if(delfile.exists()){
        if(delfile.delete())
        {
            DbManager db = new DbManager();
            String query = "delete from alumni where imgname='"+filename+"'";
            if(db.executeNonQuery(query)){
                out.print("<script>alert('Alumni deleted successfully');window.location.href='../adminzone/Manage_Alumni.jsp';</script>");
            }
            else{
                out.print("<script>alert('Alumni Image deleted successfully but \nSomething went wrong while deleting Alumni record from database');window.location.href='../adminzone/Manage_Alumni.jsp';</script>");
            }
        }
        else{
            out.print("<script>alert('Something went wrong: File exists but cannot be deleted');window.location.href='../adminzone/Manage_Alumni.jsp';</script>");
        }
    }else
    {
        out.print("<script>alert('file does not exists');window.location.href='../adminzone/Manage_Alumni.jsp';</script>");
    }
%>