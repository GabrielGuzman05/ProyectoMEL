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

public class MangaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public MangaDetachedCriteria() {
		super(ORM.Manga.class, ORM.MangaCriteria.class);
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this.getDetachedCriteria());
		idManga = new IntegerExpression("idManga", this.getDetachedCriteria());
		nombreManga = new StringExpression("nombreManga", this.getDetachedCriteria());
		nombreAlternativo = new StringExpression("nombreAlternativo", this.getDetachedCriteria());
		completamenteScanlated = new ByteExpression("completamenteScanlated", this.getDetachedCriteria());
		tieneAnimacion = new ByteExpression("tieneAnimacion", this.getDetachedCriteria());
		año = new StringExpression("año", this.getDetachedCriteria());
		licenciado = new ByteExpression("licenciado", this.getDetachedCriteria());
		bakaUpdatesCode = new StringExpression("bakaUpdatesCode", this.getDetachedCriteria());
		estadoEnPaisDeOrigen = new StringExpression("estadoEnPaisDeOrigen", this.getDetachedCriteria());
		animeStartEnd = new StringExpression("animeStartEnd", this.getDetachedCriteria());
		tipoMangaidTipoMangaId = new IntegerExpression("tipoMangaidTipoManga.idTipoManga", this.getDetachedCriteria());
		tipoMangaidTipoManga = new AssociationExpression("tipoMangaidTipoManga", this.getDetachedCriteria());
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this.getDetachedCriteria());
		autoridAutor = new CollectionExpression("ORM_AutoridAutor", this.getDetachedCriteria());
		tagidTag = new CollectionExpression("ORM_TagidTag", this.getDetachedCriteria());
		aristaidArtista = new CollectionExpression("ORM_AristaidArtista", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public MangaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.MangaCriteria.class);
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this.getDetachedCriteria());
		idManga = new IntegerExpression("idManga", this.getDetachedCriteria());
		nombreManga = new StringExpression("nombreManga", this.getDetachedCriteria());
		nombreAlternativo = new StringExpression("nombreAlternativo", this.getDetachedCriteria());
		completamenteScanlated = new ByteExpression("completamenteScanlated", this.getDetachedCriteria());
		tieneAnimacion = new ByteExpression("tieneAnimacion", this.getDetachedCriteria());
		año = new StringExpression("año", this.getDetachedCriteria());
		licenciado = new ByteExpression("licenciado", this.getDetachedCriteria());
		bakaUpdatesCode = new StringExpression("bakaUpdatesCode", this.getDetachedCriteria());
		estadoEnPaisDeOrigen = new StringExpression("estadoEnPaisDeOrigen", this.getDetachedCriteria());
		animeStartEnd = new StringExpression("animeStartEnd", this.getDetachedCriteria());
		tipoMangaidTipoMangaId = new IntegerExpression("tipoMangaidTipoManga.idTipoManga", this.getDetachedCriteria());
		tipoMangaidTipoManga = new AssociationExpression("tipoMangaidTipoManga", this.getDetachedCriteria());
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this.getDetachedCriteria());
		autoridAutor = new CollectionExpression("ORM_AutoridAutor", this.getDetachedCriteria());
		tagidTag = new CollectionExpression("ORM_TagidTag", this.getDetachedCriteria());
		aristaidArtista = new CollectionExpression("ORM_AristaidArtista", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public TipoMangaDetachedCriteria createTipoMangaidTipoMangaCriteria() {
		return new TipoMangaDetachedCriteria(createCriteria("tipoMangaidTipoManga"));
	}
	
	public ORM.GeneroDetachedCriteria createGeneroidGeneroCriteria() {
		return new ORM.GeneroDetachedCriteria(createCriteria("ORM_GeneroidGenero"));
	}
	
	public ORM.AutorDetachedCriteria createAutoridAutorCriteria() {
		return new ORM.AutorDetachedCriteria(createCriteria("ORM_AutoridAutor"));
	}
	
	public ORM.TagDetachedCriteria createTagidTagCriteria() {
		return new ORM.TagDetachedCriteria(createCriteria("ORM_TagidTag"));
	}
	
	public ORM.ArtistaDetachedCriteria createAristaidArtistaCriteria() {
		return new ORM.ArtistaDetachedCriteria(createCriteria("ORM_AristaidArtista"));
	}
	
	public ORM.EntradaListaDetachedCriteria createEntradaListaCriteria() {
		return new ORM.EntradaListaDetachedCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public Manga uniqueManga(PersistentSession session) {
		return (Manga) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Manga[] listManga(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Manga[]) list.toArray(new Manga[list.size()]);
	}
}

