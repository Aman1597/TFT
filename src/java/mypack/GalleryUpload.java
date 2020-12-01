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
@WebServlet(name = "GalleryUpload", urlPatterns = {"/GalleryUpload"})
public class GalleryUpload extends HttpServlet {

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
            out.println("<title>Servlet GalleryUpload</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GalleryUpload at " + request.getContextPath() + "</h1>");
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
        Part p = request.getPart("imgFile");
        String filename = p.getSubmittedFileName();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tftdb", "root", "");
        PreparedStatement pss = con.prepareStatement("select * from gallery where imgname='"+filename+"'");
        ResultSet rss = pss.executeQuery();
        if(rss.next())
        {
            response.getWriter().print("<script>alert('A file with same filename already exists');window.location.href='adminzone/Manage_Gallery.jsp';</script>");
        }
        else
        {
        InputStream is = p.getInputStream();
        File f = new File(request.getRealPath("/GalleryImages"), filename);
        Files.copy(is, f.toPath());
        PreparedStatement ps = con.prepareStatement("insert into gallery(imgname, uploaddate) values('"+filename+"', curdate())");
        ps.executeUpdate();
        response.getWriter().print("<script>alert('Upload Successful');window.location.href='adminzone/Manage_Gallery.jsp';</script>");
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

}
