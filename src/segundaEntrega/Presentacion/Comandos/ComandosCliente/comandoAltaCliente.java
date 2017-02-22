/**
 * 
 */
package segundaEntrega.Presentacion.Comandos.ComandosCliente;

import segundaEntrega.Negocio.Cliente.SA.SACliente;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Negocio.Transfer.TransferCliente;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Andrea
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class comandoAltaCliente extends Comando{

	@Override
	public RetornoComando execute() {
		int id;
		SACliente saCliente = FactoriaSA.getInstancia().generaSACliente();
		
		TransferCliente transferCliente = (TransferCliente)datos; //hacemos casting de los datos del comando
		
		id = saCliente.altaCliente(transferCliente);
		
		RetornoComando retornoComando;

		if(id >= 0){
			retornoComando = new RetornoComando(EventoVista.ALTA_CLIENTE_EXITO,id); //crea la respuesta de comando
		}
		else if(id == -1){
			retornoComando = new RetornoComando(EventoVista.ALTA_CLIENTE_DNI_YA_EXISTE,id); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.ALTA_HABITACION_FALLO,id); //crea la respuesta de comando
		}
		return retornoComando;
	}

}
