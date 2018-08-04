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
public class UsuarioProcessor {
	private int idUsuario;
	
	private String nombreUsuario;
	
	private String contraseñaUsuario;
	
	private String action="";
	
	public void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario == null ? "" : nombreUsuario;
	}
	
	public void setContraseñaUsuario(String value) {
		this.contraseñaUsuario = value;
	}
	
	public String getContraseñaUsuario() {
		return contraseñaUsuario == null ? "" : contraseñaUsuario;
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
				ORM.Usuario _usuario = ORM.UsuarioDAO.loadUsuarioByORMID(getIdUsuario());
				if (_usuario!= null) {
					copyFromBean(_usuario);
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
				ORM.Usuario _usuario = ORM.UsuarioDAO.createUsuario();
				copyToBean(_usuario);
				if (ORM.UsuarioDAO.save(_usuario)) {
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
				ORM.Usuario _usuario= ORM.UsuarioDAO.loadUsuarioByORMID(getIdUsuario());
				if (_usuario != null) {
					copyToBean(_usuario);
					if (ORM.UsuarioDAO.save(_usuario)) {
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
				ORM.Usuario _usuario = ORM.UsuarioDAO.loadUsuarioByORMID(getIdUsuario());
				if (_usuario != null && ORM.UsuarioDAO.deleteAndDissociate(_usuario)) {
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
	
	private void copyFromBean(ORM.Usuario _usuario) {
		setNombreUsuario(_usuario.getNombreUsuario());
		setContraseñaUsuario(_usuario.getContraseñaUsuario());
		setIdUsuario(_usuario.getORMID());
	}
	
	private void copyToBean(ORM.Usuario _usuario) {
		_usuario.setNombreUsuario(getNombreUsuario());
		_usuario.setContraseñaUsuario(getContraseñaUsuario());
	}
	
}

