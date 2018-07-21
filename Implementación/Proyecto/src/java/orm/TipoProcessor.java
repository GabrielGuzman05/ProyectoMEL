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
public class TipoProcessor {
	private int idTipo;
	
	private String nombre;
	
	private String action="";
	
	public void setIdTipo(int value) {
		this.idTipo = value;
	}
	
	public int getIdTipo() {
		return idTipo;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre == null ? "" : nombre;
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
				orm.Tipo _tipo = orm.TipoDAO.loadTipoByORMID(getIdTipo());
				if (_tipo!= null) {
					copyFromBean(_tipo);
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
				orm.Tipo _tipo = orm.TipoDAO.createTipo();
				copyToBean(_tipo);
				if (ORM.TipoDAO.save(_tipo)) {
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
				orm.Tipo _tipo= orm.TipoDAO.loadTipoByORMID(getIdTipo());
				if (_tipo != null) {
					copyToBean(_tipo);
					if (ORM.TipoDAO.save(_tipo)) {
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
				orm.Tipo _tipo = orm.TipoDAO.loadTipoByORMID(getIdTipo());
				if (_tipo != null && ORM.TipoDAO.deleteAndDissociate(_tipo)) {
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
	
	private void copyFromBean(orm.Tipo _tipo) {
		setNombre(_tipo.getNombre());
		setIdTipo(_tipo.getORMID());
	}
	
	private void copyToBean(orm.Tipo _tipo) {
		_tipo.setNombre(getNombre());
	}
	
}

