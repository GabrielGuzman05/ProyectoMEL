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

public class AutorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAutor;
	public final StringExpression nombre;
	public final CollectionExpression mangaidManga;
	public final CollectionExpression novela;
	
	public AutorDetachedCriteria() {
		super(ORM.Autor.class, ORM.AutorCriteria.class);
		idAutor = new IntegerExpression("idAutor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public AutorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.AutorCriteria.class);
		idAutor = new IntegerExpression("idAutor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public ORM.MangaDetachedCriteria createMangaidMangaCriteria() {
		return new ORM.MangaDetachedCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public ORM.NovelaDetachedCriteria createNovelaCriteria() {
		return new ORM.NovelaDetachedCriteria(createCriteria("ORM_Novela"));
	}
	
	public Autor uniqueAutor(PersistentSession session) {
		return (Autor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Autor[] listAutor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Autor[]) list.toArray(new Autor[list.size()]);
	}
}

