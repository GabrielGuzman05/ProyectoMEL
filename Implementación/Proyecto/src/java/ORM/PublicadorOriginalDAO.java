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

public class PublicadorOriginalDAO {
	public static PublicadorOriginal loadPublicadorOriginalByORMID(int idPublicadorOriginal) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadPublicadorOriginalByORMID(session, idPublicadorOriginal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal getPublicadorOriginalByORMID(int idPublicadorOriginal) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getPublicadorOriginalByORMID(session, idPublicadorOriginal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal loadPublicadorOriginalByORMID(int idPublicadorOriginal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadPublicadorOriginalByORMID(session, idPublicadorOriginal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal getPublicadorOriginalByORMID(int idPublicadorOriginal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getPublicadorOriginalByORMID(session, idPublicadorOriginal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal loadPublicadorOriginalByORMID(PersistentSession session, int idPublicadorOriginal) throws PersistentException {
		try {
			return (PublicadorOriginal) session.load(orm.PublicadorOriginal.class, new Integer(idPublicadorOriginal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal getPublicadorOriginalByORMID(PersistentSession session, int idPublicadorOriginal) throws PersistentException {
		try {
			return (PublicadorOriginal) session.get(orm.PublicadorOriginal.class, new Integer(idPublicadorOriginal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal loadPublicadorOriginalByORMID(PersistentSession session, int idPublicadorOriginal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PublicadorOriginal) session.load(orm.PublicadorOriginal.class, new Integer(idPublicadorOriginal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal getPublicadorOriginalByORMID(PersistentSession session, int idPublicadorOriginal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PublicadorOriginal) session.get(orm.PublicadorOriginal.class, new Integer(idPublicadorOriginal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicadorOriginal(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryPublicadorOriginal(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicadorOriginal(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryPublicadorOriginal(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal[] listPublicadorOriginalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listPublicadorOriginalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal[] listPublicadorOriginalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listPublicadorOriginalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicadorOriginal(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.PublicadorOriginal as PublicadorOriginal");
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
	
	public static List queryPublicadorOriginal(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.PublicadorOriginal as PublicadorOriginal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PublicadorOriginal", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal[] listPublicadorOriginalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPublicadorOriginal(session, condition, orderBy);
			return (PublicadorOriginal[]) list.toArray(new PublicadorOriginal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal[] listPublicadorOriginalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPublicadorOriginal(session, condition, orderBy, lockMode);
			return (PublicadorOriginal[]) list.toArray(new PublicadorOriginal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal loadPublicadorOriginalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadPublicadorOriginalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal loadPublicadorOriginalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadPublicadorOriginalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal loadPublicadorOriginalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PublicadorOriginal[] publicadorOriginals = listPublicadorOriginalByQuery(session, condition, orderBy);
		if (publicadorOriginals != null && publicadorOriginals.length > 0)
			return publicadorOriginals[0];
		else
			return null;
	}
	
	public static PublicadorOriginal loadPublicadorOriginalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PublicadorOriginal[] publicadorOriginals = listPublicadorOriginalByQuery(session, condition, orderBy, lockMode);
		if (publicadorOriginals != null && publicadorOriginals.length > 0)
			return publicadorOriginals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePublicadorOriginalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iteratePublicadorOriginalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicadorOriginalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iteratePublicadorOriginalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicadorOriginalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.PublicadorOriginal as PublicadorOriginal");
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
	
	public static java.util.Iterator iteratePublicadorOriginalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.PublicadorOriginal as PublicadorOriginal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PublicadorOriginal", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PublicadorOriginal createPublicadorOriginal() {
		return new orm.PublicadorOriginal();
	}
	
	public static boolean save(orm.PublicadorOriginal publicadorOriginal) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(publicadorOriginal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.PublicadorOriginal publicadorOriginal) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(publicadorOriginal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.PublicadorOriginal publicadorOriginal)throws PersistentException {
		try {
			orm.Novela[] lNovelas = publicadorOriginal.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setPublicadorOriginalidPublicadorOriginal(null);
			}
			return delete(publicadorOriginal);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.PublicadorOriginal publicadorOriginal, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Novela[] lNovelas = publicadorOriginal.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setPublicadorOriginalidPublicadorOriginal(null);
			}
			try {
				session.delete(publicadorOriginal);
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
	
	public static boolean refresh(orm.PublicadorOriginal publicadorOriginal) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(publicadorOriginal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.PublicadorOriginal publicadorOriginal) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(publicadorOriginal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
