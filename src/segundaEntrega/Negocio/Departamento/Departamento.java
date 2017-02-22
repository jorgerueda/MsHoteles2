package segundaEntrega.Negocio.Departamento;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import segundaEntrega.Negocio.Empleado.Empleado;

/**
 * The persistent class for the Departamento database table.
 * 
 */
@Entity
@Table(name="Departamento")
@Inheritance(strategy=InheritanceType.JOINED)
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String actividad;

	
	@Version
	int version;

	@Column(name="Activo")
	private boolean activo;
	
	@OneToMany(mappedBy = "departamento" )
	
	private List<Empleado> lista_empleados; // lado 1 de la relaci�n
	
	/**
	 * Constructor por defecto del departamento
	 */
	public Departamento(){
		lista_empleados = new ArrayList<Empleado>();
		
		activo = true;
	}
	
	/**
	 * Constructor de Departamento
	 * @param nombre_departamento el nombre del departamento
	 */
	public Departamento(String nombre_departamento){
		
		this.nombre = nombre_departamento;
		lista_empleados = new ArrayList<Empleado>();
		
		activo = true;
	}
	
	public void addEmpleado(Empleado e)
	{
		this.lista_empleados.add(e);
		if(e.getDepartamento() != this){
			e.setDepartamento(this);
		}
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

	
	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
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

	public List<Empleado> getLista_empleados() {
		return lista_empleados;
	}

	public void setLista_empleados(List<Empleado> lista_empleados) {
		this.lista_empleados = lista_empleados;
	}

	public String toString() {
		return "ID " + getId() + "Nombre " + getNombre();
	}

}
	