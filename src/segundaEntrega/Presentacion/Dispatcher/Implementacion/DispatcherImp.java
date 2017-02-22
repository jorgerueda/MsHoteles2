/**
 * 
 */
package segundaEntrega.Presentacion.Dispatcher.Implementacion;

import segundaEntrega.Presentacion.Cliente.GUIAltaCliente;
import segundaEntrega.Presentacion.Cliente.GUIBajaCliente;
import segundaEntrega.Presentacion.Cliente.GUIModificarCliente;
import segundaEntrega.Presentacion.Cliente.GUIMostrarCliente;
import segundaEntrega.Presentacion.Cliente.GUIMostrarClientes;
import segundaEntrega.Presentacion.Cliente.GUIMostrarClientesNReservas;
import segundaEntrega.Presentacion.Departamento.GUIAltaDepartamento;
import segundaEntrega.Presentacion.Departamento.GUIBajaDepartamento;
import segundaEntrega.Presentacion.Departamento.GUICalcularSalarioDepartamento;
import segundaEntrega.Presentacion.Departamento.GUIModificarDepartamento;
import segundaEntrega.Presentacion.Departamento.GUIMostrarDepartamento;
import segundaEntrega.Presentacion.Departamento.GUIMostrarDepartamentos;
import segundaEntrega.Presentacion.Dispatcher.Dispatcher;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;
import segundaEntrega.Presentacion.Empleado.GUIAltaEmpleado;
import segundaEntrega.Presentacion.Empleado.GUIAsignarEmpleadoTarea;
import segundaEntrega.Presentacion.Empleado.GUIEliminarEmpleadoTarea;
import segundaEntrega.Presentacion.Empleado.GUIMostrarEmpleado;
import segundaEntrega.Presentacion.Habitacion.GUIAltaHabitacion;
import segundaEntrega.Presentacion.Habitacion.GUIMostrarHabitacion;
import segundaEntrega.Presentacion.Habitacion.GUIMostrarHabitacionesNReservas;
import segundaEntrega.Presentacion.Reserva.GUIAnadirHabitacion;
import segundaEntrega.Presentacion.Reserva.GUIMostrarReserva;
import segundaEntrega.Presentacion.Reserva.GUINuevaReserva;
import segundaEntrega.Presentacion.Tarea.GUIAltaTarea;
import segundaEntrega.Presentacion.Tarea.GUIBajaTarea;
import segundaEntrega.Presentacion.Tarea.GUIMostrarTarea;
import segundaEntrega.Presentacion.Tarea.GUIMostrarTareas;


public class DispatcherImp extends Dispatcher {

