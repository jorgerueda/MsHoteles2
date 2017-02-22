package segundaEntrega.Integracion.TransactionManager;

import segundaEntrega.Integracion.Transaccion.Transaccion;
import segundaEntrega.Integracion.TransactionManager.Implementacion.TransactionManagerImp;

public abstract class TransactionManager {
	

		private static TransactionManagerImp instancia;

		public abstract Transaccion nuevaTransaccion();

	
		public abstract void eliminarTransaccion();

		public static TransactionManager getInstancia() {
			if (instancia == null){
				instancia = new TransactionManagerImp();
			}
			return instancia;
			
		}

		public abstract Transaccion getTransaccion();
}