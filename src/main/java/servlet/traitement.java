/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import Modele.Livre;
import Service.servicelivreIMP;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@WebServlet(name = "traitement", urlPatterns = {"/traitement"})
public class traitement extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    servicelivreIMP service=new servicelivreIMP();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//    String action = request.getServletPath();
    String action=request.getParameter("action");
//    RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
    Livre livre;
if(action==null){
   List<Livre> livres=service.getall();
      request.setAttribute("livres",livres);
     request.getRequestDispatcher("index.jsp").forward(request, response);
    }
  
   else 
     
  switch(action){
  
    case "add":
     String titre=request.getParameter("titre");
     String auteur=request.getParameter("auteur");
     int n_page=Integer.valueOf(request.getParameter("n_page"));
     float prix=Float.valueOf(request.getParameter("prix"));
     livre=new Livre(titre,auteur,n_page,prix);
     service.save(livre);
     response.sendRedirect("traitement");

  break;
     
    case "update":
    int  num_livre=Integer.valueOf(request.getParameter("num_livre"));
      titre=request.getParameter("titre");
      auteur=request.getParameter("auteur");
      n_page=Integer.valueOf(request.getParameter("n_page"));
      prix=Float.valueOf(request.getParameter("prix"));
      livre=new Livre(num_livre,titre,auteur,n_page,prix);
      service.update(livre);
       response.sendRedirect("traitement");
      break;
      
    case "delete":
      num_livre=Integer.valueOf(request.getParameter("num_livre"));
      service.delete(num_livre);
       response.sendRedirect("traitement");
     break;
     
     
}
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
        this.doGet(request, response);
        
    
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

     