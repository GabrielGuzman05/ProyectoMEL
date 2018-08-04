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

import java.io.Serializable;
public class Manga implements Serializable {
	public Manga() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORM.ORMConstants.KEY_MANGA_GENEROIDGENERO) {
			return ORM_generoidGenero;
		}
		else if (key == ORM.ORMConstants.KEY_MANGA_AUTORIDAUTOR) {
			return ORM_autoridAutor;
		}
		else if (key == ORM.ORMConstants.KEY_MANGA_TAGIDTAG) {
			return ORM_tagidTag;
		}
		else if (key == ORM.ORMConstants.KEY_MANGA_ARISTAIDARTISTA) {
			return ORM_aristaidArtista;
		}
		else if (key == ORM.ORMConstants.KEY_MANGA_ENTRADALISTA) {
			return ORM_entradaLista;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORM.ORMConstants.KEY_MANGA_TIPOMANGAIDTIPOMANGA) {
			this.tipoMangaidTipoManga = (ORM.TipoManga) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int estadoUsuarioidEstadoUsuario;
	
	private int idManga;
	
	private String nombreManga;
	
	private String nombreAlternativo;
	
	private Byte completamenteScanlated;
	
	private Byte tieneAnimacion;
	
	private String año;
	
	private byte licenciado;
	
	private String bakaUpdatesCode;
	
	private String estadoEnPaisDeOrigen;
	
	private String animeStartEnd;
	
	private ORM.TipoManga tipoMangaidTipoManga;
	
	private java.util.Set ORM_generoidGenero = new java.util.HashSet();
	
	private java.util.Set ORM_autoridAutor = new java.util.HashSet();
	
	private java.util.Set ORM_tagidTag = new java.util.HashSet();
	
	private java.util.Set ORM_aristaidArtista = new java.util.HashSet();
	
	private java.util.Set ORM_entradaLista = new java.util.HashSet();
	
	public void setEstadoUsuarioidEstadoUsuario(int value) {
		this.estadoUsuarioidEstadoUsuario = value;
	}
	
	public int getEstadoUsuarioidEstadoUsuario() {
		return estadoUsuarioidEstadoUsuario;
	}
	
	private void setIdManga(int value) {
		this.idManga = value;
	}
	
	public int getIdManga() {
		return idManga;
	}
	
	public int getORMID() {
		return getIdManga();
	}
	
	public void setNombreManga(String value) {
		this.nombreManga = value;
	}
	
	public String getNombreManga() {
		return nombreManga;
	}
	
	public void setNombreAlternativo(String value) {
		this.nombreAlternativo = value;
	}
	
	public String getNombreAlternativo() {
		return nombreAlternativo;
	}
	
	public void setCompletamenteScanlated(byte value) {
		setCompletamenteScanlated(new Byte(value));
	}
	
	public void setCompletamenteScanlated(Byte value) {
		this.completamenteScanlated = value;
	}
	
	public Byte getCompletamenteScanlated() {
		return completamenteScanlated;
	}
	
	public void setTieneAnimacion(byte value) {
		setTieneAnimacion(new Byte(value));
	}
	
	public void setTieneAnimacion(Byte value) {
		this.tieneAnimacion = value;
	}
	
	public Byte getTieneAnimacion() {
		return tieneAnimacion;
	}
	
	public void setAño(String value) {
		this.año = value;
	}
	
	public String getAño() {
		return año;
	}
	
	public void setLicenciado(byte value) {
		this.licenciado = value;
	}
	
	public byte getLicenciado() {
		return licenciado;
	}
	
	public void setBakaUpdatesCode(String value) {
		this.bakaUpdatesCode = value;
	}
	
	public String getBakaUpdatesCode() {
		return bakaUpdatesCode;
	}
	
	public void setEstadoEnPaisDeOrigen(String value) {
		this.estadoEnPaisDeOrigen = value;
	}
	
	public String getEstadoEnPaisDeOrigen() {
		return estadoEnPaisDeOrigen;
	}
	
	public void setAnimeStartEnd(String value) {
		this.animeStartEnd = value;
	}
	
	public String getAnimeStartEnd() {
		return animeStartEnd;
	}
	
	private void setORM_GeneroidGenero(java.util.Set value) {
		this.ORM_generoidGenero = value;
	}
	
	private java.util.Set getORM_GeneroidGenero() {
		return ORM_generoidGenero;
	}
	
	public final ORM.GeneroSetCollection generoidGenero = new ORM.GeneroSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_MANGA_GENEROIDGENERO, ORM.ORMConstants.KEY_GENERO_MANGAIDMANGA, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_AutoridAutor(java.util.Set value) {
		this.ORM_autoridAutor = value;
	}
	
	private java.util.Set getORM_AutoridAutor() {
		return ORM_autoridAutor;
	}
	
	public final ORM.AutorSetCollection autoridAutor = new ORM.AutorSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_MANGA_AUTORIDAUTOR, ORM.ORMConstants.KEY_AUTOR_MANGAIDMANGA, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_TagidTag(java.util.Set value) {
		this.ORM_tagidTag = value;
	}
	
	private java.util.Set getORM_TagidTag() {
		return ORM_tagidTag;
	}
	
	public final ORM.TagSetCollection tagidTag = new ORM.TagSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_MANGA_TAGIDTAG, ORM.ORMConstants.KEY_TAG_MANGAIDMANGA, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_AristaidArtista(java.util.Set value) {
		this.ORM_aristaidArtista = value;
	}
	
	private java.util.Set getORM_AristaidArtista() {
		return ORM_aristaidArtista;
	}
	
	public final ORM.ArtistaSetCollection aristaidArtista = new ORM.ArtistaSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_MANGA_ARISTAIDARTISTA, ORM.ORMConstants.KEY_ARTISTA_MANGAIDMANGA, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTipoMangaidTipoManga(ORM.TipoManga value) {
		if (tipoMangaidTipoManga != null) {
			tipoMangaidTipoManga.manga.remove(this);
		}
		if (value != null) {
			value.manga.add(this);
		}
	}
	
	public ORM.TipoManga getTipoMangaidTipoManga() {
		return tipoMangaidTipoManga;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TipoMangaidTipoManga(ORM.TipoManga value) {
		this.tipoMangaidTipoManga = value;
	}
	
	private ORM.TipoManga getORM_TipoMangaidTipoManga() {
		return tipoMangaidTipoManga;
	}
	
	private void setORM_EntradaLista(java.util.Set value) {
		this.ORM_entradaLista = value;
	}
	
	private java.util.Set getORM_EntradaLista() {
		return ORM_entradaLista;
	}
	
	public final ORM.EntradaListaSetCollection entradaLista = new ORM.EntradaListaSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_MANGA_ENTRADALISTA, ORM.ORMConstants.KEY_ENTRADALISTA_MANGAIDMANGA, ORM.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdManga());
	}
	
}
