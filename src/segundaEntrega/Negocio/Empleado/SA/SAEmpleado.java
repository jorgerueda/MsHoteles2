package segundaEntrega.Negocio.Empleado.SA;

import java.util.Collection;

import segundaEntrega.Negocio.Empleado.ClavesEmpleadoTarea;
import segundaEntrega.Negocio.Empleado.Empleado;
import segundaEntrega.Negocio.Empleado.EmpleadoTarea;
import segundaEntrega.Negocio.Tarea.Tarea;



public interface SAEmpleado {
	/**
	 * Permite crear empleados
	 * @param empleado la informaci�n del empleado a crear
	 * @return el id del empleado, 
	 * -1 si ya existe un empleado con ese dni
	 * -2 si se quiere crear un empleado en un departamento que no existe
	 */
	public int altaEmpleado(Empleado empleado);
	
	/**
	 * Permite dar de baja a un empleado (baja logica)
	 * @param id el id del empleado
	 * @return si se ha dado de baja o no
	 */
	public boolean bajaEmpleado(int id);
	
	/**
	 * Permite buscar el empleado en el sistema
	 * @param id el id del empleado a buscar
	 * @return el empleado (null sino lo encuentra)
	 */
	public Empleado mostrarEmpleado(int id);
	
	/**
	 * Permite obtener los datos de todos los empleados
	 * @return la coleccion de todos los empleados
	 */
	public Collection<Empleado> mostrarEmpleados();
	
	/**
	 * Permite asignar una tarea a un empleado
	 * @return 
	 * -1 si empleado no existe o no est� activo
	 * -2 si la tarea no existe o no est� activa
	 * -3 si la tarea ya est� asignadsa al empleado
	 * -4 si el empleado est� asignado a la tarea
	 * >= 0 si se realiza correctamente
	 */
	public int asignarTarea( EmpleadoTarea  claves);
	
	public boolean eliminarTarea(ClavesEmpleadoTarea claves);
	
	
	
}