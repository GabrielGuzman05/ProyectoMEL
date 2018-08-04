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

public class EntradaListaCriteria extends AbstractORMCriteria {
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
	
	public EntradaListaCriteria(Criteria criteria) {
		super(criteria);
		idEntrada = new IntegerExpression("idEntrada", this);
		alDia = new BooleanExpression("alDia", this);
		ultimoCapitulo = new IntegerExpression("ultimoCapitulo", this);
		terminado = new BooleanExpression("terminado", this);
		tipo = new IntegerExpression("tipo", this);
		listaidListaId = new IntegerExpression("listaidLista.idLista", this);
		listaidLista = new AssociationExpression("listaidLista", this);
		novelaidNovelaId = new IntegerExpression("novelaidNovela.idNovela", this);
		novelaidNovela = new AssociationExpression("novelaidNovela", this);
		mangaidMangaId = new IntegerExpression("mangaidManga.idManga", this);
		mangaidManga = new AssociationExpression("mangaidManga", this);
		animacionidAnimacionId = new IntegerExpression("animacionidAnimacion.idAnimacion", this);
		animacionidAnimacion = new AssociationExpression("animacionidAnimacion", this);
		serieGenericaidSerieId = new IntegerExpression("serieGenericaidSerie.idSerie", this);
		serieGenericaidSerie = new AssociationExpression("serieGenericaidSerie", this);
	}
	
	public EntradaListaCriteria(PersistentSession session) {
		this(session.createCriteria(EntradaLista.class));
	}
	
	public EntradaListaCriteria() throws PersistentException {
		this(ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public ListaCriteria createListaidListaCriteria() {
		return new ListaCriteria(createCriteria("listaidLista"));
	}
	
	public NovelaCriteria createNovelaidNovelaCriteria() {
		return new NovelaCriteria(createCriteria("novelaidNovela"));
	}
	
	public MangaCriteria createMangaidMangaCriteria() {
		return new MangaCriteria(createCriteria("mangaidManga"));
	}
	
	public AnimacionCriteria createAnimacionidAnimacionCriteria() {
		return new AnimacionCriteria(createCriteria("animacionidAnimacion"));
	}
	
	public SerieGenericaCriteria createSerieGenericaidSerieCriteria() {
		return new SerieGenericaCriteria(createCriteria("serieGenericaidSerie"));
	}
	
	public EntradaLista uniqueEntradaLista() {
		return (EntradaLista) super.uniqueResult();
	}
	
	public EntradaLista[] listEntradaLista() {
		java.util.List list = super.list();
		return (EntradaLista[]) list.toArray(new EntradaLista[list.size()]);
	}
}

