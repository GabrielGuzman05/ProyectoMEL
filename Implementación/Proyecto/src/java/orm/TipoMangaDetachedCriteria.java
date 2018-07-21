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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TipoMangaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTipoManga;
	public final StringExpression nombre;
	public final CollectionExpression manga;
	
	public TipoMangaDetachedCriteria() {
		super(orm.TipoManga.class, orm.TipoMangaCriteria.class);
		idTipoManga = new IntegerExpression("idTipoManga", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		manga = new CollectionExpression("ORM_Manga", this.getDetachedCriteria());
	}
	
	public TipoMangaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.TipoMangaCriteria.class);
		idTipoManga = new IntegerExpression("idTipoManga", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		manga = new CollectionExpression("ORM_Manga", this.getDetachedCriteria());
	}
	
	public orm.MangaDetachedCriteria createMangaCriteria() {
		return new orm.MangaDetachedCriteria(createCriteria("ORM_Manga"));
	}
	
	public TipoManga uniqueTipoManga(PersistentSession session) {
		return (TipoManga) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TipoManga[] listTipoManga(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TipoManga[]) list.toArray(new TipoManga[list.size()]);
	}
}

