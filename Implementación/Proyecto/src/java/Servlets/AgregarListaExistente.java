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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import orm.EntradaListaDAO;
import orm.ListaDAO;

/**
 *
 * @author Pablo
 */
public class AgregarListaExistente extends HttpServlet {

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
            throws ServletException, IOException, PersistentException {
        HttpSession sesion = request.getSession();
        if ("true".equals(sesion.getAttribute("loged").toString())) {
            PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {

                String nombreLista = request.getParameter("Lista");
                String ter = request.getParameter("terminado");
                String ult = request.getParameter("ulCap");
                String alD = request.getParameter("alDia");
                String origen = request.getParameter("origen");
                String id = request.getParameter("id");

                orm.EntradaLista el = EntradaListaDAO.createEntradaLista();
                orm.Lista list = ListaDAO.loadListaByQuery("nombreLista=" + "'" + nombreLista + "'", null);
                el.setListaidLista(list);

                if ("on".equals(ter)) {
                    el.setTerminado(true);
                } else {
                    el.setTerminado(false);
                }
                if ("on".equals(alD)) {
                    el.setAlDia(true);
                } else {
                    el.setAlDia(false);
                }

                el.setUltimoCapitulo(Integer.parseInt(ult));
                
                System.out.println("Antes de entrada" + ter + ult + origen + alD);

                switch (origen) {
                    case "Series":
                        el.setTipo(1);
                        el.setSerieGenericaidSerie(orm.SerieGenericaDAO.getSerieGenericaByORMID(Integer.parseInt(id)));
                        break;
                    case "Anime":
                        el.setTipo(2);
                        el.setAnimacionidAnimacion(orm.AnimacionDAO.getAnimacionByORMID(Integer.parseInt(id)));
                        break;
                    case "Mangas":
                        el.setTipo(3);
                        el.setMangaidManga(orm.MangaDAO.getMangaByORMID(Integer.parseInt(id)));
                        break;
                    case "Novelas":
                        el.setTipo(4);
                        el.setNovelaidNovela(orm.NovelaDAO.getNovelaByORMID(Integer.parseInt(id)));
                        break;

                }

                orm.EntradaListaDAO.save(el);
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
            Logger.getLogger(AgregarListaExistente.class
                    .getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AgregarListaExistente.class
                    .getName()).log(Level.SEVERE, null, ex);
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
