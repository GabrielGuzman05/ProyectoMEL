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
public class TipoMangaProcessor {
	private int idTipoManga;
	
	private String nombre;
	
	private String action="";
	
	public void setIdTipoManga(int value) {
		this.idTipoManga = value;
	}
	
	public int getIdTipoManga() {
		return idTipoManga;
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
				ORM.TipoManga _tipoManga = ORM.TipoMangaDAO.loadTipoMangaByORMID(getIdTipoManga());
				if (_tipoManga!= null) {
					copyFromBean(_tipoManga);
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
				ORM.TipoManga _tipoManga = ORM.TipoMangaDAO.createTipoManga();
				copyToBean(_tipoManga);
				if (ORM.TipoMangaDAO.save(_tipoManga)) {
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
				ORM.TipoManga _tipoManga= ORM.TipoMangaDAO.loadTipoMangaByORMID(getIdTipoManga());
				if (_tipoManga != null) {
					copyToBean(_tipoManga);
					if (ORM.TipoMangaDAO.save(_tipoManga)) {
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
				ORM.TipoManga _tipoManga = ORM.TipoMangaDAO.loadTipoMangaByORMID(getIdTipoManga());
				if (_tipoManga != null && ORM.TipoMangaDAO.deleteAndDissociate(_tipoManga)) {
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
	
	private void copyFromBean(ORM.TipoManga _tipoManga) {
		setNombre(_tipoManga.getNombre());
		setIdTipoManga(_tipoManga.getORMID());
	}
	
	private void copyToBean(ORM.TipoManga _tipoManga) {
		_tipoManga.setNombre(getNombre());
	}
	
}

