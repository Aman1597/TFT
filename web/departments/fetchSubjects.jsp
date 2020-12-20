<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DbManager"%>
<div class="select">
    <select name="subject" onchange="getNotes(this.value)" required="">

        <option value="">Select Subject</option>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            DbManager db = new DbManager();
            String query = "select subject from subjects where department = '"+dept+"'";
            ResultSet rs= db.selectQuery(query);
            
            while(rs.next())
            {
        %>
        <option><%=rs.getString(1)%></option>
        <% }%>
    </select>
</div>