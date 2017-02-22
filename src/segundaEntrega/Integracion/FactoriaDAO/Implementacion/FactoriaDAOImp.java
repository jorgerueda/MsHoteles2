/**
 * 
 */
package segundaEntrega.Integracion.FactoriaDAO.Implementacion;

import segundaEntrega.Integracion.Cliente.DAOCliente;
import segundaEntrega.Integracion.Cliente.Implementacion.DAOClienteImp;
import segundaEntrega.Integracion.FactoriaDAO.FactoriaDAO;
import segundaEntrega.Integracion.Habitacion.DAOHabitacion;
import segundaEntrega.Integracion.Habitacion.Implementacion.DAOHabitacionImp;
import segundaEntrega.Integracion.Reserva.DAOReserva;
import segundaEntrega.Integracion.Reserva.Implementacion.DAOReservaImp;


public class FactoriaDAOImp extends FactoriaDAO {

	public DAOCliente getDAOCliente() {
		return new DAOClienteImp();
	}


	public DAOHabitacion getDAOHabitacion() {
		return new DAOHabitacionImp();
	}


	public DAOReserva getDAOReserva() {
		return new DAOReservaImp();
	}
}