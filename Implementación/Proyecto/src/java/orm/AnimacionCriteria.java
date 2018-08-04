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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AnimacionCriteria extends AbstractORMCriteria {
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
	
	public AnimacionCriteria(Criteria criteria) {
		super(criteria);
		idAnimacion = new IntegerExpression("idAnimacion", this);
		nombre = new StringExpression("nombre", this);
		nombreAlternativo = new StringExpression("nombreAlternativo", this);
		fuente = new StringExpression("fuente", this);
		enEmision = new ByteExpression("enEmision", this);
		episodios = new IntegerExpression("episodios", this);
		MALCode = new StringExpression("MALCode", this);
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this);
		temporadaidTemporadaId = new IntegerExpression("temporadaidTemporada.idTemporada", this);
		temporadaidTemporada = new AssociationExpression("temporadaidTemporada", this);
		tipoEmisionidTipoEmisionId = new IntegerExpression("tipoEmisionidTipoEmision.idTipoEmision", this);
		tipoEmisionidTipoEmision = new AssociationExpression("tipoEmisionidTipoEmision", this);
		ratingidRatingId = new IntegerExpression("ratingidRating.idRating", this);
		ratingidRating = new AssociationExpression("ratingidRating", this);
		estudioidEstudio = new CollectionExpression("ORM_EstudioidEstudio", this);
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this);
		entradaLista = new CollectionExpression("ORM_EntradaLista", this);
	}
	
	public AnimacionCriteria(PersistentSession session) {
		this(session.createCriteria(Animacion.class));
	}
	
	public AnimacionCriteria() throws PersistentException {
		this(ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public TemporadaCriteria createTemporadaidTemporadaCriteria() {
		return new TemporadaCriteria(createCriteria("temporadaidTemporada"));
	}
	
	public TipoEmisionCriteria createTipoEmisionidTipoEmisionCriteria() {
		return new TipoEmisionCriteria(createCriteria("tipoEmisionidTipoEmision"));
	}
	
	public RatingCriteria createRatingidRatingCriteria() {
		return new RatingCriteria(createCriteria("ratingidRating"));
	}
	
	public ORM.EstudioCriteria createEstudioidEstudioCriteria() {
		return new ORM.EstudioCriteria(createCriteria("ORM_EstudioidEstudio"));
	}
	
	public ORM.GeneroCriteria createGeneroidGeneroCriteria() {
		return new ORM.GeneroCriteria(createCriteria("ORM_GeneroidGenero"));
	}
	
	public ORM.EntradaListaCriteria createEntradaListaCriteria() {
		return new ORM.EntradaListaCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public Animacion uniqueAnimacion() {
		return (Animacion) super.uniqueResult();
	}
	
	public Animacion[] listAnimacion() {
		java.util.List list = super.list();
		return (Animacion[]) list.toArray(new Animacion[list.size()]);
	}
}

