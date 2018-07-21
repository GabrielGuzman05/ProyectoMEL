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
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Novela by Criteria...");
		orm.NovelaCriteria oRMNovelaCriteria = new orm.NovelaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMNovelaCriteria.idNovela.eq();
		oRMNovelaCriteria.setMaxResults(ROW_COUNT);
		orm.Novela[] oRMNovelas = oRMNovelaCriteria.listNovela();
		int length =oRMNovelas== null ? 0 : Math.min(oRMNovelas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMNovelas[i]);
		}
		System.out.println(length + " Novela record(s) retrieved."); 
		
		System.out.println("Listing LenguajeOriginal by Criteria...");
		orm.LenguajeOriginalCriteria oRMLenguajeOriginalCriteria = new orm.LenguajeOriginalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMLenguajeOriginalCriteria.idLenguaje.eq();
		oRMLenguajeOriginalCriteria.setMaxResults(ROW_COUNT);
		orm.LenguajeOriginal[] oRMLenguajeOriginals = oRMLenguajeOriginalCriteria.listLenguajeOriginal();
		length =oRMLenguajeOriginals== null ? 0 : Math.min(oRMLenguajeOriginals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMLenguajeOriginals[i]);
		}
		System.out.println(length + " LenguajeOriginal record(s) retrieved."); 
		
		System.out.println("Listing PublicadorOriginal by Criteria...");
		orm.PublicadorOriginalCriteria oRMPublicadorOriginalCriteria = new orm.PublicadorOriginalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMPublicadorOriginalCriteria.idPublicadorOriginal.eq();
		oRMPublicadorOriginalCriteria.setMaxResults(ROW_COUNT);
		orm.PublicadorOriginal[] oRMPublicadorOriginals = oRMPublicadorOriginalCriteria.listPublicadorOriginal();
		length =oRMPublicadorOriginals== null ? 0 : Math.min(oRMPublicadorOriginals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMPublicadorOriginals[i]);
		}
		System.out.println(length + " PublicadorOriginal record(s) retrieved."); 
		
		System.out.println("Listing PublicadorIngles by Criteria...");
		orm.PublicadorInglesCriteria oRMPublicadorInglesCriteria = new orm.PublicadorInglesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMPublicadorInglesCriteria.idPublicadorIngles.eq();
		oRMPublicadorInglesCriteria.setMaxResults(ROW_COUNT);
		orm.PublicadorIngles[] oRMPublicadorIngleses = oRMPublicadorInglesCriteria.listPublicadorIngles();
		length =oRMPublicadorIngleses== null ? 0 : Math.min(oRMPublicadorIngleses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMPublicadorIngleses[i]);
		}
		System.out.println(length + " PublicadorIngles record(s) retrieved."); 
		
		System.out.println("Listing Tag by Criteria...");
		orm.TagCriteria oRMTagCriteria = new orm.TagCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTagCriteria.idTag.eq();
		oRMTagCriteria.setMaxResults(ROW_COUNT);
		orm.Tag[] oRMTags = oRMTagCriteria.listTag();
		length =oRMTags== null ? 0 : Math.min(oRMTags.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTags[i]);
		}
		System.out.println(length + " Tag record(s) retrieved."); 
		
		System.out.println("Listing Tipo by Criteria...");
		orm.TipoCriteria oRMTipoCriteria = new orm.TipoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTipoCriteria.idTipo.eq();
		oRMTipoCriteria.setMaxResults(ROW_COUNT);
		orm.Tipo[] oRMTipos = oRMTipoCriteria.listTipo();
		length =oRMTipos== null ? 0 : Math.min(oRMTipos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTipos[i]);
		}
		System.out.println(length + " Tipo record(s) retrieved."); 
		
		System.out.println("Listing Genero by Criteria...");
		orm.GeneroCriteria oRMGeneroCriteria = new orm.GeneroCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMGeneroCriteria.idGenero.eq();
		oRMGeneroCriteria.setMaxResults(ROW_COUNT);
		orm.Genero[] oRMGeneros = oRMGeneroCriteria.listGenero();
		length =oRMGeneros== null ? 0 : Math.min(oRMGeneros.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMGeneros[i]);
		}
		System.out.println(length + " Genero record(s) retrieved."); 
		
		System.out.println("Listing Autor by Criteria...");
		orm.AutorCriteria oRMAutorCriteria = new orm.AutorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMAutorCriteria.idAutor.eq();
		oRMAutorCriteria.setMaxResults(ROW_COUNT);
		orm.Autor[] oRMAutors = oRMAutorCriteria.listAutor();
		length =oRMAutors== null ? 0 : Math.min(oRMAutors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMAutors[i]);
		}
		System.out.println(length + " Autor record(s) retrieved."); 
		
		System.out.println("Listing Animacion by Criteria...");
		orm.AnimacionCriteria oRMAnimacionCriteria = new orm.AnimacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMAnimacionCriteria.idAnimacion.eq();
		oRMAnimacionCriteria.setMaxResults(ROW_COUNT);
		orm.Animacion[] oRMAnimacions = oRMAnimacionCriteria.listAnimacion();
		length =oRMAnimacions== null ? 0 : Math.min(oRMAnimacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMAnimacions[i]);
		}
		System.out.println(length + " Animacion record(s) retrieved."); 
		
		System.out.println("Listing Estudio by Criteria...");
		orm.EstudioCriteria oRMEstudioCriteria = new orm.EstudioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMEstudioCriteria.idEstudio.eq();
		oRMEstudioCriteria.setMaxResults(ROW_COUNT);
		orm.Estudio[] oRMEstudios = oRMEstudioCriteria.listEstudio();
		length =oRMEstudios== null ? 0 : Math.min(oRMEstudios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMEstudios[i]);
		}
		System.out.println(length + " Estudio record(s) retrieved."); 
		
		System.out.println("Listing Temporada by Criteria...");
		orm.TemporadaCriteria oRMTemporadaCriteria = new orm.TemporadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTemporadaCriteria.idTemporada.eq();
		oRMTemporadaCriteria.setMaxResults(ROW_COUNT);
		orm.Temporada[] oRMTemporadas = oRMTemporadaCriteria.listTemporada();
		length =oRMTemporadas== null ? 0 : Math.min(oRMTemporadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTemporadas[i]);
		}
		System.out.println(length + " Temporada record(s) retrieved."); 
		
		System.out.println("Listing TipoEmision by Criteria...");
		orm.TipoEmisionCriteria oRMTipoEmisionCriteria = new orm.TipoEmisionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTipoEmisionCriteria.idTipoEmision.eq();
		oRMTipoEmisionCriteria.setMaxResults(ROW_COUNT);
		orm.TipoEmision[] oRMTipoEmisions = oRMTipoEmisionCriteria.listTipoEmision();
		length =oRMTipoEmisions== null ? 0 : Math.min(oRMTipoEmisions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTipoEmisions[i]);
		}
		System.out.println(length + " TipoEmision record(s) retrieved."); 
		
		System.out.println("Listing Manga by Criteria...");
		orm.MangaCriteria oRMMangaCriteria = new orm.MangaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMMangaCriteria.idManga.eq();
		oRMMangaCriteria.setMaxResults(ROW_COUNT);
		orm.Manga[] oRMMangas = oRMMangaCriteria.listManga();
		length =oRMMangas== null ? 0 : Math.min(oRMMangas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMMangas[i]);
		}
		System.out.println(length + " Manga record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		orm.ArtistaCriteria oRMArtistaCriteria = new orm.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMArtistaCriteria.idArtista.eq();
		oRMArtistaCriteria.setMaxResults(ROW_COUNT);
		orm.Artista[] oRMArtistas = oRMArtistaCriteria.listArtista();
		length =oRMArtistas== null ? 0 : Math.min(oRMArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing TipoManga by Criteria...");
		orm.TipoMangaCriteria oRMTipoMangaCriteria = new orm.TipoMangaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTipoMangaCriteria.idTipoManga.eq();
		oRMTipoMangaCriteria.setMaxResults(ROW_COUNT);
		orm.TipoManga[] oRMTipoMangas = oRMTipoMangaCriteria.listTipoManga();
		length =oRMTipoMangas== null ? 0 : Math.min(oRMTipoMangas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTipoMangas[i]);
		}
		System.out.println(length + " TipoManga record(s) retrieved."); 
		
		System.out.println("Listing SerieGenerica by Criteria...");
		orm.SerieGenericaCriteria oRMSerieGenericaCriteria = new orm.SerieGenericaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMSerieGenericaCriteria.idSerie.eq();
		oRMSerieGenericaCriteria.setMaxResults(ROW_COUNT);
		orm.SerieGenerica[] oRMSerieGenericas = oRMSerieGenericaCriteria.listSerieGenerica();
		length =oRMSerieGenericas== null ? 0 : Math.min(oRMSerieGenericas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMSerieGenericas[i]);
		}
		System.out.println(length + " SerieGenerica record(s) retrieved."); 
		
		System.out.println("Listing Rating by Criteria...");
		orm.RatingCriteria oRMRatingCriteria = new orm.RatingCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMRatingCriteria.idRating.eq();
		oRMRatingCriteria.setMaxResults(ROW_COUNT);
		orm.Rating[] oRMRatings = oRMRatingCriteria.listRating();
		length =oRMRatings== null ? 0 : Math.min(oRMRatings.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMRatings[i]);
		}
		System.out.println(length + " Rating record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		orm.UsuarioCriteria oRMUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMUsuarioCriteria.idUsuario.eq();
		oRMUsuarioCriteria.setMaxResults(ROW_COUNT);
		orm.Usuario[] oRMUsuarios = oRMUsuarioCriteria.listUsuario();
		length =oRMUsuarios== null ? 0 : Math.min(oRMUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Lista by Criteria...");
		orm.ListaCriteria oRMListaCriteria = new orm.ListaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMListaCriteria.idLista.eq();
		oRMListaCriteria.setMaxResults(ROW_COUNT);
		orm.Lista[] oRMListas = oRMListaCriteria.listLista();
		length =oRMListas== null ? 0 : Math.min(oRMListas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMListas[i]);
		}
		System.out.println(length + " Lista record(s) retrieved."); 
		
		System.out.println("Listing EntradaLista by Criteria...");
		orm.EntradaListaCriteria oRMEntradaListaCriteria = new orm.EntradaListaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMEntradaListaCriteria.idEntrada.eq();
		oRMEntradaListaCriteria.setMaxResults(ROW_COUNT);
		orm.EntradaLista[] oRMEntradaListas = oRMEntradaListaCriteria.listEntradaLista();
		length =oRMEntradaListas== null ? 0 : Math.min(oRMEntradaListas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMEntradaListas[i]);
		}
		System.out.println(length + " EntradaLista record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoProgramacionAvanzadaData listProyectoProgramacionAvanzadaData = new ListProyectoProgramacionAvanzadaData();
			try {
				listProyectoProgramacionAvanzadaData.listTestData();
				//listProyectoProgramacionAvanzadaData.listByCriteria();
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
