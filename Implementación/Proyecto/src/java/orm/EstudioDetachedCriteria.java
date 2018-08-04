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

public class EstudioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEstudio;
	public final StringExpression nombre;
	public final CollectionExpression animacionidAnimacion;
	
	public EstudioDetachedCriteria() {
		super(ORM.Estudio.class, ORM.EstudioCriteria.class);
		idEstudio = new IntegerExpression("idEstudio", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		animacionidAnimacion = new CollectionExpression("ORM_AnimacionidAnimacion", this.getDetachedCriteria());
	}
	
	public EstudioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.EstudioCriteria.class);
		idEstudio = new IntegerExpression("idEstudio", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		animacionidAnimacion = new CollectionExpression("ORM_AnimacionidAnimacion", this.getDetachedCriteria());
	}
	
	public ORM.AnimacionDetachedCriteria createAnimacionidAnimacionCriteria() {
		return new ORM.AnimacionDetachedCriteria(createCriteria("ORM_AnimacionidAnimacion"));
	}
	
	public Estudio uniqueEstudio(PersistentSession session) {
		return (Estudio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estudio[] listEstudio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estudio[]) list.toArray(new Estudio[list.size()]);
	}
}

