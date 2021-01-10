<%@page import="mypack.DbManager"%>
<%@page import="java.sql.ResultSet"%>

<thead>
<tr class="rh">
    <th style="text-align: left;padding-left: 4%;">FILE</th>
    <th>TITLE</th>
    <th>DESCRIPTION</th>
    <th>SUBJECT</th>
    <th>DEPT.</th>
    <th>DOWNLOAD</th>
    <th>DELETE</th>
</tr>
</thead>
<tbody>
<%
    String sub=request.getParameter("datapost");
    DbManager db = new DbManager();
    String query = "select filename,title,description,subject,department from notes where subject='"+sub+"'";
    ResultSet rs= db.selectQuery(query);

    while(rs.next())
    {
%>

<tr class="tr">
    <td class="key" style="text-align: left;padding-left: 3%;"><img src="../image/pdf.png" height="27" width="40"/><%=rs.getString(1)%></td>
    <td class="key"><%=rs.getString(2)%></td>
    <td class="key"><%=rs.getString(3)%></td>
    <td class="key"><%=rs.getString(4)%></td>
    <td class="key"><%=rs.getString(5)%></td>
    <td><a target="_blank" href="<%=request.getContextPath() + "/notes/" + rs.getString(1)%>">Download</a></td>
    <td><a href="../codes/deletenotes.jsp?filename=<%=rs.getString(1)%>">Delete</a></td>
</tr>
<%
    }
%>
</tbody>