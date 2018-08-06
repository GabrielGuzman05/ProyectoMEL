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

public class Rating {
	public Rating() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_RATING_ANIMACION) {
			return ORM_animacion;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idRating;
	
	private String nombre;
	
	private java.util.Set ORM_animacion = new java.util.HashSet();
	
	private void setIdRating(int value) {
		this.idRating = value;
	}
	
	public int getIdRating() {
		return idRating;
	}
	
	public int getORMID() {
		return getIdRating();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Animacion(java.util.Set value) {
		this.ORM_animacion = value;
	}
	
	private java.util.Set getORM_Animacion() {
		return ORM_animacion;
	}
	
	public final orm.AnimacionSetCollection animacion = new orm.AnimacionSetCollection(this, _ormAdapter, ORMConstants.KEY_RATING_ANIMACION, ORMConstants.KEY_ANIMACION_RATINGIDRATING, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdRating());
	}
	
}
