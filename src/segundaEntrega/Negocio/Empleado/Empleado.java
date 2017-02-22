package segundaEntrega.Negocio.Empleado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import segundaEntrega.Negocio.Departamento.Departamento;


@Entity
//@Table(name="Empleado")
@Inheritance(strategy=InheritanceType.JOINED)

public abstract class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // se genera automaticamente
	
	private String dni;
	private String nombre;
	private int salario;
	
	@Version
	int version; //para la concurrencia

	@Column(name="Activo")
	private boolean activo; // para realizar el borrado logico de la entidad


	
	@ManyToOne
	 private Departamento departamento; // estamos en el lado n para esta
	
	// relacion
	@OneToMany(mappedBy = "idEmpleado" , cascade = {CascadeType.PERSIST})
	private Collection<EmpleadoTarea> lista_tareas;

	public Empleado() {
		departamento = new Departamento();
		
		lista_tareas = new ArrayList<EmpleadoTarea>();
		
		activo = true;
	} // constructor por defecto necesario para el mapeado que realiza jpa
	
	/**
	 * Constructor de empleado
	 * @param dni el dni del empleado
	 * @param nombre el nombre del empleado
	 * @param salario el salario del empleado
	 */
	public Empleado(String dni, String nombre, int salario,String nombreDepartamento){
		this.dni = dni;
		this.nombre = nombre;
		this.salario = salario;
		
		departamento = new Departamento();
		departamento.setNombre(nombreDepartamento);
		
		lista_tareas = new ArrayList<EmpleadoTarea>();
		
		activo = true;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
		if(!departamento.getLista_empleados().contains(this)){
			departamento.getLista_empleados().add(this);
		}
	}

	public Collection<EmpleadoTarea> getLista_tareas() {
		return lista_tareas;
	}

	public void setLista_tareas(List<EmpleadoTarea> lista_tareas) {
		this.lista_tareas = lista_tareas;
	}

	public String toString() {

		return "ID Empleado " + getId() + "Nombre " + getNombre()
				+ "Salario " + getSalario() + "Departamento "
				+ getDepartamento().toString() + "Tareas "
				+ lista_tareas.toString();
	}

	public abstract int calcularSalario();

}
