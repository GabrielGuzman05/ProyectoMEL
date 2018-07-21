/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SampleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			if (action.equals("create")) {
				ORMDatabaseInitiator.createSchema(orm.ProyectoProgramacionAvanzadaPersistentManager.instance());
			}
			else if (action.equals("drop")) {
				ORMDatabaseInitiator.dropSchema(orm.ProyectoProgramacionAvanzadaPersistentManager.instance());
			}
			else {
				if (action.equals("insert")) {
					CreateProyectoProgramacionAvanzadaData createProyectoProgramacionAvanzadaData = new CreateProyectoProgramacionAvanzadaData();
					createProyectoProgramacionAvanzadaData.createTestData();
				}
				else if (action.equals("update")) {
					RetrieveAndUpdateProyectoProgramacionAvanzadaData retrieveAndUpdateProyectoProgramacionAvanzadaData = new RetrieveAndUpdateProyectoProgramacionAvanzadaData();
					retrieveAndUpdateProyectoProgramacionAvanzadaData.retrieveAndUpdateTestData();
				}
				else if (action.equals("delete")) {
					DeleteProyectoProgramacionAvanzadaData deleteProyectoProgramacionAvanzadaData = new DeleteProyectoProgramacionAvanzadaData();
					deleteProyectoProgramacionAvanzadaData.deleteTestData();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//***** To ensure persistent session is closed after every request, either add the following lines to "Web.xml" (recommended):
		//
		//<filter>
		//  <filter-name>ORMFilter</filter-name>
		//	<filter-class>ormsamples.ProyectoProgramacionAvanzadaFilter</filter-class>
		//</filter>
		//
		//<filter-mapping>
		//	<filter-name>ORMFilter</filter-name>
		//	<url-pattern>/*</url-pattern>
		//</filter-mapping>
		//
		//***** or add the following statement at the end of each servlet that used ORM:
		//
		//orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().close();", true);
		
		PrintWriter lWriter = response.getWriter();
		lWriter.println("Sample Servlet. Action = " + action);
		lWriter.close();
	}
}
