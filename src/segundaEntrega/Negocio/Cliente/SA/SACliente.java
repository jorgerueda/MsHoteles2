/**
 * 
 */
package segundaEntrega.Negocio.Cliente.SA;
import java.util.List;

import segundaEntrega.Negocio.Transfer.TransferCliente;



public interface SACliente {

	public int altaCliente(TransferCliente TCliente);

	public int bajaCliente(String DNI);

	public TransferCliente mostrarCliente(String DNI);

	public List<TransferCliente> mostrarClientes();
	
	public int modificarCliente(TransferCliente TCliente);

	public List<TransferCliente> mostrarClienteNReservas(int Reservas);
}