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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ArtistaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idArtista;
	public final StringExpression nombre;
	public final CollectionExpression mangaidManga;
	public final CollectionExpression novela;
	
	public ArtistaDetachedCriteria() {
		super(orm.Artista.class, orm.ArtistaCriteria.class);
		idArtista = new IntegerExpression("idArtista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ArtistaCriteria.class);
		idArtista = new IntegerExpression("idArtista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mangaidManga = new CollectionExpression("ORM_MangaidManga", this.getDetachedCriteria());
		novela = new CollectionExpression("ORM_Novela", this.getDetachedCriteria());
	}
	
	public orm.MangaDetachedCriteria createMangaidMangaCriteria() {
		return new orm.MangaDetachedCriteria(createCriteria("ORM_MangaidManga"));
	}
	
	public orm.NovelaDetachedCriteria createNovelaCriteria() {
		return new orm.NovelaDetachedCriteria(createCriteria("ORM_Novela"));
	}
	
	public Artista uniqueArtista(PersistentSession session) {
		return (Artista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Artista[] listArtista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

