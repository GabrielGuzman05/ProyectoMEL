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

public class Novela {
	public Novela() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_NOVELA_GENEROIDGENERO) {
			return ORM_generoidGenero;
		}
		else if (key == orm.ORMConstants.KEY_NOVELA_TAGIDTAG) {
			return ORM_tagidTag;
		}
		else if (key == orm.ORMConstants.KEY_NOVELA_ENTRADALISTA) {
			return ORM_entradaLista;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_NOVELA_PUBLICADORORIGINALIDPUBLICADORORIGINAL) {
			this.publicadorOriginalidPublicadorOriginal = (orm.PublicadorOriginal) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_NOVELA_AUTORIDAUTOR) {
			this.autoridAutor = (orm.Autor) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_NOVELA_PUBLICADORINGLESIDPUBLICADORINGLES) {
			this.publicadorInglesidPublicadorIngles = (orm.PublicadorIngles) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_NOVELA_TIPOIDTIPO) {
			this.tipoidTipo = (orm.Tipo) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_NOVELA_LENGUAJEORIGINALIDLENGUAJE) {
			this.lenguajeOriginalidLenguaje = (orm.LenguajeOriginal) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_NOVELA_ARTISTAIDARTISTA) {
			this.artistaidArtista = (orm.Artista) owner;
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
	
	private orm.PublicadorOriginal publicadorOriginalidPublicadorOriginal;
	
	private orm.Autor autoridAutor;
	
	private orm.PublicadorIngles publicadorInglesidPublicadorIngles;
	
	private orm.Tipo tipoidTipo;
	
	private orm.LenguajeOriginal lenguajeOriginalidLenguaje;
	
	private orm.Artista artistaidArtista;
	
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
	
	private void setORM_GeneroidGenero(java.util.Set value) {
		this.ORM_generoidGenero = value;
	}
	
	private java.util.Set getORM_GeneroidGenero() {
		return ORM_generoidGenero;
	}
	
	public final orm.GeneroSetCollection generoidGenero = new orm.GeneroSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_NOVELA_GENEROIDGENERO, orm.ORMConstants.KEY_GENERO_NOVELAIDNOVELA, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPublicadorOriginalidPublicadorOriginal(orm.PublicadorOriginal value) {
		if (publicadorOriginalidPublicadorOriginal != null) {
			publicadorOriginalidPublicadorOriginal.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public orm.PublicadorOriginal getPublicadorOriginalidPublicadorOriginal() {
		return publicadorOriginalidPublicadorOriginal;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_PublicadorOriginalidPublicadorOriginal(orm.PublicadorOriginal value) {
		this.publicadorOriginalidPublicadorOriginal = value;
	}
	
	private orm.PublicadorOriginal getORM_PublicadorOriginalidPublicadorOriginal() {
		return publicadorOriginalidPublicadorOriginal;
	}
	
	public void setAutoridAutor(orm.Autor value) {
		if (autoridAutor != null) {
			autoridAutor.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public orm.Autor getAutoridAutor() {
		return autoridAutor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_AutoridAutor(orm.Autor value) {
		this.autoridAutor = value;
	}
	
	private orm.Autor getORM_AutoridAutor() {
		return autoridAutor;
	}
	
	public void setPublicadorInglesidPublicadorIngles(orm.PublicadorIngles value) {
		if (publicadorInglesidPublicadorIngles != null) {
			publicadorInglesidPublicadorIngles.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public orm.PublicadorIngles getPublicadorInglesidPublicadorIngles() {
		return publicadorInglesidPublicadorIngles;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_PublicadorInglesidPublicadorIngles(orm.PublicadorIngles value) {
		this.publicadorInglesidPublicadorIngles = value;
	}
	
	private orm.PublicadorIngles getORM_PublicadorInglesidPublicadorIngles() {
		return publicadorInglesidPublicadorIngles;
	}
	
	public void setTipoidTipo(orm.Tipo value) {
		if (tipoidTipo != null) {
			tipoidTipo.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public orm.Tipo getTipoidTipo() {
		return tipoidTipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TipoidTipo(orm.Tipo value) {
		this.tipoidTipo = value;
	}
	
	private orm.Tipo getORM_TipoidTipo() {
		return tipoidTipo;
	}
	
	public void setLenguajeOriginalidLenguaje(orm.LenguajeOriginal value) {
		if (lenguajeOriginalidLenguaje != null) {
			lenguajeOriginalidLenguaje.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public orm.LenguajeOriginal getLenguajeOriginalidLenguaje() {
		return lenguajeOriginalidLenguaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_LenguajeOriginalidLenguaje(orm.LenguajeOriginal value) {
		this.lenguajeOriginalidLenguaje = value;
	}
	
	private orm.LenguajeOriginal getORM_LenguajeOriginalidLenguaje() {
		return lenguajeOriginalidLenguaje;
	}
	
	public void setArtistaidArtista(orm.Artista value) {
		if (artistaidArtista != null) {
			artistaidArtista.novela.remove(this);
		}
		if (value != null) {
			value.novela.add(this);
		}
	}
	
	public orm.Artista getArtistaidArtista() {
		return artistaidArtista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ArtistaidArtista(orm.Artista value) {
		this.artistaidArtista = value;
	}
	
	private orm.Artista getORM_ArtistaidArtista() {
		return artistaidArtista;
	}
	
	private void setORM_TagidTag(java.util.Set value) {
		this.ORM_tagidTag = value;
	}
	
	private java.util.Set getORM_TagidTag() {
		return ORM_tagidTag;
	}
	
	public final orm.TagSetCollection tagidTag = new orm.TagSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_NOVELA_TAGIDTAG, orm.ORMConstants.KEY_TAG_NOVELAIDNOVELA, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_EntradaLista(java.util.Set value) {
		this.ORM_entradaLista = value;
	}
	
	private java.util.Set getORM_EntradaLista() {
		return ORM_entradaLista;
	}
	
	public final orm.EntradaListaSetCollection entradaLista = new orm.EntradaListaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_NOVELA_ENTRADALISTA, orm.ORMConstants.KEY_ENTRADALISTA_NOVELAIDNOVELA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdNovela());
	}
	
}
