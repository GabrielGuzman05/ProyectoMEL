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
import jdk.nashorn.internal.ir.RuntimeNode;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import orm.EntradaLista;
import orm.EntradaListaDAO;

/**
 *
 * @author Gabriel
 */
@WebServlet(name = "EliminarLista", urlPatterns = {"/EliminarLista"})
public class EliminarLista extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. Permite eliminar alguna lista segun el id que sea entregado.
     * Solo funciona en caso de usuario logueado. Redirecciona al home del
     * usuario en usuario logueado, redirecciona al login en caso de login
     * falso.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws org.orm.PersistentException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, PersistentException {
        HttpSession sesion = request.getSession();
        if ("true".equals(sesion.getAttribute("loged").toString())) {
            PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                orm.Lista auxLista = orm.ListaDAO.getListaByORMID(Integer.parseInt(request.getParameter("id")));
                if (auxLista != null) {
                    for (EntradaLista toArray : auxLista.entradaLista.toArray()) {
                        EntradaListaDAO.deleteAndDissociate(toArray);
                    }
                    orm.ListaDAO.delete(auxLista);
                }
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
            RequestDispatcher disp = request.getRequestDispatcher("home");
            disp.forward(request, response);
        } else {
            RequestDispatcher disp = request.getRequestDispatcher("home");
            disp.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(EliminarLista.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EliminarLista.class.getName()).log(Level.SEVERE, null, ex);
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
