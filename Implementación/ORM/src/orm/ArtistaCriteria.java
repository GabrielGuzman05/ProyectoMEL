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

public class ArtistaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idArtista;
	public final StringExpression nombre;
	public final CollectionExpression mangaidManga;
	public final CollectionExpression novela;
	
	public ArtistaCriteria(Criteria criteria) {
		super(criteria);
		idArtista = new IntegerExpression("idArtista", this);
		nombre = new StringExpression("nombre", this);
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this);
		novela = new CollectionExpression("ORM_Novela", this);
	}
	
	public ArtistaCriteria(PersistentSession session) {
		this(session.createCriteria(Artista.class));
	}
	
	public ArtistaCriteria() throws PersistentException {
		this(orm.ProyectoProgramacionAvanzadaPersistentManager.instance().getSession());
	}
	
	public orm.MangaCriteria createMangaidMangaCriteria() {
		return new orm.MangaCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public orm.NovelaCriteria createNovelaCriteria() {
		return new orm.NovelaCriteria(createCriteria("ORM_Novela"));
	}
	
	public Artista uniqueArtista() {
		return (Artista) super.uniqueResult();
	}
	
	public Artista[] listArtista() {
		java.util.List list = super.list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

