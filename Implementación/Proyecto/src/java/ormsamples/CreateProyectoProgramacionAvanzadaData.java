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
public class CreateProyectoProgramacionAvanzadaData {

    /**
     *
     * @throws PersistentException
     */
    public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Novela lormNovela = orm.NovelaDAO.createNovela();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tagidTag, generoidGenero, artistaidArtista, lenguajeOriginalidLenguaje, tipoidTipo, publicadorInglesidPublicadorIngles, autoridAutor, publicadorOriginalidPublicadorOriginal
			orm.NovelaDAO.save(lormNovela);
			orm.LenguajeOriginal lormLenguajeOriginal = orm.LenguajeOriginalDAO.createLenguajeOriginal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			orm.LenguajeOriginalDAO.save(lormLenguajeOriginal);
			orm.PublicadorOriginal lormPublicadorOriginal = orm.PublicadorOriginalDAO.createPublicadorOriginal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			orm.PublicadorOriginalDAO.save(lormPublicadorOriginal);
			orm.PublicadorIngles lormPublicadorIngles = orm.PublicadorInglesDAO.createPublicadorIngles();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			orm.PublicadorInglesDAO.save(lormPublicadorIngles);
			orm.Tag lormTag = orm.TagDAO.createTag();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mangaidManga, novelaidNovela, nombre
			orm.TagDAO.save(lormTag);
			orm.Tipo lormTipo = orm.TipoDAO.createTipo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela, nombre
			orm.TipoDAO.save(lormTipo);
			orm.Genero lormGenero = orm.GeneroDAO.createGenero();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : serieGenericaidSerie, mangaidManga, animacionidAnimacion, novelaidNovela, nombre
			orm.GeneroDAO.save(lormGenero);
			orm.Autor lormAutor = orm.AutorDAO.createAutor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela
			orm.AutorDAO.save(lormAutor);
			orm.Animacion lormAnimacion = orm.AnimacionDAO.createAnimacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : generoidGenero, estudioidEstudio, ratingidRating, tipoEmisionidTipoEmision, temporadaidTemporada
			orm.AnimacionDAO.save(lormAnimacion);
			orm.Estudio lormEstudio = orm.EstudioDAO.createEstudio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			orm.EstudioDAO.save(lormEstudio);
			orm.Temporada lormTemporada = orm.TemporadaDAO.createTemporada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			orm.TemporadaDAO.save(lormTemporada);
			orm.TipoEmision lormTipoEmision = orm.TipoEmisionDAO.createTipoEmision();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			orm.TipoEmisionDAO.save(lormTipoEmision);
			orm.Manga lormManga = orm.MangaDAO.createManga();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tagidTag, mangakaidAutor, mangakaidArtista, generoidGenero, licenciado
			orm.MangaDAO.save(lormManga);
			orm.Artista lormArtista = orm.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : novela
			orm.ArtistaDAO.save(lormArtista);
			orm.TipoManga lormTipoManga = orm.TipoMangaDAO.createTipoManga();
			// Initialize the properties of the persistent object here
			orm.TipoMangaDAO.save(lormTipoManga);
			orm.SerieGenerica lormSerieGenerica = orm.SerieGenericaDAO.createSerieGenerica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : generoidGenero
			orm.SerieGenericaDAO.save(lormSerieGenerica);
			orm.Rating lormRating = orm.RatingDAO.createRating();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : animacion
			orm.RatingDAO.save(lormRating);
			orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lista, contraseñaUsuario, nombreUsuario
			orm.UsuarioDAO.save(lormUsuario);
			orm.Lista lormLista = orm.ListaDAO.createLista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : entradaLista, usuarioidUsuario, nombreLista
			orm.ListaDAO.save(lormLista);
			orm.EntradaLista lormEntradaLista = orm.EntradaListaDAO.createEntradaLista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : listaidLista, tipo, terminado, ultimoCapitulo, alDia
			orm.EntradaListaDAO.save(lormEntradaLista);
			orm.Mangaka lormMangaka = orm.MangakaDAO.createMangaka();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mangaidMangaAutor, mangaidMangaArtista, nombre
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
