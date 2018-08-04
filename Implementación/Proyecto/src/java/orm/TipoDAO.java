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

public class TipoDAO {
	public static Tipo loadTipoByORMID(int idTipo) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTipoByORMID(session, idTipo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo getTipoByORMID(int idTipo) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getTipoByORMID(session, idTipo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo loadTipoByORMID(int idTipo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTipoByORMID(session, idTipo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo getTipoByORMID(int idTipo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getTipoByORMID(session, idTipo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo loadTipoByORMID(PersistentSession session, int idTipo) throws PersistentException {
		try {
			return (Tipo) session.load(ORM.Tipo.class, new Integer(idTipo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo getTipoByORMID(PersistentSession session, int idTipo) throws PersistentException {
		try {
			return (Tipo) session.get(ORM.Tipo.class, new Integer(idTipo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo loadTipoByORMID(PersistentSession session, int idTipo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipo) session.load(ORM.Tipo.class, new Integer(idTipo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo getTipoByORMID(PersistentSession session, int idTipo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipo) session.get(ORM.Tipo.class, new Integer(idTipo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryTipo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryTipo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo[] listTipoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listTipoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo[] listTipoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listTipoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo as Tipo");
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
	
	public static List queryTipo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo as Tipo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo[] listTipoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipo(session, condition, orderBy);
			return (Tipo[]) list.toArray(new Tipo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo[] listTipoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipo(session, condition, orderBy, lockMode);
			return (Tipo[]) list.toArray(new Tipo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo loadTipoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTipoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo loadTipoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTipoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo loadTipoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tipo[] tipos = listTipoByQuery(session, condition, orderBy);
		if (tipos != null && tipos.length > 0)
			return tipos[0];
		else
			return null;
	}
	
	public static Tipo loadTipoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tipo[] tipos = listTipoByQuery(session, condition, orderBy, lockMode);
		if (tipos != null && tipos.length > 0)
			return tipos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateTipoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateTipoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo as Tipo");
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
	
	public static java.util.Iterator iterateTipoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipo as Tipo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo createTipo() {
		return new ORM.Tipo();
	}
	
	public static boolean save(ORM.Tipo tipo) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(tipo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ORM.Tipo tipo) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(tipo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.Tipo tipo)throws PersistentException {
		try {
			ORM.Novela[] lNovelas = tipo.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setTipoidTipo(null);
			}
			return delete(tipo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.Tipo tipo, org.orm.PersistentSession session)throws PersistentException {
		try {
			ORM.Novela[] lNovelas = tipo.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setTipoidTipo(null);
			}
			try {
				session.delete(tipo);
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
	
	public static boolean refresh(ORM.Tipo tipo) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(tipo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ORM.Tipo tipo) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(tipo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipo loadTipoByCriteria(TipoCriteria tipoCriteria) {
		Tipo[] tipos = listTipoByCriteria(tipoCriteria);
		if(tipos == null || tipos.length == 0) {
			return null;
		}
		return tipos[0];
	}
	
	public static Tipo[] listTipoByCriteria(TipoCriteria tipoCriteria) {
		return tipoCriteria.listTipo();
	}
}
