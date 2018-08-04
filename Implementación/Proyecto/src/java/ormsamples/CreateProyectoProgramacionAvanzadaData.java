/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoProgramacionAvanzadaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Novela oRMNovela = orm.NovelaDAO.createNovela();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tagidTag, generoidGenero, artistaidArtista, lenguajeOriginalidLenguaje, tipoidTipo, publicadorInglesidPublicadorIngles, autoridAutor, publicadorOriginalidPublicadorOriginal
			orm.NovelaDAO.save(oRMNovela);
			orm.LenguajeOriginal oRMLenguajeOriginal = orm.LenguajeOriginalDAO.createLenguajeOriginal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			orm.LenguajeOriginalDAO.save(oRMLenguajeOriginal);
			orm.PublicadorOriginal oRMPublicadorOriginal = orm.PublicadorOriginalDAO.createPublicadorOriginal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			orm.PublicadorOriginalDAO.save(oRMPublicadorOriginal);
			orm.PublicadorIngles oRMPublicadorIngles = orm.PublicadorInglesDAO.createPublicadorIngles();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			orm.PublicadorInglesDAO.save(oRMPublicadorIngles);
			orm.Tag oRMTag = orm.TagDAO.createTag();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mangaidManga, novelaidNovela, nombre
			orm.TagDAO.save(oRMTag);
			orm.Tipo oRMTipo = orm.TipoDAO.createTipo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			orm.TipoDAO.save(oRMTipo);
			orm.Genero oRMGenero = orm.GeneroDAO.createGenero();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : serieGenericaidSerie, mangaidManga, animacionidAnimacion, novelaidNovela, nombre
			orm.GeneroDAO.save(oRMGenero);
			orm.Autor oRMAutor = orm.AutorDAO.createAutor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, mangaidManga
			orm.AutorDAO.save(oRMAutor);
			orm.Animacion oRMAnimacion = orm.AnimacionDAO.createAnimacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : generoidGenero, estudioidEstudio, ratingidRating, tipoEmisionidTipoEmision, temporadaidTemporada
			orm.AnimacionDAO.save(oRMAnimacion);
			orm.Estudio oRMEstudio = orm.EstudioDAO.createEstudio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacionidAnimacion
			orm.EstudioDAO.save(oRMEstudio);
			orm.Temporada oRMTemporada = orm.TemporadaDAO.createTemporada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			orm.TemporadaDAO.save(oRMTemporada);
			orm.TipoEmision oRMTipoEmision = orm.TipoEmisionDAO.createTipoEmision();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			orm.TipoEmisionDAO.save(oRMTipoEmision);
			orm.Manga oRMManga = orm.MangaDAO.createManga();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : aristaidArtista, tagidTag, autoridAutor, generoidGenero, licenciado
			orm.MangaDAO.save(oRMManga);
			orm.Artista oRMArtista = orm.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, mangaidManga
			orm.ArtistaDAO.save(oRMArtista);
			orm.TipoManga oRMTipoManga = orm.TipoMangaDAO.createTipoManga();
			// Initialize the properties of the persistent object here
			orm.TipoMangaDAO.save(oRMTipoManga);
			orm.SerieGenerica oRMSerieGenerica = orm.SerieGenericaDAO.createSerieGenerica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : generoidGenero
			orm.SerieGenericaDAO.save(oRMSerieGenerica);
			orm.Rating oRMRating = orm.RatingDAO.createRating();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			orm.RatingDAO.save(oRMRating);
			orm.Usuario oRMUsuario = orm.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lista, contraseñaUsuario, nombreUsuario
			orm.UsuarioDAO.save(oRMUsuario);
			orm.Lista oRMLista = orm.ListaDAO.createLista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : entradaLista, usuarioidUsuario, nombreLista
			orm.ListaDAO.save(oRMLista);
			orm.EntradaLista oRMEntradaLista = orm.EntradaListaDAO.createEntradaLista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : listaidLista, tipo, terminado, ultimoCapitulo, alDia
			orm.EntradaListaDAO.save(oRMEntradaLista);
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
				orm.ProyectoProgramacionAvanzadaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
