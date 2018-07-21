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
public class TipoEmisionProcessor {
	private int idTipoEmision;
	
	private Integer nombre;
	
	private String action="";
	
	public void setIdTipoEmision(int value) {
		this.idTipoEmision = value;
	}
	
	public int getIdTipoEmision() {
		return idTipoEmision;
	}
	
	public void setNombre(int value) {
		setNombre(new Integer(value));
	}
	
	public void setNombre(Integer value) {
		this.nombre = value;
	}
	
	public Integer getNombre() {
		return nombre;
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
				orm.TipoEmision _tipoEmision = orm.TipoEmisionDAO.loadTipoEmisionByORMID(getIdTipoEmision());
				if (_tipoEmision!= null) {
					copyFromBean(_tipoEmision);
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
				orm.TipoEmision _tipoEmision = orm.TipoEmisionDAO.createTipoEmision();
				copyToBean(_tipoEmision);
				if (ORM.TipoEmisionDAO.save(_tipoEmision)) {
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
				orm.TipoEmision _tipoEmision= orm.TipoEmisionDAO.loadTipoEmisionByORMID(getIdTipoEmision());
				if (_tipoEmision != null) {
					copyToBean(_tipoEmision);
					if (ORM.TipoEmisionDAO.save(_tipoEmision)) {
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
				orm.TipoEmision _tipoEmision = orm.TipoEmisionDAO.loadTipoEmisionByORMID(getIdTipoEmision());
				if (_tipoEmision != null && ORM.TipoEmisionDAO.deleteAndDissociate(_tipoEmision)) {
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
	
	private void copyFromBean(orm.TipoEmision _tipoEmision) {
		setNombre(_tipoEmision.getNombre());
		setIdTipoEmision(_tipoEmision.getORMID());
	}
	
	private void copyToBean(orm.TipoEmision _tipoEmision) {
		_tipoEmision.setNombre(getNombre());
	}
	
}

