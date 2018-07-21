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
public class ArtistaProcessor {
	private int idArtista;
	
	private String nombre;
	
	private String action="";
	
	public void setIdArtista(int value) {
		this.idArtista = value;
	}
	
	public int getIdArtista() {
		return idArtista;
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
				orm.Artista _artista = orm.ArtistaDAO.loadArtistaByORMID(getIdArtista());
				if (_artista!= null) {
					copyFromBean(_artista);
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
				orm.Artista _artista = orm.ArtistaDAO.createArtista();
				copyToBean(_artista);
				if (ORM.ArtistaDAO.save(_artista)) {
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
				orm.Artista _artista= orm.ArtistaDAO.loadArtistaByORMID(getIdArtista());
				if (_artista != null) {
					copyToBean(_artista);
					if (ORM.ArtistaDAO.save(_artista)) {
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
				orm.Artista _artista = orm.ArtistaDAO.loadArtistaByORMID(getIdArtista());
				if (_artista != null && ORM.ArtistaDAO.deleteAndDissociate(_artista)) {
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
	
	private void copyFromBean(orm.Artista _artista) {
		setNombre(_artista.getNombre());
		setIdArtista(_artista.getORMID());
	}
	
	private void copyToBean(orm.Artista _artista) {
		_artista.setNombre(getNombre());
	}
	
}

