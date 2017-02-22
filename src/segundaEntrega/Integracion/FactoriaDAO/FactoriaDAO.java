/**
 * 
 */
package segundaEntrega.Integracion.FactoriaDAO;

import segundaEntrega.Integracion.Cliente.DAOCliente;
import segundaEntrega.Integracion.FactoriaDAO.Implementacion.FactoriaDAOImp;
import segundaEntrega.Integracion.Habitacion.DAOHabitacion;
import segundaEntrega.Integracion.Reserva.DAOReserva;


public abstract class FactoriaDAO {

	protected FactoriaDAO() {
	}
	
	private static FactoriaDAO instance;
	
	public abstract DAOCliente getDAOCliente();



	public abstract DAOHabitacion getDAOHabitacion();

	
	public abstract DAOReserva getDAOReserva();

	public static FactoriaDAO getInstance() {

		if (instance == null)
			instance = new FactoriaDAOImp();
		
		return instance;
	}

	
	
}