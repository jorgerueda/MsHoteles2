/**
 * 
 */
package segundaEntrega.Presentacion.Comandos.ComandosCliente;

import segundaEntrega.Negocio.Cliente.SA.SACliente;
import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Andrea
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class comandoBajaCliente extends Comando {
	@Override
	public RetornoComando execute() {
		String dni;
		
		SACliente saCliente = FactoriaSA.getInstancia().generaSACliente();
		
		dni = (String)datos; //hacemos casting de los datos del comando
		
		int valorDevuelto = saCliente.bajaCliente(dni);
		
		RetornoComando retornoComando;

		if(valorDevuelto >= 0){
			retornoComando = new RetornoComando (EventoVista.BAJA_CLIENTE_EXITO,dni); //crea la respuesta de comando
		}
		else if(valorDevuelto == -1){
			retornoComando = new RetornoComando(EventoVista.BAJA_CLIENTE_NO_EXISTE,dni); //crea la respuesta de comando
		}
		
		else{
			retornoComando = new RetornoComando(EventoVista.BAJA_CLIENTE_FALLO,dni); //crea la respuesta de comando
		}
		
		return retornoComando;
	}
}
