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
public class GeneroProcessor {
	private int idGenero;
	
	private String nombre;
	
	private String descripcion;
	
	private String action="";
	
	public void setIdGenero(int value) {
		this.idGenero = value;
	}
	
	public int getIdGenero() {
		return idGenero;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre == null ? "" : nombre;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion == null ? "" : descripcion;
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
				orm.Genero _genero = orm.GeneroDAO.loadGeneroByORMID(getIdGenero());
				if (_genero!= null) {
					copyFromBean(_genero);
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
				orm.Genero _genero = orm.GeneroDAO.createGenero();
				copyToBean(_genero);
				if (ORM.GeneroDAO.save(_genero)) {
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
				orm.Genero _genero= orm.GeneroDAO.loadGeneroByORMID(getIdGenero());
				if (_genero != null) {
					copyToBean(_genero);
					if (ORM.GeneroDAO.save(_genero)) {
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
				orm.Genero _genero = orm.GeneroDAO.loadGeneroByORMID(getIdGenero());
				if (_genero != null && ORM.GeneroDAO.deleteAndDissociate(_genero)) {
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
	
	private void copyFromBean(orm.Genero _genero) {
		setNombre(_genero.getNombre());
		setDescripcion(_genero.getDescripcion());
		setIdGenero(_genero.getORMID());
	}
	
	private void copyToBean(orm.Genero _genero) {
		_genero.setNombre(getNombre());
		_genero.setDescripcion(getDescripcion());
	}
	
}

