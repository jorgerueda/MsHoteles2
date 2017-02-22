package segundaEntrega.Presentacion.Comandos.ComandosDepartamento;

import segundaEntrega.Negocio.Departamento.Departamento;
import segundaEntrega.Negocio.Departamento.SA.SADepartamento;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoAltaDepartamento  extends Comando {

	
	public RetornoComando execute() {
		
		int id;
		
		//crea el servicio de departamentos, lo crea utilizando una f�brica
		SADepartamento servicioDepartamento = FactoriaSA.getInstancia().generaSADepartamento();
		
		Departamento departamento = (Departamento)datos; //hacemos casting de los datos del comando
		
		id = servicioDepartamento.altaDepartamento(departamento);
		
		RetornoComando respuestaComando;

		if(id >= 0){
			respuestaComando = new RetornoComando(EventoVista.ALTA_DEPARTAMENTO_EXITO,id); //crea la respuesta de comando
		}
		else if(id == -1){
			respuestaComando = new RetornoComando(EventoVista.ALTA_DEPARTAMENTO_NOMBRE_EXISTE,id); //crea la respuesta de comando
		}
		else{
			respuestaComando = new RetornoComando(EventoVista.ALTA_DEPARTAMENTO_FALLO,id); //crea la respuesta de comando
		}
		
		return respuestaComando;
	}
}
