/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoProgramacionAvanzadaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ORM.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			ORM.Novela oRMNovela = ORM.NovelaDAO.createNovela();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tagidTag, generoidGenero, artistaidArtista, lenguajeOriginalidLenguaje, estadoUsuarioidEstadoUsuario, tipoidTipo, publicadorInglesidPublicadorIngles, autoridAutor, publicadorOriginalidPublicadorOriginal
			ORM.NovelaDAO.save(oRMNovela);
			ORM.LenguajeOriginal oRMLenguajeOriginal = ORM.LenguajeOriginalDAO.createLenguajeOriginal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			ORM.LenguajeOriginalDAO.save(oRMLenguajeOriginal);
			ORM.PublicadorOriginal oRMPublicadorOriginal = ORM.PublicadorOriginalDAO.createPublicadorOriginal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			ORM.PublicadorOriginalDAO.save(oRMPublicadorOriginal);
			ORM.PublicadorIngles oRMPublicadorIngles = ORM.PublicadorInglesDAO.createPublicadorIngles();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			ORM.PublicadorInglesDAO.save(oRMPublicadorIngles);
			ORM.Tag oRMTag = ORM.TagDAO.createTag();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mangaidManga, novelaidNovela, nombre
			ORM.TagDAO.save(oRMTag);
			ORM.Tipo oRMTipo = ORM.TipoDAO.createTipo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			ORM.TipoDAO.save(oRMTipo);
			ORM.Genero oRMGenero = ORM.GeneroDAO.createGenero();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : serieGenericaidSerie, mangaidManga, animacionidAnimacion, novelaidNovela, nombre
			ORM.GeneroDAO.save(oRMGenero);
			ORM.Autor oRMAutor = ORM.AutorDAO.createAutor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, mangaidManga
			ORM.AutorDAO.save(oRMAutor);
			ORM.Animacion oRMAnimacion = ORM.AnimacionDAO.createAnimacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : generoidGenero, estudioidEstudio, ratingidRating, tipoEmisionidTipoEmision, temporadaidTemporada, estadoUsuarioidEstadoUsuario
			ORM.AnimacionDAO.save(oRMAnimacion);
			ORM.Estudio oRMEstudio = ORM.EstudioDAO.createEstudio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacionidAnimacion
			ORM.EstudioDAO.save(oRMEstudio);
			ORM.Temporada oRMTemporada = ORM.TemporadaDAO.createTemporada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			ORM.TemporadaDAO.save(oRMTemporada);
			ORM.TipoEmision oRMTipoEmision = ORM.TipoEmisionDAO.createTipoEmision();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			ORM.TipoEmisionDAO.save(oRMTipoEmision);
			ORM.Manga oRMManga = ORM.MangaDAO.createManga();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : aristaidArtista, tagidTag, autoridAutor, generoidGenero, licenciado, estadoUsuarioidEstadoUsuario
			ORM.MangaDAO.save(oRMManga);
			ORM.Artista oRMArtista = ORM.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, mangaidManga
			ORM.ArtistaDAO.save(oRMArtista);
			ORM.TipoManga oRMTipoManga = ORM.TipoMangaDAO.createTipoManga();
			// Initialize the properties of the persistent object here
			ORM.TipoMangaDAO.save(oRMTipoManga);
			ORM.SerieGenerica oRMSerieGenerica = ORM.SerieGenericaDAO.createSerieGenerica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : generoidGenero, estadoUsuarioidEstadoUsuario
			ORM.SerieGenericaDAO.save(oRMSerieGenerica);
			ORM.Rating oRMRating = ORM.RatingDAO.createRating();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			ORM.RatingDAO.save(oRMRating);
			ORM.Usuario oRMUsuario = ORM.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lista, contraseñaUsuario, nombreUsuario
			ORM.UsuarioDAO.save(oRMUsuario);
			ORM.Lista oRMLista = ORM.ListaDAO.createLista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : entradaLista, usuarioidUsuario, nombreLista
			ORM.ListaDAO.save(oRMLista);
			ORM.EntradaLista oRMEntradaLista = ORM.EntradaListaDAO.createEntradaLista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : listaidLista, tipo, terminado, ultimoCapitulo, alDia
			ORM.EntradaListaDAO.save(oRMEntradaLista);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoProgramacionAvanzadaData createProyectoProgramacionAvanzadaData = new CreateProyectoProgramacionAvanzadaData();
			try {
				createProyectoProgramacionAvanzadaData.createTestData();
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
