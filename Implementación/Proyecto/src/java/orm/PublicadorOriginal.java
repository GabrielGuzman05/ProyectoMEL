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

public class PublicadorOriginal {
	public PublicadorOriginal() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PUBLICADORORIGINAL_NOVELA) {
			return ORM_novela;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idPublicadorOriginal;
	
	private String nombre;
	
	private java.util.Set ORM_novela = new java.util.HashSet();
	
	private void setIdPublicadorOriginal(int value) {
		this.idPublicadorOriginal = value;
	}
	
	public int getIdPublicadorOriginal() {
		return idPublicadorOriginal;
	}
	
	public int getORMID() {
		return getIdPublicadorOriginal();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Novela(java.util.Set value) {
		this.ORM_novela = value;
	}
	
	private java.util.Set getORM_Novela() {
		return ORM_novela;
	}
	
	public final orm.NovelaSetCollection novela = new orm.NovelaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PUBLICADORORIGINAL_NOVELA, orm.ORMConstants.KEY_NOVELA_PUBLICADORORIGINALIDPUBLICADORORIGINAL, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdPublicadorOriginal());
	}
	
}
