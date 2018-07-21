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
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.NovelaCriteria createNovelaidNovelaCriteria() {
		return new orm.NovelaCriteria(createCriteria("ORM_NovelaidNovela"));
	}
	
	public orm.AnimacionCriteria createAnimacionidAnimacionCriteria() {
		return new orm.AnimacionCriteria(createCriteria("ORM_AnimacionidAnimacion"));
	}
	
	public orm.MangaCriteria createMangaidMangaCriteria() {
		return new orm.MangaCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public orm.SerieGenericaCriteria createSerieGenericaidSerieCriteria() {
		return new orm.SerieGenericaCriteria(createCriteria("ORM_SerieGenericaidSerie"));
	}
	
	public Genero uniqueGenero() {
		return (Genero) super.uniqueResult();
	}
	
	public Genero[] listGenero() {
		java.util.List list = super.list();
		return (Genero[]) list.toArray(new Genero[list.size()]);
	}
}

