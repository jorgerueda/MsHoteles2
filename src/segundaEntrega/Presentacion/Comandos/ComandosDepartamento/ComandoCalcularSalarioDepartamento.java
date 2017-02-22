package segundaEntrega.Presentacion.Comandos.ComandosDepartamento;

import segundaEntrega.Negocio.Departamento.SA.SADepartamento;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class ComandoCalcularSalarioDepartamento extends Comando {

	@Override
	public RetornoComando execute() {

		//crea el servicio de departamentos, lo crea utilizando una fabrica
		SADepartamento departamentoSA = FactoriaSA.getInstancia().generaSADepartamento();
		int resultado;
		 resultado = departamentoSA.calcularSalarioDepartamento((int)datos); //llama al metodo de baja departamentos
		
		RetornoComando retornoComando;
		if(resultado>-1){
			retornoComando = new RetornoComando(EventoVista.CALCULAR_SALARIO_DEPARTAMENTO_EXITO,resultado); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.CALCULAR_SALARIO_DEPARTAMENTO_FALLO,null); //crea la respuesta de comando
		}
		
		return retornoComando;
	}
}
