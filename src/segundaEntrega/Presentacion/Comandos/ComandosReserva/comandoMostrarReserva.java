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
public class comandoMostrarReserva extends Comando {

	@Override
	public RetornoComando execute() {

	SAReserva saReserva = FactoriaSA.getInstancia().generaSAReserva();
	
	TransferReserva transferReserva = saReserva.mostrarReserva((int)datos);
	
	RetornoComando retornoComando;
	
	if((transferReserva != null)&&(transferReserva.isActivo())){
		retornoComando = new RetornoComando(EventoVista.MOSTRAR_RESERVA_EXITO,transferReserva); //crea la respuesta de comando
	}
	else{
		retornoComando = new RetornoComando(EventoVista.MOSTRAR_RESERVA_FALLO,transferReserva); //crea la respuesta de comando
	}
	
	return retornoComando;
}
}