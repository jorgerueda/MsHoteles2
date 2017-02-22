package segundaEntrega.Presentacion.Comandos.ComandosTarea;

import segundaEntrega.Negocio.Tarea.Tarea;
import segundaEntrega.Negocio.Tarea.SA.SATarea;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoMostrarTarea  extends Comando {

	
	public RetornoComando execute() {
		
		Tarea resultado;
		
		//crea el servicio de tareas, lo crea utilizando una f�brica
		SATarea servicioTarea = FactoriaSA.getInstancia().generaSATarea();
		
		
		resultado = servicioTarea.mostrarTarea((int) datos);
		
		RetornoComando respuestaComando;

		if(resultado!=null){
			respuestaComando = new RetornoComando(EventoVista.MOSTRAR_TAREA_EXITO,resultado); //crea la respuesta de comando
		}
		else{
			respuestaComando = new RetornoComando(EventoVista.MOSTRAR_TAREA_FALLO,null); //crea la respuesta de comando
		}
	
		return respuestaComando;
	}
}
