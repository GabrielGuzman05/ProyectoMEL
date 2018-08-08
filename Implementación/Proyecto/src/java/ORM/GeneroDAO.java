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
public class GeneroDAO {

    /**
     *
     * @param idGenero
     * @return
     * @throws PersistentException
     */
    public static Genero loadGeneroByORMID(int idGenero) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadGeneroByORMID(session, idGenero);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idGenero
     * @return
     * @throws PersistentException
     */
    public static Genero getGeneroByORMID(int idGenero) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getGeneroByORMID(session, idGenero);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idGenero
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Genero loadGeneroByORMID(int idGenero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadGeneroByORMID(session, idGenero, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param idGenero
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Genero getGeneroByORMID(int idGenero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getGeneroByORMID(session, idGenero, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idGenero
     * @return
     * @throws PersistentException
     */
    public static Genero loadGeneroByORMID(PersistentSession session, int idGenero) throws PersistentException {
		try {
			return (Genero) session.load(orm.Genero.class, new Integer(idGenero));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idGenero
     * @return
     * @throws PersistentException
     */
    public static Genero getGeneroByORMID(PersistentSession session, int idGenero) throws PersistentException {
		try {
			return (Genero) session.get(orm.Genero.class, new Integer(idGenero));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idGenero
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Genero loadGeneroByORMID(PersistentSession session, int idGenero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Genero) session.load(orm.Genero.class, new Integer(idGenero), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param idGenero
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Genero getGeneroByORMID(PersistentSession session, int idGenero, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Genero) session.get(orm.Genero.class, new Integer(idGenero), lockMode);
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
    public static List queryGenero(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryGenero(session, condition, orderBy);
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
    public static List queryGenero(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryGenero(session, condition, orderBy, lockMode);
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
    public static Genero[] listGeneroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listGeneroByQuery(session, condition, orderBy);
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
    public static Genero[] listGeneroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listGeneroByQuery(session, condition, orderBy, lockMode);
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static Genero loadGeneroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadGeneroByQuery(session, condition, orderBy);
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
    public static Genero loadGeneroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadGeneroByQuery(session, condition, orderBy, lockMode);
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
    public static Genero loadGeneroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Genero[] generos = listGeneroByQuery(session, condition, orderBy);
		if (generos != null && generos.length > 0)
			return generos[0];
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
    public static Genero loadGeneroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Genero[] generos = listGeneroByQuery(session, condition, orderBy, lockMode);
		if (generos != null && generos.length > 0)
			return generos[0];
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
    public static java.util.Iterator iterateGeneroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateGeneroByQuery(session, condition, orderBy);
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
    public static java.util.Iterator iterateGeneroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateGeneroByQuery(session, condition, orderBy, lockMode);
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @return
     */
    public static Genero createGenero() {
		return new orm.Genero();
	}
	
    /**
     *
     * @param genero
     * @return
     * @throws PersistentException
     */
    public static boolean save(orm.Genero genero) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(genero);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param genero
     * @return
     * @throws PersistentException
     */
    public static boolean delete(orm.Genero genero) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(genero);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param genero
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(orm.Genero genero)throws PersistentException {
		try {
			orm.Novela[] lNovelaidNovelas = genero.novelaidNovela.toArray();
			for(int i = 0; i < lNovelaidNovelas.length; i++) {
				lNovelaidNovelas[i].generoidGenero.remove(genero);
			}
			orm.Animacion[] lAnimacionidAnimacions = genero.animacionidAnimacion.toArray();
			for(int i = 0; i < lAnimacionidAnimacions.length; i++) {
				lAnimacionidAnimacions[i].generoidGenero.remove(genero);
			}
			orm.Manga[] lMangaidMangas = genero.mangaidManga.toArray();
			for(int i = 0; i < lMangaidMangas.length; i++) {
				lMangaidMangas[i].generoidGenero.remove(genero);
			}
			orm.SerieGenerica[] lSerieGenericaidSeries = genero.serieGenericaidSerie.toArray();
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
	
    /**
     *
     * @param genero
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(orm.Genero genero, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Novela[] lNovelaidNovelas = genero.novelaidNovela.toArray();
			for(int i = 0; i < lNovelaidNovelas.length; i++) {
				lNovelaidNovelas[i].generoidGenero.remove(genero);
			}
			orm.Animacion[] lAnimacionidAnimacions = genero.animacionidAnimacion.toArray();
			for(int i = 0; i < lAnimacionidAnimacions.length; i++) {
				lAnimacionidAnimacions[i].generoidGenero.remove(genero);
			}
			orm.Manga[] lMangaidMangas = genero.mangaidManga.toArray();
			for(int i = 0; i < lMangaidMangas.length; i++) {
				lMangaidMangas[i].generoidGenero.remove(genero);
			}
			orm.SerieGenerica[] lSerieGenericaidSeries = genero.serieGenericaidSerie.toArray();
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
	
    /**
     *
     * @param genero
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(orm.Genero genero) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(genero);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param genero
     * @return
     * @throws PersistentException
     */
    public static boolean evict(orm.Genero genero) throws PersistentException {
		try {
			ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(genero);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
