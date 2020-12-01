<%
String id=request.getParameter("id");
String password=request.getParameter("password");
if(id.equals("admin"))
{
    if(password.equals("tft@123"))
    {
        session.setAttribute("id", id);
        out.println("<script>alert('Welcome Admin');window.location.href='../adminzone/Manage_Notification.jsp';</script>");
    }
    else
    {
        out.println("<script>alert('Invalid password');window.location.href='../login.jsp';</script>");
    }
}
else
{
    out.println("<script>alert('Invalid ID');window.location.href='../login.jsp';</script>");
}
%>        