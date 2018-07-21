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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression nombreUsuario;
	public final StringExpression contraseñaUsuario;
	public final CollectionExpression lista;
	
	public UsuarioDetachedCriteria() {
		super(orm.Usuario.class, orm.UsuarioCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		contraseñaUsuario = new StringExpression("contraseñaUsuario", this.getDetachedCriteria());
		lista = new CollectionExpression("ORM_Lista", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.UsuarioCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		contraseñaUsuario = new StringExpression("contraseñaUsuario", this.getDetachedCriteria());
		lista = new CollectionExpression("ORM_Lista", this.getDetachedCriteria());
	}
	
	public orm.ListaDetachedCriteria createListaCriteria() {
		return new orm.ListaDetachedCriteria(createCriteria("ORM_Lista"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

