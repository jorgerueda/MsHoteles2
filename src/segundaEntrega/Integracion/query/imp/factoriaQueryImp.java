package segundaEntrega.Integracion.query.imp;


import segundaEntrega.Integracion.query.Query;
import segundaEntrega.Integracion.query.factoriaQuery;
import segundaEntrega.Presentacion.Controlador.Evento;

public class factoriaQueryImp extends factoriaQuery {

	@Override
	public Query getQuery(Integer id) {
		Query q = null;
		switch(id){
		case Evento.MOSTRAR_HABITACION_N_RESERVAS:
			q = new queryHabitacion();
			break;
		case Evento.MOSTRAR_CLIENTE_N_RESERVAS:
			q = new queryCliente();
			break;
		}
		return q;
	}
}

