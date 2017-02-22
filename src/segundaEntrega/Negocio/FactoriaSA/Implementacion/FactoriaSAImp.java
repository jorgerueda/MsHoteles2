/**
 * 
 */
package segundaEntrega.Negocio.FactoriaSA.Implementacion;

import segundaEntrega.Negocio.Cliente.SA.SACliente;
import segundaEntrega.Negocio.Cliente.SA.Implementacion.SAClienteImp;
import segundaEntrega.Negocio.Departamento.SA.SADepartamento;
import segundaEntrega.Negocio.Departamento.SA.SADepartamentoImp;
import segundaEntrega.Negocio.Empleado.SA.SAEmpleado;
import segundaEntrega.Negocio.Empleado.SA.SAEmpleadoImp;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Negocio.Habitacion.SA.SAHabitacion;
import segundaEntrega.Negocio.Habitacion.SA.Implementacion.SAHabitacionImp;
import segundaEntrega.Negocio.Reserva.SA.SAReserva;
import segundaEntrega.Negocio.Reserva.SA.Implementacion.SAReservaImp;
import segundaEntrega.Negocio.Tarea.SA.SATarea;
import segundaEntrega.Negocio.Tarea.SA.SATareaImp;


public class FactoriaSAImp extends FactoriaSA {

	public SACliente generaSACliente() {
		return new SAClienteImp();
	}

	public SAHabitacion generaSAHabitacion() {
		return new SAHabitacionImp();
	}
	
	public SAReserva generaSAReserva() {
		return new SAReservaImp();
	}

	@Override
	public SADepartamento generaSADepartamento() {
		// TODO Auto-generated method stub
		return new SADepartamentoImp();
	}

	@Override
	public SATarea generaSATarea() {
		// TODO Auto-generated method stub
		return new SATareaImp();
	}

	@Override
	public SAEmpleado generaSAEmpleado() {
		// TODO Auto-generated method stub
		return new SAEmpleadoImp();
	}
}