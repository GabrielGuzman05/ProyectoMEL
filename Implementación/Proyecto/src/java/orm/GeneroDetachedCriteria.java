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

public class GeneroDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idGenero;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final CollectionExpression novelaidNovela;
	public final CollectionExpression animacionidAnimacion;
	public final CollectionExpression mangaidManga;
	public final CollectionExpression serieGenericaidSerie;
	
	public GeneroDetachedCriteria() {
		super(ORM.Genero.class, ORM.GeneroCriteria.class);
		idGenero = new IntegerExpression("idGenero", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		novelaidNovela = new CollectionExpression("ORM_NovelaidNovela", this.getDetachedCriteria());
		animacionidAnimacion = new CollectionExpression("ORM_AnimacionidAnimacion", this.getDetachedCriteria());
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this.getDetachedCriteria());
		serieGenericaidSerie = new CollectionExpression("ORM_SerieGenericaidSerie", this.getDetachedCriteria());
	}
	
	public GeneroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.GeneroCriteria.class);
		idGenero = new IntegerExpression("idGenero", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		novelaidNovela = new CollectionExpression("ORM_NovelaidNovela", this.getDetachedCriteria());
		animacionidAnimacion = new CollectionExpression("ORM_AnimacionidAnimacion", this.getDetachedCriteria());
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this.getDetachedCriteria());
		serieGenericaidSerie = new CollectionExpression("ORM_SerieGenericaidSerie", this.getDetachedCriteria());
	}
	
	public ORM.NovelaDetachedCriteria createNovelaidNovelaCriteria() {
		return new ORM.NovelaDetachedCriteria(createCriteria("ORM_NovelaidNovela"));
	}
	
	public ORM.AnimacionDetachedCriteria createAnimacionidAnimacionCriteria() {
		return new ORM.AnimacionDetachedCriteria(createCriteria("ORM_AnimacionidAnimacion"));
	}
	
	public ORM.MangaDetachedCriteria createMangaidMangaCriteria() {
		return new ORM.MangaDetachedCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public ORM.SerieGenericaDetachedCriteria createSerieGenericaidSerieCriteria() {
		return new ORM.SerieGenericaDetachedCriteria(createCriteria("ORM_SerieGenericaidSerie"));
	}
	
	public Genero uniqueGenero(PersistentSession session) {
		return (Genero) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Genero[] listGenero(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Genero[]) list.toArray(new Genero[list.size()]);
	}
}

