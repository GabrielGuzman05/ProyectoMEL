/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.orm.PersistentException;
import orm.Usuario;

/**
 *
 * @author Pablo
 */
@WebServlet(name = "Novelas", urlPatterns = {"/novelas"})
public class Novelas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. Entregando una lista con las novelas a la vista
     * <code>Novelas.jsp</code> cuando es llamada, accesible a traves del
     * navegador a traves del urlPath /Novelas
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws org.orm.PersistentException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, PersistentException {

        //orm.Novela novela = orm.NovelaDAO.getNovelaByORMID(55);
        //System.out.println("sadasd"+ novela.getNombre());
        HttpSession sesion = request.getSession();
        orm.Novela[] novelas = orm.NovelaDAO.listNovelaByQuery(null, null);
        request.setAttribute("novelas", novelas);
        try{
            sesion.getAttribute("loged").toString();
        }catch(Exception e){
            sesion.setAttribute("loged", false);
        }
        if ("true".equals(sesion.getAttribute("loged").toString())) {
            Usuario usuarioByORMID = orm.UsuarioDAO.getUsuarioByORMID(Integer.
                    parseInt(sesion.getAttribute("idUsuario").toString()));
            request.setAttribute("lista", usuarioByORMID.lista.toArray());
        }
        RequestDispatcher rd = request.getRequestDispatcher("/Novelas.jsp");
        rd.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(Novelas.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(Novelas.class.getName()).log(Level.SEVERE, null, ex);
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
