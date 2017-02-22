/**
 * 
 */
package segundaEntrega.Integracion.FactoriaTransaccion.Implementacion;

import segundaEntrega.Integracion.FactoriaTransaccion.FactoriaTransaccion;
import segundaEntrega.Integracion.Transaccion.TransaccionMYSQL.TransaccionMYSQL;

public class FactoriaTransaccionImp extends FactoriaTransaccion {

	@Override
	public TransaccionMYSQL nuevaTransaccionMySQL() {

		return new TransaccionMYSQL();
	}
}