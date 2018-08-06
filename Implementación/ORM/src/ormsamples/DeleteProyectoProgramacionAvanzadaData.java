/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoProgramacionAvanzadaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Novela lormNovela = orm.NovelaDAO.loadNovelaByQuery(null, null);
			// Delete the persistent object
			orm.NovelaDAO.delete(lormNovela);
			orm.LenguajeOriginal lormLenguajeOriginal = orm.LenguajeOriginalDAO.loadLenguajeOriginalByQuery(null, null);
			// Delete the persistent object
			orm.LenguajeOriginalDAO.delete(lormLenguajeOriginal);
			orm.PublicadorOriginal lormPublicadorOriginal = orm.PublicadorOriginalDAO.loadPublicadorOriginalByQuery(null, null);
			// Delete the persistent object
			orm.PublicadorOriginalDAO.delete(lormPublicadorOriginal);
			orm.PublicadorIngles lormPublicadorIngles = orm.PublicadorInglesDAO.loadPublicadorInglesByQuery(null, null);
			// Delete the persistent object
			orm.PublicadorInglesDAO.delete(lormPublicadorIngles);
			orm.Tag lormTag = orm.TagDAO.loadTagByQuery(null, null);
			// Delete the persistent object
			orm.TagDAO.delete(lormTag);
			orm.Tipo lormTipo = orm.TipoDAO.loadTipoByQuery(null, null);
			// Delete the persistent object
			orm.TipoDAO.delete(lormTipo);
			orm.Genero lormGenero = orm.GeneroDAO.loadGeneroByQuery(null, null);
			// Delete the persistent object
			orm.GeneroDAO.delete(lormGenero);
			orm.Autor lormAutor = orm.AutorDAO.loadAutorByQuery(null, null);
			// Delete the persistent object
			orm.AutorDAO.delete(lormAutor);
			orm.Animacion lormAnimacion = orm.AnimacionDAO.loadAnimacionByQuery(null, null);
			// Delete the persistent object
			orm.AnimacionDAO.delete(lormAnimacion);
			orm.Estudio lormEstudio = orm.EstudioDAO.loadEstudioByQuery(null, null);
			// Delete the persistent object
			orm.EstudioDAO.delete(lormEstudio);
			orm.Temporada lormTemporada = orm.TemporadaDAO.loadTemporadaByQuery(null, null);
			// Delete the persistent object
			orm.TemporadaDAO.delete(lormTemporada);
			orm.TipoEmision lormTipoEmision = orm.TipoEmisionDAO.loadTipoEmisionByQuery(null, null);
			// Delete the persistent object
			orm.TipoEmisionDAO.delete(lormTipoEmision);
			orm.Manga lormManga = orm.MangaDAO.loadMangaByQuery(null, null);
			// Delete the persistent object
			orm.MangaDAO.delete(lormManga);
			orm.Artista lormArtista = orm.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			orm.ArtistaDAO.delete(lormArtista);
			orm.TipoManga lormTipoManga = orm.TipoMangaDAO.loadTipoMangaByQuery(null, null);
			// Delete the persistent object
			orm.TipoMangaDAO.delete(lormTipoManga);
			orm.SerieGenerica lormSerieGenerica = orm.SerieGenericaDAO.loadSerieGenericaByQuery(null, null);
			// Delete the persistent object
			orm.SerieGenericaDAO.delete(lormSerieGenerica);
			orm.Rating lormRating = orm.RatingDAO.loadRatingByQuery(null, null);
			// Delete the persistent object
			orm.RatingDAO.delete(lormRating);
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			orm.UsuarioDAO.delete(lormUsuario);
			orm.Lista lormLista = orm.ListaDAO.loadListaByQuery(null, null);
			// Delete the persistent object
			orm.ListaDAO.delete(lormLista);
			orm.EntradaLista lormEntradaLista = orm.EntradaListaDAO.loadEntradaListaByQuery(null, null);
			// Delete the persistent object
			orm.EntradaListaDAO.delete(lormEntradaLista);
			orm.Mangaka lormMangaka = orm.MangakaDAO.loadMangakaByQuery(null, null);
			// Delete the persistent object
			orm.MangakaDAO.delete(lormMangaka);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoProgramacionAvanzadaData deleteProyectoProgramacionAvanzadaData = new DeleteProyectoProgramacionAvanzadaData();
			try {
				deleteProyectoProgramacionAvanzadaData.deleteTestData();
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
