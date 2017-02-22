/**
 * 
 */
package segundaEntrega.Negocio.Reserva.SA.Implementacion;

import java.util.List;

import segundaEntrega.Integracion.Cliente.DAOCliente;
import segundaEntrega.Integracion.FactoriaDAO.FactoriaDAO;
import segundaEntrega.Integracion.Habitacion.DAOHabitacion;
import segundaEntrega.Integracion.Reserva.DAOReserva;
import segundaEntrega.Integracion.Transaccion.Transaccion;
import segundaEntrega.Integracion.TransactionManager.TransactionManager;
import segundaEntrega.Negocio.Reserva.SA.SAReserva;
import segundaEntrega.Negocio.Transfer.TransferCliente;
import segundaEntrega.Negocio.Transfer.TransferHabitacion;
import segundaEntrega.Negocio.Transfer.TransferReserva;

public class SAReservaImp implements SAReserva {

	public int nuevaReserva(TransferReserva TReserva) {
		// Siempre deberia cambiarse este valor
		int valorDevuelto = 0;

		// Obtiene una transaccion y la empieza
		Transaccion transaccion = TransactionManager.getInstancia().nuevaTransaccion();

		transaccion.start();

		DAOReserva daoReserva = FactoriaDAO.getInstance().getDAOReserva();

		// Para comprobacion del Cliente
		DAOCliente daoCliente = FactoriaDAO.getInstance().getDAOCliente();

		// Para comprobacion de la Habitacion

		int id_cliente = daoCliente.getId(TReserva.getDniCliente());

		// Comprobacion de si existe ese Cliente con ese id
		TransferCliente transferBuscadoCliente = daoCliente.mostrarCliente(id_cliente);

		if ((transferBuscadoCliente != null) && (transferBuscadoCliente.getDni().equals(TReserva.getDniCliente()))) {

			// Actualizamos el id del transfer con el que ya tenia
			transferBuscadoCliente.setId(id_cliente);

			// Si esta activo
			if (transferBuscadoCliente.isActivo()) {
				// En el campo id, ponemos el ID del Cliente
				TReserva.setIdCliente(id_cliente);
				// Comprueba la habitacion

				int id_reserva = daoReserva.getId(TReserva.getFechaEntrada(), TReserva.getFechaSalida(), id_cliente);

				TReserva.setId(-1);
				int valorCreacion = daoReserva.nuevaReserva(TReserva, id_cliente);

				// Si devuelve un id correcto
				if (valorCreacion != 0) {
					valorDevuelto = valorCreacion;
					transaccion.commit();
				} else {
					valorDevuelto = -2;
					transaccion.rollback();
				}

			} else {
				// No existe Cliente o no esta activo
				valorDevuelto = -1;
				transaccion.rollback();
			}
		} else {
			// No existe Cliente o no esta activo
			valorDevuelto = -1;
			transaccion.rollback();
		}

		// Elimina la transaccion
		TransactionManager.getInstancia().eliminarTransaccion();

		return valorDevuelto;
	}

	public TransferReserva mostrarReserva(int id) {

		Transaccion transaccion = TransactionManager.getInstancia().nuevaTransaccion();

		transaccion.start();

		DAOReserva daoReserva = FactoriaDAO.getInstance().getDAOReserva();

		TransferReserva transferBuscado = daoReserva.mostrarReserva(id);

		// Si no esta activa, es como si no la encuentra

		if (transferBuscado != null) {
			if (!transferBuscado.isActivo()) {
				transferBuscado = null;
			}
		}

		// En los mostrar para evitar bloqueos
		transaccion.commit();

		// Elimina la transaccion
		TransactionManager.getInstancia().eliminarTransaccion();

		return transferBuscado;
	}

	@Override
	public int anadirHabitacion(TransferReserva TReserva) {
		// Siempre deberia cambiarse este valor
		int valorDevuelto = 0;

		// Obtiene una transaccion y la empieza
		Transaccion transaccion = TransactionManager.getInstancia().nuevaTransaccion();

		transaccion.start();

		DAOReserva daoReserva = FactoriaDAO.getInstance().getDAOReserva();

		// Comprobacion de la Habitacion
		DAOHabitacion daoHabitacion = FactoriaDAO.getInstance().getDAOHabitacion();

		int id_habitacion = daoHabitacion.getId(TReserva.getNumHabitacion());

		// Comprobacion de si existe ese Cliente con ese id
		TransferHabitacion transferBuscadoHabitacion = daoHabitacion.mostrarHabitacion(id_habitacion);

		if ((transferBuscadoHabitacion != null)
				&& (transferBuscadoHabitacion.getNumero() == (TReserva.getNumHabitacion()))) {

			if (transferBuscadoHabitacion.isActivo()) {

				List<Integer> id_Habitaciones = TReserva.getId_Habitaciones();

				id_Habitaciones.add(id_habitacion);
				TReserva.setId_Habitaciones(id_Habitaciones);

				int valorCreacion = daoReserva.anadirHabitacion(TReserva, id_habitacion);

				// Si devuelve un id correcto
				if (valorCreacion != 0) {
					valorDevuelto = valorCreacion;
					transaccion.commit();
				} else {
					valorDevuelto = -2;
					transaccion.rollback();
				}
			}

		} else {
			// No existe Habitacion o no esta activo
			valorDevuelto = -1;
			transaccion.rollback();
		}
		// Elimina la transaccion
		TransactionManager.getInstancia().eliminarTransaccion();

		return valorDevuelto;
	}

	@Override
	public int quitarHabitacion(TransferReserva TReserva) {
		// Siempre deberia cambiarse este valor
		int valorDevuelto = 0;

		// Obtiene una transaccion y la empieza
		Transaccion transaccion = TransactionManager.getInstancia().nuevaTransaccion();

		transaccion.start();

		DAOReserva daoReserva = FactoriaDAO.getInstance().getDAOReserva();

		// Comprobacion de la Habitacion
		DAOHabitacion daoHabitacion = FactoriaDAO.getInstance().getDAOHabitacion();

		int id_habitacion = daoHabitacion.getId(TReserva.getNumHabitacion());

		// Comprobacion de si existe ese Cliente con ese id
		TransferHabitacion transferBuscadoHabitacion = daoHabitacion.mostrarHabitacion(id_habitacion);

		if ((transferBuscadoHabitacion != null)
				&& (transferBuscadoHabitacion.getNumero() == (TReserva.getNumHabitacion()))) {

			if (transferBuscadoHabitacion.isActivo()) {

				List<Integer> id_Habitaciones = TReserva.getId_Habitaciones();

				id_Habitaciones.remove(id_habitacion);
				TReserva.setId_Habitaciones(id_Habitaciones);

				int valorCreacion = daoReserva.quitarHabitacion(TReserva, id_habitacion);

				// Si devuelve un id correcto
				if (valorCreacion != 0) {
					valorDevuelto = valorCreacion;
					transaccion.commit();
				} else {
					valorDevuelto = -2;
					transaccion.rollback();
				}
			}

		} else {
			// No existe Habitacion o no esta activo
			valorDevuelto = -1;
			transaccion.rollback();
		}
		// Elimina la transaccion
		TransactionManager.getInstancia().eliminarTransaccion();

		return valorDevuelto;
	}
}