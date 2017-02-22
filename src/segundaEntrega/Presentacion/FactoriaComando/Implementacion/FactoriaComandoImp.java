/**
 * 
 */
package segundaEntrega.Presentacion.FactoriaComando.Implementacion;

import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.ComandosCliente.comandoAltaCliente;
import segundaEntrega.Presentacion.Comandos.ComandosCliente.comandoBajaCliente;
import segundaEntrega.Presentacion.Comandos.ComandosCliente.comandoModificarCliente;
import segundaEntrega.Presentacion.Comandos.ComandosCliente.comandoMostrarCliente;
import segundaEntrega.Presentacion.Comandos.ComandosCliente.comandoMostrarClientes;
import segundaEntrega.Presentacion.Comandos.ComandosCliente.comandoMostrarClientesNReservas;
import segundaEntrega.Presentacion.Comandos.ComandosDepartamento.ComandoBajaDepartamento;
import segundaEntrega.Presentacion.Comandos.ComandosDepartamento.ComandoCalcularSalarioDepartamento;
import segundaEntrega.Presentacion.Comandos.ComandosDepartamento.comandoAltaDepartamento;
import segundaEntrega.Presentacion.Comandos.ComandosDepartamento.comandoModificarDepartamento;
import segundaEntrega.Presentacion.Comandos.ComandosDepartamento.comandoMostrarDepartamento;
import segundaEntrega.Presentacion.Comandos.ComandosDepartamento.comandoMostrarDepartamentos;
import segundaEntrega.Presentacion.Comandos.ComandosEmpleado.ComandoAsignarEmpleadoTarea;
import segundaEntrega.Presentacion.Comandos.ComandosEmpleado.ComandoEliminarEmpleadoTarea;
import segundaEntrega.Presentacion.Comandos.ComandosEmpleado.comandoAltaEmpleado;
import segundaEntrega.Presentacion.Comandos.ComandosEmpleado.comandoMostrarEmpleado;
import segundaEntrega.Presentacion.Comandos.ComandosHabitacion.comandoAltaHabitacion;
import segundaEntrega.Presentacion.Comandos.ComandosHabitacion.comandoMostrarHabitacion;
import segundaEntrega.Presentacion.Comandos.ComandosHabitacion.comandoMostrarHabitacionesNReservas;
import segundaEntrega.Presentacion.Comandos.ComandosReserva.comandoAnadirHabitacion;
import segundaEntrega.Presentacion.Comandos.ComandosReserva.comandoMostrarReserva;
import segundaEntrega.Presentacion.Comandos.ComandosReserva.comandoNuevaReserva;
import segundaEntrega.Presentacion.Comandos.ComandosReserva.comandoQuitarHabitacion;
import segundaEntrega.Presentacion.Comandos.ComandosTarea.comandoAltaTarea;
import segundaEntrega.Presentacion.Comandos.ComandosTarea.comandoBajaTarea;
import segundaEntrega.Presentacion.Comandos.ComandosTarea.comandoMostrarTarea;
import segundaEntrega.Presentacion.Controlador.Evento;
import segundaEntrega.Presentacion.FactoriaComando.FactoriaComando;




public class FactoriaComandoImp extends FactoriaComando {
	

	@Override
	public Comando getComando(int id_comando, Object datos) {
		Comando comando = null;
		
		switch (id_comando){

		//Primera Entrega
		case Evento.ALTA_HABITACION: comando = new comandoAltaHabitacion(); break;
		case Evento.MOSTRAR_HABITACION: comando = new comandoMostrarHabitacion(); break;
		case Evento.MOSTRAR_HABITACION_N_RESERVAS: comando = new comandoMostrarHabitacionesNReservas(); break;

		
		case Evento.ALTA_CLIENTE: comando = new comandoAltaCliente(); break;
		case Evento.BAJA_CLIENTE: comando = new comandoBajaCliente(); break;
		case Evento.MODIFICAR_CLIENTE: comando = new comandoModificarCliente(); break;
		case Evento.MOSTRAR_CLIENTE: comando = new comandoMostrarCliente(); break;
		case Evento.MOSTRAR_CLIENTES: comando = new comandoMostrarClientes(); break;
		case Evento.MOSTRAR_CLIENTE_N_RESERVAS: comando = new comandoMostrarClientesNReservas(); break;

		
		case Evento.ALTA_RESERVA: comando = new comandoNuevaReserva(); break;
		case Evento.MOSTRAR_RESERVA: comando = new comandoMostrarReserva(); break;
		case Evento.ANADIR_HABITACION: comando = new comandoAnadirHabitacion(); break;
		case Evento.QUITAR_HABITACION: comando = new comandoQuitarHabitacion(); break;
		
		
		//Segunda Entrega
		case Evento.ALTA_DEPARTAMENTO: comando = new comandoAltaDepartamento(); break;
		
		case Evento.BAJA_DEPARTAMENTO: comando = new ComandoBajaDepartamento(); break;
		case Evento.CALCULAR_SALARIO_DEPARTAMENTO: comando = new ComandoCalcularSalarioDepartamento(); break;
		case Evento.MODIFICAR_DEPARTAMENTO: comando = new comandoModificarDepartamento(); break;
		case Evento.MOSTAR_DEPARTAMENTO: comando = new comandoMostrarDepartamento(); break;
		case Evento.MOSTRAR_DEPARTAMENTOS: comando = new comandoMostrarDepartamentos(); break;
		
		
				
		case Evento.ALTA_EMPLEADO: comando = new comandoAltaEmpleado(); break;
		case Evento.ASIGNAR_TAREA: comando = new ComandoAsignarEmpleadoTarea(); break;
		case Evento.ELIMINAR_TAREA: comando = new ComandoEliminarEmpleadoTarea(); break;
		case Evento.MOSTRAR_EMPLEADO: comando = new comandoMostrarEmpleado(); break;
		/*case Evento.BAJA_EMPLEADO: comando = new ComandoBajaEmpleado(); break;
		case Evento.MOSTRAR_EMPLEADOS: comando = new ComandoMostrarEmpleados(); break;
		
		*/
		
				
		case Evento.ALTA_TAREA: comando = new comandoAltaTarea(); break;
		case Evento.BAJA_TAREA: comando = new comandoBajaTarea(); break;
		case Evento.MOSTRAR_TAREA: comando = new comandoMostrarTarea(); break;
		/*case Evento.MOSTRAR_TAREAS: comando = new ComandoMostrarTareas(); break;
		
		*/
		
		}		
		return comando;
	}
}