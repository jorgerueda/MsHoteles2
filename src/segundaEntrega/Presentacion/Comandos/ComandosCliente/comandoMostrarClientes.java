/**
 * 
 */
package segundaEntrega.Presentacion.Comandos.ComandosCliente;

import java.util.List;

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
public class comandoMostrarClientes extends Comando {


	@Override
	public RetornoComando execute() {

		List<TransferCliente> lista_clientes = FactoriaSA.getInstancia().generaSACliente().mostrarClientes();
		
		RetornoComando retornoComando;

		if(lista_clientes.size() > 0){
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_CLIENTES_EXITO,lista_clientes); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_CLIENTES_FALLO,lista_clientes); //crea la respuesta de comando
		}
		
		return retornoComando;
	}

}
