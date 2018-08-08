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
public class CreateProyectoProgramacionAvanzadaDatabaseSchema {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(orm.ProyectoProgramacionAvanzadaPersistentManager.instance());
			orm.ProyectoProgramacionAvanzadaPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
