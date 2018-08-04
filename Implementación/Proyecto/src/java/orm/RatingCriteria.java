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

public class RatingCriteria extends AbstractORMCriteria {
	public final IntegerExpression idRating;
	public final StringExpression nombre;
	public final CollectionExpression animacion;
	
	public RatingCriteria(Criteria criteria) {
		super(criteria);
		idRating = new IntegerExpression("idRating", this);
		nombre = new StringExpression("nombre", this);
		animacion = new CollectionExpression("ORM_Animacion", this);
	}
	
	public RatingCriteria(PersistentSession session) {
		this(session.createCriteria(Rating.class));
	}
	
	public RatingCriteria() throws PersistentException {
		this(ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public ORM.AnimacionCriteria createAnimacionCriteria() {
		return new ORM.AnimacionCriteria(createCriteria("ORM_Animacion"));
	}
	
	public Rating uniqueRating() {
		return (Rating) super.uniqueResult();
	}
	
	public Rating[] listRating() {
		java.util.List list = super.list();
		return (Rating[]) list.toArray(new Rating[list.size()]);
	}
}

