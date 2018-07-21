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
public class TipoManga implements Serializable {
	public TipoManga() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TIPOMANGA_MANGA) {
			return ORM_manga;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idTipoManga;
	
	private String nombre;
	
	private java.util.Set ORM_manga = new java.util.HashSet();
	
	private void setIdTipoManga(int value) {
		this.idTipoManga = value;
	}
	
	public int getIdTipoManga() {
		return idTipoManga;
	}
	
	public int getORMID() {
		return getIdTipoManga();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Manga(java.util.Set value) {
		this.ORM_manga = value;
	}
	
	private java.util.Set getORM_Manga() {
		return ORM_manga;
	}
	
	public final orm.MangaSetCollection manga = new orm.MangaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TIPOMANGA_MANGA, orm.ORMConstants.KEY_MANGA_TIPOMANGAIDTIPOMANGA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdTipoManga());
	}
	
}
