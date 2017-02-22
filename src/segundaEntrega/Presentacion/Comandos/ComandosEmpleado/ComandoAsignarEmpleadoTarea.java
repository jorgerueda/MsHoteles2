package segundaEntrega.Presentacion.Comandos.ComandosEmpleado;

import segundaEntrega.Negocio.Empleado.ClavesEmpleadoTarea;
import segundaEntrega.Negocio.Empleado.EmpleadoTarea;
import segundaEntrega.Negocio.Empleado.SA.SAEmpleado;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Negocio.Tarea.Tarea;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class ComandoAsignarEmpleadoTarea extends Comando {

	@Override
	public RetornoComando execute() {

		//crea el servicio de empleados, lo crea utilizando una fabrica
		SAEmpleado empleadoSA = FactoriaSA.getInstancia().generaSAEmpleado();
		
		int resultado = empleadoSA.asignarTarea((EmpleadoTarea)datos); //llama al metodo de baja empleados
		
		RetornoComando retornoComando;

		if( resultado ==-3){
			retornoComando = new RetornoComando(EventoVista.ASIGNAR_TAREA_FALLO_TAREA_YA_ASIGNADA_EMPLEADO,null); //crea la respuesta de comando
		}else if(resultado ==0){
			retornoComando = new RetornoComando(EventoVista.ASIGNAR_TAREA_FALLO,null); //crea la respuesta de comando
		}else if (resultado ==-1){
			retornoComando = new RetornoComando(EventoVista.ASIGNAR_TAREA_FALLO_EMPLEADO_NO_EXISTE,null); //crea la respuesta de comando
		}else if (resultado ==-4){
			retornoComando = new RetornoComando(EventoVista.ASIGNAR_TAREA_FALLO_EMPLEADO_YA_ASIGNADO_TAREA,null); //crea la respuesta de comando
		}else if (resultado == -2){
			retornoComando = new RetornoComando(EventoVista.ASIGNAR_TAREA_FALLO_TAREA_NO_EXISTE,null); //crea la respuesta de comando
		}else{
			retornoComando = new RetornoComando(EventoVista.ASIGNAR_TAREA_EXITO,resultado); //crea la respuesta de comando
		}
		
		
		return retornoComando;
	}
}
