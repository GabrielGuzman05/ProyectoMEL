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

public class EntradaLista {
	public EntradaLista() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ENTRADALISTA_LISTAIDLISTA) {
			this.listaidLista = (orm.Lista) owner;
		}
		
		else if (key == ORMConstants.KEY_ENTRADALISTA_NOVELAIDNOVELA) {
			this.novelaidNovela = (orm.Novela) owner;
		}
		
		else if (key == ORMConstants.KEY_ENTRADALISTA_MANGAIDMANGA) {
			this.mangaidManga = (orm.Manga) owner;
		}
		
		else if (key == ORMConstants.KEY_ENTRADALISTA_ANIMACIONIDANIMACION) {
			this.animacionidAnimacion = (orm.Animacion) owner;
		}
		
		else if (key == ORMConstants.KEY_ENTRADALISTA_SERIEGENERICAIDSERIE) {
			this.serieGenericaidSerie = (orm.SerieGenerica) owner;
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
	
	private orm.Lista listaidLista;
	
	private orm.Novela novelaidNovela;
	
	private orm.Manga mangaidManga;
	
	private orm.Animacion animacionidAnimacion;
	
	private orm.SerieGenerica serieGenericaidSerie;
	
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
	
	public void setListaidLista(orm.Lista value) {
		if (listaidLista != null) {
			listaidLista.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public orm.Lista getListaidLista() {
		return listaidLista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ListaidLista(orm.Lista value) {
		this.listaidLista = value;
	}
	
	private orm.Lista getORM_ListaidLista() {
		return listaidLista;
	}
	
	public void setNovelaidNovela(orm.Novela value) {
		if (novelaidNovela != null) {
			novelaidNovela.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public orm.Novela getNovelaidNovela() {
		return novelaidNovela;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_NovelaidNovela(orm.Novela value) {
		this.novelaidNovela = value;
	}
	
	private orm.Novela getORM_NovelaidNovela() {
		return novelaidNovela;
	}
	
	public void setMangaidManga(orm.Manga value) {
		if (mangaidManga != null) {
			mangaidManga.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public orm.Manga getMangaidManga() {
		return mangaidManga;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_MangaidManga(orm.Manga value) {
		this.mangaidManga = value;
	}
	
	private orm.Manga getORM_MangaidManga() {
		return mangaidManga;
	}
	
	public void setAnimacionidAnimacion(orm.Animacion value) {
		if (animacionidAnimacion != null) {
			animacionidAnimacion.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public orm.Animacion getAnimacionidAnimacion() {
		return animacionidAnimacion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_AnimacionidAnimacion(orm.Animacion value) {
		this.animacionidAnimacion = value;
	}
	
	private orm.Animacion getORM_AnimacionidAnimacion() {
		return animacionidAnimacion;
	}
	
	public void setSerieGenericaidSerie(orm.SerieGenerica value) {
		if (serieGenericaidSerie != null) {
			serieGenericaidSerie.entradaLista.remove(this);
		}
		if (value != null) {
			value.entradaLista.add(this);
		}
	}
	
	public orm.SerieGenerica getSerieGenericaidSerie() {
		return serieGenericaidSerie;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_SerieGenericaidSerie(orm.SerieGenerica value) {
		this.serieGenericaidSerie = value;
	}
	
	private orm.SerieGenerica getORM_SerieGenericaidSerie() {
		return serieGenericaidSerie;
	}
	
	public String toString() {
		return String.valueOf(getIdEntrada());
	}
	
}
