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
public class Novela implements Serializable {
	public Novela() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORM.ORMConstants.KEY_NOVELA_GENEROIDGENERO) {
			return ORM_generoidGenero;
		}
		else if (key == ORM.ORMConstants.KEY_NOVELA_TAGIDTAG) {
			return ORM_tagidTag;
		}
		else if (key == ORM.ORMConstants.KEY_NOVELA_ENTRADALISTA) {
			return ORM_entradaLista;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORM.ORMConstants.KEY_NOVELA_PUBLICADORORIGINALIDPUBLICADORORIGINAL) {
			this.publicadorOriginalidPublicadorOriginal = (ORM.PublicadorOriginal) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_NOVELA_AUTORIDAUTOR) {
			this.autoridAutor = (ORM.Autor) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_NOVELA_PUBLICADORINGLESIDPUBLICADORINGLES) {
			this.publicadorInglesidPublicadorIngles = (ORM.PublicadorIngles) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_NOVELA_TIPOIDTIPO) {
			this.tipoidTipo = (ORM.Tipo) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_NOVELA_LENGUAJEORIGINALIDLENGUAJE) {
			this.lenguajeOriginalidLenguaje = (ORM.LenguajeOriginal) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_NOVELA_ARTISTAIDARTISTA) {
			this.artistaidArtista = (ORM.Artista) owner;
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
	
	private int idNovela;
	
	private String nombre;
	
	private String nombreAlternativo;
	
	private String año;
	
	private Byte licenciado;
	
	private Byte completamenteTraducido;
	
	private String novelUpdateUrl;
	
	private Integer estrellas;
	
	private ORM.PublicadorOriginal publicadorOriginalidPublicadorOriginal;
	
	private ORM.Autor autoridAutor;
	
	private ORM.PublicadorIngles publicadorInglesidPublicadorIngles;
	
	private ORM.Tipo tipoidTipo;
	
	private int estadoUsuarioidEstadoUsuario;
	
	private ORM.LenguajeOriginal lenguajeOriginalidLenguaje;
	
	private ORM.Artista artistaidArtista;
	
	private java.util.Set ORM_generoidGenero = new java.util.HashSet();
	
	private java.util.Set ORM_tagidTag = new java.util.HashSet();
	
	private java.util.Set ORM_entradaLista = new java.util.HashSet();
	
	private void setIdNovela(int value) {
		this.idNovela = value;
	}
	
	public int getIdNovela() {
		return idNovela;
	}
	
	public int getORMID() {
		return getIdNovela();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombreAlternativo(String value) {
		this.nombreAlternativo = value;
	}
	
	public String getNombreAlternativo() {
		return nombreAlternativo;
	}
	
	public void setAño(String value) {
		this.año = value;
	}
	
	public String getAño() {
		return año;
	}
	
	public void setLicenciado(byte value) {
		setLicenciado(new Byte(value));
	}
	
	public void setLicenciado(Byte value) {
		this.licenciado = value;
	}
	
	public Byte getLicenciado() {
		return licenciado;
	}
	
	public void setCompletamenteTraducido(byte value) {
		setCompletamenteTraducido(new Byte(value));
	}
	
	public void setCompletamenteTraducido(Byte value) {
		this.completamenteTraducido = value;
	}
	
	public Byte getCompletamenteTraducido() {
		return completamenteTraducido;
	}
	
	public void setNovelUpdateUrl(String value) {
		this.novelUpdateUrl = value;
	}
	
	public String getNovelUpdateUrl() {
		return novelUpdateUrl;
	}
	
	public void setEstrellas(int value) {
		setEstrellas(new Integer(value));
	}
	
	public void setEstrellas(Integer value) {
		this.estrellas = value;
	}
	
	public Integer getEstrellas() {
		return estrellas;
	}
	
	public void setEstadoUsuarioidEstadoUsuario(int value) {
		this.estadoUsuarioidEstadoUsuario = value;
	}
	
	public int getEstadoUsuarioidEstadoUsuario() {
		return estadoUsuarioidEstadoUsuario;
	}
	
	private void setORM_GeneroidGenero(java.util.Set value) {
		this.ORM_generoidGenero = value;
	}
	
	private java.util.Set getORM_GeneroidGenero() {
		return ORM_generoidGenero;
	}
	
	public final ORM.GeneroSetCollection generoidGenero = new ORM.GeneroSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_NOVELA_GENEROIDGENERO, ORM.ORMConstants.KEY_GENERO_NOVELAIDNOVELA, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPublicadorOriginalidPublicadorOriginal(ORM.PublicadorOriginal value) {
		if (publicadorOriginalidPublicadorOriginal != null) {
			publicadorOriginalidPublicadorOriginal.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public ORM.PublicadorOriginal getPublicadorOriginalidPublicadorOriginal() {
		return publicadorOriginalidPublicadorOriginal;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_PublicadorOriginalidPublicadorOriginal(ORM.PublicadorOriginal value) {
		this.publicadorOriginalidPublicadorOriginal = value;
	}
	
	private ORM.PublicadorOriginal getORM_PublicadorOriginalidPublicadorOriginal() {
		return publicadorOriginalidPublicadorOriginal;
	}
	
	public void setAutoridAutor(ORM.Autor value) {
		if (autoridAutor != null) {
			autoridAutor.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public ORM.Autor getAutoridAutor() {
		return autoridAutor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_AutoridAutor(ORM.Autor value) {
		this.autoridAutor = value;
	}
	
	private ORM.Autor getORM_AutoridAutor() {
		return autoridAutor;
	}
	
	public void setPublicadorInglesidPublicadorIngles(ORM.PublicadorIngles value) {
		if (publicadorInglesidPublicadorIngles != null) {
			publicadorInglesidPublicadorIngles.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public ORM.PublicadorIngles getPublicadorInglesidPublicadorIngles() {
		return publicadorInglesidPublicadorIngles;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_PublicadorInglesidPublicadorIngles(ORM.PublicadorIngles value) {
		this.publicadorInglesidPublicadorIngles = value;
	}
	
	private ORM.PublicadorIngles getORM_PublicadorInglesidPublicadorIngles() {
		return publicadorInglesidPublicadorIngles;
	}
	
	public void setTipoidTipo(ORM.Tipo value) {
		if (tipoidTipo != null) {
			tipoidTipo.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public ORM.Tipo getTipoidTipo() {
		return tipoidTipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TipoidTipo(ORM.Tipo value) {
		this.tipoidTipo = value;
	}
	
	private ORM.Tipo getORM_TipoidTipo() {
		return tipoidTipo;
	}
	
	public void setLenguajeOriginalidLenguaje(ORM.LenguajeOriginal value) {
		if (lenguajeOriginalidLenguaje != null) {
			lenguajeOriginalidLenguaje.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public ORM.LenguajeOriginal getLenguajeOriginalidLenguaje() {
		return lenguajeOriginalidLenguaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_LenguajeOriginalidLenguaje(ORM.LenguajeOriginal value) {
		this.lenguajeOriginalidLenguaje = value;
	}
	
	private ORM.LenguajeOriginal getORM_LenguajeOriginalidLenguaje() {
		return lenguajeOriginalidLenguaje;
	}
	
	public void setArtistaidArtista(ORM.Artista value) {
		if (artistaidArtista != null) {
			artistaidArtista.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public ORM.Artista getArtistaidArtista() {
		return artistaidArtista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ArtistaidArtista(ORM.Artista value) {
		this.artistaidArtista = value;
	}
	
	private ORM.Artista getORM_ArtistaidArtista() {
		return artistaidArtista;
	}
	
	private void setORM_TagidTag(java.util.Set value) {
		this.ORM_tagidTag = value;
	}
	
	private java.util.Set getORM_TagidTag() {
		return ORM_tagidTag;
	}
	
	public final ORM.TagSetCollection tagidTag = new ORM.TagSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_NOVELA_TAGIDTAG, ORM.ORMConstants.KEY_TAG_NOVELAIDNOVELA, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_EntradaLista(java.util.Set value) {
		this.ORM_entradaLista = value;
	}
	
	private java.util.Set getORM_EntradaLista() {
		return ORM_entradaLista;
	}
	
	public final ORM.EntradaListaSetCollection entradaLista = new ORM.EntradaListaSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_NOVELA_ENTRADALISTA, ORM.ORMConstants.KEY_ENTRADALISTA_NOVELAIDNOVELA, ORM.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdNovela());
	}
	
}
