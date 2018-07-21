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
public class PublicadorInglesProcessor {
	private int idPublicadorIngles;
	
	private String nombre;
	
	private String action="";
	
	public void setIdPublicadorIngles(int value) {
		this.idPublicadorIngles = value;
	}
	
	public int getIdPublicadorIngles() {
		return idPublicadorIngles;
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
				orm.PublicadorIngles _publicadorIngles = orm.PublicadorInglesDAO.loadPublicadorInglesByORMID(getIdPublicadorIngles());
				if (_publicadorIngles!= null) {
					copyFromBean(_publicadorIngles);
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
				orm.PublicadorIngles _publicadorIngles = orm.PublicadorInglesDAO.createPublicadorIngles();
				copyToBean(_publicadorIngles);
				if (ORM.PublicadorInglesDAO.save(_publicadorIngles)) {
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
				orm.PublicadorIngles _publicadorIngles= orm.PublicadorInglesDAO.loadPublicadorInglesByORMID(getIdPublicadorIngles());
				if (_publicadorIngles != null) {
					copyToBean(_publicadorIngles);
					if (ORM.PublicadorInglesDAO.save(_publicadorIngles)) {
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
				orm.PublicadorIngles _publicadorIngles = orm.PublicadorInglesDAO.loadPublicadorInglesByORMID(getIdPublicadorIngles());
				if (_publicadorIngles != null && ORM.PublicadorInglesDAO.deleteAndDissociate(_publicadorIngles)) {
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
	
	private void copyFromBean(orm.PublicadorIngles _publicadorIngles) {
		setNombre(_publicadorIngles.getNombre());
		setIdPublicadorIngles(_publicadorIngles.getORMID());
	}
	
	private void copyToBean(orm.PublicadorIngles _publicadorIngles) {
		_publicadorIngles.setNombre(getNombre());
	}
	
}

