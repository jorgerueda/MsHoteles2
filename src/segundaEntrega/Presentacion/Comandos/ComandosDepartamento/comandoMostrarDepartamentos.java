/**
 * 
 */
package segundaEntrega.Presentacion.Comandos.ComandosDepartamento;

import java.util.Collection;
import segundaEntrega.Negocio.Departamento.Departamento;
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
public class comandoMostrarDepartamentos extends Comando {


	@Override
	public RetornoComando execute() {

		Collection<Departamento> lista_departamentos = FactoriaSA.getInstancia().generaSADepartamento().mostrarDepartamentos();
		
		RetornoComando retornoComando;

		if(lista_departamentos.size() > 0){
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_DEPARTAMENTOS_EXITO,lista_departamentos); //crea la respuesta de comando
		}
		else{
			retornoComando = new RetornoComando(EventoVista.MOSTRAR_DEPARTAMENTOS_FALLO,lista_departamentos); //crea la respuesta de comando
		}
		
		return retornoComando;
	}

}
