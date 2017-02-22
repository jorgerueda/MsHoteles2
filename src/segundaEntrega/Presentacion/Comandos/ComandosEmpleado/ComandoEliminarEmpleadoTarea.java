package segundaEntrega.Presentacion.Comandos.ComandosEmpleado;

import segundaEntrega.Negocio.Empleado.ClavesEmpleadoTarea;
import segundaEntrega.Negocio.Empleado.SA.SAEmpleado;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Negocio.Tarea.Tarea;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class ComandoEliminarEmpleadoTarea extends Comando {

	@Override
	public RetornoComando execute() {
		//crea el servicio de empleados, lo crea utilizando una fabrica
				SAEmpleado empleadoSA = FactoriaSA.getInstancia().generaSAEmpleado();
				
				boolean resultado = empleadoSA.eliminarTarea((ClavesEmpleadoTarea)datos); //llama al metodo de baja empleados
				
				RetornoComando retornoComando;

				if( resultado){
					retornoComando = new RetornoComando(EventoVista.ELIMINAR_TAREA_EXITO,null); //crea la respuesta de comando
				}else {
					retornoComando = new RetornoComando(EventoVista.ELIMINAR_TAREA_FALLO,null); //crea la respuesta de comando
				}
				
				
				return retornoComando;
	}
}
