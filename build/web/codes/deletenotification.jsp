<%@page import="mypack.DbManager"%>

<%
    int id=Integer.parseInt(request.getParameter("id"));
    DbManager db = new DbManager();
    String query = "delete from notification where id='"+id+"'";
    db.executeNonQuery(query);
    out.print("<script>alert('Notification deleted successfully');window.location.href='../adminzone/Manage_Notification.jsp';</script>");
%>