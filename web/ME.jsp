
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width-device-width , initial-scale=1, user-scalable=yes">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mechanical Engineering</title>
        <script src="Bootstrap/js/bootstrap-v4.2.1.min.js" type="text/javascript"></script>
        <link href="Bootstrap/css/bootstrap-v3.3.7.min.css" rel="stylesheet" type="text/css"/>
        <link href="Bootstrap/css/bootstrap-v4.2.1.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/table.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

    <h1>Mechanical &nbsp;Engineering &nbsp;Department</h1>
    <% String dept = "ME";%>
    <%@include file="fetchSubjects.jsp" %>
    <%@include file="displayNotes.jsp" %>
    <script src="js/fetchNotes.js" rel="javascript" type="text/javascript"></script>
</body>
</html>