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

public class TipoMangaDAO {
	public static TipoManga loadTipoMangaByORMID(int idTipoManga) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTipoMangaByORMID(session, idTipoManga);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga getTipoMangaByORMID(int idTipoManga) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getTipoMangaByORMID(session, idTipoManga);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga loadTipoMangaByORMID(int idTipoManga, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTipoMangaByORMID(session, idTipoManga, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga getTipoMangaByORMID(int idTipoManga, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getTipoMangaByORMID(session, idTipoManga, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga loadTipoMangaByORMID(PersistentSession session, int idTipoManga) throws PersistentException {
		try {
			return (TipoManga) session.load(orm.TipoManga.class, new Integer(idTipoManga));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga getTipoMangaByORMID(PersistentSession session, int idTipoManga) throws PersistentException {
		try {
			return (TipoManga) session.get(orm.TipoManga.class, new Integer(idTipoManga));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga loadTipoMangaByORMID(PersistentSession session, int idTipoManga, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoManga) session.load(orm.TipoManga.class, new Integer(idTipoManga), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga getTipoMangaByORMID(PersistentSession session, int idTipoManga, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoManga) session.get(orm.TipoManga.class, new Integer(idTipoManga), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoManga(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryTipoManga(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoManga(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryTipoManga(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga[] listTipoMangaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listTipoMangaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga[] listTipoMangaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listTipoMangaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoManga(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.TipoManga as TipoManga");
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
	
	public static List queryTipoManga(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.TipoManga as TipoManga");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoManga", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga[] listTipoMangaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipoManga(session, condition, orderBy);
			return (TipoManga[]) list.toArray(new TipoManga[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga[] listTipoMangaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipoManga(session, condition, orderBy, lockMode);
			return (TipoManga[]) list.toArray(new TipoManga[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga loadTipoMangaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTipoMangaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga loadTipoMangaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTipoMangaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga loadTipoMangaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TipoManga[] tipoMangas = listTipoMangaByQuery(session, condition, orderBy);
		if (tipoMangas != null && tipoMangas.length > 0)
			return tipoMangas[0];
		else
			return null;
	}
	
	public static TipoManga loadTipoMangaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TipoManga[] tipoMangas = listTipoMangaByQuery(session, condition, orderBy, lockMode);
		if (tipoMangas != null && tipoMangas.length > 0)
			return tipoMangas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoMangaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateTipoMangaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoMangaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateTipoMangaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoMangaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.TipoManga as TipoManga");
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
	
	public static java.util.Iterator iterateTipoMangaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.TipoManga as TipoManga");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoManga", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga createTipoManga() {
		return new orm.TipoManga();
	}
	
	public static boolean save(orm.TipoManga tipoManga) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(tipoManga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.TipoManga tipoManga) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(tipoManga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.TipoManga tipoManga)throws PersistentException {
		try {
			orm.Manga[] lMangas = tipoManga.manga.toArray();
			for(int i = 0; i < lMangas.length; i++) {
				lMangas[i].setTipoMangaidTipoManga(null);
			}
			return delete(tipoManga);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.TipoManga tipoManga, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Manga[] lMangas = tipoManga.manga.toArray();
			for(int i = 0; i < lMangas.length; i++) {
				lMangas[i].setTipoMangaidTipoManga(null);
			}
			try {
				session.delete(tipoManga);
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
	
	public static boolean refresh(orm.TipoManga tipoManga) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(tipoManga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.TipoManga tipoManga) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(tipoManga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoManga loadTipoMangaByCriteria(TipoMangaCriteria tipoMangaCriteria) {
		TipoManga[] tipoMangas = listTipoMangaByCriteria(tipoMangaCriteria);
		if(tipoMangas == null || tipoMangas.length == 0) {
			return null;
		}
		return tipoMangas[0];
	}
	
	public static TipoManga[] listTipoMangaByCriteria(TipoMangaCriteria tipoMangaCriteria) {
		return tipoMangaCriteria.listTipoManga();
	}
}
