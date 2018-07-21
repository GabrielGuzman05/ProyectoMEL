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

public class AnimacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAnimacion;
	public final StringExpression nombre;
	public final StringExpression nombreAlternativo;
	public final StringExpression fuente;
	public final ByteExpression enEmision;
	public final IntegerExpression episodios;
	public final StringExpression MALCode;
	public final IntegerExpression estadoUsuarioidEstadoUsuario;
	public final IntegerExpression temporadaidTemporadaId;
	public final AssociationExpression temporadaidTemporada;
	public final IntegerExpression tipoEmisionidTipoEmisionId;
	public final AssociationExpression tipoEmisionidTipoEmision;
	public final IntegerExpression ratingidRatingId;
	public final AssociationExpression ratingidRating;
	public final CollectionExpression estudioidEstudio;
	public final CollectionExpression generoidGenero;
	public final CollectionExpression entradaLista;
	
	public AnimacionDetachedCriteria() {
		super(orm.Animacion.class, orm.AnimacionCriteria.class);
		idAnimacion = new IntegerExpression("idAnimacion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nombreAlternativo = new StringExpression("nombreAlternativo", this.getDetachedCriteria());
		fuente = new StringExpression("fuente", this.getDetachedCriteria());
		enEmision = new ByteExpression("enEmision", this.getDetachedCriteria());
		episodios = new IntegerExpression("episodios", this.getDetachedCriteria());
		MALCode = new StringExpression("MALCode", this.getDetachedCriteria());
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this.getDetachedCriteria());
		temporadaidTemporadaId = new IntegerExpression("temporadaidTemporada.idTemporada", this.getDetachedCriteria());
		temporadaidTemporada = new AssociationExpression("temporadaidTemporada", this.getDetachedCriteria());
		tipoEmisionidTipoEmisionId = new IntegerExpression("tipoEmisionidTipoEmision.idTipoEmision", this.getDetachedCriteria());
		tipoEmisionidTipoEmision = new AssociationExpression("tipoEmisionidTipoEmision", this.getDetachedCriteria());
		ratingidRatingId = new IntegerExpression("ratingidRating.idRating", this.getDetachedCriteria());
		ratingidRating = new AssociationExpression("ratingidRating", this.getDetachedCriteria());
		estudioidEstudio = new CollectionExpression("ORM_EstudioidEstudio", this.getDetachedCriteria());
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public AnimacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AnimacionCriteria.class);
		idAnimacion = new IntegerExpression("idAnimacion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nombreAlternativo = new StringExpression("nombreAlternativo", this.getDetachedCriteria());
		fuente = new StringExpression("fuente", this.getDetachedCriteria());
		enEmision = new ByteExpression("enEmision", this.getDetachedCriteria());
		episodios = new IntegerExpression("episodios", this.getDetachedCriteria());
		MALCode = new StringExpression("MALCode", this.getDetachedCriteria());
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this.getDetachedCriteria());
		temporadaidTemporadaId = new IntegerExpression("temporadaidTemporada.idTemporada", this.getDetachedCriteria());
		temporadaidTemporada = new AssociationExpression("temporadaidTemporada", this.getDetachedCriteria());
		tipoEmisionidTipoEmisionId = new IntegerExpression("tipoEmisionidTipoEmision.idTipoEmision", this.getDetachedCriteria());
		tipoEmisionidTipoEmision = new AssociationExpression("tipoEmisionidTipoEmision", this.getDetachedCriteria());
		ratingidRatingId = new IntegerExpression("ratingidRating.idRating", this.getDetachedCriteria());
		ratingidRating = new AssociationExpression("ratingidRating", this.getDetachedCriteria());
		estudioidEstudio = new CollectionExpression("ORM_EstudioidEstudio", this.getDetachedCriteria());
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public TemporadaDetachedCriteria createTemporadaidTemporadaCriteria() {
		return new TemporadaDetachedCriteria(createCriteria("temporadaidTemporada"));
	}
	
	public TipoEmisionDetachedCriteria createTipoEmisionidTipoEmisionCriteria() {
		return new TipoEmisionDetachedCriteria(createCriteria("tipoEmisionidTipoEmision"));
	}
	
	public RatingDetachedCriteria createRatingidRatingCriteria() {
		return new RatingDetachedCriteria(createCriteria("ratingidRating"));
	}
	
	public orm.EstudioDetachedCriteria createEstudioidEstudioCriteria() {
		return new orm.EstudioDetachedCriteria(createCriteria("ORM_EstudioidEstudio"));
	}
	
	public orm.GeneroDetachedCriteria createGeneroidGeneroCriteria() {
		return new orm.GeneroDetachedCriteria(createCriteria("ORM_GeneroidGenero"));
	}
	
	public orm.EntradaListaDetachedCriteria createEntradaListaCriteria() {
		return new orm.EntradaListaDetachedCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public Animacion uniqueAnimacion(PersistentSession session) {
		return (Animacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Animacion[] listAnimacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Animacion[]) list.toArray(new Animacion[list.size()]);
	}
}

