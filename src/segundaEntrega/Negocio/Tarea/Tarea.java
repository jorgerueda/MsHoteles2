package segundaEntrega.Negocio.Tarea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import segundaEntrega.Negocio.Empleado.EmpleadoTarea;


@Entity
//@Table(name="Tarea")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nombre;

	@OneToMany(mappedBy = "idTarea", fetch=FetchType.LAZY)
	private Collection <EmpleadoTarea> lista_empleados;
	
	@Version
	int version;

	@Column(name="Activo")
	private boolean activo;
	
	public Tarea(){
		lista_empleados = new ArrayList<EmpleadoTarea>();
		
		activo = true;
	}

	public Tarea(String nombre){
		this.nombre=nombre;
		
		lista_empleados = new ArrayList<EmpleadoTarea>();
	
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection <EmpleadoTarea> getLista_empleados() {
		return lista_empleados;
	}

	public void setLista_empleados(List<EmpleadoTarea> lista_empleados) {
		this.lista_empleados = lista_empleados;
	
		
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	


	public String toString() {
		return "ID " + getId() + "Nombre " + getNombre();
	}
}