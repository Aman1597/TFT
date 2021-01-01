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
import java.sql.ResultSet;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Aman Deep
 */
@MultipartConfig
@WebServlet(name = "upload", urlPatterns = {"/upload"})
public class upload extends HttpServlet {

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
            out.println("<title>Servlet upload</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet upload at " + request.getContextPath() + "</h1>");
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
    try {
    String subject = request.getParameter("subject");
    String title = request.getParameter("title").toUpperCase();
    String description = request.getParameter("description");
    Part p = request.getPart("myfile");
    String filename = p.getSubmittedFileName();
    DbManager db = new DbManager();
    String q = "select * from notes where filename='"+filename+"'";
    ResultSet rss= db.selectQuery(q);
    if(rss.next())
    {
        response.getWriter().print("<script>alert('A file with same filename already exists');window.location.href='adminzone/Manage_Notes.jsp';</script>");
    }
    else
    {
        InputStream is = p.getInputStream();
        //String s = getRandomString();
        File f = new File(request.getRealPath("/notes"), filename);
        Files.copy(is, f.toPath());
        String query = "insert into notes(subject,filename,title,description,uploaddate) values('"+subject+"','"+filename+"','"+title+"','"+description+"',curdate())";
        if(db.executeNonQuery(query)){
            response.getWriter().print("<script>alert('Upload Successful');window.location.href='adminzone/Manage_Notes.jsp';</script>");
        }
        else{
            response.getWriter().print("some sql exception occured");
        }
    }
    } catch (Exception e) {
                response.getWriter().print("<script>alert('Not Uploaded');window.location.href='adminzone/Manage_Notes.jsp';</script>");
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

    private String getRandomString() {
    String str="";
    int n=1 , num=0;
    Random r=new Random();
    while(n<=5)
    {
        num=r.nextInt(9)+ 1;
        str = str + num;
        n++;
    }
    return str;
    }

}
