package segundaEntrega.Presentacion.Comandos.ComandosEmpleado;

import segundaEntrega.Negocio.Empleado.Empleado;
import segundaEntrega.Negocio.Empleado.SA.SAEmpleado;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoAltaEmpleado  extends Comando {

	
	public RetornoComando execute() {
		
		int id;
		
		//crea el servicio de empleados, lo crea utilizando una f�brica
		SAEmpleado servicioEmpleado = FactoriaSA.getInstancia().generaSAEmpleado();
		
		Empleado empleado = (Empleado)datos; //hacemos casting de los datos del comando
		
		id = servicioEmpleado.altaEmpleado(empleado);
		
		RetornoComando respuestaComando;

		if(id >= 0){
			respuestaComando = new RetornoComando(EventoVista.ALTA_EMPLEADO_EXITO,id); //crea la respuesta de comando
		}
		else if(id == -1){
			respuestaComando = new RetornoComando(EventoVista.ALTA_EMPLEADO_DEPARTAMENTO_NO_EXISTE,id); //crea la respuesta de comando
		}
		else{
			respuestaComando = new RetornoComando(EventoVista.ALTA_EMPLEADO_FALLO,id); //crea la respuesta de comando
		}
		
		return respuestaComando;
	}
}
