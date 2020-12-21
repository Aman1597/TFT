<%@page import="mypack.DbManager"%>
<%@page import="java.sql.ResultSet"%>
<%
    String dept=request.getParameter("department");
    String sub=request.getParameter("subject").toUpperCase();
    DbManager db = new DbManager();
    String query = "select * from subjects where department='"+dept+"' and subject='"+sub+"'";
    ResultSet rss= db.selectQuery(query);
                       
    if(rss.next())
    {
        out.print("<script>alert('This subject already exists for this department');window.location.href='../adminzone/Add_Subject.jsp';</script>");
    }
    else
    {
        String q = "insert into subjects(department, subject) values ('"+dept+"', '"+sub+"')";
        db.executeNonQuery(q);
        out.print("<script>alert('Subject added successfully');window.location.href='../adminzone/Add_Subject.jsp';</script>");
    }
%>