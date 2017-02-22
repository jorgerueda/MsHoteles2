/**
 * 
 */
package segundaEntrega.Negocio.FactoriaSA;

import segundaEntrega.Negocio.Cliente.SA.SACliente;
import segundaEntrega.Negocio.Departamento.SA.SADepartamento;
import segundaEntrega.Negocio.Empleado.SA.SAEmpleado;
import segundaEntrega.Negocio.FactoriaSA.Implementacion.FactoriaSAImp;
import segundaEntrega.Negocio.Habitacion.SA.SAHabitacion;
import segundaEntrega.Negocio.Reserva.SA.SAReserva;
import segundaEntrega.Negocio.Tarea.SA.SATarea;


public abstract class FactoriaSA {

	private static FactoriaSA instancia;

	public static FactoriaSA getInstancia() {

		if (instancia == null)
			instancia = new FactoriaSAImp();
		
		return instancia;
	}

	public abstract SACliente generaSACliente();

	public abstract SAHabitacion generaSAHabitacion();

	public abstract SAReserva generaSAReserva();
	
	
	public abstract SADepartamento generaSADepartamento();
	public abstract SATarea generaSATarea();
	public abstract SAEmpleado generaSAEmpleado();

}