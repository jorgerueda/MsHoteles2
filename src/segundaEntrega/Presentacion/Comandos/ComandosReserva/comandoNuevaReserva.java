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
public class comandoNuevaReserva extends Comando{

	@Override
	public RetornoComando execute() {
		int id;
		
		SAReserva saReserva = FactoriaSA.getInstancia().generaSAReserva();
		
		TransferReserva transferReserva = (TransferReserva)datos; //hacemos casting de los datos del comando
		
		id = saReserva.nuevaReserva(transferReserva);
		
		RetornoComando retornoComando;

		if(id >= 0){
			retornoComando = new RetornoComando(EventoVista.ALTA_RESERVA_EXITO,id); //crea la respuesta de comando
		}
		else if(id == -1){
			retornoComando = new RetornoComando(EventoVista.ALTA_RESERVA_CLIENTE_NO_EXISTE,id); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.ALTA_RESERVA_FALLO,id); //crea la respuesta de comando
		}
		return retornoComando;
	}

}