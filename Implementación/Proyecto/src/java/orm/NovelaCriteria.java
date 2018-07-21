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
package orm;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NovelaCriteria extends AbstractORMCriteria {
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
	
	public NovelaCriteria(Criteria criteria) {
		super(criteria);
		idNovela = new IntegerExpression("idNovela", this);
		nombre = new StringExpression("nombre", this);
		nombreAlternativo = new StringExpression("nombreAlternativo", this);
		año = new StringExpression("año", this);
		licenciado = new ByteExpression("licenciado", this);
		completamenteTraducido = new ByteExpression("completamenteTraducido", this);
		novelUpdateUrl = new StringExpression("novelUpdateUrl", this);
		estrellas = new IntegerExpression("estrellas", this);
		publicadorOriginalidPublicadorOriginalId = new IntegerExpression("publicadorOriginalidPublicadorOriginal.idPublicadorOriginal", this);
		publicadorOriginalidPublicadorOriginal = new AssociationExpression("publicadorOriginalidPublicadorOriginal", this);
		autoridAutorId = new IntegerExpression("autoridAutor.idAutor", this);
		autoridAutor = new AssociationExpression("autoridAutor", this);
		publicadorInglesidPublicadorInglesId = new IntegerExpression("publicadorInglesidPublicadorIngles.idPublicadorIngles", this);
		publicadorInglesidPublicadorIngles = new AssociationExpression("publicadorInglesidPublicadorIngles", this);
		tipoidTipoId = new IntegerExpression("tipoidTipo.idTipo", this);
		tipoidTipo = new AssociationExpression("tipoidTipo", this);
		estadoUsuarioidEstadoUsuario = new IntegerExpression("estadoUsuarioidEstadoUsuario", this);
		lenguajeOriginalidLenguajeId = new IntegerExpression("lenguajeOriginalidLenguaje.idLenguaje", this);
		lenguajeOriginalidLenguaje = new AssociationExpression("lenguajeOriginalidLenguaje", this);
		artistaidArtistaId = new IntegerExpression("artistaidArtista.idArtista", this);
		artistaidArtista = new AssociationExpression("artistaidArtista", this);
		generoidGenero = new CollectionExpression("ORM_GeneroidGenero", this);
		tagidTag = new CollectionExpression("ORM_TagidTag", this);
		entradaLista = new CollectionExpression("ORM_EntradaLista", this);
	}
	
	public NovelaCriteria(PersistentSession session) {
		this(session.createCriteria(Novela.class));
	}
	
	public NovelaCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public PublicadorOriginalCriteria createPublicadorOriginalidPublicadorOriginalCriteria() {
		return new PublicadorOriginalCriteria(createCriteria("publicadorOriginalidPublicadorOriginal"));
	}
	
	public AutorCriteria createAutoridAutorCriteria() {
		return new AutorCriteria(createCriteria("autoridAutor"));
	}
	
	public PublicadorInglesCriteria createPublicadorInglesidPublicadorInglesCriteria() {
		return new PublicadorInglesCriteria(createCriteria("publicadorInglesidPublicadorIngles"));
	}
	
	public TipoCriteria createTipoidTipoCriteria() {
		return new TipoCriteria(createCriteria("tipoidTipo"));
	}
	
	public LenguajeOriginalCriteria createLenguajeOriginalidLenguajeCriteria() {
		return new LenguajeOriginalCriteria(createCriteria("lenguajeOriginalidLenguaje"));
	}
	
	public ArtistaCriteria createArtistaidArtistaCriteria() {
		return new ArtistaCriteria(createCriteria("artistaidArtista"));
	}
	
	public orm.GeneroCriteria createGeneroidGeneroCriteria() {
		return new orm.GeneroCriteria(createCriteria("ORM_GeneroidGenero"));
	}
	
	public orm.TagCriteria createTagidTagCriteria() {
		return new orm.TagCriteria(createCriteria("ORM_TagidTag"));
	}
	
	public orm.EntradaListaCriteria createEntradaListaCriteria() {
		return new orm.EntradaListaCriteria(createCriteria("ORM_EntradaLista"));
	}
	
	public Novela uniqueNovela() {
		return (Novela) super.uniqueResult();
	}
	
	public Novela[] listNovela() {
		java.util.List list = super.list();
		return (Novela[]) list.toArray(new Novela[list.size()]);
	}
}

