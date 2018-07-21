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

public class LenguajeOriginalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idLenguaje;
	public final StringExpression nombre;
	public final CollectionExpression novela;
	
	public LenguajeOriginalDetachedCriteria() {
		super(orm.LenguajeOriginal.class, orm.LenguajeOriginalCriteria.class);
		idLenguaje = new IntegerExpression("idLenguaje", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public LenguajeOriginalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.LenguajeOriginalCriteria.class);
		idLenguaje = new IntegerExpression("idLenguaje", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public orm.NovelaDetachedCriteria createNovelaCriteria() {
		return new orm.NovelaDetachedCriteria(createCriteria("ORM_Novela"));
	}
	
	public LenguajeOriginal uniqueLenguajeOriginal(PersistentSession session) {
		return (LenguajeOriginal) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public LenguajeOriginal[] listLenguajeOriginal(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (LenguajeOriginal[]) list.toArray(new LenguajeOriginal[list.size()]);
	}
}

