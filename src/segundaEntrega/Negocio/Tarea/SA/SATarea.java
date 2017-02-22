package segundaEntrega.Negocio.Tarea.SA;

import java.util.Collection;

import segundaEntrega.Negocio.Tarea.Tarea;


public interface SATarea {

	/**
	 * Permite crear una tarea
	 * @param nombre el nombre de la tarea
	 * @param descripcion la descripci�n de que consiste la tarea
	 * @return la nueva tarea creada
	 */
	public int altaTarea(Tarea tarea);

	/**
	 * Permite dar de baja una tarea
	 * @param id el id de la tarea a dar de baja
	 * @return si se ha dado de baja o no
	 */
	public boolean bajaTarea(int id);
	
	/**
	 * Permite buscar una tarea en el sistema
	 * @param id el id de la tarea a buscar
	 * @return la tarea (null sino lo encuentra)
	 */
	public Tarea mostrarTarea(int id);
	
	/**
	 * Permite obtener los datos de todas las tareas
	 * @return la colecci�n de datos de todas las tareas
	 */
	public Collection<Tarea> mostrarTareas();
	
	/**
	 * Permite relacionar una tarea con un empleado
	 * @return
	 */
	
	
}
