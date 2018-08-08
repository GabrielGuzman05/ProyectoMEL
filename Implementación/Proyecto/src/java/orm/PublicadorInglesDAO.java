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
public class PublicadorInglesDAO {

    /**
     *
     * @param idPublicadorIngles
     * @return
     * @throws PersistentException
     */
    public static PublicadorIngles loadPublicadorInglesByORMID(int idPublicadorIngles) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadPublicadorInglesByORMID(session, idPublicadorIngles);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idPublicadorIngles
     * @return
     * @throws PersistentException
     */
    public static PublicadorIngles getPublicadorInglesByORMID(int idPublicadorIngles) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getPublicadorInglesByORMID(session, idPublicadorIngles);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idPublicadorIngles
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static PublicadorIngles loadPublicadorInglesByORMID(int idPublicadorIngles, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadPublicadorInglesByORMID(session, idPublicadorIngles, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idPublicadorIngles
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static PublicadorIngles getPublicadorInglesByORMID(int idPublicadorIngles, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getPublicadorInglesByORMID(session, idPublicadorIngles, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idPublicadorIngles
     * @return
     * @throws PersistentException
     */
    public static PublicadorIngles loadPublicadorInglesByORMID(PersistentSession session, int idPublicadorIngles) throws PersistentException {
		try {
			return (PublicadorIngles) session.load(orm.PublicadorIngles.class, new Integer(idPublicadorIngles));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idPublicadorIngles
     * @return
     * @throws PersistentException
     */
    public static PublicadorIngles getPublicadorInglesByORMID(PersistentSession session, int idPublicadorIngles) throws PersistentException {
		try {
			return (PublicadorIngles) session.get(orm.PublicadorIngles.class, new Integer(idPublicadorIngles));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idPublicadorIngles
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static PublicadorIngles loadPublicadorInglesByORMID(PersistentSession session, int idPublicadorIngles, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PublicadorIngles) session.load(orm.PublicadorIngles.class, new Integer(idPublicadorIngles), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idPublicadorIngles
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static PublicadorIngles getPublicadorInglesByORMID(PersistentSession session, int idPublicadorIngles, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PublicadorIngles) session.get(orm.PublicadorIngles.class, new Integer(idPublicadorIngles), lockMode);
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
    public static List queryPublicadorIngles(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryPublicadorIngles(session, condition, orderBy);
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
    public static List queryPublicadorIngles(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryPublicadorIngles(session, condition, orderBy, lockMode);
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
    public static PublicadorIngles[] listPublicadorInglesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listPublicadorInglesByQuery(session, condition, orderBy);
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
    public static PublicadorIngles[] listPublicadorInglesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listPublicadorInglesByQuery(session, condition, orderBy, lockMode);
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
    public static List queryPublicadorIngles(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.PublicadorIngles as PublicadorIngles");
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
    public static List queryPublicadorIngles(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.PublicadorIngles as PublicadorIngles");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PublicadorIngles", lockMode);
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
    public static PublicadorIngles[] listPublicadorInglesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPublicadorIngles(session, condition, orderBy);
			return (PublicadorIngles[]) list.toArray(new PublicadorIngles[list.size()]);
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
    public static PublicadorIngles[] listPublicadorInglesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPublicadorIngles(session, condition, orderBy, lockMode);
			return (PublicadorIngles[]) list.toArray(new PublicadorIngles[list.size()]);
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
    public static PublicadorIngles loadPublicadorInglesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadPublicadorInglesByQuery(session, condition, orderBy);
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
    public static PublicadorIngles loadPublicadorInglesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadPublicadorInglesByQuery(session, condition, orderBy, lockMode);
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
    public static PublicadorIngles loadPublicadorInglesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PublicadorIngles[] publicadorIngleses = listPublicadorInglesByQuery(session, condition, orderBy);
		if (publicadorIngleses != null && publicadorIngleses.length > 0)
			return publicadorIngleses[0];
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
    public static PublicadorIngles loadPublicadorInglesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PublicadorIngles[] publicadorIngleses = listPublicadorInglesByQuery(session, condition, orderBy, lockMode);
		if (publicadorIngleses != null && publicadorIngleses.length > 0)
			return publicadorIngleses[0];
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
    public static java.util.Iterator iteratePublicadorInglesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iteratePublicadorInglesByQuery(session, condition, orderBy);
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
    public static java.util.Iterator iteratePublicadorInglesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iteratePublicadorInglesByQuery(session, condition, orderBy, lockMode);
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
    public static java.util.Iterator iteratePublicadorInglesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.PublicadorIngles as PublicadorIngles");
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
    public static java.util.Iterator iteratePublicadorInglesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.PublicadorIngles as PublicadorIngles");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PublicadorIngles", lockMode);
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
    public static PublicadorIngles createPublicadorIngles() {
		return new orm.PublicadorIngles();
	}
	
    /**
     *
     * @param publicadorIngles
     * @return
     * @throws PersistentException
     */
    public static boolean save(orm.PublicadorIngles publicadorIngles) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(publicadorIngles);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param publicadorIngles
     * @return
     * @throws PersistentException
     */
    public static boolean delete(orm.PublicadorIngles publicadorIngles) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(publicadorIngles);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param publicadorIngles
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(orm.PublicadorIngles publicadorIngles)throws PersistentException {
		try {
			orm.Novela[] lNovelas = publicadorIngles.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setPublicadorInglesidPublicadorIngles(null);
			}
			return delete(publicadorIngles);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param publicadorIngles
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(orm.PublicadorIngles publicadorIngles, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Novela[] lNovelas = publicadorIngles.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setPublicadorInglesidPublicadorIngles(null);
			}
			try {
				session.delete(publicadorIngles);
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
     * @param publicadorIngles
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(orm.PublicadorIngles publicadorIngles) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(publicadorIngles);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param publicadorIngles
     * @return
     * @throws PersistentException
     */
    public static boolean evict(orm.PublicadorIngles publicadorIngles) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(publicadorIngles);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
