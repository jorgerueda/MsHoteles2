package segundaEntrega.Presentacion.Comandos.ComandosDepartamento;

import segundaEntrega.Negocio.Departamento.Departamento;
import segundaEntrega.Negocio.Departamento.SA.SADepartamento;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoModificarDepartamento  extends Comando {

	
	public RetornoComando execute() {
		
		boolean resultado;
		
		//crea el servicio de departamentos, lo crea utilizando una f�brica
		SADepartamento servicioDepartamento = FactoriaSA.getInstancia().generaSADepartamento();
		
		Departamento departamento = (Departamento)datos; //hacemos casting de los datos del comando
		
		resultado = servicioDepartamento.modificarDepartamento(departamento.getId(),departamento);
		
		RetornoComando respuestaComando;

		if(resultado){
			respuestaComando = new RetornoComando(EventoVista.MODIFICAR_DEPARTAMENTO_EXITO,null); //crea la respuesta de comando
		}
		
		else{
			respuestaComando = new RetornoComando(EventoVista.MODIFICAR_DEPARTAMENTO_FALLO,null); //crea la respuesta de comando
		}
		
		return respuestaComando;
	}
}
