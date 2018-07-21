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

import java.io.Serializable;
public class Temporada implements Serializable {
	public Temporada() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TEMPORADA_ANIMACION) {
			return ORM_animacion;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idTemporada;
	
	private String estacion;
	
	private Integer año;
	
	private java.util.Set ORM_animacion = new java.util.HashSet();
	
	private void setIdTemporada(int value) {
		this.idTemporada = value;
	}
	
	public int getIdTemporada() {
		return idTemporada;
	}
	
	public int getORMID() {
		return getIdTemporada();
	}
	
	public void setEstacion(String value) {
		this.estacion = value;
	}
	
	public String getEstacion() {
		return estacion;
	}
	
	public void setAño(int value) {
		setAño(new Integer(value));
	}
	
	public void setAño(Integer value) {
		this.año = value;
	}
	
	public Integer getAño() {
		return año;
	}
	
	private void setORM_Animacion(java.util.Set value) {
		this.ORM_animacion = value;
	}
	
	private java.util.Set getORM_Animacion() {
		return ORM_animacion;
	}
	
	public final orm.AnimacionSetCollection animacion = new orm.AnimacionSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TEMPORADA_ANIMACION, orm.ORMConstants.KEY_ANIMACION_TEMPORADAIDTEMPORADA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdTemporada());
	}
	
}
