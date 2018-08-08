/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;

/**
 *
 * @author Gabriel
 */
public class RetrieveAndUpdateProyectoProgramacionAvanzadaData {

    /**
     *
     * @throws PersistentException
     */
    public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Novela lormNovela = orm.NovelaDAO.loadNovelaByQuery(null, null);
			// Update the properties of the persistent object
			orm.NovelaDAO.save(lormNovela);
			orm.LenguajeOriginal lormLenguajeOriginal = orm.LenguajeOriginalDAO.loadLenguajeOriginalByQuery(null, null);
			// Update the properties of the persistent object
			orm.LenguajeOriginalDAO.save(lormLenguajeOriginal);
			orm.PublicadorOriginal lormPublicadorOriginal = orm.PublicadorOriginalDAO.loadPublicadorOriginalByQuery(null, null);
			// Update the properties of the persistent object
			orm.PublicadorOriginalDAO.save(lormPublicadorOriginal);
			orm.PublicadorIngles lormPublicadorIngles = orm.PublicadorInglesDAO.loadPublicadorInglesByQuery(null, null);
			// Update the properties of the persistent object
			orm.PublicadorInglesDAO.save(lormPublicadorIngles);
			orm.Tag lormTag = orm.TagDAO.loadTagByQuery(null, null);
			// Update the properties of the persistent object
			orm.TagDAO.save(lormTag);
			orm.Tipo lormTipo = orm.TipoDAO.loadTipoByQuery(null, null);
			// Update the properties of the persistent object
			orm.TipoDAO.save(lormTipo);
			orm.Genero lormGenero = orm.GeneroDAO.loadGeneroByQuery(null, null);
			// Update the properties of the persistent object
			orm.GeneroDAO.save(lormGenero);
			orm.Autor lormAutor = orm.AutorDAO.loadAutorByQuery(null, null);
			// Update the properties of the persistent object
			orm.AutorDAO.save(lormAutor);
			orm.Animacion lormAnimacion = orm.AnimacionDAO.loadAnimacionByQuery(null, null);
			// Update the properties of the persistent object
			orm.AnimacionDAO.save(lormAnimacion);
			orm.Estudio lormEstudio = orm.EstudioDAO.loadEstudioByQuery(null, null);
			// Update the properties of the persistent object
			orm.EstudioDAO.save(lormEstudio);
			orm.Temporada lormTemporada = orm.TemporadaDAO.loadTemporadaByQuery(null, null);
			// Update the properties of the persistent object
			orm.TemporadaDAO.save(lormTemporada);
			orm.TipoEmision lormTipoEmision = orm.TipoEmisionDAO.loadTipoEmisionByQuery(null, null);
			// Update the properties of the persistent object
			orm.TipoEmisionDAO.save(lormTipoEmision);
			orm.Manga lormManga = orm.MangaDAO.loadMangaByQuery(null, null);
			// Update the properties of the persistent object
			orm.MangaDAO.save(lormManga);
			orm.Artista lormArtista = orm.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			orm.ArtistaDAO.save(lormArtista);
			orm.TipoManga lormTipoManga = orm.TipoMangaDAO.loadTipoMangaByQuery(null, null);
			// Update the properties of the persistent object
			orm.TipoMangaDAO.save(lormTipoManga);
			orm.SerieGenerica lormSerieGenerica = orm.SerieGenericaDAO.loadSerieGenericaByQuery(null, null);
			// Update the properties of the persistent object
			orm.SerieGenericaDAO.save(lormSerieGenerica);
			orm.Rating lormRating = orm.RatingDAO.loadRatingByQuery(null, null);
			// Update the properties of the persistent object
			orm.RatingDAO.save(lormRating);
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			orm.UsuarioDAO.save(lormUsuario);
			orm.Lista lormLista = orm.ListaDAO.loadListaByQuery(null, null);
			// Update the properties of the persistent object
			orm.ListaDAO.save(lormLista);
			orm.EntradaLista lormEntradaLista = orm.EntradaListaDAO.loadEntradaListaByQuery(null, null);
			// Update the properties of the persistent object
			orm.EntradaListaDAO.save(lormEntradaLista);
			orm.Mangaka lormMangaka = orm.MangakaDAO.loadMangakaByQuery(null, null);
			// Update the properties of the persistent object
			orm.MangakaDAO.save(lormMangaka);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoProgramacionAvanzadaData retrieveAndUpdateProyectoProgramacionAvanzadaData = new RetrieveAndUpdateProyectoProgramacionAvanzadaData();
			try {
				retrieveAndUpdateProyectoProgramacionAvanzadaData.retrieveAndUpdateTestData();
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
