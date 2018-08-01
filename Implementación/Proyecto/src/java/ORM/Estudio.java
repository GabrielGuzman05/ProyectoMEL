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
public class Estudio implements Serializable {
	public Estudio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORM.ORMConstants.KEY_ESTUDIO_ANIMACIONIDANIMACION) {
			return ORM_animacionidAnimacion;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idEstudio;
	
	private String nombre;
	
	private java.util.Set ORM_animacionidAnimacion = new java.util.HashSet();
	
	private void setIdEstudio(int value) {
		this.idEstudio = value;
	}
	
	public int getIdEstudio() {
		return idEstudio;
	}
	
	public int getORMID() {
		return getIdEstudio();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_AnimacionidAnimacion(java.util.Set value) {
		this.ORM_animacionidAnimacion = value;
	}
	
	private java.util.Set getORM_AnimacionidAnimacion() {
		return ORM_animacionidAnimacion;
	}
	
	public final ORM.AnimacionSetCollection animacionidAnimacion = new ORM.AnimacionSetCollection(this, _ormAdapter, ORM.ORMConstants.KEY_ESTUDIO_ANIMACIONIDANIMACION, ORM.ORMConstants.KEY_ANIMACION_ESTUDIOIDESTUDIO, ORM.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdEstudio());
	}
	
}
