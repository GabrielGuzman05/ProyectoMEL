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
public class Tag implements Serializable {
	public Tag() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TAG_NOVELAIDNOVELA) {
			return ORM_novelaidNovela;
		}
		else if (key == orm.ORMConstants.KEY_TAG_MANGAIDMANGA) {
			return ORM_mangaidManga;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idTag;
	
	private String nombre;
	
	private String descripcion;
	
	private java.util.Set ORM_novelaidNovela = new java.util.HashSet();
	
	private java.util.Set ORM_mangaidManga = new java.util.HashSet();
	
	private void setIdTag(int value) {
		this.idTag = value;
	}
	
	public int getIdTag() {
		return idTag;
	}
	
	public int getORMID() {
		return getIdTag();
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
	
	public final orm.NovelaSetCollection novelaidNovela = new orm.NovelaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TAG_NOVELAIDNOVELA, orm.ORMConstants.KEY_NOVELA_TAGIDTAG, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_MangaidManga(java.util.Set value) {
		this.ORM_mangaidManga = value;
	}
	
	private java.util.Set getORM_MangaidManga() {
		return ORM_mangaidManga;
	}
	
	public final orm.MangaSetCollection mangaidManga = new orm.MangaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TAG_MANGAIDMANGA, orm.ORMConstants.KEY_MANGA_TAGIDTAG, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdTag());
	}
	
}
