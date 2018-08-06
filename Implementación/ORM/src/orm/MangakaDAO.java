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

public class MangakaDAO {
	public static Mangaka loadMangakaByORMID(int idMangaka) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadMangakaByORMID(session, idMangaka);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka getMangakaByORMID(int idMangaka) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getMangakaByORMID(session, idMangaka);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka loadMangakaByORMID(int idMangaka, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadMangakaByORMID(session, idMangaka, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka getMangakaByORMID(int idMangaka, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getMangakaByORMID(session, idMangaka, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka loadMangakaByORMID(PersistentSession session, int idMangaka) throws PersistentException {
		try {
			return (Mangaka) session.load(orm.Mangaka.class, new Integer(idMangaka));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka getMangakaByORMID(PersistentSession session, int idMangaka) throws PersistentException {
		try {
			return (Mangaka) session.get(orm.Mangaka.class, new Integer(idMangaka));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka loadMangakaByORMID(PersistentSession session, int idMangaka, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mangaka) session.load(orm.Mangaka.class, new Integer(idMangaka), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka getMangakaByORMID(PersistentSession session, int idMangaka, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mangaka) session.get(orm.Mangaka.class, new Integer(idMangaka), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMangaka(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryMangaka(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMangaka(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryMangaka(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka[] listMangakaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listMangakaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka[] listMangakaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listMangakaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMangaka(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Mangaka as Mangaka");
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
	
	public static List queryMangaka(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Mangaka as Mangaka");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mangaka", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka[] listMangakaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMangaka(session, condition, orderBy);
			return (Mangaka[]) list.toArray(new Mangaka[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka[] listMangakaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMangaka(session, condition, orderBy, lockMode);
			return (Mangaka[]) list.toArray(new Mangaka[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka loadMangakaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadMangakaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka loadMangakaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadMangakaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka loadMangakaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Mangaka[] mangakas = listMangakaByQuery(session, condition, orderBy);
		if (mangakas != null && mangakas.length > 0)
			return mangakas[0];
		else
			return null;
	}
	
	public static Mangaka loadMangakaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Mangaka[] mangakas = listMangakaByQuery(session, condition, orderBy, lockMode);
		if (mangakas != null && mangakas.length > 0)
			return mangakas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMangakaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateMangakaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMangakaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateMangakaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMangakaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Mangaka as Mangaka");
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
	
	public static java.util.Iterator iterateMangakaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Mangaka as Mangaka");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mangaka", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mangaka createMangaka() {
		return new orm.Mangaka();
	}
	
	public static boolean save(orm.Mangaka mangaka) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(mangaka);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Mangaka mangaka) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(mangaka);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Mangaka mangaka)throws PersistentException {
		try {
			orm.Manga[] lMangaidMangaArtistas = mangaka.mangaidMangaArtista.toArray();
			for(int i = 0; i < lMangaidMangaArtistas.length; i++) {
				lMangaidMangaArtistas[i].mangakaidArtista.remove(mangaka);
			}
			orm.Manga[] lMangaidMangaAutors = mangaka.mangaidMangaAutor.toArray();
			for(int i = 0; i < lMangaidMangaAutors.length; i++) {
				lMangaidMangaAutors[i].mangakaidAutor.remove(mangaka);
			}
			return delete(mangaka);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Mangaka mangaka, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Manga[] lMangaidMangaArtistas = mangaka.mangaidMangaArtista.toArray();
			for(int i = 0; i < lMangaidMangaArtistas.length; i++) {
				lMangaidMangaArtistas[i].mangakaidArtista.remove(mangaka);
			}
			orm.Manga[] lMangaidMangaAutors = mangaka.mangaidMangaAutor.toArray();
			for(int i = 0; i < lMangaidMangaAutors.length; i++) {
				lMangaidMangaAutors[i].mangakaidAutor.remove(mangaka);
			}
			try {
				session.delete(mangaka);
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
	
	public static boolean refresh(orm.Mangaka mangaka) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(mangaka);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Mangaka mangaka) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(mangaka);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