	@Override
	public void dispatch(int id_evento_vista, Object datos) {
	
		switch(id_evento_vista){
		
							//HABITACIONES
		
			case EventoVista.ALTA_HABITACION_EXITO: GUIAltaHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_HABITACION_CAPACIDAD_NO_VALIDA: GUIAltaHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_HABITACION_NUMERO_YA_EXISTE: GUIAltaHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_HABITACION_FALLO: GUIAltaHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_HABITACION_EXITO: GUIMostrarHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_HABITACION_FALLO: GUIMostrarHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_HABITACION_N_RESERVAS_EXITO: GUIMostrarHabitacionesNReservas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_HABITACION_N_RESERVAS_FALLO: GUIMostrarHabitacionesNReservas.obtenerInstancia().actualizar(id_evento_vista, datos); break;

			
							//CLIENTES
			
			case EventoVista.ALTA_CLIENTE_EXITO: GUIAltaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_CLIENTE_DNI_YA_EXISTE: GUIAltaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_CLIENTE_HABITACION_NO_EXISTE: GUIAltaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_CLIENTE_HABITACION_LLENA: GUIAltaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_CLIENTE_FALLO: GUIAltaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			case EventoVista.BAJA_CLIENTE_EXITO: GUIBajaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.BAJA_CLIENTE_NO_EXISTE: GUIBajaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.BAJA_CLIENTES_RESERVAS_ASOCIADAS: GUIBajaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.BAJA_CLIENTE_FALLO: GUIBajaCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			case EventoVista.MODIFICAR_CLIENTE_EXITO: GUIModificarCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MODIFICAR_CLIENTE_NO_EXISTE: GUIModificarCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MODIFICAR_CLIENTE_FALLO: GUIModificarCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			case EventoVista.MOSTRAR_CLIENTE_EXITO: GUIMostrarCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_CLIENTE_FALLO: GUIMostrarCliente.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_CLIENTE_N_RESERVAS_EXITO: GUIMostrarClientesNReservas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_CLIENTE_N_RESERVAS_FALLO: GUIMostrarClientesNReservas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			
			case EventoVista.MOSTRAR_CLIENTES_EXITO: GUIMostrarClientes.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_CLIENTES_FALLO: GUIMostrarClientes.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			
							//RESERVAS
			
			case EventoVista.ALTA_RESERVA_EXITO: GUINuevaReserva.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_RESERVA_CLIENTE_NO_EXISTE: GUINuevaReserva.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_RESERVA_FALLO: GUINuevaReserva.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ADD_HABITACION_EXITO: GUIAnadirHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ADD_HABITACION_FALLO: GUIAnadirHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.QUITAR_HABITACION_EXITO: GUIAnadirHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.QUITAR_HABITACION_FALLO: GUIAnadirHabitacion.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_RESERVA_EXITO: GUIMostrarReserva.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_RESERVA_FALLO: GUIMostrarReserva.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			
			//SEGUNDA ENTREGA
			
			
							//DEPARTAMNENTOS

			case EventoVista.ALTA_DEPARTAMENTO_EXITO: GUIAltaDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_DEPARTAMENTO_FALLO: GUIAltaDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_DEPARTAMENTO_NOMBRE_EXISTE: GUIAltaDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			case EventoVista.BAJA_DEPARTAMENTO_EXITO: GUIBajaDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.BAJA_DEPARTAMENTO_FALLO: GUIBajaDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.CALCULAR_SALARIO_DEPARTAMENTO_EXITO: GUICalcularSalarioDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.CALCULAR_SALARIO_DEPARTAMENTO_FALLO: GUICalcularSalarioDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MODIFICAR_DEPARTAMENTO_EXITO: GUIModificarDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MODIFICAR_DEPARTAMENTO_FALLO: GUIModificarDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;

			
			case EventoVista.MOSTAR_DEPARTAMENTO_EXITO: GUIMostrarDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTAR_DEPARTAMENTO_FALLO: GUIMostrarDepartamento.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			case EventoVista.MOSTRAR_DEPARTAMENTOS_EXITO: GUIMostrarDepartamentos.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MOSTRAR_DEPARTAMENTOS_FALLO: GUIMostrarDepartamentos.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			
							//EMPLEADOS
			
			case EventoVista.ALTA_EMPLEADO_EXITO: GUIAltaEmpleado.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_EMPLEADO_FALLO: GUIAltaEmpleado.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_EMPLEADO_DEPARTAMENTO_NO_EXISTE: GUIAltaEmpleado.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			case EventoVista.ASIGNAR_TAREA_EXITO: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ASIGNAR_TAREA_FALLO_EMPLEADO_NO_EXISTE: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ASIGNAR_TAREA_FALLO_TAREA_NO_EXISTE: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ASIGNAR_TAREA_FALLO_TAREA_YA_ASIGNADA_EMPLEADO: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ASIGNAR_TAREA_FALLO_EMPLEADO_YA_ASIGNADO_TAREA: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			
			case EventoVista.ELIMINAR_TAREA_EXITO: GUIEliminarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ELIMINAR_TAREA_FALLO: GUIEliminarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;

			case EventoVista.MOSTRAR_EMPLEADO_EXITO: GUIMostrarEmpleado.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.MOSTRAR_EMPLEADO_FALLO: GUIMostrarEmpleado.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			
			/*case EventoVista.BAJA_EMPLEADO_EXITO: GUIBajaEmpleado.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.BAJA_EMPLEADO_FALLO: GUIBajaEmpleado.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			
			
			case EventoVista.MOSTRAR_EMPLEADOS_EXITO: GUIMostrarEmpleados.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.MOSTRAR_EMPLEADOS_FALLO: GUIMostrarEmpleados.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			
			case EventoVista.ELIMINAR_TAREA_FALLO_EMPLEADO_NO_EXISTE: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ELIMINAR_TAREA_FALLO_TAREA_NO_EXISTE: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ELIMINAR_TAREA_FALLO_TAREA_YA_ASIGNADA_EMPLEADO: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ELIMINAR_TAREA_FALLO_EMPLEADO_YA_ASIGNADO_TAREA: GUIAsignarEmpleadoTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			*/
						//TAREAS
			
			case EventoVista.ALTA_TAREA_EXITO: GUIAltaTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.ALTA_TAREA_FALLO:GUIAltaTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			
			case EventoVista.BAJA_TAREA_EXITO: GUIBajaTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.BAJA_TAREA_FALLO: GUIBajaTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			
			case EventoVista.MOSTRAR_TAREA_EXITO: GUIMostrarTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.MOSTRAR_TAREA_FALLO: GUIMostrarTarea.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			
			/*case EventoVista.MOSTRAR_TAREAS_EXITO: GUIMostrarTareas.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			case EventoVista.MOSTRAR_TAREAS_FALLO: GUIMostrarTareas.obtenerInstancia().actualizar(id_evento_vista, datos);break;
			
			
			*/
				
					
		}	
	}

}
