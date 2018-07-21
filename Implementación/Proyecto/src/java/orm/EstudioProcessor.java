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
public class EstudioProcessor {
	private int idEstudio;
	
	private String nombre;
	
	private String action="";
	
	public void setIdEstudio(int value) {
		this.idEstudio = value;
	}
	
	public int getIdEstudio() {
		return idEstudio;
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
				orm.Estudio _estudio = orm.EstudioDAO.loadEstudioByORMID(getIdEstudio());
				if (_estudio!= null) {
					copyFromBean(_estudio);
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
				orm.Estudio _estudio = orm.EstudioDAO.createEstudio();
				copyToBean(_estudio);
				if (ORM.EstudioDAO.save(_estudio)) {
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
				orm.Estudio _estudio= orm.EstudioDAO.loadEstudioByORMID(getIdEstudio());
				if (_estudio != null) {
					copyToBean(_estudio);
					if (ORM.EstudioDAO.save(_estudio)) {
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
				orm.Estudio _estudio = orm.EstudioDAO.loadEstudioByORMID(getIdEstudio());
				if (_estudio != null && ORM.EstudioDAO.deleteAndDissociate(_estudio)) {
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
	
	private void copyFromBean(orm.Estudio _estudio) {
		setNombre(_estudio.getNombre());
		setIdEstudio(_estudio.getORMID());
	}
	
	private void copyToBean(orm.Estudio _estudio) {
		_estudio.setNombre(getNombre());
	}
	
}

