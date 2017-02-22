package segundaEntrega.Presentacion.Comandos.ComandosTarea;

import segundaEntrega.Negocio.Tarea.SA.SATarea;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoBajaTarea  extends Comando {

	
	public RetornoComando execute() {
		
		boolean resultado;
		
		//crea el servicio de tareas, lo crea utilizando una f�brica
		SATarea servicioTarea = FactoriaSA.getInstancia().generaSATarea();
		
		
		resultado = servicioTarea.bajaTarea((int) datos);
		
		RetornoComando respuestaComando;

		if(resultado){
			respuestaComando = new RetornoComando(EventoVista.BAJA_TAREA_EXITO,null); //crea la respuesta de comando
		}
		else{
			respuestaComando = new RetornoComando(EventoVista.BAJA_TAREA_FALLO,null); //crea la respuesta de comando
		}
	
		return respuestaComando;
	}
}
