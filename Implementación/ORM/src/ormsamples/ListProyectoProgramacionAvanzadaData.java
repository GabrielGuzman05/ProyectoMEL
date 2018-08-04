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
		orm.Novela[] oRMNovelas = orm.NovelaDAO.listNovelaByQuery(null, null);
		int length = Math.min(oRMNovelas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMNovelas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing LenguajeOriginal...");
		orm.LenguajeOriginal[] oRMLenguajeOriginals = orm.LenguajeOriginalDAO.listLenguajeOriginalByQuery(null, null);
		length = Math.min(oRMLenguajeOriginals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMLenguajeOriginals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PublicadorOriginal...");
		orm.PublicadorOriginal[] oRMPublicadorOriginals = orm.PublicadorOriginalDAO.listPublicadorOriginalByQuery(null, null);
		length = Math.min(oRMPublicadorOriginals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMPublicadorOriginals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PublicadorIngles...");
		orm.PublicadorIngles[] oRMPublicadorIngleses = orm.PublicadorInglesDAO.listPublicadorInglesByQuery(null, null);
		length = Math.min(oRMPublicadorIngleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMPublicadorIngleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tag...");
		orm.Tag[] oRMTags = orm.TagDAO.listTagByQuery(null, null);
		length = Math.min(oRMTags.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTags[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tipo...");
		orm.Tipo[] oRMTipos = orm.TipoDAO.listTipoByQuery(null, null);
		length = Math.min(oRMTipos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTipos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Genero...");
		orm.Genero[] oRMGeneros = orm.GeneroDAO.listGeneroByQuery(null, null);
		length = Math.min(oRMGeneros.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMGeneros[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Autor...");
		orm.Autor[] oRMAutors = orm.AutorDAO.listAutorByQuery(null, null);
		length = Math.min(oRMAutors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMAutors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Animacion...");
		orm.Animacion[] oRMAnimacions = orm.AnimacionDAO.listAnimacionByQuery(null, null);
		length = Math.min(oRMAnimacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMAnimacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estudio...");
		orm.Estudio[] oRMEstudios = orm.EstudioDAO.listEstudioByQuery(null, null);
		length = Math.min(oRMEstudios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMEstudios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Temporada...");
		orm.Temporada[] oRMTemporadas = orm.TemporadaDAO.listTemporadaByQuery(null, null);
		length = Math.min(oRMTemporadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTemporadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipoEmision...");
		orm.TipoEmision[] oRMTipoEmisions = orm.TipoEmisionDAO.listTipoEmisionByQuery(null, null);
		length = Math.min(oRMTipoEmisions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTipoEmisions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Manga...");
		orm.Manga[] oRMMangas = orm.MangaDAO.listMangaByQuery(null, null);
		length = Math.min(oRMMangas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMMangas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		orm.Artista[] oRMArtistas = orm.ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(oRMArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipoManga...");
		orm.TipoManga[] oRMTipoMangas = orm.TipoMangaDAO.listTipoMangaByQuery(null, null);
		length = Math.min(oRMTipoMangas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMTipoMangas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SerieGenerica...");
		orm.SerieGenerica[] oRMSerieGenericas = orm.SerieGenericaDAO.listSerieGenericaByQuery(null, null);
		length = Math.min(oRMSerieGenericas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMSerieGenericas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Rating...");
		orm.Rating[] oRMRatings = orm.RatingDAO.listRatingByQuery(null, null);
		length = Math.min(oRMRatings.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMRatings[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		orm.Usuario[] oRMUsuarios = orm.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(oRMUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista...");
		orm.Lista[] oRMListas = orm.ListaDAO.listListaByQuery(null, null);
		length = Math.min(oRMListas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMListas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EntradaLista...");
		orm.EntradaLista[] oRMEntradaListas = orm.EntradaListaDAO.listEntradaListaByQuery(null, null);
		length = Math.min(oRMEntradaListas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMEntradaListas[i]);
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
