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

public class AutorDAO {
	public static Autor loadAutorByORMID(int idAutor) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadAutorByORMID(session, idAutor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor getAutorByORMID(int idAutor) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getAutorByORMID(session, idAutor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor loadAutorByORMID(int idAutor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadAutorByORMID(session, idAutor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor getAutorByORMID(int idAutor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getAutorByORMID(session, idAutor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor loadAutorByORMID(PersistentSession session, int idAutor) throws PersistentException {
		try {
			return (Autor) session.load(ORM.Autor.class, new Integer(idAutor));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor getAutorByORMID(PersistentSession session, int idAutor) throws PersistentException {
		try {
			return (Autor) session.get(ORM.Autor.class, new Integer(idAutor));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor loadAutorByORMID(PersistentSession session, int idAutor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autor) session.load(ORM.Autor.class, new Integer(idAutor), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor getAutorByORMID(PersistentSession session, int idAutor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autor) session.get(ORM.Autor.class, new Integer(idAutor), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryAutor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryAutor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor[] listAutorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listAutorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor[] listAutorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listAutorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autor as Autor");
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
	
	public static List queryAutor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autor as Autor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor[] listAutorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAutor(session, condition, orderBy);
			return (Autor[]) list.toArray(new Autor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor[] listAutorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAutor(session, condition, orderBy, lockMode);
			return (Autor[]) list.toArray(new Autor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor loadAutorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadAutorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor loadAutorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadAutorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor loadAutorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Autor[] autors = listAutorByQuery(session, condition, orderBy);
		if (autors != null && autors.length > 0)
			return autors[0];
		else
			return null;
	}
	
	public static Autor loadAutorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Autor[] autors = listAutorByQuery(session, condition, orderBy, lockMode);
		if (autors != null && autors.length > 0)
			return autors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAutorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateAutorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateAutorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autor as Autor");
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
	
	public static java.util.Iterator iterateAutorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autor as Autor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor createAutor() {
		return new ORM.Autor();
	}
	
	public static boolean save(ORM.Autor autor) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(autor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ORM.Autor autor) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(autor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.Autor autor)throws PersistentException {
		try {
			ORM.Manga[] lMangaidMangas = autor.mangaidManga.toArray();
			for(int i = 0; i < lMangaidMangas.length; i++) {
				lMangaidMangas[i].autoridAutor.remove(autor);
			}
			ORM.Novela[] lNovelas = autor.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setAutoridAutor(null);
			}
			return delete(autor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.Autor autor, org.orm.PersistentSession session)throws PersistentException {
		try {
			ORM.Manga[] lMangaidMangas = autor.mangaidManga.toArray();
			for(int i = 0; i < lMangaidMangas.length; i++) {
				lMangaidMangas[i].autoridAutor.remove(autor);
			}
			ORM.Novela[] lNovelas = autor.novela.toArray();
			for(int i = 0; i < lNovelas.length; i++) {
				lNovelas[i].setAutoridAutor(null);
			}
			try {
				session.delete(autor);
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
	
	public static boolean refresh(ORM.Autor autor) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(autor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ORM.Autor autor) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(autor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autor loadAutorByCriteria(AutorCriteria autorCriteria) {
		Autor[] autors = listAutorByCriteria(autorCriteria);
		if(autors == null || autors.length == 0) {
			return null;
		}
		return autors[0];
	}
	
	public static Autor[] listAutorByCriteria(AutorCriteria autorCriteria) {
		return autorCriteria.listAutor();
	}
}
