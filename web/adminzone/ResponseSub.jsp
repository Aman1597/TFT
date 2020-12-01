<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>


<option value="">Select Subject</option>
<%
    String dept=request.getParameter("datapost");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
    PreparedStatement ps=con.prepareStatement("select subject from subjects where department = '"+dept+"' ");
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
%>
<option><%=rs.getString(1)%></option>
<% }%>