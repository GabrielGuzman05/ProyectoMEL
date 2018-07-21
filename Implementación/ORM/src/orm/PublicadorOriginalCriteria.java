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

public class PublicadorOriginalCriteria extends AbstractORMCriteria {
	public final IntegerExpression idPublicadorOriginal;
	public final StringExpression nombre;
	public final CollectionExpression novela;
	
	public PublicadorOriginalCriteria(Criteria criteria) {
		super(criteria);
		idPublicadorOriginal = new IntegerExpression("idPublicadorOriginal", this);
		nombre = new StringExpression("nombre", this);
		novela = new CollectionExpression("ORM_Novela", this);
	}
	
	public PublicadorOriginalCriteria(PersistentSession session) {
		this(session.createCriteria(PublicadorOriginal.class));
	}
	
	public PublicadorOriginalCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.NovelaCriteria createNovelaCriteria() {
		return new orm.NovelaCriteria(createCriteria("ORM_Novela"));
	}
	
	public PublicadorOriginal uniquePublicadorOriginal() {
		return (PublicadorOriginal) super.uniqueResult();
	}
	
	public PublicadorOriginal[] listPublicadorOriginal() {
		java.util.List list = super.list();
		return (PublicadorOriginal[]) list.toArray(new PublicadorOriginal[list.size()]);
	}
}

