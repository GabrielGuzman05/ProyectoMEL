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
package ORM;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class SerieGenericaDAO {
	public static SerieGenerica loadSerieGenericaByORMID(int idSerie) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadSerieGenericaByORMID(session, idSerie);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica getSerieGenericaByORMID(int idSerie) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getSerieGenericaByORMID(session, idSerie);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica loadSerieGenericaByORMID(int idSerie, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadSerieGenericaByORMID(session, idSerie, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica getSerieGenericaByORMID(int idSerie, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getSerieGenericaByORMID(session, idSerie, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica loadSerieGenericaByORMID(PersistentSession session, int idSerie) throws PersistentException {
		try {
			return (SerieGenerica) session.load(ORM.SerieGenerica.class, new Integer(idSerie));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica getSerieGenericaByORMID(PersistentSession session, int idSerie) throws PersistentException {
		try {
			return (SerieGenerica) session.get(ORM.SerieGenerica.class, new Integer(idSerie));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica loadSerieGenericaByORMID(PersistentSession session, int idSerie, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SerieGenerica) session.load(ORM.SerieGenerica.class, new Integer(idSerie), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica getSerieGenericaByORMID(PersistentSession session, int idSerie, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SerieGenerica) session.get(ORM.SerieGenerica.class, new Integer(idSerie), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySerieGenerica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return querySerieGenerica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySerieGenerica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return querySerieGenerica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica[] listSerieGenericaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listSerieGenericaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica[] listSerieGenericaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listSerieGenericaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySerieGenerica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SerieGenerica as SerieGenerica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySerieGenerica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SerieGenerica as SerieGenerica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SerieGenerica", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica[] listSerieGenericaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySerieGenerica(session, condition, orderBy);
			return (SerieGenerica[]) list.toArray(new SerieGenerica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica[] listSerieGenericaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySerieGenerica(session, condition, orderBy, lockMode);
			return (SerieGenerica[]) list.toArray(new SerieGenerica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica loadSerieGenericaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadSerieGenericaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica loadSerieGenericaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadSerieGenericaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica loadSerieGenericaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SerieGenerica[] serieGenericas = listSerieGenericaByQuery(session, condition, orderBy);
		if (serieGenericas != null && serieGenericas.length > 0)
			return serieGenericas[0];
		else
			return null;
	}
	
	public static SerieGenerica loadSerieGenericaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SerieGenerica[] serieGenericas = listSerieGenericaByQuery(session, condition, orderBy, lockMode);
		if (serieGenericas != null && serieGenericas.length > 0)
			return serieGenericas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSerieGenericaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateSerieGenericaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSerieGenericaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateSerieGenericaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSerieGenericaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SerieGenerica as SerieGenerica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSerieGenericaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.SerieGenerica as SerieGenerica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SerieGenerica", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica createSerieGenerica() {
		return new ORM.SerieGenerica();
	}
	
	public static boolean save(ORM.SerieGenerica serieGenerica) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(serieGenerica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ORM.SerieGenerica serieGenerica) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(serieGenerica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.SerieGenerica serieGenerica)throws PersistentException {
		try {
			ORM.Genero[] lGeneroidGeneros = serieGenerica.generoidGenero.toArray();
			for(int i = 0; i < lGeneroidGeneros.length; i++) {
				lGeneroidGeneros[i].serieGenericaidSerie.remove(serieGenerica);
			}
			ORM.EntradaLista[] lEntradaListas = serieGenerica.entradaLista.toArray();
			for(int i = 0; i < lEntradaListas.length; i++) {
				lEntradaListas[i].setSerieGenericaidSerie(null);
			}
			return delete(serieGenerica);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.SerieGenerica serieGenerica, org.orm.PersistentSession session)throws PersistentException {
		try {
			ORM.Genero[] lGeneroidGeneros = serieGenerica.generoidGenero.toArray();
			for(int i = 0; i < lGeneroidGeneros.length; i++) {
				lGeneroidGeneros[i].serieGenericaidSerie.remove(serieGenerica);
			}
			ORM.EntradaLista[] lEntradaListas = serieGenerica.entradaLista.toArray();
			for(int i = 0; i < lEntradaListas.length; i++) {
				lEntradaListas[i].setSerieGenericaidSerie(null);
			}
			try {
				session.delete(serieGenerica);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ORM.SerieGenerica serieGenerica) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(serieGenerica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ORM.SerieGenerica serieGenerica) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(serieGenerica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SerieGenerica loadSerieGenericaByCriteria(SerieGenericaCriteria serieGenericaCriteria) {
		SerieGenerica[] serieGenericas = listSerieGenericaByCriteria(serieGenericaCriteria);
		if(serieGenericas == null || serieGenericas.length == 0) {
			return null;
		}
		return serieGenericas[0];
	}
	
	public static SerieGenerica[] listSerieGenericaByCriteria(SerieGenericaCriteria serieGenericaCriteria) {
		return serieGenericaCriteria.listSerieGenerica();
	}
}
