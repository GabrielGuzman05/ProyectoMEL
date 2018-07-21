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
public class TemporadaProcessor {
	private int idTemporada;
	
	private String estacion;
	
	private Integer año;
	
	private String action="";
	
	public void setIdTemporada(int value) {
		this.idTemporada = value;
	}
	
	public int getIdTemporada() {
		return idTemporada;
	}
	
	public void setEstacion(String value) {
		this.estacion = value;
	}
	
	public String getEstacion() {
		return estacion == null ? "" : estacion;
	}
	
	public void setAño(int value) {
		setAño(new Integer(value));
	}
	
	public void setAño(Integer value) {
		this.año = value;
	}
	
	public Integer getAño() {
		return año;
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
				orm.Temporada _temporada = orm.TemporadaDAO.loadTemporadaByORMID(getIdTemporada());
				if (_temporada!= null) {
					copyFromBean(_temporada);
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
				orm.Temporada _temporada = orm.TemporadaDAO.createTemporada();
				copyToBean(_temporada);
				if (ORM.TemporadaDAO.save(_temporada)) {
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
				orm.Temporada _temporada= orm.TemporadaDAO.loadTemporadaByORMID(getIdTemporada());
				if (_temporada != null) {
					copyToBean(_temporada);
					if (ORM.TemporadaDAO.save(_temporada)) {
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
				orm.Temporada _temporada = orm.TemporadaDAO.loadTemporadaByORMID(getIdTemporada());
				if (_temporada != null && ORM.TemporadaDAO.deleteAndDissociate(_temporada)) {
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
	
	private void copyFromBean(orm.Temporada _temporada) {
		setEstacion(_temporada.getEstacion());
		setAño(_temporada.getAño());
		setIdTemporada(_temporada.getORMID());
	}
	
	private void copyToBean(orm.Temporada _temporada) {
		_temporada.setEstacion(getEstacion());
		_temporada.setAño(getAño());
	}
	
}

