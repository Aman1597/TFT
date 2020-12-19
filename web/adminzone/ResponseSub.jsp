<%@page import="mypack.DbManager"%>
<%@page import="java.sql.ResultSet"%>

<option value="">Select Subject</option>
<%
    String dept=request.getParameter("datapost");
    DbManager db = new DbManager();
    String query = "select subject from subjects where department = '"+dept+"'";
    ResultSet rs= db.selectQuery(query);
    
    while(rs.next())
    {
%>
<option><%=rs.getString(1)%></option>
<% }%>