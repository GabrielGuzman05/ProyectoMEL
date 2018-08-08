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
public class TemporadaDAO {

    /**
     *
     * @param idTemporada
     * @return
     * @throws PersistentException
     */
    public static Temporada loadTemporadaByORMID(int idTemporada) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTemporadaByORMID(session, idTemporada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idTemporada
     * @return
     * @throws PersistentException
     */
    public static Temporada getTemporadaByORMID(int idTemporada) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getTemporadaByORMID(session, idTemporada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idTemporada
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Temporada loadTemporadaByORMID(int idTemporada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTemporadaByORMID(session, idTemporada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idTemporada
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Temporada getTemporadaByORMID(int idTemporada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getTemporadaByORMID(session, idTemporada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idTemporada
     * @return
     * @throws PersistentException
     */
    public static Temporada loadTemporadaByORMID(PersistentSession session, int idTemporada) throws PersistentException {
		try {
			return (Temporada) session.load(orm.Temporada.class, new Integer(idTemporada));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idTemporada
     * @return
     * @throws PersistentException
     */
    public static Temporada getTemporadaByORMID(PersistentSession session, int idTemporada) throws PersistentException {
		try {
			return (Temporada) session.get(orm.Temporada.class, new Integer(idTemporada));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idTemporada
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Temporada loadTemporadaByORMID(PersistentSession session, int idTemporada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Temporada) session.load(orm.Temporada.class, new Integer(idTemporada), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idTemporada
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Temporada getTemporadaByORMID(PersistentSession session, int idTemporada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Temporada) session.get(orm.Temporada.class, new Integer(idTemporada), lockMode);
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
    public static List queryTemporada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryTemporada(session, condition, orderBy);
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
    public static List queryTemporada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryTemporada(session, condition, orderBy, lockMode);
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
    public static Temporada[] listTemporadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listTemporadaByQuery(session, condition, orderBy);
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
    public static Temporada[] listTemporadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listTemporadaByQuery(session, condition, orderBy, lockMode);
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
    public static List queryTemporada(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Temporada as Temporada");
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
    public static List queryTemporada(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Temporada as Temporada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Temporada", lockMode);
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
    public static Temporada[] listTemporadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTemporada(session, condition, orderBy);
			return (Temporada[]) list.toArray(new Temporada[list.size()]);
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
    public static Temporada[] listTemporadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTemporada(session, condition, orderBy, lockMode);
			return (Temporada[]) list.toArray(new Temporada[list.size()]);
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
    public static Temporada loadTemporadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTemporadaByQuery(session, condition, orderBy);
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
    public static Temporada loadTemporadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTemporadaByQuery(session, condition, orderBy, lockMode);
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
    public static Temporada loadTemporadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Temporada[] temporadas = listTemporadaByQuery(session, condition, orderBy);
		if (temporadas != null && temporadas.length > 0)
			return temporadas[0];
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
    public static Temporada loadTemporadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Temporada[] temporadas = listTemporadaByQuery(session, condition, orderBy, lockMode);
		if (temporadas != null && temporadas.length > 0)
			return temporadas[0];
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
    public static java.util.Iterator iterateTemporadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateTemporadaByQuery(session, condition, orderBy);
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
    public static java.util.Iterator iterateTemporadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateTemporadaByQuery(session, condition, orderBy, lockMode);
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
    public static java.util.Iterator iterateTemporadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Temporada as Temporada");
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
    public static java.util.Iterator iterateTemporadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Temporada as Temporada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Temporada", lockMode);
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
    public static Temporada createTemporada() {
		return new orm.Temporada();
	}
	
    /**
     *
     * @param temporada
     * @return
     * @throws PersistentException
     */
    public static boolean save(orm.Temporada temporada) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(temporada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param temporada
     * @return
     * @throws PersistentException
     */
    public static boolean delete(orm.Temporada temporada) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(temporada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param temporada
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(orm.Temporada temporada)throws PersistentException {
		try {
			orm.Animacion[] lAnimacions = temporada.animacion.toArray();
			for(int i = 0; i < lAnimacions.length; i++) {
				lAnimacions[i].setTemporadaidTemporada(null);
			}
			return delete(temporada);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param temporada
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(orm.Temporada temporada, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Animacion[] lAnimacions = temporada.animacion.toArray();
			for(int i = 0; i < lAnimacions.length; i++) {
				lAnimacions[i].setTemporadaidTemporada(null);
			}
			try {
				session.delete(temporada);
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
     * @param temporada
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(orm.Temporada temporada) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(temporada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param temporada
     * @return
     * @throws PersistentException
     */
    public static boolean evict(orm.Temporada temporada) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(temporada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
