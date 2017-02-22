package segundaEntrega.Presentacion.Comandos.ComandosCliente;

import java.util.List;

import segundaEntrega.Negocio.Cliente.SA.SACliente;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Negocio.Transfer.TransferCliente;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoMostrarClientesNReservas extends Comando {
	@Override
	public RetornoComando execute() {
		SACliente saCliente = FactoriaSA.getInstancia().generaSACliente();
		
		List<TransferCliente> lista_clientesNReservas = saCliente.mostrarClienteNReservas((int) datos);
		
		RetornoComando retornoComando;
		
		if(lista_clientesNReservas.size()>0){
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_CLIENTE_N_RESERVAS_EXITO,lista_clientesNReservas); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_CLIENTE_N_RESERVAS_FALLO,lista_clientesNReservas); //crea la respuesta de comando
		}
		
		return retornoComando;
	}
}



