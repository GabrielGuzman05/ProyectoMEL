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
public class Animacion implements Serializable {
	public Animacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORM.ORMConstants.KEY_ANIMACION_ESTUDIOIDESTUDIO) {
			return ORM_estudioidEstudio;
		}
		else if (key == ORM.ORMConstants.KEY_ANIMACION_GENEROIDGENERO) {
			return ORM_generoidGenero;
		}
		else if (key == ORM.ORMConstants.KEY_ANIMACION_ENTRADALISTA) {
			return ORM_entradaLista;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORM.ORMConstants.KEY_ANIMACION_TEMPORADAIDTEMPORADA) {
			this.temporadaidTemporada = (ORM.Temporada) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_ANIMACION_TIPOEMISIONIDTIPOEMISION) {
			this.tipoEmisionidTipoEmision = (ORM.TipoEmision) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_ANIMACION_RATINGIDRATING) {
			this.ratingidRating = (ORM.Rating) owner;
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
	
	private String MALCode;
	
	private int estadoUsuarioidEstadoUsuario;
	
	private ORM.Temporada temporadaidTemporada;
	
	private ORM.TipoEmision tipoEmisionidTipoEmision;
	
	private ORM.Rating ratingidRating;
	
	private java.util.Set ORM_estudioidEstudio = new java.util.HashSet();
	
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
	
	public void setMALCode(String value) {
		this.MALCode = value;
	}
	
	public String getMALCode() {
		return MALCode;
	}
	
	public void setEstadoUsuarioidEstadoUsuario(int value) {
		this.estadoUsuarioidEstadoUsuario = value;
	}
	
	public int getEstadoUsuarioidEstadoUsuario() {
		return estadoUsuarioidEstadoUsuario;
	}
	
	private void setORM_EstudioidEstudio(java.util.Set value) {
		this.ORM_estudioidEstudio = value;
	}
	
	private java.util.Set getORM_EstudioidEstudio() {
		return ORM_estudioidEstudio;
	}
	
	public final ORM.EstudioSetCollection estudioidEstudio = new ORM.EstudioSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_ANIMACION_ESTUDIOIDESTUDIO, ORM.ORMConstants.KEY_ESTUDIO_ANIMACIONIDANIMACION, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_GeneroidGenero(java.util.Set value) {
		this.ORM_generoidGenero = value;
	}
	
	private java.util.Set getORM_GeneroidGenero() {
		return ORM_generoidGenero;
	}
	
	public final ORM.GeneroSetCollection generoidGenero = new ORM.GeneroSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_ANIMACION_GENEROIDGENERO, ORM.ORMConstants.KEY_GENERO_ANIMACIONIDANIMACION, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTemporadaidTemporada(ORM.Temporada value) {
		if (temporadaidTemporada != null) {
			temporadaidTemporada.animacion.remove(this);
		}
		if (value != null) {
			value.animacion.add(this);
		}
	}
	
	public ORM.Temporada getTemporadaidTemporada() {
		return temporadaidTemporada;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TemporadaidTemporada(ORM.Temporada value) {
		this.temporadaidTemporada = value;
	}
	
	private ORM.Temporada getORM_TemporadaidTemporada() {
		return temporadaidTemporada;
	}
	
	public void setTipoEmisionidTipoEmision(ORM.TipoEmision value) {
		if (tipoEmisionidTipoEmision != null) {
			tipoEmisionidTipoEmision.animacion.remove(this);
		}
		if (value != null) {
			value.animacion.add(this);
		}
	}
	
	public ORM.TipoEmision getTipoEmisionidTipoEmision() {
		return tipoEmisionidTipoEmision;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TipoEmisionidTipoEmision(ORM.TipoEmision value) {
		this.tipoEmisionidTipoEmision = value;
	}
	
	private ORM.TipoEmision getORM_TipoEmisionidTipoEmision() {
		return tipoEmisionidTipoEmision;
	}
	
	public void setRatingidRating(ORM.Rating value) {
		if (ratingidRating != null) {
			ratingidRating.animacion.remove(this);
		}
		if (value != null) {
			value.animacion.add(this);
		}
	}
	
	public ORM.Rating getRatingidRating() {
		return ratingidRating;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RatingidRating(ORM.Rating value) {
		this.ratingidRating = value;
	}
	
	private ORM.Rating getORM_RatingidRating() {
		return ratingidRating;
	}
	
	private void setORM_EntradaLista(java.util.Set value) {
		this.ORM_entradaLista = value;
	}
	
	private java.util.Set getORM_EntradaLista() {
		return ORM_entradaLista;
	}
	
	public final ORM.EntradaListaSetCollection entradaLista = new ORM.EntradaListaSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_ANIMACION_ENTRADALISTA, ORM.ORMConstants.KEY_ENTRADALISTA_ANIMACIONIDANIMACION, ORM.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAnimacion());
	}
	
}
