/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoProgramacionAvanzadaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
            int length=0;
            /*
                System.out.println("Listing Novela...");
		orm.Novela[] oRMNovelas = orm.NovelaDAO.listNovelaByQuery(null, null);
		length = Math.min(oRMNovelas.length, ROW_COUNT);
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
		*/
		System.out.println("Listing Usuario...");
		ORM.Usuario[] oRMUsuarios = ORM.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(oRMUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMUsuarios[i]);
		}
                /*
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
		*/
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Novela by Criteria...");
		ORM.NovelaCriteria oRMNovelaCriteria = new ORM.NovelaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMNovelaCriteria.idNovela.eq();
		oRMNovelaCriteria.setMaxResults(ROW_COUNT);
		ORM.Novela[] oRMNovelas = oRMNovelaCriteria.listNovela();
		int length =oRMNovelas== null ? 0 : Math.min(oRMNovelas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMNovelas[i]);
		}
		System.out.println(length + " Novela record(s) retrieved."); 
		
		System.out.println("Listing LenguajeOriginal by Criteria...");
		ORM.LenguajeOriginalCriteria oRMLenguajeOriginalCriteria = new ORM.LenguajeOriginalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMLenguajeOriginalCriteria.idLenguaje.eq();
		oRMLenguajeOriginalCriteria.setMaxResults(ROW_COUNT);
		ORM.LenguajeOriginal[] oRMLenguajeOriginals = oRMLenguajeOriginalCriteria.listLenguajeOriginal();
		length =oRMLenguajeOriginals== null ? 0 : Math.min(oRMLenguajeOriginals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMLenguajeOriginals[i]);
		}
		System.out.println(length + " LenguajeOriginal record(s) retrieved."); 
		
		System.out.println("Listing PublicadorOriginal by Criteria...");
		ORM.PublicadorOriginalCriteria oRMPublicadorOriginalCriteria = new ORM.PublicadorOriginalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMPublicadorOriginalCriteria.idPublicadorOriginal.eq();
		oRMPublicadorOriginalCriteria.setMaxResults(ROW_COUNT);
		ORM.PublicadorOriginal[] oRMPublicadorOriginals = oRMPublicadorOriginalCriteria.listPublicadorOriginal();
		length =oRMPublicadorOriginals== null ? 0 : Math.min(oRMPublicadorOriginals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMPublicadorOriginals[i]);
		}
		System.out.println(length + " PublicadorOriginal record(s) retrieved."); 
		
		System.out.println("Listing PublicadorIngles by Criteria...");
		ORM.PublicadorInglesCriteria oRMPublicadorInglesCriteria = new ORM.PublicadorInglesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMPublicadorInglesCriteria.idPublicadorIngles.eq();
		oRMPublicadorInglesCriteria.setMaxResults(ROW_COUNT);
		ORM.PublicadorIngles[] oRMPublicadorIngleses = oRMPublicadorInglesCriteria.listPublicadorIngles();
		length =oRMPublicadorIngleses== null ? 0 : Math.min(oRMPublicadorIngleses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMPublicadorIngleses[i]);
		}
		System.out.println(length + " PublicadorIngles record(s) retrieved."); 
		
		System.out.println("Listing Tag by Criteria...");
		ORM.TagCriteria oRMTagCriteria = new ORM.TagCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTagCriteria.idTag.eq();
		oRMTagCriteria.setMaxResults(ROW_COUNT);
		ORM.Tag[] oRMTags = oRMTagCriteria.listTag();
		length =oRMTags== null ? 0 : Math.min(oRMTags.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTags[i]);
		}
		System.out.println(length + " Tag record(s) retrieved."); 
		
		System.out.println("Listing Tipo by Criteria...");
		ORM.TipoCriteria oRMTipoCriteria = new ORM.TipoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTipoCriteria.idTipo.eq();
		oRMTipoCriteria.setMaxResults(ROW_COUNT);
		ORM.Tipo[] oRMTipos = oRMTipoCriteria.listTipo();
		length =oRMTipos== null ? 0 : Math.min(oRMTipos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTipos[i]);
		}
		System.out.println(length + " Tipo record(s) retrieved."); 
		
		System.out.println("Listing Genero by Criteria...");
		ORM.GeneroCriteria oRMGeneroCriteria = new ORM.GeneroCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMGeneroCriteria.idGenero.eq();
		oRMGeneroCriteria.setMaxResults(ROW_COUNT);
		ORM.Genero[] oRMGeneros = oRMGeneroCriteria.listGenero();
		length =oRMGeneros== null ? 0 : Math.min(oRMGeneros.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMGeneros[i]);
		}
		System.out.println(length + " Genero record(s) retrieved."); 
		
		System.out.println("Listing Autor by Criteria...");
		ORM.AutorCriteria oRMAutorCriteria = new ORM.AutorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMAutorCriteria.idAutor.eq();
		oRMAutorCriteria.setMaxResults(ROW_COUNT);
		ORM.Autor[] oRMAutors = oRMAutorCriteria.listAutor();
		length =oRMAutors== null ? 0 : Math.min(oRMAutors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMAutors[i]);
		}
		System.out.println(length + " Autor record(s) retrieved."); 
		
		System.out.println("Listing Animacion by Criteria...");
		ORM.AnimacionCriteria oRMAnimacionCriteria = new ORM.AnimacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMAnimacionCriteria.idAnimacion.eq();
		oRMAnimacionCriteria.setMaxResults(ROW_COUNT);
		ORM.Animacion[] oRMAnimacions = oRMAnimacionCriteria.listAnimacion();
		length =oRMAnimacions== null ? 0 : Math.min(oRMAnimacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMAnimacions[i]);
		}
		System.out.println(length + " Animacion record(s) retrieved."); 
		
		System.out.println("Listing Estudio by Criteria...");
		ORM.EstudioCriteria oRMEstudioCriteria = new ORM.EstudioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMEstudioCriteria.idEstudio.eq();
		oRMEstudioCriteria.setMaxResults(ROW_COUNT);
		ORM.Estudio[] oRMEstudios = oRMEstudioCriteria.listEstudio();
		length =oRMEstudios== null ? 0 : Math.min(oRMEstudios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMEstudios[i]);
		}
		System.out.println(length + " Estudio record(s) retrieved."); 
		
		System.out.println("Listing Temporada by Criteria...");
		ORM.TemporadaCriteria oRMTemporadaCriteria = new ORM.TemporadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTemporadaCriteria.idTemporada.eq();
		oRMTemporadaCriteria.setMaxResults(ROW_COUNT);
		ORM.Temporada[] oRMTemporadas = oRMTemporadaCriteria.listTemporada();
		length =oRMTemporadas== null ? 0 : Math.min(oRMTemporadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTemporadas[i]);
		}
		System.out.println(length + " Temporada record(s) retrieved."); 
		
		System.out.println("Listing TipoEmision by Criteria...");
		ORM.TipoEmisionCriteria oRMTipoEmisionCriteria = new ORM.TipoEmisionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTipoEmisionCriteria.idTipoEmision.eq();
		oRMTipoEmisionCriteria.setMaxResults(ROW_COUNT);
		ORM.TipoEmision[] oRMTipoEmisions = oRMTipoEmisionCriteria.listTipoEmision();
		length =oRMTipoEmisions== null ? 0 : Math.min(oRMTipoEmisions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTipoEmisions[i]);
		}
		System.out.println(length + " TipoEmision record(s) retrieved."); 
		
		System.out.println("Listing Manga by Criteria...");
		ORM.MangaCriteria oRMMangaCriteria = new ORM.MangaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMMangaCriteria.idManga.eq();
		oRMMangaCriteria.setMaxResults(ROW_COUNT);
		ORM.Manga[] oRMMangas = oRMMangaCriteria.listManga();
		length =oRMMangas== null ? 0 : Math.min(oRMMangas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMMangas[i]);
		}
		System.out.println(length + " Manga record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		ORM.ArtistaCriteria oRMArtistaCriteria = new ORM.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMArtistaCriteria.idArtista.eq();
		oRMArtistaCriteria.setMaxResults(ROW_COUNT);
		ORM.Artista[] oRMArtistas = oRMArtistaCriteria.listArtista();
		length =oRMArtistas== null ? 0 : Math.min(oRMArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing TipoManga by Criteria...");
		ORM.TipoMangaCriteria oRMTipoMangaCriteria = new ORM.TipoMangaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMTipoMangaCriteria.idTipoManga.eq();
		oRMTipoMangaCriteria.setMaxResults(ROW_COUNT);
		ORM.TipoManga[] oRMTipoMangas = oRMTipoMangaCriteria.listTipoManga();
		length =oRMTipoMangas== null ? 0 : Math.min(oRMTipoMangas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMTipoMangas[i]);
		}
		System.out.println(length + " TipoManga record(s) retrieved."); 
		
		System.out.println("Listing SerieGenerica by Criteria...");
		ORM.SerieGenericaCriteria oRMSerieGenericaCriteria = new ORM.SerieGenericaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMSerieGenericaCriteria.idSerie.eq();
		oRMSerieGenericaCriteria.setMaxResults(ROW_COUNT);
		ORM.SerieGenerica[] oRMSerieGenericas = oRMSerieGenericaCriteria.listSerieGenerica();
		length =oRMSerieGenericas== null ? 0 : Math.min(oRMSerieGenericas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMSerieGenericas[i]);
		}
		System.out.println(length + " SerieGenerica record(s) retrieved."); 
		
		System.out.println("Listing Rating by Criteria...");
		ORM.RatingCriteria oRMRatingCriteria = new ORM.RatingCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMRatingCriteria.idRating.eq();
		oRMRatingCriteria.setMaxResults(ROW_COUNT);
		ORM.Rating[] oRMRatings = oRMRatingCriteria.listRating();
		length =oRMRatings== null ? 0 : Math.min(oRMRatings.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMRatings[i]);
		}
		System.out.println(length + " Rating record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		ORM.UsuarioCriteria oRMUsuarioCriteria = new ORM.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMUsuarioCriteria.idUsuario.eq();
		oRMUsuarioCriteria.setMaxResults(ROW_COUNT);
		ORM.Usuario[] oRMUsuarios = oRMUsuarioCriteria.listUsuario();
		length =oRMUsuarios== null ? 0 : Math.min(oRMUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Lista by Criteria...");
		ORM.ListaCriteria oRMListaCriteria = new ORM.ListaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMListaCriteria.idLista.eq();
		oRMListaCriteria.setMaxResults(ROW_COUNT);
		ORM.Lista[] oRMListas = oRMListaCriteria.listLista();
		length =oRMListas== null ? 0 : Math.min(oRMListas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMListas[i]);
		}
		System.out.println(length + " Lista record(s) retrieved."); 
		
		System.out.println("Listing EntradaLista by Criteria...");
		ORM.EntradaListaCriteria oRMEntradaListaCriteria = new ORM.EntradaListaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMEntradaListaCriteria.idEntrada.eq();
		oRMEntradaListaCriteria.setMaxResults(ROW_COUNT);
		ORM.EntradaLista[] oRMEntradaListas = oRMEntradaListaCriteria.listEntradaLista();
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
				ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
