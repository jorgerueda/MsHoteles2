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
public class comandoMostrarHabitacion extends Comando {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public RetornoComando execute() {
		SAHabitacion saHabitacion = FactoriaSA.getInstancia().generaSAHabitacion();
		
		TransferHabitacion transferHabitacion = saHabitacion.mostrarHabitacion((int)datos);
		
		RetornoComando retornoComando;
		
		if((transferHabitacion != null)&&(transferHabitacion.isActivo())){
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_HABITACION_EXITO,transferHabitacion); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_HABITACION_FALLO,transferHabitacion); //crea la respuesta de comando
		}
		
		return retornoComando;
	}
}