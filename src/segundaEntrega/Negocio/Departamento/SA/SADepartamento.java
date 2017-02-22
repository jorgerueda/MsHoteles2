package segundaEntrega.Negocio.Departamento.SA;

import java.util.Collection;

import segundaEntrega.Negocio.Departamento.Departamento;


public interface SADepartamento {

	
	/**
	 * Crea un departamento
	 * @param departamento el departamento que se desea crear
	 * @return el id del departamento creado, -1 si existe un departamento con el mismo nombre.
	 */
	public int altaDepartamento(Departamento departamento);
	
	/**
	 * Permite dar de baja un departamento (baja logica)
	 * @param id el id del departamento
	 * @return si se ha dado de baja o no
	 */
	public boolean bajaDepartamento(int id);
	
	/**
	 * Permite buscar el departamento en el sistema si esta activo
	 * @param id el id del departamento a buscar
	 * @return el departamento (null sino lo encuentra)
	 */
	public Departamento mostrarDepartamento(int id);
	
	/**
	 * Permite obtener los datos de todos los departamentos activos
	 * @return la coleccion de todos los departamentos
	 */
	public Collection<Departamento> mostrarDepartamentos();
	
	public boolean modificarDepartamento(int id,Departamento d);
	
	public int calcularSalarioDepartamento(int id);
	
	
	

}
