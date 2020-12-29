/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 *
 * @author AMAN DEEP
 */
@MultipartConfig
@WebServlet(name = "AlumniUpload", urlPatterns = {"/AlumniUpload"})
public class AlumniUpload extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlumniUpload</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AlumniUpload at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try{
        String strx = request.getParameter("name");
        String name = getCapitalizedString(strx);
        String branch = request.getParameter("branch");
        int batch = Integer.parseInt(request.getParameter("batch"));
        String email = request.getParameter("email");
        Part p = request.getPart("imgFile");
        String filename = p.getSubmittedFileName();
        DbManager db = new DbManager();
        String query = "select * from alumni where imgname='"+filename+"'";
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
//        PreparedStatement pss = con.prepareStatement("select * from alumni where imgname='"+filename+"'");
        ResultSet rss = db.selectQuery(query);
        if(rss.next())
        {
            response.getWriter().print("<script>alert('The Alumni or an image file with same filename already exists');window.location.href='adminzone/Manage_Alumni.jsp';</script>");
        }
        else
        {
        InputStream is = p.getInputStream();
        File f = new File(request.getRealPath("/AlumniImages"), filename);
        Files.copy(is, f.toPath());
        String q = "insert into alumni(name, branch, batch, email, imgname, uploaddate) values('"+name+"', '"+branch+"', '"+batch+"', '"+email+"', '"+filename+"', curdate())";
//        PreparedStatement ps = con.prepareStatement("insert into alumni(name, branch, batch, imgname, uploaddate) values('"+name+"', '"+branch+"', '"+batch+"', '"+filename+"', curdate())");
//        ps.executeUpdate();
        db.executeNonQuery(q);
        response.getWriter().print("<script>alert('Alumni Added Successfully');window.location.href='adminzone/Manage_Alumni.jsp';</script>");
        }
    }
    catch(Exception e){
        response.sendRedirect("index.html?error"+e);
    }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public String getCapitalizedString(String str){
        String arr[]=str.split(" ");
        String s="";
        for(String w:arr){
            String s1 = w.substring(0,1);
            String s2 = w.substring(1);
            s += s1.toUpperCase()+s2+" ";
        }
        return s.trim();
    }
}
