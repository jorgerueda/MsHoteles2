package segundaEntrega.Negocio.Empleado;

import javax.persistence.*;

import segundaEntrega.Negocio.Tarea.Tarea;

@Entity
public class EmpleadoTarea {

	@EmbeddedId
	private ClavesEmpleadoTarea ida;
	
	@ManyToOne
	@MapsId("idEmpleado")
	private Empleado idEmpleado;
	
	@ManyToOne
	@MapsId("idTarea")
	private Tarea idTarea;
	
	
	public Empleado getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Empleado idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Tarea getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(Tarea idTarea) {
		this.idTarea = idTarea;
	}

	public ClavesEmpleadoTarea getClaves() {
		return ida;
	}

	public void setClaves(ClavesEmpleadoTarea claves) {
		this.ida = claves;
	}

	public int getNumHorasTarea() {
		return numHorasTarea;
	}

	public void setNumHorasTarea(int numHorasTarea) {
		this.numHorasTarea = numHorasTarea;
	}

	private int numHorasTarea;
	
	
	
}
