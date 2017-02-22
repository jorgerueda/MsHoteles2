/**
 * 
 */
package segundaEntrega.Presentacion.Comandos.ComandosHabitacion;

import segundaEntrega.Negocio.FactoriaSA.FactoriaSA;
import segundaEntrega.Negocio.Habitacion.SA.SAHabitacion;
import segundaEntrega.Negocio.Transfer.TransferHabitacion;
import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Andrea
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class comandoAltaHabitacion extends Comando{

	@Override
	public RetornoComando execute() {
		int id;
		
		SAHabitacion saHabitacion = FactoriaSA.getInstancia().generaSAHabitacion();
		
		TransferHabitacion transferHabitacion = (TransferHabitacion)datos; //hacemos casting de los datos del comando
		
		id = saHabitacion.altaHabitacion(transferHabitacion);
		
		RetornoComando retornoComando;

		if(id >= 0){
			retornoComando = new RetornoComando(EventoVista.ALTA_HABITACION_EXITO,id); //crea la respuesta de comando
		}
		else if(id == -1){
			retornoComando = new RetornoComando(EventoVista.ALTA_HABITACION_NUMERO_YA_EXISTE,id); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.ALTA_HABITACION_FALLO,id); //crea la respuesta de comando
		}
		return retornoComando;
	}

}
