/**
 * 
 */
package segundaEntrega.Presentacion.Controlador.Implementacion;

import segundaEntrega.Presentacion.Comandos.Comando;
import segundaEntrega.Presentacion.Comandos.RetornoComando;
import segundaEntrega.Presentacion.Controlador.Controlador;
import segundaEntrega.Presentacion.Dispatcher.Dispatcher;
import segundaEntrega.Presentacion.FactoriaComando.FactoriaComando;


public class ControladorImp extends Controlador {
	
	@Override
	public void execute(int id_evento, Object datos) {
		
		Comando comando = FactoriaComando.getInstancia().getComando(id_evento, datos);
		comando.setDatos(datos); //le da los datos al comando
		RetornoComando respuesta = comando.execute(); //lo ejecuta
		Dispatcher.getInstancia().dispatch(respuesta.getId_evento_vista(), respuesta.getDatos()); 
		//redirige la vista en funcion de la respuesta
	}
}
