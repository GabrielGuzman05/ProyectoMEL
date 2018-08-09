/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
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
import org.orm.PersistentTransaction;

/**
 *
 * @author Gabriel
 */
@WebServlet(name = "CrearLista", urlPatterns = {"/CrearLista"})
public class CrearLista extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. Permite crear una nueva lista con el nombre que sea entregado.
     * Solo funciona cunado hay un usuario logeado. Redirecciona al home del
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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession();
        if ("true".equals(sesion.getAttribute("loged").toString())) {
            PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                orm.Lista auxLista = orm.ListaDAO.createLista();
                orm.Usuario auxUser = orm.UsuarioDAO.getUsuarioByORMID(Integer.
                        parseInt(sesion.getAttribute("idUsuario").toString()));
                if (auxUser != null) {
                    auxLista.setNombreLista(request.getParameter("name"));
                    auxLista.setUsuarioidUsuario(auxUser);
                    orm.ListaDAO.save(auxLista);
                }
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
            RequestDispatcher disp = request.getRequestDispatcher("home");
            disp.forward(request, response);
        } else {
            RequestDispatcher disp = request.getRequestDispatcher(request.getParameter("login.html"));
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
                processRequest(request, response);
            } catch (PersistentException ex) {
                Logger.getLogger(CrearLista.class.getName()).log(Level.SEVERE, null, ex);
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
                processRequest(request, response);
            } catch (PersistentException ex) {
                Logger.getLogger(CrearLista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
