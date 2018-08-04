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

public class MangaDAO {
	public static Manga loadMangaByORMID(int idManga) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadMangaByORMID(session, idManga);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga getMangaByORMID(int idManga) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getMangaByORMID(session, idManga);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga loadMangaByORMID(int idManga, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadMangaByORMID(session, idManga, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga getMangaByORMID(int idManga, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getMangaByORMID(session, idManga, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga loadMangaByORMID(PersistentSession session, int idManga) throws PersistentException {
		try {
			return (Manga) session.load(orm.Manga.class, new Integer(idManga));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga getMangaByORMID(PersistentSession session, int idManga) throws PersistentException {
		try {
			return (Manga) session.get(orm.Manga.class, new Integer(idManga));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga loadMangaByORMID(PersistentSession session, int idManga, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Manga) session.load(orm.Manga.class, new Integer(idManga), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga getMangaByORMID(PersistentSession session, int idManga, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Manga) session.get(orm.Manga.class, new Integer(idManga), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryManga(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryManga(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryManga(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryManga(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga[] listMangaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listMangaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga[] listMangaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listMangaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryManga(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Manga as Manga");
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
	
	public static List queryManga(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Manga as Manga");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Manga", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga[] listMangaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryManga(session, condition, orderBy);
			return (Manga[]) list.toArray(new Manga[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga[] listMangaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryManga(session, condition, orderBy, lockMode);
			return (Manga[]) list.toArray(new Manga[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga loadMangaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadMangaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga loadMangaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadMangaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga loadMangaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Manga[] mangas = listMangaByQuery(session, condition, orderBy);
		if (mangas != null && mangas.length > 0)
			return mangas[0];
		else
			return null;
	}
	
	public static Manga loadMangaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Manga[] mangas = listMangaByQuery(session, condition, orderBy, lockMode);
		if (mangas != null && mangas.length > 0)
			return mangas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMangaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateMangaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMangaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateMangaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMangaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Manga as Manga");
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
	
	public static java.util.Iterator iterateMangaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Manga as Manga");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Manga", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Manga createManga() {
		return new orm.Manga();
	}
	
	public static boolean save(orm.Manga manga) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(manga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Manga manga) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(manga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Manga manga)throws PersistentException {
		try {
			if (manga.getTipoMangaidTipoManga() != null) {
				manga.getTipoMangaidTipoManga().manga.remove(manga);
			}
			
			orm.Genero[] lGeneroidGeneros = manga.generoidGenero.toArray();
			for(int i = 0; i < lGeneroidGeneros.length; i++) {
				lGeneroidGeneros[i].mangaidManga.remove(manga);
			}
			orm.Autor[] lAutoridAutors = manga.autoridAutor.toArray();
			for(int i = 0; i < lAutoridAutors.length; i++) {
				lAutoridAutors[i].mangaidManga.remove(manga);
			}
			orm.Tag[] lTagidTags = manga.tagidTag.toArray();
			for(int i = 0; i < lTagidTags.length; i++) {
				lTagidTags[i].mangaidManga.remove(manga);
			}
			orm.Artista[] lAristaidArtistas = manga.aristaidArtista.toArray();
			for(int i = 0; i < lAristaidArtistas.length; i++) {
				lAristaidArtistas[i].mangaidManga.remove(manga);
			}
			orm.EntradaLista[] lEntradaListas = manga.entradaLista.toArray();
			for(int i = 0; i < lEntradaListas.length; i++) {
				lEntradaListas[i].setMangaidManga(null);
			}
			return delete(manga);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Manga manga, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (manga.getTipoMangaidTipoManga() != null) {
				manga.getTipoMangaidTipoManga().manga.remove(manga);
			}
			
			orm.Genero[] lGeneroidGeneros = manga.generoidGenero.toArray();
			for(int i = 0; i < lGeneroidGeneros.length; i++) {
				lGeneroidGeneros[i].mangaidManga.remove(manga);
			}
			orm.Autor[] lAutoridAutors = manga.autoridAutor.toArray();
			for(int i = 0; i < lAutoridAutors.length; i++) {
				lAutoridAutors[i].mangaidManga.remove(manga);
			}
			orm.Tag[] lTagidTags = manga.tagidTag.toArray();
			for(int i = 0; i < lTagidTags.length; i++) {
				lTagidTags[i].mangaidManga.remove(manga);
			}
			orm.Artista[] lAristaidArtistas = manga.aristaidArtista.toArray();
			for(int i = 0; i < lAristaidArtistas.length; i++) {
				lAristaidArtistas[i].mangaidManga.remove(manga);
			}
			orm.EntradaLista[] lEntradaListas = manga.entradaLista.toArray();
			for(int i = 0; i < lEntradaListas.length; i++) {
				lEntradaListas[i].setMangaidManga(null);
			}
			try {
				session.delete(manga);
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
	
	public static boolean refresh(orm.Manga manga) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(manga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Manga manga) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(manga);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
