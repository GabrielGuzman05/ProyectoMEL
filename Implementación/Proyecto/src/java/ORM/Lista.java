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

/**
 *
 * @author Gabriel
 */
public class Lista {

    /**
     *
     */
    public Lista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LISTA_ENTRADALISTA) {
			return ORM_entradaLista;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LISTA_USUARIOIDUSUARIO) {
			this.usuarioidUsuario = (orm.Usuario) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idLista;
	
	private String nombreLista;
	
	private orm.Usuario usuarioidUsuario;
	
	private java.util.Set ORM_entradaLista = new java.util.HashSet();
	
	private void setIdLista(int value) {
		this.idLista = value;
	}
	
    /**
     *
     * @return
     */
    public int getIdLista() {
		return idLista;
	}
	
    /**
     *
     * @return
     */
    public int getORMID() {
		return getIdLista();
	}
	
    /**
     *
     * @param value
     */
    public void setNombreLista(String value) {
		this.nombreLista = value;
	}
	
    /**
     *
     * @return
     */
    public String getNombreLista() {
		return nombreLista;
	}
	
    /**
     *
     * @param value
     */
    public void setUsuarioidUsuario(orm.Usuario value) {
		if (usuarioidUsuario != null) {
			usuarioidUsuario.lista.remove(this);
		}
		if (value != null) {
			value.lista.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public orm.Usuario getUsuarioidUsuario() {
		return usuarioidUsuario;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_UsuarioidUsuario(orm.Usuario value) {
		this.usuarioidUsuario = value;
	}
	
	private orm.Usuario getORM_UsuarioidUsuario() {
		return usuarioidUsuario;
	}
	
	private void setORM_EntradaLista(java.util.Set value) {
		this.ORM_entradaLista = value;
	}
	
	private java.util.Set getORM_EntradaLista() {
		return ORM_entradaLista;
	}
	
    /**
     *
     */
    public final orm.EntradaListaSetCollection entradaLista = new orm.EntradaListaSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_ENTRADALISTA, ORMConstants.KEY_ENTRADALISTA_LISTAIDLISTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdLista());
	}
	
}
