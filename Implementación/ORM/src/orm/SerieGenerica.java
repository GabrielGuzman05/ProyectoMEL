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

public class SerieGenerica {
	public SerieGenerica() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_SERIEGENERICA_GENEROIDGENERO) {
			return ORM_generoidGenero;
		}
		else if (key == orm.ORMConstants.KEY_SERIEGENERICA_ENTRADALISTA) {
			return ORM_entradaLista;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idSerie;
	
	private String nombre;
	
	private String nombreAlternativo;
	
	private String cadena;
	
	private Integer episodios;
	
	private java.util.Set ORM_generoidGenero = new java.util.HashSet();
	
	private java.util.Set ORM_entradaLista = new java.util.HashSet();
	
	private void setIdSerie(int value) {
		this.idSerie = value;
	}
	
	public int getIdSerie() {
		return idSerie;
	}
	
	public int getORMID() {
		return getIdSerie();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombreAlternativo(String value) {
		this.nombreAlternativo = value;
	}
	
	public String getNombreAlternativo() {
		return nombreAlternativo;
	}
	
	public void setCadena(String value) {
		this.cadena = value;
	}
	
	public String getCadena() {
		return cadena;
	}
	
	public void setEpisodios(int value) {
		setEpisodios(new Integer(value));
	}
	
	public void setEpisodios(Integer value) {
		this.episodios = value;
	}
	
	public Integer getEpisodios() {
		return episodios;
	}
	
	private void setORM_GeneroidGenero(java.util.Set value) {
		this.ORM_generoidGenero = value;
	}
	
	private java.util.Set getORM_GeneroidGenero() {
		return ORM_generoidGenero;
	}
	
	public final orm.GeneroSetCollection generoidGenero = new orm.GeneroSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_SERIEGENERICA_GENEROIDGENERO, orm.ORMConstants.KEY_GENERO_SERIEGENERICAIDSERIE, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_EntradaLista(java.util.Set value) {
		this.ORM_entradaLista = value;
	}
	
	private java.util.Set getORM_EntradaLista() {
		return ORM_entradaLista;
	}
	
	public final orm.EntradaListaSetCollection entradaLista = new orm.EntradaListaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_SERIEGENERICA_ENTRADALISTA, orm.ORMConstants.KEY_ENTRADALISTA_SERIEGENERICAIDSERIE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdSerie());
	}
	
}
