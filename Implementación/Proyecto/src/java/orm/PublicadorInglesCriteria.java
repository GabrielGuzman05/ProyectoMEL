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

public class PublicadorInglesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idPublicadorIngles;
	public final StringExpression nombre;
	public final CollectionExpression novela;
	
	public PublicadorInglesCriteria(Criteria criteria) {
		super(criteria);
		idPublicadorIngles = new IntegerExpression("idPublicadorIngles", this);
		nombre = new StringExpression("nombre", this);
		novela = new CollectionExpression("ORM_Novela", this);
	}
	
	public PublicadorInglesCriteria(PersistentSession session) {
		this(session.createCriteria(PublicadorIngles.class));
	}
	
	public PublicadorInglesCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.NovelaCriteria createNovelaCriteria() {
		return new orm.NovelaCriteria(createCriteria("ORM_Novela"));
	}
	
	public PublicadorIngles uniquePublicadorIngles() {
		return (PublicadorIngles) super.uniqueResult();
	}
	
	public PublicadorIngles[] listPublicadorIngles() {
		java.util.List list = super.list();
		return (PublicadorIngles[]) list.toArray(new PublicadorIngles[list.size()]);
	}
}

