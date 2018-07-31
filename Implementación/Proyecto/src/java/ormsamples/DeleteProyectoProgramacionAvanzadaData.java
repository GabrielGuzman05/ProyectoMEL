/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoProgramacionAvanzadaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			ORM.Novela oRMNovela = ORM.NovelaDAO.loadNovelaByQuery(null, null);
			// Delete the persistent object
			ORM.NovelaDAO.delete(oRMNovela);
			ORM.LenguajeOriginal oRMLenguajeOriginal = ORM.LenguajeOriginalDAO.loadLenguajeOriginalByQuery(null, null);
			// Delete the persistent object
			ORM.LenguajeOriginalDAO.delete(oRMLenguajeOriginal);
			ORM.PublicadorOriginal oRMPublicadorOriginal = ORM.PublicadorOriginalDAO.loadPublicadorOriginalByQuery(null, null);
			// Delete the persistent object
			ORM.PublicadorOriginalDAO.delete(oRMPublicadorOriginal);
			ORM.PublicadorIngles oRMPublicadorIngles = ORM.PublicadorInglesDAO.loadPublicadorInglesByQuery(null, null);
			// Delete the persistent object
			ORM.PublicadorInglesDAO.delete(oRMPublicadorIngles);
			ORM.Tag oRMTag = ORM.TagDAO.loadTagByQuery(null, null);
			// Delete the persistent object
			ORM.TagDAO.delete(oRMTag);
			ORM.Tipo oRMTipo = ORM.TipoDAO.loadTipoByQuery(null, null);
			// Delete the persistent object
			ORM.TipoDAO.delete(oRMTipo);
			ORM.Genero oRMGenero = ORM.GeneroDAO.loadGeneroByQuery(null, null);
			// Delete the persistent object
			ORM.GeneroDAO.delete(oRMGenero);
			ORM.Autor oRMAutor = ORM.AutorDAO.loadAutorByQuery(null, null);
			// Delete the persistent object
			ORM.AutorDAO.delete(oRMAutor);
			ORM.Animacion oRMAnimacion = ORM.AnimacionDAO.loadAnimacionByQuery(null, null);
			// Delete the persistent object
			ORM.AnimacionDAO.delete(oRMAnimacion);
			ORM.Estudio oRMEstudio = ORM.EstudioDAO.loadEstudioByQuery(null, null);
			// Delete the persistent object
			ORM.EstudioDAO.delete(oRMEstudio);
			ORM.Temporada oRMTemporada = ORM.TemporadaDAO.loadTemporadaByQuery(null, null);
			// Delete the persistent object
			ORM.TemporadaDAO.delete(oRMTemporada);
			ORM.TipoEmision oRMTipoEmision = ORM.TipoEmisionDAO.loadTipoEmisionByQuery(null, null);
			// Delete the persistent object
			ORM.TipoEmisionDAO.delete(oRMTipoEmision);
			ORM.Manga oRMManga = ORM.MangaDAO.loadMangaByQuery(null, null);
			// Delete the persistent object
			ORM.MangaDAO.delete(oRMManga);
			ORM.Artista oRMArtista = ORM.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			ORM.ArtistaDAO.delete(oRMArtista);
			ORM.TipoManga oRMTipoManga = ORM.TipoMangaDAO.loadTipoMangaByQuery(null, null);
			// Delete the persistent object
			ORM.TipoMangaDAO.delete(oRMTipoManga);
			ORM.SerieGenerica oRMSerieGenerica = ORM.SerieGenericaDAO.loadSerieGenericaByQuery(null, null);
			// Delete the persistent object
			ORM.SerieGenericaDAO.delete(oRMSerieGenerica);
			ORM.Rating oRMRating = ORM.RatingDAO.loadRatingByQuery(null, null);
			// Delete the persistent object
			ORM.RatingDAO.delete(oRMRating);
			ORM.Usuario oRMUsuario = ORM.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			ORM.UsuarioDAO.delete(oRMUsuario);
			ORM.Lista oRMLista = ORM.ListaDAO.loadListaByQuery(null, null);
			// Delete the persistent object
			ORM.ListaDAO.delete(oRMLista);
			ORM.EntradaLista oRMEntradaLista = ORM.EntradaListaDAO.loadEntradaListaByQuery(null, null);
			// Delete the persistent object
			ORM.EntradaListaDAO.delete(oRMEntradaLista);
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
				ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
