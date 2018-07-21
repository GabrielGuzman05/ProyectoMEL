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

import org.orm.PersistentException;
public class SerieGenericaProcessor {
	private int idSerie;
	
	private String nombre;
	
	private String nombreAlternativo;
	
	private int estadoUsuarioidEstadoUsuario;
	
	private String cadena;
	
	private Integer episodios;
	
	private String action="";
	
	public void setIdSerie(int value) {
		this.idSerie = value;
	}
	
	public int getIdSerie() {
		return idSerie;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre == null ? "" : nombre;
	}
	
	public void setNombreAlternativo(String value) {
		this.nombreAlternativo = value;
	}
	
	public String getNombreAlternativo() {
		return nombreAlternativo == null ? "" : nombreAlternativo;
	}
	
	public void setEstadoUsuarioidEstadoUsuario(int value) {
		this.estadoUsuarioidEstadoUsuario = value;
	}
	
	public int getEstadoUsuarioidEstadoUsuario() {
		return estadoUsuarioidEstadoUsuario;
	}
	
	public void setCadena(String value) {
		this.cadena = value;
	}
	
	public String getCadena() {
		return cadena == null ? "" : cadena;
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
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.SerieGenerica _serieGenerica = orm.SerieGenericaDAO.loadSerieGenericaByORMID(getIdSerie());
				if (_serieGenerica!= null) {
					copyFromBean(_serieGenerica);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				orm.SerieGenerica _serieGenerica = orm.SerieGenericaDAO.createSerieGenerica();
				copyToBean(_serieGenerica);
				if (ORM.SerieGenericaDAO.save(_serieGenerica)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				orm.SerieGenerica _serieGenerica= orm.SerieGenericaDAO.loadSerieGenericaByORMID(getIdSerie());
				if (_serieGenerica != null) {
					copyToBean(_serieGenerica);
					if (ORM.SerieGenericaDAO.save(_serieGenerica)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				orm.SerieGenerica _serieGenerica = orm.SerieGenericaDAO.loadSerieGenericaByORMID(getIdSerie());
				if (_serieGenerica != null && ORM.SerieGenericaDAO.deleteAndDissociate(_serieGenerica)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(orm.SerieGenerica _serieGenerica) {
		setNombre(_serieGenerica.getNombre());
		setNombreAlternativo(_serieGenerica.getNombreAlternativo());
		setEstadoUsuarioidEstadoUsuario(_serieGenerica.getEstadoUsuarioidEstadoUsuario());
		setCadena(_serieGenerica.getCadena());
		setEpisodios(_serieGenerica.getEpisodios());
		setIdSerie(_serieGenerica.getORMID());
	}
	
	private void copyToBean(orm.SerieGenerica _serieGenerica) {
		_serieGenerica.setNombre(getNombre());
		_serieGenerica.setNombreAlternativo(getNombreAlternativo());
		_serieGenerica.setEstadoUsuarioidEstadoUsuario(getEstadoUsuarioidEstadoUsuario());
		_serieGenerica.setCadena(getCadena());
		_serieGenerica.setEpisodios(getEpisodios());
	}
	
}

