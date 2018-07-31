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

public class NovelaDAO {
	public static Novela loadNovelaByORMID(int idNovela) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadNovelaByORMID(session, idNovela);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela getNovelaByORMID(int idNovela) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getNovelaByORMID(session, idNovela);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela loadNovelaByORMID(int idNovela, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadNovelaByORMID(session, idNovela, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela getNovelaByORMID(int idNovela, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getNovelaByORMID(session, idNovela, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela loadNovelaByORMID(PersistentSession session, int idNovela) throws PersistentException {
		try {
			return (Novela) session.load(ORM.Novela.class, new Integer(idNovela));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela getNovelaByORMID(PersistentSession session, int idNovela) throws PersistentException {
		try {
			return (Novela) session.get(ORM.Novela.class, new Integer(idNovela));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela loadNovelaByORMID(PersistentSession session, int idNovela, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Novela) session.load(ORM.Novela.class, new Integer(idNovela), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela getNovelaByORMID(PersistentSession session, int idNovela, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Novela) session.get(ORM.Novela.class, new Integer(idNovela), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNovela(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryNovela(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNovela(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryNovela(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela[] listNovelaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listNovelaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela[] listNovelaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listNovelaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNovela(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Novela as Novela");
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
	
	public static List queryNovela(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Novela as Novela");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Novela", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela[] listNovelaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNovela(session, condition, orderBy);
			return (Novela[]) list.toArray(new Novela[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela[] listNovelaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNovela(session, condition, orderBy, lockMode);
			return (Novela[]) list.toArray(new Novela[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela loadNovelaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadNovelaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela loadNovelaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadNovelaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela loadNovelaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Novela[] novelas = listNovelaByQuery(session, condition, orderBy);
		if (novelas != null && novelas.length > 0)
			return novelas[0];
		else
			return null;
	}
	
	public static Novela loadNovelaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Novela[] novelas = listNovelaByQuery(session, condition, orderBy, lockMode);
		if (novelas != null && novelas.length > 0)
			return novelas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNovelaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateNovelaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNovelaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateNovelaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNovelaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Novela as Novela");
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
	
	public static java.util.Iterator iterateNovelaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Novela as Novela");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Novela", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela createNovela() {
		return new ORM.Novela();
	}
	
	public static boolean save(ORM.Novela novela) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(novela);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ORM.Novela novela) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(novela);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.Novela novela)throws PersistentException {
		try {
			if (novela.getPublicadorOriginalidPublicadorOriginal() != null) {
				novela.getPublicadorOriginalidPublicadorOriginal().novela.remove(novela);
			}
			
			if (novela.getAutoridAutor() != null) {
				novela.getAutoridAutor().novela.remove(novela);
			}
			
			if (novela.getPublicadorInglesidPublicadorIngles() != null) {
				novela.getPublicadorInglesidPublicadorIngles().novela.remove(novela);
			}
			
			if (novela.getTipoidTipo() != null) {
				novela.getTipoidTipo().novela.remove(novela);
			}
			
			if (novela.getLenguajeOriginalidLenguaje() != null) {
				novela.getLenguajeOriginalidLenguaje().novela.remove(novela);
			}
			
			if (novela.getArtistaidArtista() != null) {
				novela.getArtistaidArtista().novela.remove(novela);
			}
			
			ORM.Genero[] lGeneroidGeneros = novela.generoidGenero.toArray();
			for(int i = 0; i < lGeneroidGeneros.length; i++) {
				lGeneroidGeneros[i].novelaidNovela.remove(novela);
			}
			ORM.Tag[] lTagidTags = novela.tagidTag.toArray();
			for(int i = 0; i < lTagidTags.length; i++) {
				lTagidTags[i].novelaidNovela.remove(novela);
			}
			ORM.EntradaLista[] lEntradaListas = novela.entradaLista.toArray();
			for(int i = 0; i < lEntradaListas.length; i++) {
				lEntradaListas[i].setNovelaidNovela(null);
			}
			return delete(novela);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ORM.Novela novela, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (novela.getPublicadorOriginalidPublicadorOriginal() != null) {
				novela.getPublicadorOriginalidPublicadorOriginal().novela.remove(novela);
			}
			
			if (novela.getAutoridAutor() != null) {
				novela.getAutoridAutor().novela.remove(novela);
			}
			
			if (novela.getPublicadorInglesidPublicadorIngles() != null) {
				novela.getPublicadorInglesidPublicadorIngles().novela.remove(novela);
			}
			
			if (novela.getTipoidTipo() != null) {
				novela.getTipoidTipo().novela.remove(novela);
			}
			
			if (novela.getLenguajeOriginalidLenguaje() != null) {
				novela.getLenguajeOriginalidLenguaje().novela.remove(novela);
			}
			
			if (novela.getArtistaidArtista() != null) {
				novela.getArtistaidArtista().novela.remove(novela);
			}
			
			ORM.Genero[] lGeneroidGeneros = novela.generoidGenero.toArray();
			for(int i = 0; i < lGeneroidGeneros.length; i++) {
				lGeneroidGeneros[i].novelaidNovela.remove(novela);
			}
			ORM.Tag[] lTagidTags = novela.tagidTag.toArray();
			for(int i = 0; i < lTagidTags.length; i++) {
				lTagidTags[i].novelaidNovela.remove(novela);
			}
			ORM.EntradaLista[] lEntradaListas = novela.entradaLista.toArray();
			for(int i = 0; i < lEntradaListas.length; i++) {
				lEntradaListas[i].setNovelaidNovela(null);
			}
			try {
				session.delete(novela);
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
	
	public static boolean refresh(ORM.Novela novela) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(novela);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ORM.Novela novela) throws PersistentException {
		try {
			ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(novela);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Novela loadNovelaByCriteria(NovelaCriteria novelaCriteria) {
		Novela[] novelas = listNovelaByCriteria(novelaCriteria);
		if(novelas == null || novelas.length == 0) {
			return null;
		}
		return novelas[0];
	}
	
	public static Novela[] listNovelaByCriteria(NovelaCriteria novelaCriteria) {
		return novelaCriteria.listNovela();
	}
}
