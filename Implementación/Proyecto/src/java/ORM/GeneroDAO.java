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

public class GeneroDAO {
	public static Genero loadGeneroByORMID(int idGenero) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadGeneroByORMID(session, idGenero);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero getGeneroByORMID(int idGenero) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getGeneroByORMID(session, idGenero);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero loadGeneroByORMID(int idGenero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadGeneroByORMID(session, idGenero, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero getGeneroByORMID(int idGenero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getGeneroByORMID(session, idGenero, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero loadGeneroByORMID(PersistentSession session, int idGenero) throws PersistentException {
		try {
			return (Genero) session.load(ORM.Genero.class, new Integer(idGenero));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero getGeneroByORMID(PersistentSession session, int idGenero) throws PersistentException {
		try {
			return (Genero) session.get(ORM.Genero.class, new Integer(idGenero));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero loadGeneroByORMID(PersistentSession session, int idGenero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Genero) session.load(ORM.Genero.class, new Integer(idGenero), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero getGeneroByORMID(PersistentSession session, int idGenero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Genero) session.get(ORM.Genero.class, new Integer(idGenero), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGenero(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryGenero(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGenero(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryGenero(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero[] listGeneroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listGeneroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero[] listGeneroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listGeneroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGenero(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Genero as Genero");
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
	
	public static List queryGenero(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Genero as Genero");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Genero", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero[] listGeneroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGenero(session, condition, orderBy);
			return (Genero[]) list.toArray(new Genero[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero[] listGeneroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGenero(session, condition, orderBy, lockMode);
			return (Genero[]) list.toArray(new Genero[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero loadGeneroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadGeneroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero loadGeneroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadGeneroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero loadGeneroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Genero[] generos = listGeneroByQuery(session, condition, orderBy);
		if (generos != null && generos.length > 0)
			return generos[0];
		else
			return null;
	}
	
	public static Genero loadGeneroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Genero[] generos = listGeneroByQuery(session, condition, orderBy, lockMode);
		if (generos != null && generos.length > 0)
			return generos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGeneroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateGeneroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGeneroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateGeneroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGeneroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Genero as Genero");
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
	
	public static java.util.Iterator iterateGeneroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Genero as Genero");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Genero", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero createGenero() {
		return new ORM.Genero();
	}
	
	public static boolean save(ORM.Genero genero) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(genero);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ORM.Genero genero) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(genero);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.Genero genero)throws PersistentException {
		try {
			ORM.Novela[] lNovelaidNovelas = genero.novelaidNovela.toArray();
			for(int i = 0; i < lNovelaidNovelas.length; i++) {
				lNovelaidNovelas[i].generoidGenero.remove(genero);
			}
			ORM.Animacion[] lAnimacionidAnimacions = genero.animacionidAnimacion.toArray();
			for(int i = 0; i < lAnimacionidAnimacions.length; i++) {
				lAnimacionidAnimacions[i].generoidGenero.remove(genero);
			}
			ORM.Manga[] lMangaidMangas = genero.mangaidManga.toArray();
			for(int i = 0; i < lMangaidMangas.length; i++) {
				lMangaidMangas[i].generoidGenero.remove(genero);
			}
			ORM.SerieGenerica[] lSerieGenericaidSeries = genero.serieGenericaidSerie.toArray();
			for(int i = 0; i < lSerieGenericaidSeries.length; i++) {
				lSerieGenericaidSeries[i].generoidGenero.remove(genero);
			}
			return delete(genero);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.Genero genero, org.orm.PersistentSession session)throws PersistentException {
		try {
			ORM.Novela[] lNovelaidNovelas = genero.novelaidNovela.toArray();
			for(int i = 0; i < lNovelaidNovelas.length; i++) {
				lNovelaidNovelas[i].generoidGenero.remove(genero);
			}
			ORM.Animacion[] lAnimacionidAnimacions = genero.animacionidAnimacion.toArray();
			for(int i = 0; i < lAnimacionidAnimacions.length; i++) {
				lAnimacionidAnimacions[i].generoidGenero.remove(genero);
			}
			ORM.Manga[] lMangaidMangas = genero.mangaidManga.toArray();
			for(int i = 0; i < lMangaidMangas.length; i++) {
				lMangaidMangas[i].generoidGenero.remove(genero);
			}
			ORM.SerieGenerica[] lSerieGenericaidSeries = genero.serieGenericaidSerie.toArray();
			for(int i = 0; i < lSerieGenericaidSeries.length; i++) {
				lSerieGenericaidSeries[i].generoidGenero.remove(genero);
			}
			try {
				session.delete(genero);
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
	
	public static boolean refresh(ORM.Genero genero) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(genero);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ORM.Genero genero) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(genero);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Genero loadGeneroByCriteria(GeneroCriteria generoCriteria) {
		Genero[] generos = listGeneroByCriteria(generoCriteria);
		if(generos == null || generos.length == 0) {
			return null;
		}
		return generos[0];
	}
	
	public static Genero[] listGeneroByCriteria(GeneroCriteria generoCriteria) {
		return generoCriteria.listGenero();
	}
}
