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

public class EstudioDAO {
	public static Estudio loadEstudioByORMID(int idEstudio) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadEstudioByORMID(session, idEstudio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio getEstudioByORMID(int idEstudio) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getEstudioByORMID(session, idEstudio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio loadEstudioByORMID(int idEstudio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadEstudioByORMID(session, idEstudio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio getEstudioByORMID(int idEstudio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getEstudioByORMID(session, idEstudio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio loadEstudioByORMID(PersistentSession session, int idEstudio) throws PersistentException {
		try {
			return (Estudio) session.load(orm.Estudio.class, new Integer(idEstudio));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio getEstudioByORMID(PersistentSession session, int idEstudio) throws PersistentException {
		try {
			return (Estudio) session.get(orm.Estudio.class, new Integer(idEstudio));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio loadEstudioByORMID(PersistentSession session, int idEstudio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estudio) session.load(orm.Estudio.class, new Integer(idEstudio), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio getEstudioByORMID(PersistentSession session, int idEstudio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estudio) session.get(orm.Estudio.class, new Integer(idEstudio), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryEstudio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryEstudio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio[] listEstudioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listEstudioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio[] listEstudioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listEstudioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudio as Estudio");
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
	
	public static List queryEstudio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudio as Estudio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estudio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio[] listEstudioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstudio(session, condition, orderBy);
			return (Estudio[]) list.toArray(new Estudio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio[] listEstudioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstudio(session, condition, orderBy, lockMode);
			return (Estudio[]) list.toArray(new Estudio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio loadEstudioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadEstudioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio loadEstudioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadEstudioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio loadEstudioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estudio[] estudios = listEstudioByQuery(session, condition, orderBy);
		if (estudios != null && estudios.length > 0)
			return estudios[0];
		else
			return null;
	}
	
	public static Estudio loadEstudioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estudio[] estudios = listEstudioByQuery(session, condition, orderBy, lockMode);
		if (estudios != null && estudios.length > 0)
			return estudios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstudioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateEstudioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateEstudioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudio as Estudio");
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
	
	public static java.util.Iterator iterateEstudioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estudio as Estudio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estudio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudio createEstudio() {
		return new orm.Estudio();
	}
	
	public static boolean save(orm.Estudio estudio) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(estudio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Estudio estudio) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(estudio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estudio estudio)throws PersistentException {
		try {
			orm.Animacion[] lAnimacionidAnimacions = estudio.animacionidAnimacion.toArray();
			for(int i = 0; i < lAnimacionidAnimacions.length; i++) {
				lAnimacionidAnimacions[i].estudioidEstudio.remove(estudio);
			}
			return delete(estudio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estudio estudio, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Animacion[] lAnimacionidAnimacions = estudio.animacionidAnimacion.toArray();
			for(int i = 0; i < lAnimacionidAnimacions.length; i++) {
				lAnimacionidAnimacions[i].estudioidEstudio.remove(estudio);
			}
			try {
				session.delete(estudio);
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
	
	public static boolean refresh(orm.Estudio estudio) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(estudio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Estudio estudio) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(estudio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
