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

public class TipoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTipo;
	public final StringExpression nombre;
	public final CollectionExpression novela;
	
	public TipoCriteria(Criteria criteria) {
		super(criteria);
		idTipo = new IntegerExpression("idTipo", this);
		nombre = new StringExpression("nombre", this);
		novela = new CollectionExpression("ORM_Novela", this);
	}
	
	public TipoCriteria(PersistentSession session) {
		this(session.createCriteria(Tipo.class));
	}
	
	public TipoCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.NovelaCriteria createNovelaCriteria() {
		return new orm.NovelaCriteria(createCriteria("ORM_Novela"));
	}
	
	public Tipo uniqueTipo() {
		return (Tipo) super.uniqueResult();
	}
	
	public Tipo[] listTipo() {
		java.util.List list = super.list();
		return (Tipo[]) list.toArray(new Tipo[list.size()]);
	}
}

