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

public class LenguajeOriginalDAO {
	public static LenguajeOriginal loadLenguajeOriginalByORMID(int idLenguaje) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadLenguajeOriginalByORMID(session, idLenguaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal getLenguajeOriginalByORMID(int idLenguaje) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getLenguajeOriginalByORMID(session, idLenguaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal loadLenguajeOriginalByORMID(int idLenguaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadLenguajeOriginalByORMID(session, idLenguaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal getLenguajeOriginalByORMID(int idLenguaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getLenguajeOriginalByORMID(session, idLenguaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal loadLenguajeOriginalByORMID(PersistentSession session, int idLenguaje) throws PersistentException {
		try {
			return (LenguajeOriginal) session.load(ORM.LenguajeOriginal.class, new Integer(idLenguaje));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal getLenguajeOriginalByORMID(PersistentSession session, int idLenguaje) throws PersistentException {
		try {
			return (LenguajeOriginal) session.get(ORM.LenguajeOriginal.class, new Integer(idLenguaje));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal loadLenguajeOriginalByORMID(PersistentSession session, int idLenguaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (LenguajeOriginal) session.load(ORM.LenguajeOriginal.class, new Integer(idLenguaje), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal getLenguajeOriginalByORMID(PersistentSession session, int idLenguaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (LenguajeOriginal) session.get(ORM.LenguajeOriginal.class, new Integer(idLenguaje), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLenguajeOriginal(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryLenguajeOriginal(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLenguajeOriginal(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryLenguajeOriginal(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal[] listLenguajeOriginalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listLenguajeOriginalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal[] listLenguajeOriginalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listLenguajeOriginalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLenguajeOriginal(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.LenguajeOriginal as LenguajeOriginal");
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
	
	public static List queryLenguajeOriginal(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.LenguajeOriginal as LenguajeOriginal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("LenguajeOriginal", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal[] listLenguajeOriginalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLenguajeOriginal(session, condition, orderBy);
			return (LenguajeOriginal[]) list.toArray(new LenguajeOriginal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal[] listLenguajeOriginalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLenguajeOriginal(session, condition, orderBy, lockMode);
			return (LenguajeOriginal[]) list.toArray(new LenguajeOriginal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal loadLenguajeOriginalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadLenguajeOriginalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal loadLenguajeOriginalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadLenguajeOriginalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal loadLenguajeOriginalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		LenguajeOriginal[] lenguajeOriginals = listLenguajeOriginalByQuery(session, condition, orderBy);
		if (lenguajeOriginals != null && lenguajeOriginals.length > 0)
			return lenguajeOriginals[0];
		else
			return null;
	}
	
	public static LenguajeOriginal loadLenguajeOriginalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		LenguajeOriginal[] lenguajeOriginals = listLenguajeOriginalByQuery(session, condition, orderBy, lockMode);
		if (lenguajeOriginals != null && lenguajeOriginals.length > 0)
			return lenguajeOriginals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLenguajeOriginalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateLenguajeOriginalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLenguajeOriginalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateLenguajeOriginalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLenguajeOriginalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.LenguajeOriginal as LenguajeOriginal");
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
	
	public static java.util.Iterator iterateLenguajeOriginalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.LenguajeOriginal as LenguajeOriginal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("LenguajeOriginal", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal createLenguajeOriginal() {
		return new ORM.LenguajeOriginal();
	}
	
	public static boolean save(ORM.LenguajeOriginal lenguajeOriginal) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(lenguajeOriginal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ORM.LenguajeOriginal lenguajeOriginal) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(lenguajeOriginal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.LenguajeOriginal lenguajeOriginal)throws PersistentException {
		try {
			ORM.Novela[] lNovelas = lenguajeOriginal.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setLenguajeOriginalidLenguaje(null);
			}
			return delete(lenguajeOriginal);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.LenguajeOriginal lenguajeOriginal, org.orm.PersistentSession session)throws PersistentException {
		try {
			ORM.Novela[] lNovelas = lenguajeOriginal.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setLenguajeOriginalidLenguaje(null);
			}
			try {
				session.delete(lenguajeOriginal);
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
	
	public static boolean refresh(ORM.LenguajeOriginal lenguajeOriginal) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(lenguajeOriginal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ORM.LenguajeOriginal lenguajeOriginal) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(lenguajeOriginal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LenguajeOriginal loadLenguajeOriginalByCriteria(LenguajeOriginalCriteria lenguajeOriginalCriteria) {
		LenguajeOriginal[] lenguajeOriginals = listLenguajeOriginalByCriteria(lenguajeOriginalCriteria);
		if(lenguajeOriginals == null || lenguajeOriginals.length == 0) {
			return null;
		}
		return lenguajeOriginals[0];
	}
	
	public static LenguajeOriginal[] listLenguajeOriginalByCriteria(LenguajeOriginalCriteria lenguajeOriginalCriteria) {
		return lenguajeOriginalCriteria.listLenguajeOriginal();
	}
}
