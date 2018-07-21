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
public class Autor implements Serializable {
	public Autor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_AUTOR_MANGAIDMANGA) {
			return ORM_mangaidManga;
		}
		else if (key == orm.ORMConstants.KEY_AUTOR_NOVELA) {
			return ORM_novela;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idAutor;
	
	private String nombre;
	
	private java.util.Set ORM_mangaidManga = new java.util.HashSet();
	
	private java.util.Set ORM_novela = new java.util.HashSet();
	
	private void setIdAutor(int value) {
		this.idAutor = value;
	}
	
	public int getIdAutor() {
		return idAutor;
	}
	
	public int getORMID() {
		return getIdAutor();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_MangaidManga(java.util.Set value) {
		this.ORM_mangaidManga = value;
	}
	
	private java.util.Set getORM_MangaidManga() {
		return ORM_mangaidManga;
	}
	
	public final orm.MangaSetCollection mangaidManga = new orm.MangaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_AUTOR_MANGAIDMANGA, orm.ORMConstants.KEY_MANGA_AUTORIDAUTOR, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Novela(java.util.Set value) {
		this.ORM_novela = value;
	}
	
	private java.util.Set getORM_Novela() {
		return ORM_novela;
	}
	
	public final orm.NovelaSetCollection novela = new orm.NovelaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_AUTOR_NOVELA, orm.ORMConstants.KEY_NOVELA_AUTORIDAUTOR, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAutor());
	}
	
}
