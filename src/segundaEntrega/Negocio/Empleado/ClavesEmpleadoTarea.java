package segundaEntrega.Negocio.Empleado;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ClavesEmpleadoTarea implements Serializable {

	
	private int idEmpleado;

	private int idTarea;
	
	
	public ClavesEmpleadoTarea(){}
	
	public ClavesEmpleadoTarea(int idEmpleado, int idTarea){
		
		this.idEmpleado=idEmpleado;
		this.idTarea=idTarea;
		
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public int getIdTarea() {
		return idTarea;
	}

	
	
	@Override
	public int hashCode() {
		return idEmpleado + idTarea;
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClavesEmpleadoTarea other = (ClavesEmpleadoTarea) obj;
		if (idTarea != other.idTarea)
			return false;
		if (idEmpleado != other.idEmpleado)
			return false;
		return true;
	}
}
