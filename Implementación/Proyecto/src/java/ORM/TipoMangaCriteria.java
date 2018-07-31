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

public class TipoMangaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTipoManga;
	public final StringExpression nombre;
	public final CollectionExpression manga;
	
	public TipoMangaCriteria(Criteria criteria) {
		super(criteria);
		idTipoManga = new IntegerExpression("idTipoManga", this);
		nombre = new StringExpression("nombre", this);
		manga = new CollectionExpression("ORM_Manga", this);
	}
	
	public TipoMangaCriteria(PersistentSession session) {
		this(session.createCriteria(TipoManga.class));
	}
	
	public TipoMangaCriteria() throws PersistentException {
		this(ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public ORM.MangaCriteria createMangaCriteria() {
		return new ORM.MangaCriteria(createCriteria("ORM_Manga"));
	}
	
	public TipoManga uniqueTipoManga() {
		return (TipoManga) super.uniqueResult();
	}
	
	public TipoManga[] listTipoManga() {
		java.util.List list = super.list();
		return (TipoManga[]) list.toArray(new TipoManga[list.size()]);
	}
}

