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
public class PublicadorOriginalProcessor {
	private int idPublicadorOriginal;
	
	private String nombre;
	
	private String action="";
	
	public void setIdPublicadorOriginal(int value) {
		this.idPublicadorOriginal = value;
	}
	
	public int getIdPublicadorOriginal() {
		return idPublicadorOriginal;
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
				orm.PublicadorOriginal _publicadorOriginal = orm.PublicadorOriginalDAO.loadPublicadorOriginalByORMID(getIdPublicadorOriginal());
				if (_publicadorOriginal!= null) {
					copyFromBean(_publicadorOriginal);
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
				orm.PublicadorOriginal _publicadorOriginal = orm.PublicadorOriginalDAO.createPublicadorOriginal();
				copyToBean(_publicadorOriginal);
				if (ORM.PublicadorOriginalDAO.save(_publicadorOriginal)) {
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
				orm.PublicadorOriginal _publicadorOriginal= orm.PublicadorOriginalDAO.loadPublicadorOriginalByORMID(getIdPublicadorOriginal());
				if (_publicadorOriginal != null) {
					copyToBean(_publicadorOriginal);
					if (ORM.PublicadorOriginalDAO.save(_publicadorOriginal)) {
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
				orm.PublicadorOriginal _publicadorOriginal = orm.PublicadorOriginalDAO.loadPublicadorOriginalByORMID(getIdPublicadorOriginal());
				if (_publicadorOriginal != null && ORM.PublicadorOriginalDAO.deleteAndDissociate(_publicadorOriginal)) {
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
	
	private void copyFromBean(orm.PublicadorOriginal _publicadorOriginal) {
		setNombre(_publicadorOriginal.getNombre());
		setIdPublicadorOriginal(_publicadorOriginal.getORMID());
	}
	
	private void copyToBean(orm.PublicadorOriginal _publicadorOriginal) {
		_publicadorOriginal.setNombre(getNombre());
	}
	
}

