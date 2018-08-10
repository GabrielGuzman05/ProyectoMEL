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
import orm.Novela;
import orm.NovelaDAO;

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
                System.out.println("Entra");
                String nombreLista = request.getParameter("Lista");
                String ter = request.getParameter("terminado");
                String ult = request.getParameter("ulCap");
                String alD = request.getParameter("alDia");
                String origen = request.getParameter("origen");
                String id = request.getParameter("id");
                System.out.println(id);
                System.out.println("Antes de entrada ----" + ter + ult + origen + alD);

                System.out.println("Saca los datos");
                orm.EntradaLista el = EntradaListaDAO.createEntradaLista();
                orm.Lista list = ListaDAO.loadListaByQuery("nombreLista=" + "'" + nombreLista + "'", null);
                System.out.println("Busca las lista");
                System.out.println(list.getNombreLista());
                if ("Series".equals(origen)) {
                    el.setTipo(1);
                    el.setSerieGenericaidSerie(orm.SerieGenericaDAO.getSerieGenericaByORMID(Integer.parseInt(id)));
                } else if ("Anime".equals(origen)) {
                    el.setTipo(2);
                    el.setAnimacionidAnimacion(orm.AnimacionDAO.getAnimacionByORMID(Integer.parseInt(id)));
                } else if ("Mangas".equals(origen)) {
                    el.setTipo(3);
                    el.setMangaidManga(orm.MangaDAO.getMangaByORMID(Integer.parseInt(id)));
                } else if ("Novelas".equals(origen)) {
                    el.setTipo(4);
                    System.out.println("setea tipo");
                    Novela novelaByORMID = orm.NovelaDAO.getNovelaByORMID(Integer.parseInt(id));
                    System.out.println("la busca");
                    el.setNovelaidNovela(novelaByORMID);
                    System.out.println("la setea");
                    NovelaDAO.save(novelaByORMID);
                    System.out.println("no encuentra la novela");
                }

                System.out.println("origen");
                if ("on".equals(ter)) {
                    el.setTerminado(true);
                } else {
                    el.setTerminado(false);
                }
                System.out.println("terminado");
                if ("on".equals(alD)) {
                    el.setAlDia(true);
                } else {
                    el.setAlDia(false);
                }
                System.out.println("al dia");
                el.setUltimoCapitulo(Integer.parseInt(ult));
                el.setListaidLista(list);

                System.out.println("Antes de entrada" + ter + ult + origen + alD);
                
                orm.EntradaListaDAO.save(el);
                orm.ListaDAO.save(list);
                t.commit();
            } catch (Exception e) {
                t.rollback();
            }
            RequestDispatcher disp = request.getRequestDispatcher("home");
            disp.forward(request, response);
        } else {
            System.out.println("");
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
