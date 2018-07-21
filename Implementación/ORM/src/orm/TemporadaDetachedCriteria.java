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

public class TemporadaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTemporada;
	public final StringExpression estacion;
	public final IntegerExpression año;
	public final CollectionExpression animacion;
	
	public TemporadaDetachedCriteria() {
		super(orm.Temporada.class, orm.TemporadaCriteria.class);
		idTemporada = new IntegerExpression("idTemporada", this.getDetachedCriteria());
		estacion = new StringExpression("estacion", this.getDetachedCriteria());
		año = new IntegerExpression("año", this.getDetachedCriteria());
		animacion = new CollectionExpression("ORM_Animacion", this.getDetachedCriteria());
	}
	
	public TemporadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.TemporadaCriteria.class);
		idTemporada = new IntegerExpression("idTemporada", this.getDetachedCriteria());
		estacion = new StringExpression("estacion", this.getDetachedCriteria());
		año = new IntegerExpression("año", this.getDetachedCriteria());
		animacion = new CollectionExpression("ORM_Animacion", this.getDetachedCriteria());
	}
	
	public orm.AnimacionDetachedCriteria createAnimacionCriteria() {
		return new orm.AnimacionDetachedCriteria(createCriteria("ORM_Animacion"));
	}
	
	public Temporada uniqueTemporada(PersistentSession session) {
		return (Temporada) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Temporada[] listTemporada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Temporada[]) list.toArray(new Temporada[list.size()]);
	}
}

