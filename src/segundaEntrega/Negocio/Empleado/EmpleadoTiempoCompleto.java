package segundaEntrega.Negocio.Empleado;

import javax.persistence.Entity;


@Entity
public class EmpleadoTiempoCompleto  extends Empleado{


	public EmpleadoTiempoCompleto(){
		
	}// constructor por defecto necesario para el mapeado que realiza jpa
	
	
	
	private int plus;
	private int anos_trabajados;

	public EmpleadoTiempoCompleto(String dni, String nombre_apellidos,
			int salario, String nombreDepartamento,int plus, int anos_trabajados) {
		super(dni, nombre_apellidos, salario, nombreDepartamento);
		this.plus=plus;
		this.anos_trabajados= anos_trabajados;
		
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}

	public int getAnos_trabajados() {
		return anos_trabajados;
	}

	public void setAnos_trabajados(int anos_trabajados) {
		this.anos_trabajados = anos_trabajados;
	}

	@Override
	public int calcularSalario() {
		
		return this.getSalario() + (this.plus * this.anos_trabajados);
	}

	


}
