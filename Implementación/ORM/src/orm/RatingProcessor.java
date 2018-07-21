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
public class RatingProcessor {
	private int idRating;
	
	private String nombre;
	
	private String action="";
	
	public void setIdRating(int value) {
		this.idRating = value;
	}
	
	public int getIdRating() {
		return idRating;
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
				orm.Rating _rating = orm.RatingDAO.loadRatingByORMID(getIdRating());
				if (_rating!= null) {
					copyFromBean(_rating);
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
				orm.Rating _rating = orm.RatingDAO.createRating();
				copyToBean(_rating);
				if (ORM.RatingDAO.save(_rating)) {
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
				orm.Rating _rating= orm.RatingDAO.loadRatingByORMID(getIdRating());
				if (_rating != null) {
					copyToBean(_rating);
					if (ORM.RatingDAO.save(_rating)) {
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
				orm.Rating _rating = orm.RatingDAO.loadRatingByORMID(getIdRating());
				if (_rating != null && ORM.RatingDAO.deleteAndDissociate(_rating)) {
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
	
	private void copyFromBean(orm.Rating _rating) {
		setNombre(_rating.getNombre());
		setIdRating(_rating.getORMID());
	}
	
	private void copyToBean(orm.Rating _rating) {
		_rating.setNombre(getNombre());
	}
	
}

