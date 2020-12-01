<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
    String ntxt=request.getParameter("notificationtext");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
    //PreparedStatement ps=con.prepareStatement("insert into notification(notificationtext,posteddt) values('"+ntxt+"',curdate())");
    PreparedStatement ps=con.prepareStatement("insert into notification(notificationtext,posteddt) values(?,curdate())");
    ps.setString(1, ntxt);
    ps.executeUpdate();
    out.print("<script>alert('Notification uploaded successfully');window.location.href='../adminzone/Manage_Notification.jsp';</script>");
%>