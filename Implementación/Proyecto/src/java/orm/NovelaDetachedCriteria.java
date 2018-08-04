/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ORM;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NovelaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idNovela;
	public final StringExpression nombre;
	public final StringExpression nombreAlternativo;
	public final StringExpression año;
	public final ByteExpression licenciado;
	public final ByteExpression completamenteTraducido;
	public final StringExpression novelUpdateUrl;
	public final IntegerExpression estrellas;
	public final IntegerExpression publicadorOriginalidPublicadorOriginalId;
	public final AssociationExpression publicadorOriginalidPublicadorOriginal;
	public final IntegerExpression autoridAutorId;
	public final AssociationExpression autoridAutor;
	public final IntegerExpression publicadorInglesidPublicadorInglesId;
	public final AssociationExpression publicadorInglesidPublicadorIngles;
	public final IntegerExpression tipoidTipoId;
	public final AssociationExpression tipoidTipo;
	public final IntegerExpression estadoUsuarioidEstadoUsuario;
	public final IntegerExpression lenguajeOriginalidLenguajeId;
	public final AssociationExpression lenguajeOriginalidLenguaje;
	public final IntegerExpression artistaidArtistaId;
	public final AssociationExpression artistaidArtista;
	public final CollectionExpression generoidGenero;
	public final CollectionExpression tagidTag;
	public final CollectionExpression entradaLista;
	
	public NovelaDetachedCriteria() {
		super(ORM.Novela.class, ORM.NovelaCriteria.class);
		idNovela = new IntegerExpression("idNovela", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nombreAlternativo = new StringExpression("nombreAlternativo", this.getDetachedCriteria());
		año = new StringExpression("año", this.getDetachedCriteria());
		licenciado = new ByteExpression("licenciado", this.getDetachedCriteria());
		completamenteTraducido = new ByteExpression("completamenteTraducido", this.getDetachedCriteria());
		novelUpdateUrl = new StringExpression("novelUpdateUrl", this.getDetachedCriteria());
		estrellas = new IntegerExpression("estrellas", this.getDetachedCriteria());
		publicadorOriginalidPublicadorOriginalId = new IntegerExpression("publicadorOriginalidPublicadorOriginal.idPublicadorOriginal", this.getDetachedCriteria());
		publicadorOriginalidPublicadorOriginal = new AssociationExpression("publicadorOriginalidPublicadorOriginal", this.getDetachedCriteria());
		autoridAutorId = new IntegerExpression("autoridAutor.idAutor", this.getDetachedCriteria());
		autoridAutor = new AssociationExpression("autoridAutor", this.getDetachedCriteria());
		publicadorInglesidPublicadorInglesId = new IntegerExpression("publicadorInglesidPublicadorIngles.idPublicadorIngles", this.getDetachedCriteria());
		publicadorInglesidPublicadorIngles = new AssociationExpression("publicadorInglesidPublicadorIngles", this.getDetachedCriteria());
		tipoidTipoId = new IntegerExpression("tipoidTipo.idTipo", this.getDetachedCriteria());
		tipoidTipo = new AssociationExpression("tipoidTipo", this.getDetachedCriteria());
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this.getDetachedCriteria());
		lenguajeOriginalidLenguajeId = new IntegerExpression("lenguajeOriginalidLenguaje.idLenguaje", this.getDetachedCriteria());
		lenguajeOriginalidLenguaje = new AssociationExpression("lenguajeOriginalidLenguaje", this.getDetachedCriteria());
		artistaidArtistaId = new IntegerExpression("artistaidArtista.idArtista", this.getDetachedCriteria());
		artistaidArtista = new AssociationExpression("artistaidArtista", this.getDetachedCriteria());
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this.getDetachedCriteria());
		tagidTag = new CollectionExpression("ORM_TagidTag", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public NovelaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ORM.NovelaCriteria.class);
		idNovela = new IntegerExpression("idNovela", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		nombreAlternativo = new StringExpression("nombreAlternativo", this.getDetachedCriteria());
		año = new StringExpression("año", this.getDetachedCriteria());
		licenciado = new ByteExpression("licenciado", this.getDetachedCriteria());
		completamenteTraducido = new ByteExpression("completamenteTraducido", this.getDetachedCriteria());
		novelUpdateUrl = new StringExpression("novelUpdateUrl", this.getDetachedCriteria());
		estrellas = new IntegerExpression("estrellas", this.getDetachedCriteria());
		publicadorOriginalidPublicadorOriginalId = new IntegerExpression("publicadorOriginalidPublicadorOriginal.idPublicadorOriginal", this.getDetachedCriteria());
		publicadorOriginalidPublicadorOriginal = new AssociationExpression("publicadorOriginalidPublicadorOriginal", this.getDetachedCriteria());
		autoridAutorId = new IntegerExpression("autoridAutor.idAutor", this.getDetachedCriteria());
		autoridAutor = new AssociationExpression("autoridAutor", this.getDetachedCriteria());
		publicadorInglesidPublicadorInglesId = new IntegerExpression("publicadorInglesidPublicadorIngles.idPublicadorIngles", this.getDetachedCriteria());
		publicadorInglesidPublicadorIngles = new AssociationExpression("publicadorInglesidPublicadorIngles", this.getDetachedCriteria());
		tipoidTipoId = new IntegerExpression("tipoidTipo.idTipo", this.getDetachedCriteria());
		tipoidTipo = new AssociationExpression("tipoidTipo", this.getDetachedCriteria());
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this.getDetachedCriteria());
		lenguajeOriginalidLenguajeId = new IntegerExpression("lenguajeOriginalidLenguaje.idLenguaje", this.getDetachedCriteria());
		lenguajeOriginalidLenguaje = new AssociationExpression("lenguajeOriginalidLenguaje", this.getDetachedCriteria());
		artistaidArtistaId = new IntegerExpression("artistaidArtista.idArtista", this.getDetachedCriteria());
		artistaidArtista = new AssociationExpression("artistaidArtista", this.getDetachedCriteria());
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this.getDetachedCriteria());
		tagidTag = new CollectionExpression("ORM_TagidTag", this.getDetachedCriteria());
		entradaLista = new CollectionExpression("ORM_EntradaLista", this.getDetachedCriteria());
	}
	
	public PublicadorOriginalDetachedCriteria createPublicadorOriginalidPublicadorOriginalCriteria() {
		return new PublicadorOriginalDetachedCriteria(createCriteria("publicadorOriginalidPublicadorOriginal"));
	}
	
	public AutorDetachedCriteria createAutoridAutorCriteria() {
		return new AutorDetachedCriteria(createCriteria("autoridAutor"));
	}
	
	public PublicadorInglesDetachedCriteria createPublicadorInglesidPublicadorInglesCriteria() {
		return new PublicadorInglesDetachedCriteria(createCriteria("publicadorInglesidPublicadorIngles"));
	}
	
	public TipoDetachedCriteria createTipoidTipoCriteria() {
		return new TipoDetachedCriteria(createCriteria("tipoidTipo"));
	}
	
	public LenguajeOriginalDetachedCriteria createLenguajeOriginalidLenguajeCriteria() {
		return new LenguajeOriginalDetachedCriteria(createCriteria("lenguajeOriginalidLenguaje"));
	}
	
	public ArtistaDetachedCriteria createArtistaidArtistaCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("artistaidArtista"));
	}
	
	public ORM.GeneroDetachedCriteria createGeneroidGeneroCriteria() {
		return new ORM.GeneroDetachedCriteria(createCriteria("ORM_GeneroidGenero"));
	}
	
	public ORM.TagDetachedCriteria createTagidTagCriteria() {
		return new ORM.TagDetachedCriteria(createCriteria("ORM_TagidTag"));
	}
	
	public ORM.EntradaListaDetachedCriteria createEntradaListaCriteria() {
		return new ORM.EntradaListaDetachedCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public Novela uniqueNovela(PersistentSession session) {
		return (Novela) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Novela[] listNovela(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Novela[]) list.toArray(new Novela[list.size()]);
	}
}

