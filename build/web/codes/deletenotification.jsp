<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
    int id=Integer.parseInt(request.getParameter("id"));
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb","root","");
    PreparedStatement ps=con.prepareStatement("delete from notification where id='"+id+"'");
    ps.executeUpdate();
    out.print("<script>alert('Notification deleted successfully');window.location.href='../adminzone/Manage_Notification.jsp';</script>");
%>