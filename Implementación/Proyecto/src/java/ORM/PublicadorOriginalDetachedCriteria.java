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

public class PublicadorOriginalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPublicadorOriginal;
	public final StringExpression nombre;
	public final CollectionExpression novela;
	
	public PublicadorOriginalDetachedCriteria() {
		super(ORM.PublicadorOriginal.class, ORM.PublicadorOriginalCriteria.class);
		idPublicadorOriginal = new IntegerExpression("idPublicadorOriginal", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public PublicadorOriginalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.PublicadorOriginalCriteria.class);
		idPublicadorOriginal = new IntegerExpression("idPublicadorOriginal", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public ORM.NovelaDetachedCriteria createNovelaCriteria() {
		return new ORM.NovelaDetachedCriteria(createCriteria("ORM_Novela"));
	}
	
	public PublicadorOriginal uniquePublicadorOriginal(PersistentSession session) {
		return (PublicadorOriginal) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PublicadorOriginal[] listPublicadorOriginal(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PublicadorOriginal[]) list.toArray(new PublicadorOriginal[list.size()]);
	}
}

