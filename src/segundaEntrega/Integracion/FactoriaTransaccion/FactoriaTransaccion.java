/**
 * 
 */
package segundaEntrega.Integracion.FactoriaTransaccion;

import segundaEntrega.Integracion.FactoriaTransaccion.Implementacion.FactoriaTransaccionImp;
import segundaEntrega.Integracion.Transaccion.TransaccionMYSQL.TransaccionMYSQL;

public abstract class FactoriaTransaccion {

	private static FactoriaTransaccion instancia;


	public static FactoriaTransaccion getInstancia() {
		if (instancia == null) 
			instancia = new FactoriaTransaccionImp();
		return instancia;
	}
	
	public abstract TransaccionMYSQL nuevaTransaccionMySQL();

}