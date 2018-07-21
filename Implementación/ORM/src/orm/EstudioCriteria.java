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

public class EstudioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEstudio;
	public final StringExpression nombre;
	public final CollectionExpression animacionidAnimacion;
	
	public EstudioCriteria(Criteria criteria) {
		super(criteria);
		idEstudio = new IntegerExpression("idEstudio", this);
		nombre = new StringExpression("nombre", this);
		animacionidAnimacion = new CollectionExpression("ORM_AnimacionidAnimacion", this);
	}
	
	public EstudioCriteria(PersistentSession session) {
		this(session.createCriteria(Estudio.class));
	}
	
	public EstudioCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.AnimacionCriteria createAnimacionidAnimacionCriteria() {
		return new orm.AnimacionCriteria(createCriteria("ORM_AnimacionidAnimacion"));
	}
	
	public Estudio uniqueEstudio() {
		return (Estudio) super.uniqueResult();
	}
	
	public Estudio[] listEstudio() {
		java.util.List list = super.list();
		return (Estudio[]) list.toArray(new Estudio[list.size()]);
	}
}

