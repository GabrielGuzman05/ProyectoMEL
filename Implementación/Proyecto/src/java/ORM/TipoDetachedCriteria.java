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

public class TipoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTipo;
	public final StringExpression nombre;
	public final CollectionExpression novela;
	
	public TipoDetachedCriteria() {
		super(ORM.Tipo.class, ORM.TipoCriteria.class);
		idTipo = new IntegerExpression("idTipo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public TipoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.TipoCriteria.class);
		idTipo = new IntegerExpression("idTipo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public ORM.NovelaDetachedCriteria createNovelaCriteria() {
		return new ORM.NovelaDetachedCriteria(createCriteria("ORM_Novela"));
	}
	
	public Tipo uniqueTipo(PersistentSession session) {
		return (Tipo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipo[] listTipo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipo[]) list.toArray(new Tipo[list.size()]);
	}
}

