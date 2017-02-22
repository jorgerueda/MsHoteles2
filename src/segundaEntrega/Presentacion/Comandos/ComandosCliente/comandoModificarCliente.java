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
public class comandoModificarCliente extends Comando {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public RetornoComando execute() {
		SACliente saCliente = FactoriaSA.getInstancia().generaSACliente();
		
		TransferCliente transferClienteInformacionNueva = (TransferCliente)datos; //hacemos casting de los datos del comando
		
		int valorDevuelto = saCliente.modificarCliente(transferClienteInformacionNueva);
		
		RetornoComando retornoComando;
	
		if(valorDevuelto >= 0){
			retornoComando = new RetornoComando(EventoVista.MODIFICAR_CLIENTE_EXITO,null); //crea la respuesta de comando
		}
		else if(valorDevuelto == -1){
			retornoComando = new RetornoComando(EventoVista.MODIFICAR_CLIENTE_NO_EXISTE,null); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.MODIFICAR_CLIENTE_FALLO,null); //crea la respuesta de comando
		}
		return retornoComando;
	}
}
