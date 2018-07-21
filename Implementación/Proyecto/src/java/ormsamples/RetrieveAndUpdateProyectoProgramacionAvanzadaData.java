/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoProgramacionAvanzadaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Novela oRMNovela = orm.NovelaDAO.loadNovelaByQuery(null, null);
			// Update the properties of the persistent object
			orm.NovelaDAO.save(oRMNovela);
			orm.LenguajeOriginal oRMLenguajeOriginal = orm.LenguajeOriginalDAO.loadLenguajeOriginalByQuery(null, null);
			// Update the properties of the persistent object
			orm.LenguajeOriginalDAO.save(oRMLenguajeOriginal);
			orm.PublicadorOriginal oRMPublicadorOriginal = orm.PublicadorOriginalDAO.loadPublicadorOriginalByQuery(null, null);
			// Update the properties of the persistent object
			orm.PublicadorOriginalDAO.save(oRMPublicadorOriginal);
			orm.PublicadorIngles oRMPublicadorIngles = orm.PublicadorInglesDAO.loadPublicadorInglesByQuery(null, null);
			// Update the properties of the persistent object
			orm.PublicadorInglesDAO.save(oRMPublicadorIngles);
			orm.Tag oRMTag = orm.TagDAO.loadTagByQuery(null, null);
			// Update the properties of the persistent object
			orm.TagDAO.save(oRMTag);
			orm.Tipo oRMTipo = orm.TipoDAO.loadTipoByQuery(null, null);
			// Update the properties of the persistent object
			orm.TipoDAO.save(oRMTipo);
			orm.Genero oRMGenero = orm.GeneroDAO.loadGeneroByQuery(null, null);
			// Update the properties of the persistent object
			orm.GeneroDAO.save(oRMGenero);
			orm.Autor oRMAutor = orm.AutorDAO.loadAutorByQuery(null, null);
			// Update the properties of the persistent object
			orm.AutorDAO.save(oRMAutor);
			orm.Animacion oRMAnimacion = orm.AnimacionDAO.loadAnimacionByQuery(null, null);
			// Update the properties of the persistent object
			orm.AnimacionDAO.save(oRMAnimacion);
			orm.Estudio oRMEstudio = orm.EstudioDAO.loadEstudioByQuery(null, null);
			// Update the properties of the persistent object
			orm.EstudioDAO.save(oRMEstudio);
			orm.Temporada oRMTemporada = orm.TemporadaDAO.loadTemporadaByQuery(null, null);
			// Update the properties of the persistent object
			orm.TemporadaDAO.save(oRMTemporada);
			orm.TipoEmision oRMTipoEmision = orm.TipoEmisionDAO.loadTipoEmisionByQuery(null, null);
			// Update the properties of the persistent object
			orm.TipoEmisionDAO.save(oRMTipoEmision);
			orm.Manga oRMManga = orm.MangaDAO.loadMangaByQuery(null, null);
			// Update the properties of the persistent object
			orm.MangaDAO.save(oRMManga);
			orm.Artista oRMArtista = orm.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			orm.ArtistaDAO.save(oRMArtista);
			orm.TipoManga oRMTipoManga = orm.TipoMangaDAO.loadTipoMangaByQuery(null, null);
			// Update the properties of the persistent object
			orm.TipoMangaDAO.save(oRMTipoManga);
			orm.SerieGenerica oRMSerieGenerica = orm.SerieGenericaDAO.loadSerieGenericaByQuery(null, null);
			// Update the properties of the persistent object
			orm.SerieGenericaDAO.save(oRMSerieGenerica);
			orm.Rating oRMRating = orm.RatingDAO.loadRatingByQuery(null, null);
			// Update the properties of the persistent object
			orm.RatingDAO.save(oRMRating);
			orm.Usuario oRMUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			orm.UsuarioDAO.save(oRMUsuario);
			orm.Lista oRMLista = orm.ListaDAO.loadListaByQuery(null, null);
			// Update the properties of the persistent object
			orm.ListaDAO.save(oRMLista);
			orm.EntradaLista oRMEntradaLista = orm.EntradaListaDAO.loadEntradaListaByQuery(null, null);
			// Update the properties of the persistent object
			orm.EntradaListaDAO.save(oRMEntradaLista);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Novela by NovelaCriteria");
		orm.NovelaCriteria oRMNovelaCriteria = new orm.NovelaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMNovelaCriteria.idNovela.eq();
		System.out.println(oRMNovelaCriteria.uniqueNovela());
		
		System.out.println("Retrieving LenguajeOriginal by LenguajeOriginalCriteria");
		orm.LenguajeOriginalCriteria oRMLenguajeOriginalCriteria = new orm.LenguajeOriginalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMLenguajeOriginalCriteria.idLenguaje.eq();
		System.out.println(oRMLenguajeOriginalCriteria.uniqueLenguajeOriginal());
		
		System.out.println("Retrieving PublicadorOriginal by PublicadorOriginalCriteria");
		orm.PublicadorOriginalCriteria oRMPublicadorOriginalCriteria = new orm.PublicadorOriginalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMPublicadorOriginalCriteria.idPublicadorOriginal.eq();
		System.out.println(oRMPublicadorOriginalCriteria.uniquePublicadorOriginal());
		
		System.out.println("Retrieving PublicadorIngles by PublicadorInglesCriteria");
		orm.PublicadorInglesCriteria oRMPublicadorInglesCriteria = new orm.PublicadorInglesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMPublicadorInglesCriteria.idPublicadorIngles.eq();
		System.out.println(oRMPublicadorInglesCriteria.uniquePublicadorIngles());
		
		System.out.println("Retrieving Tag by TagCriteria");
		orm.TagCriteria oRMTagCriteria = new orm.TagCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTagCriteria.idTag.eq();
		System.out.println(oRMTagCriteria.uniqueTag());
		
		System.out.println("Retrieving Tipo by TipoCriteria");
		orm.TipoCriteria oRMTipoCriteria = new orm.TipoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTipoCriteria.idTipo.eq();
		System.out.println(oRMTipoCriteria.uniqueTipo());
		
		System.out.println("Retrieving Genero by GeneroCriteria");
		orm.GeneroCriteria oRMGeneroCriteria = new orm.GeneroCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMGeneroCriteria.idGenero.eq();
		System.out.println(oRMGeneroCriteria.uniqueGenero());
		
		System.out.println("Retrieving Autor by AutorCriteria");
		orm.AutorCriteria oRMAutorCriteria = new orm.AutorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMAutorCriteria.idAutor.eq();
		System.out.println(oRMAutorCriteria.uniqueAutor());
		
		System.out.println("Retrieving Animacion by AnimacionCriteria");
		orm.AnimacionCriteria oRMAnimacionCriteria = new orm.AnimacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMAnimacionCriteria.idAnimacion.eq();
		System.out.println(oRMAnimacionCriteria.uniqueAnimacion());
		
		System.out.println("Retrieving Estudio by EstudioCriteria");
		orm.EstudioCriteria oRMEstudioCriteria = new orm.EstudioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMEstudioCriteria.idEstudio.eq();
		System.out.println(oRMEstudioCriteria.uniqueEstudio());
		
		System.out.println("Retrieving Temporada by TemporadaCriteria");
		orm.TemporadaCriteria oRMTemporadaCriteria = new orm.TemporadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTemporadaCriteria.idTemporada.eq();
		System.out.println(oRMTemporadaCriteria.uniqueTemporada());
		
		System.out.println("Retrieving TipoEmision by TipoEmisionCriteria");
		orm.TipoEmisionCriteria oRMTipoEmisionCriteria = new orm.TipoEmisionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTipoEmisionCriteria.idTipoEmision.eq();
		System.out.println(oRMTipoEmisionCriteria.uniqueTipoEmision());
		
		System.out.println("Retrieving Manga by MangaCriteria");
		orm.MangaCriteria oRMMangaCriteria = new orm.MangaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMMangaCriteria.idManga.eq();
		System.out.println(oRMMangaCriteria.uniqueManga());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		orm.ArtistaCriteria oRMArtistaCriteria = new orm.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMArtistaCriteria.idArtista.eq();
		System.out.println(oRMArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving TipoManga by TipoMangaCriteria");
		orm.TipoMangaCriteria oRMTipoMangaCriteria = new orm.TipoMangaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTipoMangaCriteria.idTipoManga.eq();
		System.out.println(oRMTipoMangaCriteria.uniqueTipoManga());
		
		System.out.println("Retrieving SerieGenerica by SerieGenericaCriteria");
		orm.SerieGenericaCriteria oRMSerieGenericaCriteria = new orm.SerieGenericaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMSerieGenericaCriteria.idSerie.eq();
		System.out.println(oRMSerieGenericaCriteria.uniqueSerieGenerica());
		
		System.out.println("Retrieving Rating by RatingCriteria");
		orm.RatingCriteria oRMRatingCriteria = new orm.RatingCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMRatingCriteria.idRating.eq();
		System.out.println(oRMRatingCriteria.uniqueRating());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		orm.UsuarioCriteria oRMUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMUsuarioCriteria.idUsuario.eq();
		System.out.println(oRMUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Lista by ListaCriteria");
		orm.ListaCriteria oRMListaCriteria = new orm.ListaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMListaCriteria.idLista.eq();
		System.out.println(oRMListaCriteria.uniqueLista());
		
		System.out.println("Retrieving EntradaLista by EntradaListaCriteria");
		orm.EntradaListaCriteria oRMEntradaListaCriteria = new orm.EntradaListaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMEntradaListaCriteria.idEntrada.eq();
		System.out.println(oRMEntradaListaCriteria.uniqueEntradaLista());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoProgramacionAvanzadaData retrieveAndUpdateProyectoProgramacionAvanzadaData = new RetrieveAndUpdateProyectoProgramacionAvanzadaData();
			try {
				retrieveAndUpdateProyectoProgramacionAvanzadaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoProgramacionAvanzadaData.retrieveByCriteria();
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
