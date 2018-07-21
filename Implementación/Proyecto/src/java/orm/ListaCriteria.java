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

public class ListaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idLista;
	public final StringExpression nombreLista;
	public final IntegerExpression usuarioidUsuarioId;
	public final AssociationExpression usuarioidUsuario;
	public final CollectionExpression entradaLista;
	
	public ListaCriteria(Criteria criteria) {
		super(criteria);
		idLista = new IntegerExpression("idLista", this);
		nombreLista = new StringExpression("nombreLista", this);
		usuarioidUsuarioId = new IntegerExpression("usuarioidUsuario.idUsuario", this);
		usuarioidUsuario = new AssociationExpression("usuarioidUsuario", this);
		entradaLista = new CollectionExpression("ORM_EntradaLista", this);
	}
	
	public ListaCriteria(PersistentSession session) {
		this(session.createCriteria(Lista.class));
	}
	
	public ListaCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuarioidUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuarioidUsuario"));
	}
	
	public orm.EntradaListaCriteria createEntradaListaCriteria() {
		return new orm.EntradaListaCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public Lista uniqueLista() {
		return (Lista) super.uniqueResult();
	}
	
	public Lista[] listLista() {
		java.util.List list = super.list();
		return (Lista[]) list.toArray(new Lista[list.size()]);
	}
}

