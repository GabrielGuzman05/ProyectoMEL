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
			orm.Novela oRMNovela = orm.NovelaDAO.loadNovelaByQuery(null, null);
			// Delete the persistent object
			orm.NovelaDAO.delete(oRMNovela);
			orm.LenguajeOriginal oRMLenguajeOriginal = orm.LenguajeOriginalDAO.loadLenguajeOriginalByQuery(null, null);
			// Delete the persistent object
			orm.LenguajeOriginalDAO.delete(oRMLenguajeOriginal);
			orm.PublicadorOriginal oRMPublicadorOriginal = orm.PublicadorOriginalDAO.loadPublicadorOriginalByQuery(null, null);
			// Delete the persistent object
			orm.PublicadorOriginalDAO.delete(oRMPublicadorOriginal);
			orm.PublicadorIngles oRMPublicadorIngles = orm.PublicadorInglesDAO.loadPublicadorInglesByQuery(null, null);
			// Delete the persistent object
			orm.PublicadorInglesDAO.delete(oRMPublicadorIngles);
			orm.Tag oRMTag = orm.TagDAO.loadTagByQuery(null, null);
			// Delete the persistent object
			orm.TagDAO.delete(oRMTag);
			orm.Tipo oRMTipo = orm.TipoDAO.loadTipoByQuery(null, null);
			// Delete the persistent object
			orm.TipoDAO.delete(oRMTipo);
			orm.Genero oRMGenero = orm.GeneroDAO.loadGeneroByQuery(null, null);
			// Delete the persistent object
			orm.GeneroDAO.delete(oRMGenero);
			orm.Autor oRMAutor = orm.AutorDAO.loadAutorByQuery(null, null);
			// Delete the persistent object
			orm.AutorDAO.delete(oRMAutor);
			orm.Animacion oRMAnimacion = orm.AnimacionDAO.loadAnimacionByQuery(null, null);
			// Delete the persistent object
			orm.AnimacionDAO.delete(oRMAnimacion);
			orm.Estudio oRMEstudio = orm.EstudioDAO.loadEstudioByQuery(null, null);
			// Delete the persistent object
			orm.EstudioDAO.delete(oRMEstudio);
			orm.Temporada oRMTemporada = orm.TemporadaDAO.loadTemporadaByQuery(null, null);
			// Delete the persistent object
			orm.TemporadaDAO.delete(oRMTemporada);
			orm.TipoEmision oRMTipoEmision = orm.TipoEmisionDAO.loadTipoEmisionByQuery(null, null);
			// Delete the persistent object
			orm.TipoEmisionDAO.delete(oRMTipoEmision);
			orm.Manga oRMManga = orm.MangaDAO.loadMangaByQuery(null, null);
			// Delete the persistent object
			orm.MangaDAO.delete(oRMManga);
			orm.Artista oRMArtista = orm.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			orm.ArtistaDAO.delete(oRMArtista);
			orm.TipoManga oRMTipoManga = orm.TipoMangaDAO.loadTipoMangaByQuery(null, null);
			// Delete the persistent object
			orm.TipoMangaDAO.delete(oRMTipoManga);
			orm.SerieGenerica oRMSerieGenerica = orm.SerieGenericaDAO.loadSerieGenericaByQuery(null, null);
			// Delete the persistent object
			orm.SerieGenericaDAO.delete(oRMSerieGenerica);
			orm.Rating oRMRating = orm.RatingDAO.loadRatingByQuery(null, null);
			// Delete the persistent object
			orm.RatingDAO.delete(oRMRating);
			orm.Usuario oRMUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			orm.UsuarioDAO.delete(oRMUsuario);
			orm.Lista oRMLista = orm.ListaDAO.loadListaByQuery(null, null);
			// Delete the persistent object
			orm.ListaDAO.delete(oRMLista);
			orm.EntradaLista oRMEntradaLista = orm.EntradaListaDAO.loadEntradaListaByQuery(null, null);
			// Delete the persistent object
			orm.EntradaListaDAO.delete(oRMEntradaLista);
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
