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

public class LenguajeOriginal {
	public LenguajeOriginal() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_LENGUAJEORIGINAL_NOVELA) {
			return ORM_novela;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idLenguaje;
	
	private String nombre;
	
	private java.util.Set ORM_novela = new java.util.HashSet();
	
	private void setIdLenguaje(int value) {
		this.idLenguaje = value;
	}
	
	public int getIdLenguaje() {
		return idLenguaje;
	}
	
	public int getORMID() {
		return getIdLenguaje();
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
	
	public final orm.NovelaSetCollection novela = new orm.NovelaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LENGUAJEORIGINAL_NOVELA, orm.ORMConstants.KEY_NOVELA_LENGUAJEORIGINALIDLENGUAJE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdLenguaje());
	}
	
}
