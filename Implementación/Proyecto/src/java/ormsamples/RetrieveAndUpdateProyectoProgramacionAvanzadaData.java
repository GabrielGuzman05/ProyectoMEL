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
