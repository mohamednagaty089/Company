/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nagaty
 */
public class LoginServlet extends HttpServlet {

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
        String username=request.getParameter("Username");
        String password=request.getParameter("Password");
        HttpSession httpsession=request.getSession();
        httpsession.setAttribute("username", username);
        httpsession.setAttribute("password", password);
          
        try (PrintWriter out = response.getWriter();
              ) {
            
            /* TODO output your page here. You may use following sample code. */
            out.println(prepareHeader());
            
            out.println("<a href=\"http://localhost:8080/Company/ShowSessionData\">tam tahmel el data</h1>");
            out.println("<h1>"+username +"</h1>");
            out.println("<h1>"+ password+"</h1>");
            out.println(prepareFooter());
           
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
    private String prepareHeader(){
        String header="";
        header+="<!DOCTYPE html>";
        header+="<html>";
        header+="<head>";
        header+="<title>Servlet LoginServlet</title>";
        header+="</head>";
        header+="<body>";
        return header;
    }
    private String prepareFooter(){
        String footer="";
        footer+="</body>";
        footer+="</html>";
        
      return footer;
    }
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
        processRequest(request, response);
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
