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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TagDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTag;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final CollectionExpression novelaidNovela;
	public final CollectionExpression mangaidManga;
	
	public TagDetachedCriteria() {
		super(ORM.Tag.class, ORM.TagCriteria.class);
		idTag = new IntegerExpression("idTag", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		novelaidNovela = new CollectionExpression("ORM_NovelaidNovela", this.getDetachedCriteria());
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this.getDetachedCriteria());
	}
	
	public TagDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.TagCriteria.class);
		idTag = new IntegerExpression("idTag", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		novelaidNovela = new CollectionExpression("ORM_NovelaidNovela", this.getDetachedCriteria());
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this.getDetachedCriteria());
	}
	
	public ORM.NovelaDetachedCriteria createNovelaidNovelaCriteria() {
		return new ORM.NovelaDetachedCriteria(createCriteria("ORM_NovelaidNovela"));
	}
	
	public ORM.MangaDetachedCriteria createMangaidMangaCriteria() {
		return new ORM.MangaDetachedCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public Tag uniqueTag(PersistentSession session) {
		return (Tag) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tag[] listTag(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tag[]) list.toArray(new Tag[list.size()]);
	}
}

