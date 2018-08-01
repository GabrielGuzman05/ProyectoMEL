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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TagCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTag;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final CollectionExpression novelaidNovela;
	public final CollectionExpression mangaidManga;
	
	public TagCriteria(Criteria criteria) {
		super(criteria);
		idTag = new IntegerExpression("idTag", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		novelaidNovela = new CollectionExpression("ORM_NovelaidNovela", this);
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this);
	}
	
	public TagCriteria(PersistentSession session) {
		this(session.createCriteria(Tag.class));
	}
	
	public TagCriteria() throws PersistentException {
		this(ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public ORM.NovelaCriteria createNovelaidNovelaCriteria() {
		return new ORM.NovelaCriteria(createCriteria("ORM_NovelaidNovela"));
	}
	
	public ORM.MangaCriteria createMangaidMangaCriteria() {
		return new ORM.MangaCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public Tag uniqueTag() {
		return (Tag) super.uniqueResult();
	}
	
	public Tag[] listTag() {
		java.util.List list = super.list();
		return (Tag[]) list.toArray(new Tag[list.size()]);
	}
}

