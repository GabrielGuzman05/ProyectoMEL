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
public class Genero implements Serializable {
	public Genero() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORM.ORMConstants.KEY_GENERO_NOVELAIDNOVELA) {
			return ORM_novelaidNovela;
		}
		else if (key == ORM.ORMConstants.KEY_GENERO_ANIMACIONIDANIMACION) {
			return ORM_animacionidAnimacion;
		}
		else if (key == ORM.ORMConstants.KEY_GENERO_MANGAIDMANGA) {
			return ORM_mangaidManga;
		}
		else if (key == ORM.ORMConstants.KEY_GENERO_SERIEGENERICAIDSERIE) {
			return ORM_serieGenericaidSerie;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idGenero;
	
	private String nombre;
	
	private String descripcion;
	
	private java.util.Set ORM_novelaidNovela = new java.util.HashSet();
	
	private java.util.Set ORM_animacionidAnimacion = new java.util.HashSet();
	
	private java.util.Set ORM_mangaidManga = new java.util.HashSet();
	
	private java.util.Set ORM_serieGenericaidSerie = new java.util.HashSet();
	
	private void setIdGenero(int value) {
		this.idGenero = value;
	}
	
	public int getIdGenero() {
		return idGenero;
	}
	
	public int getORMID() {
		return getIdGenero();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	private void setORM_NovelaidNovela(java.util.Set value) {
		this.ORM_novelaidNovela = value;
	}
	
	private java.util.Set getORM_NovelaidNovela() {
		return ORM_novelaidNovela;
	}
	
	public final ORM.NovelaSetCollection novelaidNovela = new ORM.NovelaSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_GENERO_NOVELAIDNOVELA, ORM.ORMConstants.KEY_NOVELA_GENEROIDGENERO, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_AnimacionidAnimacion(java.util.Set value) {
		this.ORM_animacionidAnimacion = value;
	}
	
	private java.util.Set getORM_AnimacionidAnimacion() {
		return ORM_animacionidAnimacion;
	}
	
	public final ORM.AnimacionSetCollection animacionidAnimacion = new ORM.AnimacionSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_GENERO_ANIMACIONIDANIMACION, ORM.ORMConstants.KEY_ANIMACION_GENEROIDGENERO, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_MangaidManga(java.util.Set value) {
		this.ORM_mangaidManga = value;
	}
	
	private java.util.Set getORM_MangaidManga() {
		return ORM_mangaidManga;
	}
	
	public final ORM.MangaSetCollection mangaidManga = new ORM.MangaSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_GENERO_MANGAIDMANGA, ORM.ORMConstants.KEY_MANGA_GENEROIDGENERO, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_SerieGenericaidSerie(java.util.Set value) {
		this.ORM_serieGenericaidSerie = value;
	}
	
	private java.util.Set getORM_SerieGenericaidSerie() {
		return ORM_serieGenericaidSerie;
	}
	
	public final ORM.SerieGenericaSetCollection serieGenericaidSerie = new ORM.SerieGenericaSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_GENERO_SERIEGENERICAIDSERIE, ORM.ORMConstants.KEY_SERIEGENERICA_GENEROIDGENERO, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdGenero());
	}
	
}
