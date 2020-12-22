<%@page import="mypack.DbManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
    String ntxt=request.getParameter("notificationtext");
    DbManager db = new DbManager();
    Connection con = db.getCon() ;
    //PreparedStatement ps=con.prepareStatement("insert into notification(notificationtext,posteddt) values('"+ntxt+"',curdate())");
    PreparedStatement ps=con.prepareStatement("insert into notification(notificationtext,posteddt) values(?,curdate())");
    ps.setString(1, ntxt);
    
    String q = ps.toString();
    //out.print(q+"<br/>");
    String query = q.substring(q.indexOf("insert"));
    //out.print(query);
    if(db.executeNonQuery(query))
    {
    out.print("<script>alert('Notification uploaded successfully');window.location.href='../adminzone/Manage_Notification.jsp';</script>");
    }
%>