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
package orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class EntradaListaDAO {

    /**
     *
     * @param idEntrada
     * @return
     * @throws PersistentException
     */
    public static EntradaLista loadEntradaListaByORMID(int idEntrada) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadEntradaListaByORMID(session, idEntrada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idEntrada
     * @return
     * @throws PersistentException
     */
    public static EntradaLista getEntradaListaByORMID(int idEntrada) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getEntradaListaByORMID(session, idEntrada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idEntrada
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static EntradaLista loadEntradaListaByORMID(int idEntrada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadEntradaListaByORMID(session, idEntrada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idEntrada
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static EntradaLista getEntradaListaByORMID(int idEntrada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getEntradaListaByORMID(session, idEntrada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idEntrada
     * @return
     * @throws PersistentException
     */
    public static EntradaLista loadEntradaListaByORMID(PersistentSession session, int idEntrada) throws PersistentException {
		try {
			return (EntradaLista) session.load(orm.EntradaLista.class, new Integer(idEntrada));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idEntrada
     * @return
     * @throws PersistentException
     */
    public static EntradaLista getEntradaListaByORMID(PersistentSession session, int idEntrada) throws PersistentException {
		try {
			return (EntradaLista) session.get(orm.EntradaLista.class, new Integer(idEntrada));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idEntrada
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static EntradaLista loadEntradaListaByORMID(PersistentSession session, int idEntrada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EntradaLista) session.load(orm.EntradaLista.class, new Integer(idEntrada), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idEntrada
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static EntradaLista getEntradaListaByORMID(PersistentSession session, int idEntrada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EntradaLista) session.get(orm.EntradaLista.class, new Integer(idEntrada), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static List queryEntradaLista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryEntradaLista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static List queryEntradaLista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryEntradaLista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static EntradaLista[] listEntradaListaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listEntradaListaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static EntradaLista[] listEntradaListaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listEntradaListaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static List queryEntradaLista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.EntradaLista as EntradaLista");
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static List queryEntradaLista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.EntradaLista as EntradaLista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EntradaLista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static EntradaLista[] listEntradaListaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEntradaLista(session, condition, orderBy);
			return (EntradaLista[]) list.toArray(new EntradaLista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static EntradaLista[] listEntradaListaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEntradaLista(session, condition, orderBy, lockMode);
			return (EntradaLista[]) list.toArray(new EntradaLista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static EntradaLista loadEntradaListaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadEntradaListaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static EntradaLista loadEntradaListaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadEntradaListaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static EntradaLista loadEntradaListaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EntradaLista[] entradaListas = listEntradaListaByQuery(session, condition, orderBy);
		if (entradaListas != null && entradaListas.length > 0)
			return entradaListas[0];
		else
			return null;
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static EntradaLista loadEntradaListaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EntradaLista[] entradaListas = listEntradaListaByQuery(session, condition, orderBy, lockMode);
		if (entradaListas != null && entradaListas.length > 0)
			return entradaListas[0];
		else
			return null;
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static java.util.Iterator iterateEntradaListaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateEntradaListaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static java.util.Iterator iterateEntradaListaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateEntradaListaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static java.util.Iterator iterateEntradaListaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.EntradaLista as EntradaLista");
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static java.util.Iterator iterateEntradaListaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.EntradaLista as EntradaLista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EntradaLista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @return
     */
    public static EntradaLista createEntradaLista() {
		return new orm.EntradaLista();
	}
	
    /**
     *
     * @param entradaLista
     * @return
     * @throws PersistentException
     */
    public static boolean save(orm.EntradaLista entradaLista) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(entradaLista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param entradaLista
     * @return
     * @throws PersistentException
     */
    public static boolean delete(orm.EntradaLista entradaLista) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(entradaLista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param entradaLista
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(orm.EntradaLista entradaLista)throws PersistentException {
		try {
			if (entradaLista.getListaidLista() != null) {
				entradaLista.getListaidLista().entradaLista.remove(entradaLista);
			}
			
			if (entradaLista.getNovelaidNovela() != null) {
				entradaLista.getNovelaidNovela().entradaLista.remove(entradaLista);
			}
			
			if (entradaLista.getMangaidManga() != null) {
				entradaLista.getMangaidManga().entradaLista.remove(entradaLista);
			}
			
			if (entradaLista.getAnimacionidAnimacion() != null) {
				entradaLista.getAnimacionidAnimacion().entradaLista.remove(entradaLista);
			}
			
			if (entradaLista.getSerieGenericaidSerie() != null) {
				entradaLista.getSerieGenericaidSerie().entradaLista.remove(entradaLista);
			}
			
			return delete(entradaLista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param entradaLista
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(orm.EntradaLista entradaLista, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (entradaLista.getListaidLista() != null) {
				entradaLista.getListaidLista().entradaLista.remove(entradaLista);
			}
			
			if (entradaLista.getNovelaidNovela() != null) {
				entradaLista.getNovelaidNovela().entradaLista.remove(entradaLista);
			}
			
			if (entradaLista.getMangaidManga() != null) {
				entradaLista.getMangaidManga().entradaLista.remove(entradaLista);
			}
			
			if (entradaLista.getAnimacionidAnimacion() != null) {
				entradaLista.getAnimacionidAnimacion().entradaLista.remove(entradaLista);
			}
			
			if (entradaLista.getSerieGenericaidSerie() != null) {
				entradaLista.getSerieGenericaidSerie().entradaLista.remove(entradaLista);
			}
			
			try {
				session.delete(entradaLista);
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
	
    /**
     *
     * @param entradaLista
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(orm.EntradaLista entradaLista) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(entradaLista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param entradaLista
     * @return
     * @throws PersistentException
     */
    public static boolean evict(orm.EntradaLista entradaLista) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(entradaLista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
