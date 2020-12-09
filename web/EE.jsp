
<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width-device-width , initial-scale=1, user-scalable=yes">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Electrical Engineering</title>
        <script src="Bootstrap/js/bootstrap-v4.2.1.min.js" type="text/javascript"></script>
        <link href="Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
        <link href="Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/table.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

    <h1>Electrical &nbsp;Engineering &nbsp;Department</h1>
    <div class="select">
        <select name="subject" onchange="getNotes(this.value)" required="">

            <option value="">Select Subject</option>
            <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
                PreparedStatement ps=con.prepareStatement("select subject from subjects where department = 'EE'");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
            %>
            <option><%=rs.getString(1)%></option>
            <% }%>
        </select>
    </div>

    <table id="gr1" border="0" cellspacing="0" class="table table-dark ">
        <thead>
            <tr class="rh">
                    <th>FILE</th>
                    <th>TITLE</th>
                    <th>DESCRIPTION</th>
                    <th>SUBJECT</th>
                    <th>DOWNLOAD</th>
            </tr>
        </thead>
    </table>

    <script src="js/fetchNotes.js" rel="javascript" type="text/javascript"></script>
</body>
</html>