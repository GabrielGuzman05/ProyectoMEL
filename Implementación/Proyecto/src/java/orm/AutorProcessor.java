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
public class AutorProcessor {
	private int idAutor;
	
	private String nombre;
	
	private String action="";
	
	public void setIdAutor(int value) {
		this.idAutor = value;
	}
	
	public int getIdAutor() {
		return idAutor;
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
				ORM.Autor _autor = ORM.AutorDAO.loadAutorByORMID(getIdAutor());
				if (_autor!= null) {
					copyFromBean(_autor);
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
				ORM.Autor _autor = ORM.AutorDAO.createAutor();
				copyToBean(_autor);
				if (ORM.AutorDAO.save(_autor)) {
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
				ORM.Autor _autor= ORM.AutorDAO.loadAutorByORMID(getIdAutor());
				if (_autor != null) {
					copyToBean(_autor);
					if (ORM.AutorDAO.save(_autor)) {
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
				ORM.Autor _autor = ORM.AutorDAO.loadAutorByORMID(getIdAutor());
				if (_autor != null && ORM.AutorDAO.deleteAndDissociate(_autor)) {
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
	
	private void copyFromBean(ORM.Autor _autor) {
		setNombre(_autor.getNombre());
		setIdAutor(_autor.getORMID());
	}
	
	private void copyToBean(ORM.Autor _autor) {
		_autor.setNombre(getNombre());
	}
	
}

