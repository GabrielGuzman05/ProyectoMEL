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

public class TipoEmisionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTipoEmision;
	public final IntegerExpression nombre;
	public final CollectionExpression animacion;
	
	public TipoEmisionCriteria(Criteria criteria) {
		super(criteria);
		idTipoEmision = new IntegerExpression("idTipoEmision", this);
		nombre = new IntegerExpression("nombre", this);
		animacion = new CollectionExpression("ORM_Animacion", this);
	}
	
	public TipoEmisionCriteria(PersistentSession session) {
		this(session.createCriteria(TipoEmision.class));
	}
	
	public TipoEmisionCriteria() throws PersistentException {
		this(ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public ORM.AnimacionCriteria createAnimacionCriteria() {
		return new ORM.AnimacionCriteria(createCriteria("ORM_Animacion"));
	}
	
	public TipoEmision uniqueTipoEmision() {
		return (TipoEmision) super.uniqueResult();
	}
	
	public TipoEmision[] listTipoEmision() {
		java.util.List list = super.list();
		return (TipoEmision[]) list.toArray(new TipoEmision[list.size()]);
	}
}

