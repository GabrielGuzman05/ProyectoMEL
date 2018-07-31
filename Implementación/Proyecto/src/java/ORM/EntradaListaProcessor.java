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
public class EntradaListaProcessor {
	private int idEntrada;
	
	private boolean alDia;
	
	private int ultimoCapitulo;
	
	private boolean terminado;
	
	private int tipo;
	
	private String action="";
	
	public void setIdEntrada(int value) {
		this.idEntrada = value;
	}
	
	public int getIdEntrada() {
		return idEntrada;
	}
	
	public void setAlDia(boolean value) {
		this.alDia = value;
	}
	
	public boolean getAlDia() {
		return alDia;
	}
	
	public void setUltimoCapitulo(int value) {
		this.ultimoCapitulo = value;
	}
	
	public int getUltimoCapitulo() {
		return ultimoCapitulo;
	}
	
	public void setTerminado(boolean value) {
		this.terminado = value;
	}
	
	public boolean getTerminado() {
		return terminado;
	}
	
	public void setTipo(int value) {
		this.tipo = value;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int listaidLista_listaidLista;
	
	public void setListaidLista_listaidLista(int value) {
		this.listaidLista_listaidLista = value;
	}
	
	public int getListaidLista_listaidLista() {
		return listaidLista_listaidLista;
	}
	
	private int novelaidNovela_novelaidNovela;
	
	public void setNovelaidNovela_novelaidNovela(int value) {
		this.novelaidNovela_novelaidNovela = value;
	}
	
	public int getNovelaidNovela_novelaidNovela() {
		return novelaidNovela_novelaidNovela;
	}
	
	private int mangaidManga_mangaidManga;
	
	public void setMangaidManga_mangaidManga(int value) {
		this.mangaidManga_mangaidManga = value;
	}
	
	public int getMangaidManga_mangaidManga() {
		return mangaidManga_mangaidManga;
	}
	
	private int animacionidAnimacion_animacionidAnimacion;
	
	public void setAnimacionidAnimacion_animacionidAnimacion(int value) {
		this.animacionidAnimacion_animacionidAnimacion = value;
	}
	
	public int getAnimacionidAnimacion_animacionidAnimacion() {
		return animacionidAnimacion_animacionidAnimacion;
	}
	
	private int serieGenericaidSerie_serieGenericaidSerie;
	
	public void setSerieGenericaidSerie_serieGenericaidSerie(int value) {
		this.serieGenericaidSerie_serieGenericaidSerie = value;
	}
	
	public int getSerieGenericaidSerie_serieGenericaidSerie() {
		return serieGenericaidSerie_serieGenericaidSerie;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				ORM.EntradaLista _entradaLista = ORM.EntradaListaDAO.loadEntradaListaByORMID(getIdEntrada());
				if (_entradaLista!= null) {
					copyFromBean(_entradaLista);
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
				ORM.EntradaLista _entradaLista = ORM.EntradaListaDAO.createEntradaLista();
				copyToBean(_entradaLista);
				if (ORM.EntradaListaDAO.save(_entradaLista)) {
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
				ORM.EntradaLista _entradaLista= ORM.EntradaListaDAO.loadEntradaListaByORMID(getIdEntrada());
				if (_entradaLista != null) {
					copyToBean(_entradaLista);
					if (ORM.EntradaListaDAO.save(_entradaLista)) {
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
				ORM.EntradaLista _entradaLista = ORM.EntradaListaDAO.loadEntradaListaByORMID(getIdEntrada());
				if (_entradaLista != null && ORM.EntradaListaDAO.deleteAndDissociate(_entradaLista)) {
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
	
	private void copyFromBean(ORM.EntradaLista _entradaLista) {
		setAlDia(_entradaLista.getAlDia());
		setUltimoCapitulo(_entradaLista.getUltimoCapitulo());
		setTerminado(_entradaLista.getTerminado());
		setTipo(_entradaLista.getTipo());
		setIdEntrada(_entradaLista.getORMID());
		
		{
			ORM.Lista _lista = _entradaLista.getListaidLista();
			if (_lista != null) {
				setListaidLista_listaidLista(_lista.getORMID());
			}
		}
		
		
		{
			ORM.Novela _novela = _entradaLista.getNovelaidNovela();
			if (_novela != null) {
				setNovelaidNovela_novelaidNovela(_novela.getORMID());
			}
		}
		
		
		{
			ORM.Manga _manga = _entradaLista.getMangaidManga();
			if (_manga != null) {
				setMangaidManga_mangaidManga(_manga.getORMID());
			}
		}
		
		
		{
			ORM.Animacion _animacion = _entradaLista.getAnimacionidAnimacion();
			if (_animacion != null) {
				setAnimacionidAnimacion_animacionidAnimacion(_animacion.getORMID());
			}
		}
		
		
		{
			ORM.SerieGenerica _serieGenerica = _entradaLista.getSerieGenericaidSerie();
			if (_serieGenerica != null) {
				setSerieGenericaidSerie_serieGenericaidSerie(_serieGenerica.getORMID());
			}
		}
		
	}
	
	private void copyToBean(ORM.EntradaLista _entradaLista) {
		_entradaLista.setAlDia(getAlDia());
		_entradaLista.setUltimoCapitulo(getUltimoCapitulo());
		_entradaLista.setTerminado(getTerminado());
		_entradaLista.setTipo(getTipo());
		try  {
			ORM.Lista _listaidLista = ORM.ListaDAO.loadListaByORMID(getListaidLista_listaidLista());
			_entradaLista.setListaidLista(_listaidLista);
		}
		catch (PersistentException e) {
		}
		
		try  {
			ORM.Novela _novelaidNovela = ORM.NovelaDAO.loadNovelaByORMID(getNovelaidNovela_novelaidNovela());
			_entradaLista.setNovelaidNovela(_novelaidNovela);
		}
		catch (PersistentException e) {
		}
		
		try  {
			ORM.Manga _mangaidManga = ORM.MangaDAO.loadMangaByORMID(getMangaidManga_mangaidManga());
			_entradaLista.setMangaidManga(_mangaidManga);
		}
		catch (PersistentException e) {
		}
		
		try  {
			ORM.Animacion _animacionidAnimacion = ORM.AnimacionDAO.loadAnimacionByORMID(getAnimacionidAnimacion_animacionidAnimacion());
			_entradaLista.setAnimacionidAnimacion(_animacionidAnimacion);
		}
		catch (PersistentException e) {
		}
		
		try  {
			ORM.SerieGenerica _serieGenericaidSerie = ORM.SerieGenericaDAO.loadSerieGenericaByORMID(getSerieGenericaidSerie_serieGenericaidSerie());
			_entradaLista.setSerieGenericaidSerie(_serieGenericaidSerie);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

