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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AutorCriteria extends AbstractORMCriteria {
	public final IntegerExpression idAutor;
	public final StringExpression nombre;
	public final CollectionExpression mangaidManga;
	public final CollectionExpression novela;
	
	public AutorCriteria(Criteria criteria) {
		super(criteria);
		idAutor = new IntegerExpression("idAutor", this);
		nombre = new StringExpression("nombre", this);
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this);
		novela = new CollectionExpression("ORM_Novela", this);
	}
	
	public AutorCriteria(PersistentSession session) {
		this(session.createCriteria(Autor.class));
	}
	
	public AutorCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.MangaCriteria createMangaidMangaCriteria() {
		return new orm.MangaCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public orm.NovelaCriteria createNovelaCriteria() {
		return new orm.NovelaCriteria(createCriteria("ORM_Novela"));
	}
	
	public Autor uniqueAutor() {
		return (Autor) super.uniqueResult();
	}
	
	public Autor[] listAutor() {
		java.util.List list = super.list();
		return (Autor[]) list.toArray(new Autor[list.size()]);
	}
}

