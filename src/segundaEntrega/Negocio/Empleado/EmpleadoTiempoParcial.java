package segundaEntrega.Negocio.Empleado;

import javax.persistence.Entity;


@Entity
public class EmpleadoTiempoParcial extends Empleado {

	
	public EmpleadoTiempoParcial(){
		
	}// constructor por defecto necesario para el mapeado que realiza jpa
	
	public EmpleadoTiempoParcial(String dni, String nombre,
			int salario, String nombreDepartamento,int horas, int precio_hora) {
		
		super(dni, nombre, salario, nombreDepartamento);
		this.horas=horas;
		this.precio_hora= precio_hora;
	
	}

	private int horas;
	private int precio_hora;
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getPrecio_hora() {
		return precio_hora;
	}

	public void setPrecio_hora(int precio_hora) {
		this.precio_hora = precio_hora;
	}

	@Override
	public int calcularSalario() {
		return this.getSalario() + (this.horas*this.precio_hora);
	}

	

	
}
