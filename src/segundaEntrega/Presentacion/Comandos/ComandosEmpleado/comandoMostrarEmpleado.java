package segundaEntrega.Presentacion.Comandos.ComandosEmpleado;

import segundaEntrega.Negocio.Empleado.Empleado;
import segundaEntrega.Negocio.Empleado.SA.SAEmpleado;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoMostrarEmpleado  extends Comando {

	
	public RetornoComando execute() {
		
		Empleado resultado;
		
		//crea el servicio de departamentos, lo crea utilizando una f�brica
		SAEmpleado servicioEmpleado = FactoriaSA.getInstancia().generaSAEmpleado();
		
		
		resultado = servicioEmpleado.mostrarEmpleado(((int)datos));
		
		RetornoComando respuestaComando;

		if(resultado != null){
			respuestaComando = new RetornoComando(EventoVista.MOSTRAR_EMPLEADO_EXITO, resultado); //crea la respuesta de comando
		}
		
		else{
			respuestaComando = new RetornoComando(EventoVista.MOSTRAR_EMPLEADO_FALLO,null); //crea la respuesta de comando
		}
		
		return respuestaComando;
	}
}
