/**
 * 
 */
package segundaEntrega.Presentacion.Comandos.ComandosReserva;

import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Negocio.Reserva.SA.SAReserva;
import segundaEntrega.Negocio.Transfer.TransferReserva;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Andrea
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class comandoQuitarHabitacion extends Comando{

	@Override
	public RetornoComando execute() {
		int id;
		
		SAReserva saReserva = FactoriaSA.getInstancia().generaSAReserva();
		
		TransferReserva transferReserva = (TransferReserva)datos; //hacemos casting de los datos del comando
		
		id = saReserva.quitarHabitacion(transferReserva);
		
		RetornoComando retornoComando;

		if(id >= 0){
			retornoComando = new RetornoComando(EventoVista.QUITAR_HABITACION_EXITO,id); //crea la respuesta de comando
		}
		
		else{
			retornoComando = new RetornoComando(EventoVista.QUITAR_HABITACION_FALLO,id); //crea la respuesta de comando
		}
		return retornoComando;
	}

}