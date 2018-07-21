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
public class ListaProcessor {
	private int idLista;
	
	private String nombreLista;
	
	private String action="";
	
	public void setIdLista(int value) {
		this.idLista = value;
	}
	
	public int getIdLista() {
		return idLista;
	}
	
	public void setNombreLista(String value) {
		this.nombreLista = value;
	}
	
	public String getNombreLista() {
		return nombreLista == null ? "" : nombreLista;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int usuarioidUsuario_usuarioidUsuario;
	
	public void setUsuarioidUsuario_usuarioidUsuario(int value) {
		this.usuarioidUsuario_usuarioidUsuario = value;
	}
	
	public int getUsuarioidUsuario_usuarioidUsuario() {
		return usuarioidUsuario_usuarioidUsuario;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Lista _lista = orm.ListaDAO.loadListaByORMID(getIdLista());
				if (_lista!= null) {
					copyFromBean(_lista);
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
				orm.Lista _lista = orm.ListaDAO.createLista();
				copyToBean(_lista);
				if (ORM.ListaDAO.save(_lista)) {
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
				orm.Lista _lista= orm.ListaDAO.loadListaByORMID(getIdLista());
				if (_lista != null) {
					copyToBean(_lista);
					if (ORM.ListaDAO.save(_lista)) {
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
				orm.Lista _lista = orm.ListaDAO.loadListaByORMID(getIdLista());
				if (_lista != null && ORM.ListaDAO.deleteAndDissociate(_lista)) {
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
	
	private void copyFromBean(orm.Lista _lista) {
		setNombreLista(_lista.getNombreLista());
		setIdLista(_lista.getORMID());
		
		{
			orm.Usuario _usuario = _lista.getUsuarioidUsuario();
			if (_usuario != null) {
				setUsuarioidUsuario_usuarioidUsuario(_usuario.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Lista _lista) {
		_lista.setNombreLista(getNombreLista());
		try  {
			orm.Usuario _usuarioidUsuario = orm.UsuarioDAO.loadUsuarioByORMID(getUsuarioidUsuario_usuarioidUsuario());
			_lista.setUsuarioidUsuario(_usuarioidUsuario);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

