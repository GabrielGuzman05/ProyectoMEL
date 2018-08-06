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

public class Mangaka {
	public Mangaka() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MANGAKA_MANGAIDMANGAARTISTA) {
			return ORM_mangaidMangaArtista;
		}
		else if (key == ORMConstants.KEY_MANGAKA_MANGAIDMANGAAUTOR) {
			return ORM_mangaidMangaAutor;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idMangaka;
	
	private String nombre;
	
	private java.util.Set ORM_mangaidMangaArtista = new java.util.HashSet();
	
	private java.util.Set ORM_mangaidMangaAutor = new java.util.HashSet();
	
	private void setIdMangaka(int value) {
		this.idMangaka = value;
	}
	
	public int getIdMangaka() {
		return idMangaka;
	}
	
	public int getORMID() {
		return getIdMangaka();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_MangaidMangaArtista(java.util.Set value) {
		this.ORM_mangaidMangaArtista = value;
	}
	
	private java.util.Set getORM_MangaidMangaArtista() {
		return ORM_mangaidMangaArtista;
	}
	
	public final orm.MangaSetCollection mangaidMangaArtista = new orm.MangaSetCollection(this, _ormAdapter, ORMConstants.KEY_MANGAKA_MANGAIDMANGAARTISTA, ORMConstants.KEY_MANGA_MANGAKAIDARTISTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_MangaidMangaAutor(java.util.Set value) {
		this.ORM_mangaidMangaAutor = value;
	}
	
	private java.util.Set getORM_MangaidMangaAutor() {
		return ORM_mangaidMangaAutor;
	}
	
	public final orm.MangaSetCollection mangaidMangaAutor = new orm.MangaSetCollection(this, _ormAdapter, ORMConstants.KEY_MANGAKA_MANGAIDMANGAAUTOR, ORMConstants.KEY_MANGA_MANGAKAIDAUTOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdMangaka());
	}
	
}
