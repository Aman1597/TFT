
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Electrical Engineering</title>
    <%@include file="CSS_and_JS_links.jsp" %>
</head>
<body>

    <h1>Electrical &nbsp;Engineering &nbsp;Department</h1>
    <% String dept = "EE";%>
    <%@include file="fetchSubjects.jsp" %>
    <%@include file="displayNotes.jsp" %>
    <script src="js/fetchNotes.js" rel="javascript" type="text/javascript"></script>
</body>
</html>