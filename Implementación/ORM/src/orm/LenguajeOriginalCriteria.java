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

public class LenguajeOriginalCriteria extends AbstractORMCriteria {
	public final IntegerExpression idLenguaje;
	public final StringExpression nombre;
	public final CollectionExpression novela;
	
	public LenguajeOriginalCriteria(Criteria criteria) {
		super(criteria);
		idLenguaje = new IntegerExpression("idLenguaje", this);
		nombre = new StringExpression("nombre", this);
		novela = new CollectionExpression("ORM_Novela", this);
	}
	
	public LenguajeOriginalCriteria(PersistentSession session) {
		this(session.createCriteria(LenguajeOriginal.class));
	}
	
	public LenguajeOriginalCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.NovelaCriteria createNovelaCriteria() {
		return new orm.NovelaCriteria(createCriteria("ORM_Novela"));
	}
	
	public LenguajeOriginal uniqueLenguajeOriginal() {
		return (LenguajeOriginal) super.uniqueResult();
	}
	
	public LenguajeOriginal[] listLenguajeOriginal() {
		java.util.List list = super.list();
		return (LenguajeOriginal[]) list.toArray(new LenguajeOriginal[list.size()]);
	}
}

