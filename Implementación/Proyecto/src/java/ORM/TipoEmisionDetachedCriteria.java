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

public class TipoEmisionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTipoEmision;
	public final IntegerExpression nombre;
	public final CollectionExpression animacion;
	
	public TipoEmisionDetachedCriteria() {
		super(ORM.TipoEmision.class, ORM.TipoEmisionCriteria.class);
		idTipoEmision = new IntegerExpression("idTipoEmision", this.getDetachedCriteria());
		nombre = new IntegerExpression("nombre", this.getDetachedCriteria());
		animacion = new CollectionExpression("ORM_Animacion", this.getDetachedCriteria());
	}
	
	public TipoEmisionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.TipoEmisionCriteria.class);
		idTipoEmision = new IntegerExpression("idTipoEmision", this.getDetachedCriteria());
		nombre = new IntegerExpression("nombre", this.getDetachedCriteria());
		animacion = new CollectionExpression("ORM_Animacion", this.getDetachedCriteria());
	}
	
	public ORM.AnimacionDetachedCriteria createAnimacionCriteria() {
		return new ORM.AnimacionDetachedCriteria(createCriteria("ORM_Animacion"));
	}
	
	public TipoEmision uniqueTipoEmision(PersistentSession session) {
		return (TipoEmision) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TipoEmision[] listTipoEmision(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TipoEmision[]) list.toArray(new TipoEmision[list.size()]);
	}
}

