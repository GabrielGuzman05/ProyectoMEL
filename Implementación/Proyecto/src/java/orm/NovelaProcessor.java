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
public class NovelaProcessor {
	private int idNovela;
	
	private String nombre;
	
	private String nombreAlternativo;
	
	private String año;
	
	private Byte licenciado;
	
	private Byte completamenteTraducido;
	
	private String novelUpdateUrl;
	
	private Integer estrellas;
	
	private int estadoUsuarioidEstadoUsuario;
	
	private String action="";
	
	public void setIdNovela(int value) {
		this.idNovela = value;
	}
	
	public int getIdNovela() {
		return idNovela;
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
	
	public void setAño(String value) {
		this.año = value;
	}
	
	public String getAño() {
		return año == null ? "" : año;
	}
	
	public void setLicenciado(byte value) {
		setLicenciado(new Byte(value));
	}
	
	public void setLicenciado(Byte value) {
		this.licenciado = value;
	}
	
	public Byte getLicenciado() {
		return licenciado;
	}
	
	public void setCompletamenteTraducido(byte value) {
		setCompletamenteTraducido(new Byte(value));
	}
	
	public void setCompletamenteTraducido(Byte value) {
		this.completamenteTraducido = value;
	}
	
	public Byte getCompletamenteTraducido() {
		return completamenteTraducido;
	}
	
	public void setNovelUpdateUrl(String value) {
		this.novelUpdateUrl = value;
	}
	
	public String getNovelUpdateUrl() {
		return novelUpdateUrl == null ? "" : novelUpdateUrl;
	}
	
	public void setEstrellas(int value) {
		setEstrellas(new Integer(value));
	}
	
	public void setEstrellas(Integer value) {
		this.estrellas = value;
	}
	
	public Integer getEstrellas() {
		return estrellas;
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
	
	private int publicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal;
	
	public void setPublicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal(int value) {
		this.publicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal = value;
	}
	
	public int getPublicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal() {
		return publicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal;
	}
	
	private int autoridAutor_autoridAutor;
	
	public void setAutoridAutor_autoridAutor(int value) {
		this.autoridAutor_autoridAutor = value;
	}
	
	public int getAutoridAutor_autoridAutor() {
		return autoridAutor_autoridAutor;
	}
	
	private int publicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles;
	
	public void setPublicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles(int value) {
		this.publicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles = value;
	}
	
	public int getPublicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles() {
		return publicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles;
	}
	
	private int tipoidTipo_tipoidTipo;
	
	public void setTipoidTipo_tipoidTipo(int value) {
		this.tipoidTipo_tipoidTipo = value;
	}
	
	public int getTipoidTipo_tipoidTipo() {
		return tipoidTipo_tipoidTipo;
	}
	
	private int lenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje;
	
	public void setLenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje(int value) {
		this.lenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje = value;
	}
	
	public int getLenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje() {
		return lenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje;
	}
	
	private int artistaidArtista_artistaidArtista;
	
	public void setArtistaidArtista_artistaidArtista(int value) {
		this.artistaidArtista_artistaidArtista = value;
	}
	
	public int getArtistaidArtista_artistaidArtista() {
		return artistaidArtista_artistaidArtista;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Novela _novela = orm.NovelaDAO.loadNovelaByORMID(getIdNovela());
				if (_novela!= null) {
					copyFromBean(_novela);
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
				orm.Novela _novela = orm.NovelaDAO.createNovela();
				copyToBean(_novela);
				if (ORM.NovelaDAO.save(_novela)) {
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
				orm.Novela _novela= orm.NovelaDAO.loadNovelaByORMID(getIdNovela());
				if (_novela != null) {
					copyToBean(_novela);
					if (ORM.NovelaDAO.save(_novela)) {
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
				orm.Novela _novela = orm.NovelaDAO.loadNovelaByORMID(getIdNovela());
				if (_novela != null && ORM.NovelaDAO.deleteAndDissociate(_novela)) {
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
	
	private void copyFromBean(orm.Novela _novela) {
		setNombre(_novela.getNombre());
		setNombreAlternativo(_novela.getNombreAlternativo());
		setAño(_novela.getAño());
		setLicenciado(_novela.getLicenciado());
		setCompletamenteTraducido(_novela.getCompletamenteTraducido());
		setNovelUpdateUrl(_novela.getNovelUpdateUrl());
		setEstrellas(_novela.getEstrellas());
		setEstadoUsuarioidEstadoUsuario(_novela.getEstadoUsuarioidEstadoUsuario());
		setIdNovela(_novela.getORMID());
		
		{
			orm.PublicadorOriginal _publicadorOriginal = _novela.getPublicadorOriginalidPublicadorOriginal();
			if (_publicadorOriginal != null) {
				setPublicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal(_publicadorOriginal.getORMID());
			}
		}
		
		
		{
			orm.Autor _autor = _novela.getAutoridAutor();
			if (_autor != null) {
				setAutoridAutor_autoridAutor(_autor.getORMID());
			}
		}
		
		
		{
			orm.PublicadorIngles _publicadorIngles = _novela.getPublicadorInglesidPublicadorIngles();
			if (_publicadorIngles != null) {
				setPublicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles(_publicadorIngles.getORMID());
			}
		}
		
		
		{
			orm.Tipo _tipo = _novela.getTipoidTipo();
			if (_tipo != null) {
				setTipoidTipo_tipoidTipo(_tipo.getORMID());
			}
		}
		
		
		{
			orm.LenguajeOriginal _lenguajeOriginal = _novela.getLenguajeOriginalidLenguaje();
			if (_lenguajeOriginal != null) {
				setLenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje(_lenguajeOriginal.getORMID());
			}
		}
		
		
		{
			orm.Artista _artista = _novela.getArtistaidArtista();
			if (_artista != null) {
				setArtistaidArtista_artistaidArtista(_artista.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Novela _novela) {
		_novela.setNombre(getNombre());
		_novela.setNombreAlternativo(getNombreAlternativo());
		_novela.setAño(getAño());
		_novela.setLicenciado(getLicenciado());
		_novela.setCompletamenteTraducido(getCompletamenteTraducido());
		_novela.setNovelUpdateUrl(getNovelUpdateUrl());
		_novela.setEstrellas(getEstrellas());
		_novela.setEstadoUsuarioidEstadoUsuario(getEstadoUsuarioidEstadoUsuario());
		try  {
			orm.PublicadorOriginal _publicadorOriginalidPublicadorOriginal = orm.PublicadorOriginalDAO.loadPublicadorOriginalByORMID(getPublicadorOriginalidPublicadorOriginal_publicadorOriginalidPublicadorOriginal());
			_novela.setPublicadorOriginalidPublicadorOriginal(_publicadorOriginalidPublicadorOriginal);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Autor _autoridAutor = orm.AutorDAO.loadAutorByORMID(getAutoridAutor_autoridAutor());
			_novela.setAutoridAutor(_autoridAutor);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.PublicadorIngles _publicadorInglesidPublicadorIngles = orm.PublicadorInglesDAO.loadPublicadorInglesByORMID(getPublicadorInglesidPublicadorIngles_publicadorInglesidPublicadorIngles());
			_novela.setPublicadorInglesidPublicadorIngles(_publicadorInglesidPublicadorIngles);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Tipo _tipoidTipo = orm.TipoDAO.loadTipoByORMID(getTipoidTipo_tipoidTipo());
			_novela.setTipoidTipo(_tipoidTipo);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.LenguajeOriginal _lenguajeOriginalidLenguaje = orm.LenguajeOriginalDAO.loadLenguajeOriginalByORMID(getLenguajeOriginalidLenguaje_lenguajeOriginalidLenguaje());
			_novela.setLenguajeOriginalidLenguaje(_lenguajeOriginalidLenguaje);
		}
		catch (PersistentException e) {
		}
		
		try  {
			orm.Artista _artistaidArtista = orm.ArtistaDAO.loadArtistaByORMID(getArtistaidArtista_artistaidArtista());
			_novela.setArtistaidArtista(_artistaidArtista);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

