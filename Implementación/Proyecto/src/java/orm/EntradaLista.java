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

import java.io.Serializable;
public class EntradaLista implements Serializable {
	public EntradaLista() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORM.ORMConstants.KEY_ENTRADALISTA_LISTAIDLISTA) {
			this.listaidLista = (ORM.Lista) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_ENTRADALISTA_NOVELAIDNOVELA) {
			this.novelaidNovela = (ORM.Novela) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_ENTRADALISTA_MANGAIDMANGA) {
			this.mangaidManga = (ORM.Manga) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_ENTRADALISTA_ANIMACIONIDANIMACION) {
			this.animacionidAnimacion = (ORM.Animacion) owner;
		}
		
		else if (key == ORM.ORMConstants.KEY_ENTRADALISTA_SERIEGENERICAIDSERIE) {
			this.serieGenericaidSerie = (ORM.SerieGenerica) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idEntrada;
	
	private boolean alDia;
	
	private int ultimoCapitulo;
	
	private boolean terminado;
	
	private int tipo;
	
	private ORM.Lista listaidLista;
	
	private ORM.Novela novelaidNovela;
	
	private ORM.Manga mangaidManga;
	
	private ORM.Animacion animacionidAnimacion;
	
	private ORM.SerieGenerica serieGenericaidSerie;
	
	private void setIdEntrada(int value) {
		this.idEntrada = value;
	}
	
	public int getIdEntrada() {
		return idEntrada;
	}
	
	public int getORMID() {
		return getIdEntrada();
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
	
	public void setListaidLista(ORM.Lista value) {
		if (listaidLista != null) {
			listaidLista.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public ORM.Lista getListaidLista() {
		return listaidLista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ListaidLista(ORM.Lista value) {
		this.listaidLista = value;
	}
	
	private ORM.Lista getORM_ListaidLista() {
		return listaidLista;
	}
	
	public void setNovelaidNovela(ORM.Novela value) {
		if (novelaidNovela != null) {
			novelaidNovela.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public ORM.Novela getNovelaidNovela() {
		return novelaidNovela;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_NovelaidNovela(ORM.Novela value) {
		this.novelaidNovela = value;
	}
	
	private ORM.Novela getORM_NovelaidNovela() {
		return novelaidNovela;
	}
	
	public void setMangaidManga(ORM.Manga value) {
		if (mangaidManga != null) {
			mangaidManga.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public ORM.Manga getMangaidManga() {
		return mangaidManga;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_MangaidManga(ORM.Manga value) {
		this.mangaidManga = value;
	}
	
	private ORM.Manga getORM_MangaidManga() {
		return mangaidManga;
	}
	
	public void setAnimacionidAnimacion(ORM.Animacion value) {
		if (animacionidAnimacion != null) {
			animacionidAnimacion.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public ORM.Animacion getAnimacionidAnimacion() {
		return animacionidAnimacion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_AnimacionidAnimacion(ORM.Animacion value) {
		this.animacionidAnimacion = value;
	}
	
	private ORM.Animacion getORM_AnimacionidAnimacion() {
		return animacionidAnimacion;
	}
	
	public void setSerieGenericaidSerie(ORM.SerieGenerica value) {
		if (serieGenericaidSerie != null) {
			serieGenericaidSerie.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public ORM.SerieGenerica getSerieGenericaidSerie() {
		return serieGenericaidSerie;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_SerieGenericaidSerie(ORM.SerieGenerica value) {
		this.serieGenericaidSerie = value;
	}
	
	private ORM.SerieGenerica getORM_SerieGenericaidSerie() {
		return serieGenericaidSerie;
	}
	
	public String toString() {
		return String.valueOf(getIdEntrada());
	}
	
}
