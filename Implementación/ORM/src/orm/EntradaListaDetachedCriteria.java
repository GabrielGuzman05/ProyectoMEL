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

public class EntradaListaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEntrada;
	public final BooleanExpression alDia;
	public final IntegerExpression ultimoCapitulo;
	public final BooleanExpression terminado;
	public final IntegerExpression tipo;
	public final IntegerExpression listaidListaId;
	public final AssociationExpression listaidLista;
	public final IntegerExpression novelaidNovelaId;
	public final AssociationExpression novelaidNovela;
	public final IntegerExpression mangaidMangaId;
	public final AssociationExpression mangaidManga;
	public final IntegerExpression animacionidAnimacionId;
	public final AssociationExpression animacionidAnimacion;
	public final IntegerExpression serieGenericaidSerieId;
	public final AssociationExpression serieGenericaidSerie;
	
	public EntradaListaDetachedCriteria() {
		super(orm.EntradaLista.class, orm.EntradaListaCriteria.class);
		idEntrada = new IntegerExpression("idEntrada", this.getDetachedCriteria());
		alDia = new BooleanExpression("alDia", this.getDetachedCriteria());
		ultimoCapitulo = new IntegerExpression("ultimoCapitulo", this.getDetachedCriteria());
		terminado = new BooleanExpression("terminado", this.getDetachedCriteria());
		tipo = new IntegerExpression("tipo", this.getDetachedCriteria());
		listaidListaId = new IntegerExpression("listaidLista.idLista", this.getDetachedCriteria());
		listaidLista = new AssociationExpression("listaidLista", this.getDetachedCriteria());
		novelaidNovelaId = new IntegerExpression("novelaidNovela.idNovela", this.getDetachedCriteria());
		novelaidNovela = new AssociationExpression("novelaidNovela", this.getDetachedCriteria());
		mangaidMangaId = new IntegerExpression("mangaidManga.idManga", this.getDetachedCriteria());
		mangaidManga = new AssociationExpression("mangaidManga", this.getDetachedCriteria());
		animacionidAnimacionId = new IntegerExpression("animacionidAnimacion.idAnimacion", this.getDetachedCriteria());
		animacionidAnimacion = new AssociationExpression("animacionidAnimacion", this.getDetachedCriteria());
		serieGenericaidSerieId = new IntegerExpression("serieGenericaidSerie.idSerie", this.getDetachedCriteria());
		serieGenericaidSerie = new AssociationExpression("serieGenericaidSerie", this.getDetachedCriteria());
	}
	
	public EntradaListaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EntradaListaCriteria.class);
		idEntrada = new IntegerExpression("idEntrada", this.getDetachedCriteria());
		alDia = new BooleanExpression("alDia", this.getDetachedCriteria());
		ultimoCapitulo = new IntegerExpression("ultimoCapitulo", this.getDetachedCriteria());
		terminado = new BooleanExpression("terminado", this.getDetachedCriteria());
		tipo = new IntegerExpression("tipo", this.getDetachedCriteria());
		listaidListaId = new IntegerExpression("listaidLista.idLista", this.getDetachedCriteria());
		listaidLista = new AssociationExpression("listaidLista", this.getDetachedCriteria());
		novelaidNovelaId = new IntegerExpression("novelaidNovela.idNovela", this.getDetachedCriteria());
		novelaidNovela = new AssociationExpression("novelaidNovela", this.getDetachedCriteria());
		mangaidMangaId = new IntegerExpression("mangaidManga.idManga", this.getDetachedCriteria());
		mangaidManga = new AssociationExpression("mangaidManga", this.getDetachedCriteria());
		animacionidAnimacionId = new IntegerExpression("animacionidAnimacion.idAnimacion", this.getDetachedCriteria());
		animacionidAnimacion = new AssociationExpression("animacionidAnimacion", this.getDetachedCriteria());
		serieGenericaidSerieId = new IntegerExpression("serieGenericaidSerie.idSerie", this.getDetachedCriteria());
		serieGenericaidSerie = new AssociationExpression("serieGenericaidSerie", this.getDetachedCriteria());
	}
	
	public ListaDetachedCriteria createListaidListaCriteria() {
		return new ListaDetachedCriteria(createCriteria("listaidLista"));
	}
	
	public NovelaDetachedCriteria createNovelaidNovelaCriteria() {
		return new NovelaDetachedCriteria(createCriteria("novelaidNovela"));
	}
	
	public MangaDetachedCriteria createMangaidMangaCriteria() {
		return new MangaDetachedCriteria(createCriteria("mangaidManga"));
	}
	
	public AnimacionDetachedCriteria createAnimacionidAnimacionCriteria() {
		return new AnimacionDetachedCriteria(createCriteria("animacionidAnimacion"));
	}
	
	public SerieGenericaDetachedCriteria createSerieGenericaidSerieCriteria() {
		return new SerieGenericaDetachedCriteria(createCriteria("serieGenericaidSerie"));
	}
	
	public EntradaLista uniqueEntradaLista(PersistentSession session) {
		return (EntradaLista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EntradaLista[] listEntradaLista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EntradaLista[]) list.toArray(new EntradaLista[list.size()]);
	}
}

