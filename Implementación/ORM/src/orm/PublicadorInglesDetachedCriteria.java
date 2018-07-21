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

public class PublicadorInglesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPublicadorIngles;
	public final StringExpression nombre;
	public final CollectionExpression novela;
	
	public PublicadorInglesDetachedCriteria() {
		super(orm.PublicadorIngles.class, orm.PublicadorInglesCriteria.class);
		idPublicadorIngles = new IntegerExpression("idPublicadorIngles", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public PublicadorInglesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PublicadorInglesCriteria.class);
		idPublicadorIngles = new IntegerExpression("idPublicadorIngles", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public orm.NovelaDetachedCriteria createNovelaCriteria() {
		return new orm.NovelaDetachedCriteria(createCriteria("ORM_Novela"));
	}
	
	public PublicadorIngles uniquePublicadorIngles(PersistentSession session) {
		return (PublicadorIngles) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PublicadorIngles[] listPublicadorIngles(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PublicadorIngles[]) list.toArray(new PublicadorIngles[list.size()]);
	}
}

