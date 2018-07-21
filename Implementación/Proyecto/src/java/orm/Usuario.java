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
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_USUARIO_LISTA) {
			return ORM_lista;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idUsuario;
	
	private String nombreUsuario;
	
	private String contraseñaUsuario;
	
	private java.util.Set ORM_lista = new java.util.HashSet();
	
	private void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setContraseñaUsuario(String value) {
		this.contraseñaUsuario = value;
	}
	
	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}
	
	private void setORM_Lista(java.util.Set value) {
		this.ORM_lista = value;
	}
	
	private java.util.Set getORM_Lista() {
		return ORM_lista;
	}
	
	public final orm.ListaSetCollection lista = new orm.ListaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_USUARIO_LISTA, orm.ORMConstants.KEY_LISTA_USUARIOIDUSUARIO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
