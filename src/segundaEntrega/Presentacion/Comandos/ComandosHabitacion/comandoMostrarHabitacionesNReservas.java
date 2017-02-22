package segundaEntrega.Presentacion.Comandos.ComandosHabitacion;

import java.util.List;

import segundaEntrega.Negocio.Cliente.SA.SACliente;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Negocio.Habitacion.SA.SAHabitacion;
import segundaEntrega.Negocio.Transfer.TransferCliente;
import segundaEntrega.Negocio.Transfer.TransferHabitacion;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class comandoMostrarHabitacionesNReservas extends Comando {
	@Override
	public RetornoComando execute() {
		SAHabitacion saHabitacion = FactoriaSA.getInstancia().generaSAHabitacion();
		
		List<TransferHabitacion> lista_HabitacionesNReservas = saHabitacion.mostrarHabitacionNReservas((int) datos);
		
		RetornoComando retornoComando;
		
		if(lista_HabitacionesNReservas.size()>0){
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_HABITACION_N_RESERVAS_EXITO,lista_HabitacionesNReservas); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_HABITACION_N_RESERVAS_FALLO,lista_HabitacionesNReservas); //crea la respuesta de comando
		}
		
		return retornoComando;
	}
}



