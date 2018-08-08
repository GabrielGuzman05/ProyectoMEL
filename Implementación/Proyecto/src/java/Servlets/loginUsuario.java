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
import org.orm.PersistentTransaction;

/**
 *
 * @author Gabriel
 */
@WebServlet(name = "loginUsuario", urlPatterns = {"/loginUsuario"})
public class loginUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * Procesa la logica para ingresar a los datos de un usuario.
     * Requiere el usuario y contraseña, si encuentra los datos, se redirecciona
     * a la pagina del usuario home, en caso de que los datos no sean correctos
     * se redirecciona a la pagina de login.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ///*
        String user = request.getParameter("User");
        String pass = request.getParameter("password");

        HttpSession sesion = request.getSession();
        Boolean login = false;

        try {
            PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
            orm.Usuario oRMUsuario = orm.UsuarioDAO.loadUsuarioByQuery("nombre"
                    + "Usuario='" + user + "' and contraseñaUsuario='" + pass + "'", null);
            // Update the properties of the persistent object
            if (oRMUsuario != null) {
                sesion.setAttribute("usuario", oRMUsuario);
                sesion.setAttribute("idUsuario", oRMUsuario.getIdUsuario());
                System.out.println("Found");
                login = true;
                sesion.setAttribute("loged", login);
            }
            if (login) {
                RequestDispatcher disp = request.getRequestDispatcher("home");
                request.setAttribute("lista", oRMUsuario.lista.toArray());
                disp.forward(request, response);
                System.out.println("Login Correcto");
                orm.UsuarioDAO.save(oRMUsuario);
            } else {
                RequestDispatcher disp = request.getRequestDispatcher("login.html");
                disp.forward(request, response);
                System.out.println("Login Incorrecto");
            }
        } catch (PersistentException ex) {
            Logger.getLogger(loginUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
