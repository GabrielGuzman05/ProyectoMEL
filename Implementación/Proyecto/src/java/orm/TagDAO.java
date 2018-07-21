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

public class TagDAO {
	public static Tag loadTagByORMID(int idTag) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTagByORMID(session, idTag);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag getTagByORMID(int idTag) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getTagByORMID(session, idTag);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag loadTagByORMID(int idTag, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTagByORMID(session, idTag, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag getTagByORMID(int idTag, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return getTagByORMID(session, idTag, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag loadTagByORMID(PersistentSession session, int idTag) throws PersistentException {
		try {
			return (Tag) session.load(orm.Tag.class, new Integer(idTag));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag getTagByORMID(PersistentSession session, int idTag) throws PersistentException {
		try {
			return (Tag) session.get(orm.Tag.class, new Integer(idTag));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag loadTagByORMID(PersistentSession session, int idTag, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tag) session.load(orm.Tag.class, new Integer(idTag), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag getTagByORMID(PersistentSession session, int idTag, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tag) session.get(orm.Tag.class, new Integer(idTag), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTag(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryTag(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTag(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return queryTag(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag[] listTagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listTagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag[] listTagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return listTagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTag(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tag as Tag");
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
	
	public static List queryTag(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tag as Tag");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tag", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag[] listTagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTag(session, condition, orderBy);
			return (Tag[]) list.toArray(new Tag[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag[] listTagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTag(session, condition, orderBy, lockMode);
			return (Tag[]) list.toArray(new Tag[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag loadTagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag loadTagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return loadTagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag loadTagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tag[] tags = listTagByQuery(session, condition, orderBy);
		if (tags != null && tags.length > 0)
			return tags[0];
		else
			return null;
	}
	
	public static Tag loadTagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tag[] tags = listTagByQuery(session, condition, orderBy, lockMode);
		if (tags != null && tags.length > 0)
			return tags[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateTagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession();
			return iterateTagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tag as Tag");
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
	
	public static java.util.Iterator iterateTagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tag as Tag");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tag", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag createTag() {
		return new orm.Tag();
	}
	
	public static boolean save(orm.Tag tag) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().saveObject(tag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Tag tag) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().deleteObject(tag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Tag tag)throws PersistentException {
		try {
			orm.Novela[] lNovelaidNovelas = tag.novelaidNovela.toArray();
			for(int i = 0; i < lNovelaidNovelas.length; i++) {
				lNovelaidNovelas[i].tagidTag.remove(tag);
			}
			orm.Manga[] lMangaidMangas = tag.mangaidManga.toArray();
			for(int i = 0; i < lMangaidMangas.length; i++) {
				lMangaidMangas[i].tagidTag.remove(tag);
			}
			return delete(tag);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Tag tag, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Novela[] lNovelaidNovelas = tag.novelaidNovela.toArray();
			for(int i = 0; i < lNovelaidNovelas.length; i++) {
				lNovelaidNovelas[i].tagidTag.remove(tag);
			}
			orm.Manga[] lMangaidMangas = tag.mangaidManga.toArray();
			for(int i = 0; i < lMangaidMangas.length; i++) {
				lMangaidMangas[i].tagidTag.remove(tag);
			}
			try {
				session.delete(tag);
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
	
	public static boolean refresh(orm.Tag tag) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().refresh(tag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Tag tag) throws PersistentException {
		try {
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().evict(tag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tag loadTagByCriteria(TagCriteria tagCriteria) {
		Tag[] tags = listTagByCriteria(tagCriteria);
		if(tags == null || tags.length == 0) {
			return null;
		}
		return tags[0];
	}
	
	public static Tag[] listTagByCriteria(TagCriteria tagCriteria) {
		return tagCriteria.listTag();
	}
}
