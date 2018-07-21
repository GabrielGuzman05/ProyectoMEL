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

public class RatingDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idRating;
	public final StringExpression nombre;
	public final CollectionExpression animacion;
	
	public RatingDetachedCriteria() {
		super(orm.Rating.class, orm.RatingCriteria.class);
		idRating = new IntegerExpression("idRating", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		animacion = new CollectionExpression("ORM_Animacion", this.getDetachedCriteria());
	}
	
	public RatingDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.RatingCriteria.class);
		idRating = new IntegerExpression("idRating", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		animacion = new CollectionExpression("ORM_Animacion", this.getDetachedCriteria());
	}
	
	public orm.AnimacionDetachedCriteria createAnimacionCriteria() {
		return new orm.AnimacionDetachedCriteria(createCriteria("ORM_Animacion"));
	}
	
	public Rating uniqueRating(PersistentSession session) {
		return (Rating) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Rating[] listRating(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Rating[]) list.toArray(new Rating[list.size()]);
	}
}

