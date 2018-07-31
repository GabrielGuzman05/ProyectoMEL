/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoProgramacionAvanzadaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			ORM.Novela oRMNovela = ORM.NovelaDAO.loadNovelaByQuery(null, null);
			// Update the properties of the persistent object
			ORM.NovelaDAO.save(oRMNovela);
			ORM.LenguajeOriginal oRMLenguajeOriginal = ORM.LenguajeOriginalDAO.loadLenguajeOriginalByQuery(null, null);
			// Update the properties of the persistent object
			ORM.LenguajeOriginalDAO.save(oRMLenguajeOriginal);
			ORM.PublicadorOriginal oRMPublicadorOriginal = ORM.PublicadorOriginalDAO.loadPublicadorOriginalByQuery(null, null);
			// Update the properties of the persistent object
			ORM.PublicadorOriginalDAO.save(oRMPublicadorOriginal);
			ORM.PublicadorIngles oRMPublicadorIngles = ORM.PublicadorInglesDAO.loadPublicadorInglesByQuery(null, null);
			// Update the properties of the persistent object
			ORM.PublicadorInglesDAO.save(oRMPublicadorIngles);
			ORM.Tag oRMTag = ORM.TagDAO.loadTagByQuery(null, null);
			// Update the properties of the persistent object
			ORM.TagDAO.save(oRMTag);
			ORM.Tipo oRMTipo = ORM.TipoDAO.loadTipoByQuery(null, null);
			// Update the properties of the persistent object
			ORM.TipoDAO.save(oRMTipo);
			ORM.Genero oRMGenero = ORM.GeneroDAO.loadGeneroByQuery(null, null);
			// Update the properties of the persistent object
			ORM.GeneroDAO.save(oRMGenero);
			ORM.Autor oRMAutor = ORM.AutorDAO.loadAutorByQuery(null, null);
			// Update the properties of the persistent object
			ORM.AutorDAO.save(oRMAutor);
			ORM.Animacion oRMAnimacion = ORM.AnimacionDAO.loadAnimacionByQuery(null, null);
			// Update the properties of the persistent object
			ORM.AnimacionDAO.save(oRMAnimacion);
			ORM.Estudio oRMEstudio = ORM.EstudioDAO.loadEstudioByQuery(null, null);
			// Update the properties of the persistent object
			ORM.EstudioDAO.save(oRMEstudio);
			ORM.Temporada oRMTemporada = ORM.TemporadaDAO.loadTemporadaByQuery(null, null);
			// Update the properties of the persistent object
			ORM.TemporadaDAO.save(oRMTemporada);
			ORM.TipoEmision oRMTipoEmision = ORM.TipoEmisionDAO.loadTipoEmisionByQuery(null, null);
			// Update the properties of the persistent object
			ORM.TipoEmisionDAO.save(oRMTipoEmision);
			ORM.Manga oRMManga = ORM.MangaDAO.loadMangaByQuery(null, null);
			// Update the properties of the persistent object
			ORM.MangaDAO.save(oRMManga);
			ORM.Artista oRMArtista = ORM.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			ORM.ArtistaDAO.save(oRMArtista);
			ORM.TipoManga oRMTipoManga = ORM.TipoMangaDAO.loadTipoMangaByQuery(null, null);
			// Update the properties of the persistent object
			ORM.TipoMangaDAO.save(oRMTipoManga);
			ORM.SerieGenerica oRMSerieGenerica = ORM.SerieGenericaDAO.loadSerieGenericaByQuery(null, null);
			// Update the properties of the persistent object
			ORM.SerieGenericaDAO.save(oRMSerieGenerica);
			ORM.Rating oRMRating = ORM.RatingDAO.loadRatingByQuery(null, null);
			// Update the properties of the persistent object
			ORM.RatingDAO.save(oRMRating);
			ORM.Usuario oRMUsuario = ORM.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			ORM.UsuarioDAO.save(oRMUsuario);
			ORM.Lista oRMLista = ORM.ListaDAO.loadListaByQuery(null, null);
			// Update the properties of the persistent object
			ORM.ListaDAO.save(oRMLista);
			ORM.EntradaLista oRMEntradaLista = ORM.EntradaListaDAO.loadEntradaListaByQuery(null, null);
			// Update the properties of the persistent object
			ORM.EntradaListaDAO.save(oRMEntradaLista);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Novela by NovelaCriteria");
		ORM.NovelaCriteria oRMNovelaCriteria = new ORM.NovelaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMNovelaCriteria.idNovela.eq();
		System.out.println(oRMNovelaCriteria.uniqueNovela());
		
		System.out.println("Retrieving LenguajeOriginal by LenguajeOriginalCriteria");
		ORM.LenguajeOriginalCriteria oRMLenguajeOriginalCriteria = new ORM.LenguajeOriginalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMLenguajeOriginalCriteria.idLenguaje.eq();
		System.out.println(oRMLenguajeOriginalCriteria.uniqueLenguajeOriginal());
		
		System.out.println("Retrieving PublicadorOriginal by PublicadorOriginalCriteria");
		ORM.PublicadorOriginalCriteria oRMPublicadorOriginalCriteria = new ORM.PublicadorOriginalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMPublicadorOriginalCriteria.idPublicadorOriginal.eq();
		System.out.println(oRMPublicadorOriginalCriteria.uniquePublicadorOriginal());
		
		System.out.println("Retrieving PublicadorIngles by PublicadorInglesCriteria");
		ORM.PublicadorInglesCriteria oRMPublicadorInglesCriteria = new ORM.PublicadorInglesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMPublicadorInglesCriteria.idPublicadorIngles.eq();
		System.out.println(oRMPublicadorInglesCriteria.uniquePublicadorIngles());
		
		System.out.println("Retrieving Tag by TagCriteria");
		ORM.TagCriteria oRMTagCriteria = new ORM.TagCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTagCriteria.idTag.eq();
		System.out.println(oRMTagCriteria.uniqueTag());
		
		System.out.println("Retrieving Tipo by TipoCriteria");
		ORM.TipoCriteria oRMTipoCriteria = new ORM.TipoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTipoCriteria.idTipo.eq();
		System.out.println(oRMTipoCriteria.uniqueTipo());
		
		System.out.println("Retrieving Genero by GeneroCriteria");
		ORM.GeneroCriteria oRMGeneroCriteria = new ORM.GeneroCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMGeneroCriteria.idGenero.eq();
		System.out.println(oRMGeneroCriteria.uniqueGenero());
		
		System.out.println("Retrieving Autor by AutorCriteria");
		ORM.AutorCriteria oRMAutorCriteria = new ORM.AutorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMAutorCriteria.idAutor.eq();
		System.out.println(oRMAutorCriteria.uniqueAutor());
		
		System.out.println("Retrieving Animacion by AnimacionCriteria");
		ORM.AnimacionCriteria oRMAnimacionCriteria = new ORM.AnimacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMAnimacionCriteria.idAnimacion.eq();
		System.out.println(oRMAnimacionCriteria.uniqueAnimacion());
		
		System.out.println("Retrieving Estudio by EstudioCriteria");
		ORM.EstudioCriteria oRMEstudioCriteria = new ORM.EstudioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMEstudioCriteria.idEstudio.eq();
		System.out.println(oRMEstudioCriteria.uniqueEstudio());
		
		System.out.println("Retrieving Temporada by TemporadaCriteria");
		ORM.TemporadaCriteria oRMTemporadaCriteria = new ORM.TemporadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTemporadaCriteria.idTemporada.eq();
		System.out.println(oRMTemporadaCriteria.uniqueTemporada());
		
		System.out.println("Retrieving TipoEmision by TipoEmisionCriteria");
		ORM.TipoEmisionCriteria oRMTipoEmisionCriteria = new ORM.TipoEmisionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTipoEmisionCriteria.idTipoEmision.eq();
		System.out.println(oRMTipoEmisionCriteria.uniqueTipoEmision());
		
		System.out.println("Retrieving Manga by MangaCriteria");
		ORM.MangaCriteria oRMMangaCriteria = new ORM.MangaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMMangaCriteria.idManga.eq();
		System.out.println(oRMMangaCriteria.uniqueManga());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		ORM.ArtistaCriteria oRMArtistaCriteria = new ORM.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMArtistaCriteria.idArtista.eq();
		System.out.println(oRMArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving TipoManga by TipoMangaCriteria");
		ORM.TipoMangaCriteria oRMTipoMangaCriteria = new ORM.TipoMangaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMTipoMangaCriteria.idTipoManga.eq();
		System.out.println(oRMTipoMangaCriteria.uniqueTipoManga());
		
		System.out.println("Retrieving SerieGenerica by SerieGenericaCriteria");
		ORM.SerieGenericaCriteria oRMSerieGenericaCriteria = new ORM.SerieGenericaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMSerieGenericaCriteria.idSerie.eq();
		System.out.println(oRMSerieGenericaCriteria.uniqueSerieGenerica());
		
		System.out.println("Retrieving Rating by RatingCriteria");
		ORM.RatingCriteria oRMRatingCriteria = new ORM.RatingCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMRatingCriteria.idRating.eq();
		System.out.println(oRMRatingCriteria.uniqueRating());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		ORM.UsuarioCriteria oRMUsuarioCriteria = new ORM.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMUsuarioCriteria.idUsuario.eq();
		System.out.println(oRMUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Lista by ListaCriteria");
		ORM.ListaCriteria oRMListaCriteria = new ORM.ListaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMListaCriteria.idLista.eq();
		System.out.println(oRMListaCriteria.uniqueLista());
		
		System.out.println("Retrieving EntradaLista by EntradaListaCriteria");
		ORM.EntradaListaCriteria oRMEntradaListaCriteria = new ORM.EntradaListaCriteria();
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
				ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
