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

public class TemporadaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTemporada;
	public final StringExpression estacion;
	public final IntegerExpression año;
	public final CollectionExpression animacion;
	
	public TemporadaCriteria(Criteria criteria) {
		super(criteria);
		idTemporada = new IntegerExpression("idTemporada", this);
		estacion = new StringExpression("estacion", this);
		año = new IntegerExpression("año", this);
		animacion = new CollectionExpression("ORM_Animacion", this);
	}
	
	public TemporadaCriteria(PersistentSession session) {
		this(session.createCriteria(Temporada.class));
	}
	
	public TemporadaCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.AnimacionCriteria createAnimacionCriteria() {
		return new orm.AnimacionCriteria(createCriteria("ORM_Animacion"));
	}
	
	public Temporada uniqueTemporada() {
		return (Temporada) super.uniqueResult();
	}
	
	public Temporada[] listTemporada() {
		java.util.List list = super.list();
		return (Temporada[]) list.toArray(new Temporada[list.size()]);
	}
}

