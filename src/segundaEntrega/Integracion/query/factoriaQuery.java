package segundaEntrega.Integracion.query;

import segundaEntrega.Integracion.query.imp.factoriaQueryImp;

public abstract class factoriaQuery {
	
	private static factoriaQuery instancia;


	public abstract Query getQuery(Integer id);

	public static factoriaQuery getInstance() {
		
		if (instancia == null){
			instancia = new factoriaQueryImp();
		}
		return instancia;
	}
}
