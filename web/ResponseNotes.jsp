<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<thead>
    <tr class="rh">
            <th style="text-align: left;padding-left: 4%;">FILE</th>
            <th>TITLE</th>
            <th>DESCRIPTION</th>
            <th>SUBJECT</th>
            <th>DOWNLOAD</th>
    </tr>
</thead>
<tbody>
<%
    String sub=request.getParameter("datapost");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb","root","");
    PreparedStatement ps=con.prepareStatement("select filename,title,description,subject from notes where subject='"+sub+"'");
    ResultSet rs=ps.executeQuery();

    while(rs.next())
    {
%>
<tr>
    <td style="text-align: left;padding-left: 3%;"><img src="image/pdf.png" height="27" width="40"/><%=rs.getString(1)%></td>
    <td><%=rs.getString(2)%></td>
    <td><%=rs.getString(3)%></td>
    <td><%=rs.getString(4)%></td>
    <td><a target="_blank" href="<%=request.getContextPath() + "/notes/" + rs.getString(1)%>">Download</a></td>
</tr>
<%
    }
%>
</tbody>