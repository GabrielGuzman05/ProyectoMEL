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

public class SerieGenericaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idSerie;
	public final StringExpression nombre;
	public final StringExpression nombreAlternativo;
	public final IntegerExpression estadoUsuarioidEstadoUsuario;
	public final StringExpression cadena;
	public final IntegerExpression episodios;
	public final CollectionExpression generoidGenero;
	public final CollectionExpression entradaLista;
	
	public SerieGenericaCriteria(Criteria criteria) {
		super(criteria);
		idSerie = new IntegerExpression("idSerie", this);
		nombre = new StringExpression("nombre", this);
		nombreAlternativo = new StringExpression("nombreAlternativo", this);
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this);
		cadena = new StringExpression("cadena", this);
		episodios = new IntegerExpression("episodios", this);
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this);
		entradaLista = new CollectionExpression("ORM_EntradaLista", this);
	}
	
	public SerieGenericaCriteria(PersistentSession session) {
		this(session.createCriteria(SerieGenerica.class));
	}
	
	public SerieGenericaCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.GeneroCriteria createGeneroidGeneroCriteria() {
		return new orm.GeneroCriteria(createCriteria("ORM_GeneroidGenero"));
	}
	
	public orm.EntradaListaCriteria createEntradaListaCriteria() {
		return new orm.EntradaListaCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public SerieGenerica uniqueSerieGenerica() {
		return (SerieGenerica) super.uniqueResult();
	}
	
	public SerieGenerica[] listSerieGenerica() {
		java.util.List list = super.list();
		return (SerieGenerica[]) list.toArray(new SerieGenerica[list.size()]);
	}
}

