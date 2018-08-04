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
public class TagProcessor {
	private int idTag;
	
	private String nombre;
	
	private String descripcion;
	
	private String action="";
	
	public void setIdTag(int value) {
		this.idTag = value;
	}
	
	public int getIdTag() {
		return idTag;
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
				ORM.Tag _tag = ORM.TagDAO.loadTagByORMID(getIdTag());
				if (_tag!= null) {
					copyFromBean(_tag);
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
				ORM.Tag _tag = ORM.TagDAO.createTag();
				copyToBean(_tag);
				if (ORM.TagDAO.save(_tag)) {
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
				ORM.Tag _tag= ORM.TagDAO.loadTagByORMID(getIdTag());
				if (_tag != null) {
					copyToBean(_tag);
					if (ORM.TagDAO.save(_tag)) {
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
				ORM.Tag _tag = ORM.TagDAO.loadTagByORMID(getIdTag());
				if (_tag != null && ORM.TagDAO.deleteAndDissociate(_tag)) {
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
	
	private void copyFromBean(ORM.Tag _tag) {
		setNombre(_tag.getNombre());
		setDescripcion(_tag.getDescripcion());
		setIdTag(_tag.getORMID());
	}
	
	private void copyToBean(ORM.Tag _tag) {
		_tag.setNombre(getNombre());
		_tag.setDescripcion(getDescripcion());
	}
	
}

