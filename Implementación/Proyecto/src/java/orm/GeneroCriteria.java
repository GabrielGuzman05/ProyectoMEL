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

public class GeneroCriteria extends AbstractORMCriteria {
	public final IntegerExpression idGenero;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final CollectionExpression novelaidNovela;
	public final CollectionExpression animacionidAnimacion;
	public final CollectionExpression mangaidManga;
	public final CollectionExpression serieGenericaidSerie;
	
	public GeneroCriteria(Criteria criteria) {
		super(criteria);
		idGenero = new IntegerExpression("idGenero", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		novelaidNovela = new CollectionExpression("ORM_NovelaidNovela", this);
		animacionidAnimacion = new CollectionExpression("ORM_AnimacionidAnimacion", this);
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this);
		serieGenericaidSerie = new CollectionExpression("ORM_SerieGenericaidSerie", this);
	}
	
	public GeneroCriteria(PersistentSession session) {
		this(session.createCriteria(Genero.class));
	}
	
	public GeneroCriteria() throws PersistentException {
		this(ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public ORM.NovelaCriteria createNovelaidNovelaCriteria() {
		return new ORM.NovelaCriteria(createCriteria("ORM_NovelaidNovela"));
	}
	
	public ORM.AnimacionCriteria createAnimacionidAnimacionCriteria() {
		return new ORM.AnimacionCriteria(createCriteria("ORM_AnimacionidAnimacion"));
	}
	
	public ORM.MangaCriteria createMangaidMangaCriteria() {
		return new ORM.MangaCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public ORM.SerieGenericaCriteria createSerieGenericaidSerieCriteria() {
		return new ORM.SerieGenericaCriteria(createCriteria("ORM_SerieGenericaidSerie"));
	}
	
	public Genero uniqueGenero() {
		return (Genero) super.uniqueResult();
	}
	
	public Genero[] listGenero() {
		java.util.List list = super.list();
		return (Genero[]) list.toArray(new Genero[list.size()]);
	}
}

