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

public class SerieGenericaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idSerie;
	public final StringExpression nombre;
	public final StringExpression nombreAlternativo;
	public final IntegerExpression estadoUsuarioidEstadoUsuario;
	public final StringExpression cadena;
	public final IntegerExpression episodios;
	public final CollectionExpression generoidGenero;
	public final CollectionExpression entradaLista;
	
	public SerieGenericaDetachedCriteria() {
		super(orm.SerieGenerica.class, orm.SerieGenericaCriteria.class);
		idSerie = new IntegerExpression("idSerie", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nombreAlternativo = new StringExpression("nombreAlternativo", this.getDetachedCriteria());
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this.getDetachedCriteria());
		cadena = new StringExpression("cadena", this.getDetachedCriteria());
		episodios = new IntegerExpression("episodios", this.getDetachedCriteria());
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public SerieGenericaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.SerieGenericaCriteria.class);
		idSerie = new IntegerExpression("idSerie", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nombreAlternativo = new StringExpression("nombreAlternativo", this.getDetachedCriteria());
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this.getDetachedCriteria());
		cadena = new StringExpression("cadena", this.getDetachedCriteria());
		episodios = new IntegerExpression("episodios", this.getDetachedCriteria());
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public orm.GeneroDetachedCriteria createGeneroidGeneroCriteria() {
		return new orm.GeneroDetachedCriteria(createCriteria("ORM_GeneroidGenero"));
	}
	
	public orm.EntradaListaDetachedCriteria createEntradaListaCriteria() {
		return new orm.EntradaListaDetachedCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public SerieGenerica uniqueSerieGenerica(PersistentSession session) {
		return (SerieGenerica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SerieGenerica[] listSerieGenerica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SerieGenerica[]) list.toArray(new SerieGenerica[list.size()]);
	}
}

