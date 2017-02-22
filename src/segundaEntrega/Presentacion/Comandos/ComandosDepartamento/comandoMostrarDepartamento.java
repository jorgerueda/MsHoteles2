package segundaEntrega.Presentacion.Comandos.ComandosDepartamento;

import segundaEntrega.Negocio.Departamento.Departamento;
import segundaEntrega.Negocio.Departamento.SA.SADepartamento;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoMostrarDepartamento  extends Comando {

	
	public RetornoComando execute() {
		
		Departamento resultado;
		
		//crea el servicio de departamentos, lo crea utilizando una f�brica
		SADepartamento servicioDepartamento = FactoriaSA.getInstancia().generaSADepartamento();
		
		
		resultado = servicioDepartamento.mostrarDepartamento(((int)datos));
		
		RetornoComando respuestaComando;

		if(resultado != null){
			respuestaComando = new RetornoComando(EventoVista.MOSTAR_DEPARTAMENTO_EXITO, resultado); //crea la respuesta de comando
		}
		
		else{
			respuestaComando = new RetornoComando(EventoVista.MOSTAR_DEPARTAMENTO_FALLO,null); //crea la respuesta de comando
		}
		
		return respuestaComando;
	}
}
