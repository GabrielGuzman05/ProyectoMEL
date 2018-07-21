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
public class AnimacionProcessor {
	private int idAnimacion;
	
	private String nombre;
	
	private String nombreAlternativo;
	
	private String fuente;
	
	private Byte enEmision;
	
	private Integer episodios;
	
	private String MALCode;
	
	private int estadoUsuarioidEstadoUsuario;
	
	private String action="";
	
	public void setIdAnimacion(int value) {
		this.idAnimacion = value;
	}
	
	public int getIdAnimacion() {
		return idAnimacion;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre == null ? "" : nombre;
	}
	
	public void setNombreAlternativo(String value) {
		this.nombreAlternativo = value;
	}
	
	public String getNombreAlternativo() {
		return nombreAlternativo == null ? "" : nombreAlternativo;
	}
	
	public void setFuente(String value) {
		this.fuente = value;
	}
	
	public String getFuente() {
		return fuente == null ? "" : fuente;
	}
	
	public void setEnEmision(byte value) {
		setEnEmision(new Byte(value));
	}
	
	public void setEnEmision(Byte value) {
		this.enEmision = value;
	}
	
	public Byte getEnEmision() {
		return enEmision;
	}
	
	public void setEpisodios(int value) {
		setEpisodios(new Integer(value));
	}
	
	public void setEpisodios(Integer value) {
		this.episodios = value;
	}
	
	public Integer getEpisodios() {
		return episodios;
	}
	
	public void setMALCode(String value) {
		this.MALCode = value;
	}
	
	public String getMALCode() {
		return MALCode == null ? "" : MALCode;
	}
	
	public void setEstadoUsuarioidEstadoUsuario(int value) {
		this.estadoUsuarioidEstadoUsuario = value;
	}
	
	public int getEstadoUsuarioidEstadoUsuario() {
		return estadoUsuarioidEstadoUsuario;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int temporadaidTemporada_temporadaidTemporada;
	
	public void setTemporadaidTemporada_temporadaidTemporada(int value) {
		this.temporadaidTemporada_temporadaidTemporada = value;
	}
	
	public int getTemporadaidTemporada_temporadaidTemporada() {
		return temporadaidTemporada_temporadaidTemporada;
	}
	
	private int tipoEmisionidTipoEmision_tipoEmisionidTipoEmision;
	
	public void setTipoEmisionidTipoEmision_tipoEmisionidTipoEmision(int value) {
		this.tipoEmisionidTipoEmision_tipoEmisionidTipoEmision = value;
	}
	
	public int getTipoEmisionidTipoEmision_tipoEmisionidTipoEmision() {
		return tipoEmisionidTipoEmision_tipoEmisionidTipoEmision;
	}
	
	private int ratingidRating_ratingidRating;
	
	public void setRatingidRating_ratingidRating(int value) {
		this.ratingidRating_ratingidRating = value;
	}
	
	public int getRatingidRating_ratingidRating() {
		return ratingidRating_ratingidRating;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Animacion _animacion = orm.AnimacionDAO.loadAnimacionByORMID(getIdAnimacion());
				if (_animacion!= null) {
					copyFromBean(_animacion);
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
				orm.Animacion _animacion = orm.AnimacionDAO.createAnimacion();
				copyToBean(_animacion);
				if (ORM.AnimacionDAO.save(_animacion)) {
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
				orm.Animacion _animacion= orm.AnimacionDAO.loadAnimacionByORMID(getIdAnimacion());
				if (_animacion != null) {
					copyToBean(_animacion);
					if (ORM.AnimacionDAO.save(_animacion)) {
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
				orm.Animacion _animacion = orm.AnimacionDAO.loadAnimacionByORMID(getIdAnimacion());
				if (_animacion != null && ORM.AnimacionDAO.deleteAndDissociate(_animacion)) {
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
	
	private void copyFromBean(orm.Animacion _animacion) {
		setNombre(_animacion.getNombre());
		setNombreAlternativo(_animacion.getNombreAlternativo());
		setFuente(_animacion.getFuente());
		setEnEmision(_animacion.getEnEmision());
		setEpisodios(_animacion.getEpisodios());
		setMALCode(_animacion.getMALCode());
		setEstadoUsuarioidEstadoUsuario(_animacion.getEstadoUsuarioidEstadoUsuario());
		setIdAnimacion(_animacion.getORMID());
		
		{
			orm.Temporada _temporada = _animacion.getTemporadaidTemporada();
			if (_temporada != null) {
				setTemporadaidTemporada_temporadaidTemporada(_temporada.getORMID());
			}
		}
		
		
		{
			orm.TipoEmision _tipoEmision = _animacion.getTipoEmisionidTipoEmision();
			if (_tipoEmision != null) {
				setTipoEmisionidTipoEmision_tipoEmisionidTipoEmision(_tipoEmision.getORMID());
			}
		}
		
		
		{
			orm.Rating _rating = _animacion.getRatingidRating();
			if (_rating != null) {
				setRatingidRating_ratingidRating(_rating.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Animacion _animacion) {
		_animacion.setNombre(getNombre());
		_animacion.setNombreAlternativo(getNombreAlternativo());
		_animacion.setFuente(getFuente());
		_animacion.setEnEmision(getEnEmision());
		_animacion.setEpisodios(getEpisodios());
		_animacion.setMALCode(getMALCode());
		_animacion.setEstadoUsuarioidEstadoUsuario(getEstadoUsuarioidEstadoUsuario());
		try  {
			orm.Temporada _temporadaidTemporada = orm.TemporadaDAO.loadTemporadaByORMID(getTemporadaidTemporada_temporadaidTemporada());
			_animacion.setTemporadaidTemporada(_temporadaidTemporada);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.TipoEmision _tipoEmisionidTipoEmision = orm.TipoEmisionDAO.loadTipoEmisionByORMID(getTipoEmisionidTipoEmision_tipoEmisionidTipoEmision());
			_animacion.setTipoEmisionidTipoEmision(_tipoEmisionidTipoEmision);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Rating _ratingidRating = orm.RatingDAO.loadRatingByORMID(getRatingidRating_ratingidRating());
			_animacion.setRatingidRating(_ratingidRating);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

