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
package ORM;

import org.orm.PersistentException;
public class LenguajeOriginalProcessor {
	private int idLenguaje;
	
	private String nombre;
	
	private String action="";
	
	public void setIdLenguaje(int value) {
		this.idLenguaje = value;
	}
	
	public int getIdLenguaje() {
		return idLenguaje;
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
				ORM.LenguajeOriginal _lenguajeOriginal = ORM.LenguajeOriginalDAO.loadLenguajeOriginalByORMID(getIdLenguaje());
				if (_lenguajeOriginal!= null) {
					copyFromBean(_lenguajeOriginal);
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
				ORM.LenguajeOriginal _lenguajeOriginal = ORM.LenguajeOriginalDAO.createLenguajeOriginal();
				copyToBean(_lenguajeOriginal);
				if (ORM.LenguajeOriginalDAO.save(_lenguajeOriginal)) {
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
				ORM.LenguajeOriginal _lenguajeOriginal= ORM.LenguajeOriginalDAO.loadLenguajeOriginalByORMID(getIdLenguaje());
				if (_lenguajeOriginal != null) {
					copyToBean(_lenguajeOriginal);
					if (ORM.LenguajeOriginalDAO.save(_lenguajeOriginal)) {
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
				ORM.LenguajeOriginal _lenguajeOriginal = ORM.LenguajeOriginalDAO.loadLenguajeOriginalByORMID(getIdLenguaje());
				if (_lenguajeOriginal != null && ORM.LenguajeOriginalDAO.deleteAndDissociate(_lenguajeOriginal)) {
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
	
	private void copyFromBean(ORM.LenguajeOriginal _lenguajeOriginal) {
		setNombre(_lenguajeOriginal.getNombre());
		setIdLenguaje(_lenguajeOriginal.getORMID());
	}
	
	private void copyToBean(ORM.LenguajeOriginal _lenguajeOriginal) {
		_lenguajeOriginal.setNombre(getNombre());
	}
	
}

