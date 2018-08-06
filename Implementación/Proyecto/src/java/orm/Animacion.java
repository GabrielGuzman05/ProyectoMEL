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

public class Animacion {
	public Animacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ANIMACION_GENEROIDGENERO) {
			return ORM_generoidGenero;
		}
		else if (key == ORMConstants.KEY_ANIMACION_ENTRADALISTA) {
			return ORM_entradaLista;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ANIMACION_TEMPORADAIDTEMPORADA) {
			this.temporadaidTemporada = (orm.Temporada) owner;
		}
		
		else if (key == ORMConstants.KEY_ANIMACION_TIPOEMISIONIDTIPOEMISION) {
			this.tipoEmisionidTipoEmision = (orm.TipoEmision) owner;
		}
		
		else if (key == ORMConstants.KEY_ANIMACION_RATINGIDRATING) {
			this.ratingidRating = (orm.Rating) owner;
		}
		
		else if (key == ORMConstants.KEY_ANIMACION_ESTUDIOIDESTUDIO) {
			this.estudioidEstudio = (orm.Estudio) owner;
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
	
	private int idAnimacion;
	
	private String nombre;
	
	private String nombreAlternativo;
	
	private String fuente;
	
	private Byte enEmision;
	
	private Integer episodios;
	
	private orm.Temporada temporadaidTemporada;
	
	private orm.TipoEmision tipoEmisionidTipoEmision;
	
	private orm.Rating ratingidRating;
	
	private orm.Estudio estudioidEstudio;
	
	private java.util.Set ORM_generoidGenero = new java.util.HashSet();
	
	private java.util.Set ORM_entradaLista = new java.util.HashSet();
	
	private void setIdAnimacion(int value) {
		this.idAnimacion = value;
	}
	
	public int getIdAnimacion() {
		return idAnimacion;
	}
	
	public int getORMID() {
		return getIdAnimacion();
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
	
	public void setFuente(String value) {
		this.fuente = value;
	}
	
	public String getFuente() {
		return fuente;
	}
	
	public void setEnEmision(byte value) {
		setEnEmision(new Byte(value));
	}
	
	public void setEnEmision(Byte value) {
		this.enEmision = value;
	}
	
	public Byte getEnEmision() {
		return enEmision;
	}
	
	public void setEpisodios(int value) {
		setEpisodios(new Integer(value));
	}
	
	public void setEpisodios(Integer value) {
		this.episodios = value;
	}
	
	public Integer getEpisodios() {
		return episodios;
	}
	
	private void setORM_GeneroidGenero(java.util.Set value) {
		this.ORM_generoidGenero = value;
	}
	
	private java.util.Set getORM_GeneroidGenero() {
		return ORM_generoidGenero;
	}
	
	public final orm.GeneroSetCollection generoidGenero = new orm.GeneroSetCollection(this, _ormAdapter, ORMConstants.KEY_ANIMACION_GENEROIDGENERO, ORMConstants.KEY_GENERO_ANIMACIONIDANIMACION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTemporadaidTemporada(orm.Temporada value) {
		if (temporadaidTemporada != null) {
			temporadaidTemporada.animacion.remove(this);
		}
		if (value != null) {
			value.animacion.add(this);
		}
	}
	
	public orm.Temporada getTemporadaidTemporada() {
		return temporadaidTemporada;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TemporadaidTemporada(orm.Temporada value) {
		this.temporadaidTemporada = value;
	}
	
	private orm.Temporada getORM_TemporadaidTemporada() {
		return temporadaidTemporada;
	}
	
	public void setTipoEmisionidTipoEmision(orm.TipoEmision value) {
		if (tipoEmisionidTipoEmision != null) {
			tipoEmisionidTipoEmision.animacion.remove(this);
		}
		if (value != null) {
			value.animacion.add(this);
		}
	}
	
	public orm.TipoEmision getTipoEmisionidTipoEmision() {
		return tipoEmisionidTipoEmision;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TipoEmisionidTipoEmision(orm.TipoEmision value) {
		this.tipoEmisionidTipoEmision = value;
	}
	
	private orm.TipoEmision getORM_TipoEmisionidTipoEmision() {
		return tipoEmisionidTipoEmision;
	}
	
	public void setRatingidRating(orm.Rating value) {
		if (ratingidRating != null) {
			ratingidRating.animacion.remove(this);
		}
		if (value != null) {
			value.animacion.add(this);
		}
	}
	
	public orm.Rating getRatingidRating() {
		return ratingidRating;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RatingidRating(orm.Rating value) {
		this.ratingidRating = value;
	}
	
	private orm.Rating getORM_RatingidRating() {
		return ratingidRating;
	}
	
	public void setEstudioidEstudio(orm.Estudio value) {
		if (estudioidEstudio != null) {
			estudioidEstudio.animacion.remove(this);
		}
		if (value != null) {
			value.animacion.add(this);
		}
	}
	
	public orm.Estudio getEstudioidEstudio() {
		return estudioidEstudio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EstudioidEstudio(orm.Estudio value) {
		this.estudioidEstudio = value;
	}
	
	private orm.Estudio getORM_EstudioidEstudio() {
		return estudioidEstudio;
	}
	
	private void setORM_EntradaLista(java.util.Set value) {
		this.ORM_entradaLista = value;
	}
	
	private java.util.Set getORM_EntradaLista() {
		return ORM_entradaLista;
	}
	
	public final orm.EntradaListaSetCollection entradaLista = new orm.EntradaListaSetCollection(this, _ormAdapter, ORMConstants.KEY_ANIMACION_ENTRADALISTA, ORMConstants.KEY_ENTRADALISTA_ANIMACIONIDANIMACION, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAnimacion());
	}
	
}
