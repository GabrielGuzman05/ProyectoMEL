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

public class MangaCriteria extends AbstractORMCriteria {
	public final IntegerExpression estadoUsuarioidEstadoUsuario;
	public final IntegerExpression idManga;
	public final StringExpression nombreManga;
	public final StringExpression nombreAlternativo;
	public final ByteExpression completamenteScanlated;
	public final ByteExpression tieneAnimacion;
	public final StringExpression año;
	public final ByteExpression licenciado;
	public final StringExpression bakaUpdatesCode;
	public final StringExpression estadoEnPaisDeOrigen;
	public final StringExpression animeStartEnd;
	public final IntegerExpression tipoMangaidTipoMangaId;
	public final AssociationExpression tipoMangaidTipoManga;
	public final CollectionExpression generoidGenero;
	public final CollectionExpression autoridAutor;
	public final CollectionExpression tagidTag;
	public final CollectionExpression aristaidArtista;
	public final CollectionExpression entradaLista;
	
	public MangaCriteria(Criteria criteria) {
		super(criteria);
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this);
		idManga = new IntegerExpression("idManga", this);
		nombreManga = new StringExpression("nombreManga", this);
		nombreAlternativo = new StringExpression("nombreAlternativo", this);
		completamenteScanlated = new ByteExpression("completamenteScanlated", this);
		tieneAnimacion = new ByteExpression("tieneAnimacion", this);
		año = new StringExpression("año", this);
		licenciado = new ByteExpression("licenciado", this);
		bakaUpdatesCode = new StringExpression("bakaUpdatesCode", this);
		estadoEnPaisDeOrigen = new StringExpression("estadoEnPaisDeOrigen", this);
		animeStartEnd = new StringExpression("animeStartEnd", this);
		tipoMangaidTipoMangaId = new IntegerExpression("tipoMangaidTipoManga.idTipoManga", this);
		tipoMangaidTipoManga = new AssociationExpression("tipoMangaidTipoManga", this);
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this);
		autoridAutor = new CollectionExpression("ORM_AutoridAutor", this);
		tagidTag = new CollectionExpression("ORM_TagidTag", this);
		aristaidArtista = new CollectionExpression("ORM_AristaidArtista", this);
		entradaLista = new CollectionExpression("ORM_EntradaLista", this);
	}
	
	public MangaCriteria(PersistentSession session) {
		this(session.createCriteria(Manga.class));
	}
	
	public MangaCriteria() throws PersistentException {
		this(ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public TipoMangaCriteria createTipoMangaidTipoMangaCriteria() {
		return new TipoMangaCriteria(createCriteria("tipoMangaidTipoManga"));
	}
	
	public ORM.GeneroCriteria createGeneroidGeneroCriteria() {
		return new ORM.GeneroCriteria(createCriteria("ORM_GeneroidGenero"));
	}
	
	public ORM.AutorCriteria createAutoridAutorCriteria() {
		return new ORM.AutorCriteria(createCriteria("ORM_AutoridAutor"));
	}
	
	public ORM.TagCriteria createTagidTagCriteria() {
		return new ORM.TagCriteria(createCriteria("ORM_TagidTag"));
	}
	
	public ORM.ArtistaCriteria createAristaidArtistaCriteria() {
		return new ORM.ArtistaCriteria(createCriteria("ORM_AristaidArtista"));
	}
	
	public ORM.EntradaListaCriteria createEntradaListaCriteria() {
		return new ORM.EntradaListaCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public Manga uniqueManga() {
		return (Manga) super.uniqueResult();
	}
	
	public Manga[] listManga() {
		java.util.List list = super.list();
		return (Manga[]) list.toArray(new Manga[list.size()]);
	}
}

