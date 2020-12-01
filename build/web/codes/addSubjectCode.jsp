<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
    String dept=request.getParameter("department");
    String sub=request.getParameter("subject").toUpperCase();
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "" );
    PreparedStatement pss=con.prepareStatement("select * from subjects where department='"+dept+"' and subject='"+sub+"'");
    ResultSet rss=pss.executeQuery();
    if(rss.next())
    {
        out.print("<script>alert('This subject already exists for this department');window.location.href='../adminzone/Add_Subject.jsp';</script>");
    }
    else
    {
        PreparedStatement ps=con.prepareStatement("insert into subjects(department, subject) values ('"+dept+"', '"+sub+"')");
        ps.executeUpdate();
        out.print("<script>alert('Subject added successfully');window.location.href='../adminzone/Add_Subject.jsp';</script>");
    }
%>