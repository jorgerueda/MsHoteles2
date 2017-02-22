package segundaEntrega.Negocio.Tarea.SA;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import segundaEntrega.Negocio.Empleado.ClavesEmpleadoTarea;
import segundaEntrega.Negocio.Empleado.Empleado;
import segundaEntrega.Negocio.Empleado.EmpleadoTarea;
import segundaEntrega.Negocio.Tarea.Tarea;



public class SATareaImp implements SATarea {

	protected EntityManager entityManager;

	/**
	 * Constructor de la implementacion de los servicios de tarea
	 * 
	 * @param entityManager
	 *            el entity manager que utiliza
	 */
	public SATareaImp() {
		// crea una f�brica de EntityManagers
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("MsHoteles3");

		this.entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public int altaTarea(Tarea tarea) {

		entityManager.getTransaction().begin();

		// id = 0 para nueva tarea
	
		int id = 0;

		// comprueba que no hay tareas con el mismo nombre activas
		Query query = entityManager.createQuery("SELECT t FROM Tarea t",
				Tarea.class); // ejecuta la consulta
		
		List<Tarea> tareas = query.getResultList(); 

		for (Tarea t : tareas) {
			if (tarea.getNombre().equals(t.getNombre())) {
				if (t.isActivo()) {
					id = -1;
				} else {
					// si existe pero no esta activo se da de alta ese
					id = t.getId();
					t.setActivo(true);
					t.setNombre(tarea.getNombre());
					entityManager.persist(t);

				}
			}
		}

		if (id >= 0) {

			//si id = 0 quiere decir que se crea uina nueva, no se reactiva
			if (id == 0) {
				entityManager.persist(tarea);
				entityManager.getTransaction().commit(); // realiza los cambios
				id = tarea.getId();
				
			}
			//Si se va a dar de alta , en vez de crear, no hace falta coger el id
			else {
	
				entityManager.getTransaction().commit(); // realiza los cambios
			}

		} else {
			entityManager.getTransaction().rollback(); // no realiza cambios
		}
	
		entityManager.close();
		return id;
	}

	@Override
	public boolean bajaTarea(int id) {

		entityManager.getTransaction().begin(); // empieza la transaccion
		Tarea tarea = entityManager.find(Tarea.class, id,LockModeType.OPTIMISTIC);
		boolean correcto = false;
		if(tarea!=null){
			tarea.setActivo(false); // baja logica

			// se elimina la tarea de todos los empleados que la tengan
			for (EmpleadoTarea e : tarea.getLista_empleados()) {
				int ide = e.getClaves().getIdEmpleado();
				Empleado empleado =  entityManager.find(Empleado.class, ide,
						LockModeType.OPTIMISTIC);
				ClavesEmpleadoTarea c =  new ClavesEmpleadoTarea(ide,id);
				empleado.getLista_tareas().remove(c);

			}

			entityManager.persist(tarea);

			correcto = true;
			entityManager.getTransaction().commit(); // realiza los cambios
		} else {
			correcto = false;
			entityManager.getTransaction().rollback(); // no realiza cambios
		}
		entityManager.close();
		return correcto;

	}

	@Override
	public Tarea mostrarTarea(int id) {
		entityManager.getTransaction().begin(); //empieza la transaccion
		Tarea t = entityManager.find(Tarea.class, id,LockModeType.OPTIMISTIC);
		if ((t != null)) {
			// si no esta activo la tarea no se muestra
			if (!t.isActivo())
				t = null;
		}
		entityManager.close();
		return t;
	}

	@Override
	public Collection<Tarea> mostrarTareas() {

		entityManager.getTransaction().begin();

		List<Tarea> lista_tareas;

		TypedQuery query = entityManager.createQuery(

		// obtiene la lista de tareas
				"SELECT t FROM Tarea t  WHERE t.activo = 1", Tarea.class);

		lista_tareas = query.getResultList();

		entityManager.getTransaction().commit();
		entityManager.close();;
		return lista_tareas;

	}

}
