package segundaEntrega.Presentacion.Comandos.ComandosTarea;

import segundaEntrega.Negocio.Tarea.Tarea;
import segundaEntrega.Negocio.Tarea.SA.SATarea;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoAltaTarea  extends Comando {

	
	public RetornoComando execute() {
		
		int id;
		
		//crea el servicio de tareas, lo crea utilizando una f�brica
		SATarea servicioTarea = FactoriaSA.getInstancia().generaSATarea();
		
		Tarea tarea = (Tarea)datos; //hacemos casting de los datos del comando
		
		id = servicioTarea.altaTarea(tarea);
		
		RetornoComando respuestaComando;

		if(id >= 0){
			respuestaComando = new RetornoComando(EventoVista.ALTA_TAREA_EXITO,id); //crea la respuesta de comando
		}
		else{
			respuestaComando = new RetornoComando(EventoVista.ALTA_TAREA_FALLO,id); //crea la respuesta de comando
		}
		
		return respuestaComando;
	}
}
