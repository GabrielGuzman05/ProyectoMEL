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

public class ListaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idLista;
	public final StringExpression nombreLista;
	public final IntegerExpression usuarioidUsuarioId;
	public final AssociationExpression usuarioidUsuario;
	public final CollectionExpression entradaLista;
	
	public ListaDetachedCriteria() {
		super(ORM.Lista.class, ORM.ListaCriteria.class);
		idLista = new IntegerExpression("idLista", this.getDetachedCriteria());
		nombreLista = new StringExpression("nombreLista", this.getDetachedCriteria());
		usuarioidUsuarioId = new IntegerExpression("usuarioidUsuario.idUsuario", this.getDetachedCriteria());
		usuarioidUsuario = new AssociationExpression("usuarioidUsuario", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public ListaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.ListaCriteria.class);
		idLista = new IntegerExpression("idLista", this.getDetachedCriteria());
		nombreLista = new StringExpression("nombreLista", this.getDetachedCriteria());
		usuarioidUsuarioId = new IntegerExpression("usuarioidUsuario.idUsuario", this.getDetachedCriteria());
		usuarioidUsuario = new AssociationExpression("usuarioidUsuario", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuarioidUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuarioidUsuario"));
	}
	
	public ORM.EntradaListaDetachedCriteria createEntradaListaCriteria() {
		return new ORM.EntradaListaDetachedCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public Lista uniqueLista(PersistentSession session) {
		return (Lista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lista[] listLista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lista[]) list.toArray(new Lista[list.size()]);
	}
}

