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
public class MangaProcessor {
	private int estadoUsuarioidEstadoUsuario;
	
	private int idManga;
	
	private String nombreManga;
	
	private String nombreAlternativo;
	
	private Byte completamenteScanlated;
	
	private Byte tieneAnimacion;
	
	private String año;
	
	private byte licenciado;
	
	private String bakaUpdatesCode;
	
	private String estadoEnPaisDeOrigen;
	
	private String animeStartEnd;
	
	private String action="";
	
	public void setEstadoUsuarioidEstadoUsuario(int value) {
		this.estadoUsuarioidEstadoUsuario = value;
	}
	
	public int getEstadoUsuarioidEstadoUsuario() {
		return estadoUsuarioidEstadoUsuario;
	}
	
	public void setIdManga(int value) {
		this.idManga = value;
	}
	
	public int getIdManga() {
		return idManga;
	}
	
	public void setNombreManga(String value) {
		this.nombreManga = value;
	}
	
	public String getNombreManga() {
		return nombreManga == null ? "" : nombreManga;
	}
	
	public void setNombreAlternativo(String value) {
		this.nombreAlternativo = value;
	}
	
	public String getNombreAlternativo() {
		return nombreAlternativo == null ? "" : nombreAlternativo;
	}
	
	public void setCompletamenteScanlated(byte value) {
		setCompletamenteScanlated(new Byte(value));
	}
	
	public void setCompletamenteScanlated(Byte value) {
		this.completamenteScanlated = value;
	}
	
	public Byte getCompletamenteScanlated() {
		return completamenteScanlated;
	}
	
	public void setTieneAnimacion(byte value) {
		setTieneAnimacion(new Byte(value));
	}
	
	public void setTieneAnimacion(Byte value) {
		this.tieneAnimacion = value;
	}
	
	public Byte getTieneAnimacion() {
		return tieneAnimacion;
	}
	
	public void setAño(String value) {
		this.año = value;
	}
	
	public String getAño() {
		return año == null ? "" : año;
	}
	
	public void setLicenciado(byte value) {
		this.licenciado = value;
	}
	
	public byte getLicenciado() {
		return licenciado;
	}
	
	public void setBakaUpdatesCode(String value) {
		this.bakaUpdatesCode = value;
	}
	
	public String getBakaUpdatesCode() {
		return bakaUpdatesCode == null ? "" : bakaUpdatesCode;
	}
	
	public void setEstadoEnPaisDeOrigen(String value) {
		this.estadoEnPaisDeOrigen = value;
	}
	
	public String getEstadoEnPaisDeOrigen() {
		return estadoEnPaisDeOrigen == null ? "" : estadoEnPaisDeOrigen;
	}
	
	public void setAnimeStartEnd(String value) {
		this.animeStartEnd = value;
	}
	
	public String getAnimeStartEnd() {
		return animeStartEnd == null ? "" : animeStartEnd;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int tipoMangaidTipoManga_tipoMangaidTipoManga;
	
	public void setTipoMangaidTipoManga_tipoMangaidTipoManga(int value) {
		this.tipoMangaidTipoManga_tipoMangaidTipoManga = value;
	}
	
	public int getTipoMangaidTipoManga_tipoMangaidTipoManga() {
		return tipoMangaidTipoManga_tipoMangaidTipoManga;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Manga _manga = orm.MangaDAO.loadMangaByORMID(getIdManga());
				if (_manga!= null) {
					copyFromBean(_manga);
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
				orm.Manga _manga = orm.MangaDAO.createManga();
				copyToBean(_manga);
				if (ORM.MangaDAO.save(_manga)) {
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
				orm.Manga _manga= orm.MangaDAO.loadMangaByORMID(getIdManga());
				if (_manga != null) {
					copyToBean(_manga);
					if (ORM.MangaDAO.save(_manga)) {
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
				orm.Manga _manga = orm.MangaDAO.loadMangaByORMID(getIdManga());
				if (_manga != null && ORM.MangaDAO.deleteAndDissociate(_manga)) {
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
	
	private void copyFromBean(orm.Manga _manga) {
		setEstadoUsuarioidEstadoUsuario(_manga.getEstadoUsuarioidEstadoUsuario());
		setNombreManga(_manga.getNombreManga());
		setNombreAlternativo(_manga.getNombreAlternativo());
		setCompletamenteScanlated(_manga.getCompletamenteScanlated());
		setTieneAnimacion(_manga.getTieneAnimacion());
		setAño(_manga.getAño());
		setLicenciado(_manga.getLicenciado());
		setBakaUpdatesCode(_manga.getBakaUpdatesCode());
		setEstadoEnPaisDeOrigen(_manga.getEstadoEnPaisDeOrigen());
		setAnimeStartEnd(_manga.getAnimeStartEnd());
		setIdManga(_manga.getORMID());
		
		{
			orm.TipoManga _tipoManga = _manga.getTipoMangaidTipoManga();
			if (_tipoManga != null) {
				setTipoMangaidTipoManga_tipoMangaidTipoManga(_tipoManga.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Manga _manga) {
		_manga.setEstadoUsuarioidEstadoUsuario(getEstadoUsuarioidEstadoUsuario());
		_manga.setNombreManga(getNombreManga());
		_manga.setNombreAlternativo(getNombreAlternativo());
		_manga.setCompletamenteScanlated(getCompletamenteScanlated());
		_manga.setTieneAnimacion(getTieneAnimacion());
		_manga.setAño(getAño());
		_manga.setLicenciado(getLicenciado());
		_manga.setBakaUpdatesCode(getBakaUpdatesCode());
		_manga.setEstadoEnPaisDeOrigen(getEstadoEnPaisDeOrigen());
		_manga.setAnimeStartEnd(getAnimeStartEnd());
		try  {
			orm.TipoManga _tipoMangaidTipoManga = orm.TipoMangaDAO.loadTipoMangaByORMID(getTipoMangaidTipoManga_tipoMangaidTipoManga());
			_manga.setTipoMangaidTipoManga(_tipoMangaidTipoManga);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

