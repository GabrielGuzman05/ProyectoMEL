/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoProgramacionAvanzadaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Novela...");
		orm.Novela[] ormNovelas = orm.NovelaDAO.listNovelaByQuery(null, null);
		int length = Math.min(ormNovelas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormNovelas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing LenguajeOriginal...");
		orm.LenguajeOriginal[] ormLenguajeOriginals = orm.LenguajeOriginalDAO.listLenguajeOriginalByQuery(null, null);
		length = Math.min(ormLenguajeOriginals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormLenguajeOriginals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PublicadorOriginal...");
		orm.PublicadorOriginal[] ormPublicadorOriginals = orm.PublicadorOriginalDAO.listPublicadorOriginalByQuery(null, null);
		length = Math.min(ormPublicadorOriginals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPublicadorOriginals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PublicadorIngles...");
		orm.PublicadorIngles[] ormPublicadorIngleses = orm.PublicadorInglesDAO.listPublicadorInglesByQuery(null, null);
		length = Math.min(ormPublicadorIngleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPublicadorIngleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tag...");
		orm.Tag[] ormTags = orm.TagDAO.listTagByQuery(null, null);
		length = Math.min(ormTags.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTags[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tipo...");
		orm.Tipo[] ormTipos = orm.TipoDAO.listTipoByQuery(null, null);
		length = Math.min(ormTipos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTipos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Genero...");
		orm.Genero[] ormGeneros = orm.GeneroDAO.listGeneroByQuery(null, null);
		length = Math.min(ormGeneros.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormGeneros[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Autor...");
		orm.Autor[] ormAutors = orm.AutorDAO.listAutorByQuery(null, null);
		length = Math.min(ormAutors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAutors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Animacion...");
		orm.Animacion[] ormAnimacions = orm.AnimacionDAO.listAnimacionByQuery(null, null);
		length = Math.min(ormAnimacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAnimacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estudio...");
		orm.Estudio[] ormEstudios = orm.EstudioDAO.listEstudioByQuery(null, null);
		length = Math.min(ormEstudios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEstudios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Temporada...");
		orm.Temporada[] ormTemporadas = orm.TemporadaDAO.listTemporadaByQuery(null, null);
		length = Math.min(ormTemporadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTemporadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipoEmision...");
		orm.TipoEmision[] ormTipoEmisions = orm.TipoEmisionDAO.listTipoEmisionByQuery(null, null);
		length = Math.min(ormTipoEmisions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTipoEmisions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Manga...");
		orm.Manga[] ormMangas = orm.MangaDAO.listMangaByQuery(null, null);
		length = Math.min(ormMangas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMangas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		orm.Artista[] ormArtistas = orm.ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(ormArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipoManga...");
		orm.TipoManga[] ormTipoMangas = orm.TipoMangaDAO.listTipoMangaByQuery(null, null);
		length = Math.min(ormTipoMangas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTipoMangas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SerieGenerica...");
		orm.SerieGenerica[] ormSerieGenericas = orm.SerieGenericaDAO.listSerieGenericaByQuery(null, null);
		length = Math.min(ormSerieGenericas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormSerieGenericas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Rating...");
		orm.Rating[] ormRatings = orm.RatingDAO.listRatingByQuery(null, null);
		length = Math.min(ormRatings.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormRatings[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		orm.Usuario[] ormUsuarios = orm.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(ormUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista...");
		orm.Lista[] ormListas = orm.ListaDAO.listListaByQuery(null, null);
		length = Math.min(ormListas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormListas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EntradaLista...");
		orm.EntradaLista[] ormEntradaListas = orm.EntradaListaDAO.listEntradaListaByQuery(null, null);
		length = Math.min(ormEntradaListas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEntradaListas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mangaka...");
		orm.Mangaka[] ormMangakas = orm.MangakaDAO.listMangakaByQuery(null, null);
		length = Math.min(ormMangakas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMangakas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoProgramacionAvanzadaData listProyectoProgramacionAvanzadaData = new ListProyectoProgramacionAvanzadaData();
			try {
				listProyectoProgramacionAvanzadaData.listTestData();
			}
			finally {
				orm.ProyectoProgramacionAvanzadaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
