/**
 * 
 */
package segundaEntrega.Presentacion;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import segundaEntrega.Presentacion.Cliente.GUIAltaCliente;
import segundaEntrega.Presentacion.Cliente.GUIBajaCliente;
import segundaEntrega.Presentacion.Cliente.GUIModificarCliente;
import segundaEntrega.Presentacion.Cliente.GUIMostrarCliente;
import segundaEntrega.Presentacion.Cliente.GUIMostrarClientes;
import segundaEntrega.Presentacion.Cliente.GUIMostrarClientesNReservas;
import segundaEntrega.Presentacion.Departamento.GUIAltaDepartamento;
import segundaEntrega.Presentacion.Departamento.GUIBajaDepartamento;
import segundaEntrega.Presentacion.Departamento.GUICalcularSalarioDepartamento;
import segundaEntrega.Presentacion.Departamento.GUIModificarDepartamento;
import segundaEntrega.Presentacion.Departamento.GUIMostrarDepartamento;
import segundaEntrega.Presentacion.Departamento.GUIMostrarDepartamentos;
import segundaEntrega.Presentacion.Empleado.GUIAltaEmpleado;
import segundaEntrega.Presentacion.Empleado.GUIAsignarEmpleadoTarea;
import segundaEntrega.Presentacion.Empleado.GUIEliminarEmpleadoTarea;
import segundaEntrega.Presentacion.Empleado.GUIMostrarEmpleado;
import segundaEntrega.Presentacion.Habitacion.GUIAltaHabitacion;
import segundaEntrega.Presentacion.Habitacion.GUIMostrarHabitacion;
import segundaEntrega.Presentacion.Habitacion.GUIMostrarHabitacionesNReservas;
import segundaEntrega.Presentacion.Reserva.GUIAnadirHabitacion;
import segundaEntrega.Presentacion.Reserva.GUIMostrarReserva;
import segundaEntrega.Presentacion.Reserva.GUINuevaReserva;
import segundaEntrega.Presentacion.Reserva.GUIQuitarHabitacion;
import segundaEntrega.Presentacion.Tarea.GUIAltaTarea;
import segundaEntrega.Presentacion.Tarea.GUIBajaTarea;
import segundaEntrega.Presentacion.Tarea.GUIMostrarTarea;

public class PanelPrincipal extends javax.swing.JFrame {

	public PanelPrincipal() {
		initComponents();
	}

	private void initComponents() {

		jMenuBar1 = new javax.swing.JMenuBar();
		pestanaCliente = new javax.swing.JMenu();
		botonNuevoCliente = new javax.swing.JMenuItem();
		botonBorrarCliente = new javax.swing.JMenuItem();
		botonModifcarCliente = new javax.swing.JMenuItem();
		botonMostrarCliente = new javax.swing.JMenuItem();
		botonMostrarClientes = new javax.swing.JMenuItem();
		botonMostrarClientesNReservas = new javax.swing.JMenuItem();
		pestanaHabitacion = new javax.swing.JMenu();
		botonNuevaHabitacion = new javax.swing.JMenuItem();
		botonMostrarHabitacion = new javax.swing.JMenuItem();
		botonMostrarHabitacionNReservas = new javax.swing.JMenuItem();
		botonCalcularSalarioDepartamento = new javax.swing.JMenuItem();

		pestanaReserva = new javax.swing.JMenu();
		botonNuevaReserva = new javax.swing.JMenuItem();
		botonAnadirHabitacion = new javax.swing.JMenuItem();
		botonQuitarHabitacion = new javax.swing.JMenuItem();
		botonMostrarReserva = new javax.swing.JMenuItem();
		pestanaEmpleado = new javax.swing.JMenu();
		botonNuevoEmpleado = new javax.swing.JMenuItem();
		botonBajaEmpleado = new javax.swing.JMenuItem();
		botonMostrarEmpleado = new javax.swing.JMenuItem();
		botonMostrarEmpleados = new javax.swing.JMenuItem();
		botonAsignarTarea = new javax.swing.JMenuItem();
		botonEliminarTarea = new javax.swing.JMenuItem();
		pestanaDepartamento = new javax.swing.JMenu();
		botonNuevoDepartamento = new javax.swing.JMenuItem();
		botonBajaDepartamento = new javax.swing.JMenuItem();
		botonMostrarDepartamento = new javax.swing.JMenuItem();
		botonModificarDepartamento = new javax.swing.JMenuItem();
		botonMostrarDepartamentos = new javax.swing.JMenuItem();
		pestanaTarea = new javax.swing.JMenu();
		botonNuevaTarea = new javax.swing.JMenuItem();
		botonBajaTarea = new javax.swing.JMenuItem();
		botonMostrarTarea = new javax.swing.JMenuItem();
		botonMostrarTareas = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		this.setTitle("MSHoteles");

		pestanaCliente.setText("Cliente");
		;
		botonNuevoCliente.setText("Nuevo Cliente");
		botonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonNuevoClienteActionPerformed(evt);
			}
		});
		pestanaCliente.add(botonNuevoCliente);
		;
		botonBorrarCliente.setText("Borrar Cliente");
		botonBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonBorrarClienteActionPerformed(evt);
			}
		});
		pestanaCliente.add(botonBorrarCliente);

		botonModifcarCliente.setText("Modifcar Cliente");
		botonModifcarCliente.setActionCommand("Modificar Cliente");
		botonModifcarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonModificarClienteActionPerformed(evt);
			}
		});
		pestanaCliente.add(botonModifcarCliente);

		botonMostrarCliente.setText("Mostrar Cliente");
		botonMostrarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarClienteActionPerformed(evt);
			}
		});
		pestanaCliente.add(botonMostrarCliente);

		botonMostrarClientes.setText("Mostrar Clientes");
		botonMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarClientesActionPerformed(evt);
			}
		});
		pestanaCliente.add(botonMostrarClientes);

		botonMostrarClientesNReservas.setText("Clientes N Reservas");
		botonMostrarClientesNReservas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarClientesNReservasActionPerformed(evt);
			}
		});
		pestanaCliente.add(botonMostrarClientesNReservas);

		jMenuBar1.add(pestanaCliente);

		pestanaHabitacion.setText("Habitacion");

		botonNuevaHabitacion.setText("Nueva Habitacion");
		botonNuevaHabitacion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonNuevaHabitacionActionPerformed(evt);
			}
		});
		pestanaHabitacion.add(botonNuevaHabitacion);

		botonMostrarHabitacion.setText("Mostrar Habitacion");
		pestanaHabitacion.add(botonMostrarHabitacion);
		botonMostrarHabitacion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarHabitacionActionPerformed(evt);
			}
		});
		botonMostrarHabitacionNReservas.setText("Habitaciones N Reservas");
		pestanaHabitacion.add(botonMostrarHabitacionNReservas);
		botonMostrarHabitacionNReservas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarHabitacionNReservasActionPerformed(evt);
			}
		});

		jMenuBar1.add(pestanaHabitacion);

		pestanaReserva.setText("Reserva");

		botonNuevaReserva.setText("Nueva Reserva");
		botonNuevaReserva.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonNuevaReservaActionPerformed(evt);
			}
		});
		pestanaReserva.add(botonNuevaReserva);

		botonAnadirHabitacion.setText("Anadir Habitacion");
		botonAnadirHabitacion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonAnadirHabitacionActionPerformed(evt);
			}
		});
		pestanaReserva.add(botonAnadirHabitacion);

		botonQuitarHabitacion.setText("Quitar Habitacion");
		botonQuitarHabitacion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonQuitarHabitacionActionPerformed(evt);
			}
		});
		pestanaReserva.add(botonQuitarHabitacion);

		botonMostrarReserva.setText("Mostrar Reserva");
		botonMostrarReserva.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarReservaActionPerformed(evt);
			}
		});
		pestanaReserva.add(botonMostrarReserva);

		jMenuBar1.add(pestanaReserva);

		pestanaEmpleado.setText("Empleado");

		botonNuevoEmpleado.setText("Nuevo empleado");
		botonNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonNuevoEmpleadoActionPerformed(evt);
			}
		});
		pestanaEmpleado.add(botonNuevoEmpleado);

		botonBajaEmpleado.setText("Baja empleado");
		botonBajaEmpleado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonBajaEmpleadoActionPerformed(evt);
			}
		});
		pestanaEmpleado.add(botonBajaEmpleado);

		botonMostrarEmpleado.setText("Mostrar empleado");
		botonMostrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarEmpleadoActionPerformed(evt);
			}
		});
		pestanaEmpleado.add(botonMostrarEmpleado);

		botonMostrarEmpleados.setText("Mostrar empleados");

		botonMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarEmpleadosActionPerformed(evt);
			}
		});
		pestanaEmpleado.add(botonMostrarEmpleados);

		botonAsignarTarea.setText("Asignar tarea");
		botonAsignarTarea.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonAsignarTareaActionPerformed(evt);
			}
		});
		pestanaEmpleado.add(botonAsignarTarea);
		

		botonEliminarTarea.setText("Eliminar tarea");
		botonEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonEliminarTareaActionPerformed(evt);
			}
		});
		pestanaEmpleado.add(botonEliminarTarea);

		jMenuBar1.add(pestanaEmpleado);

		pestanaDepartamento.setText("Departamento");

		botonNuevoDepartamento.setText("Nuevo departamento");
		botonNuevoDepartamento.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonNuevoDepartamentoActionPerformed(evt);
			}
		});
		pestanaDepartamento.add(botonNuevoDepartamento);

		botonBajaDepartamento.setText("Baja departamento");
		botonBajaDepartamento.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonBajaDepartamentoActionPerformed(evt);
			}
		});
		pestanaDepartamento.add(botonBajaDepartamento);

		botonModificarDepartamento.setText("Modificar departamento");
		botonModificarDepartamento.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonModificarDepartamentoActionPerformed(evt);
			}
		});
		
		pestanaDepartamento.add(botonModificarDepartamento);
		
		botonMostrarDepartamento.setText("Mostrar departamento");
		botonMostrarDepartamento.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarDepartamentoActionPerformed(evt);
			}
		});
		pestanaDepartamento.add(botonMostrarDepartamento);

		botonMostrarDepartamentos.setText("Mostrar departamentos");
		botonMostrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarDepartamentosActionPerformed(evt);
			}
		});
		pestanaDepartamento.add(botonMostrarDepartamentos);
		
		botonCalcularSalarioDepartamento.setText("Calcular Salario departamento");
		botonCalcularSalarioDepartamento.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				 botonCalcularSalarioDepartamentoActionPerformed(evt);
			}
		});
		pestanaDepartamento.add(botonCalcularSalarioDepartamento);

		jMenuBar1.add(pestanaDepartamento);

		pestanaTarea.setText("Tarea");

		botonNuevaTarea.setText("Nueva tarea");
		botonNuevaTarea.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonNuevaTareaActionPerformed(evt);
			}
		});
		pestanaTarea.add(botonNuevaTarea);

		botonBajaTarea.setText("Baja tarea");
		botonBajaTarea.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonBajaTareaActionPerformed(evt);
			}
		});
		pestanaTarea.add(botonBajaTarea);

		botonMostrarTarea.setText("Mostrar tarea");
		botonMostrarTarea.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarTareaActionPerformed(evt);
			}
		});
		pestanaTarea.add(botonMostrarTarea);

		botonMostrarTareas.setText("Mostrar tareas");
		botonMostrarTareas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botonMostrarTareasActionPerformed(evt);
			}
		});
		pestanaTarea.add(botonMostrarTareas);

		jMenuBar1.add(pestanaTarea);

		setJMenuBar(jMenuBar1);

		ImageIcon image = new ImageIcon("./res/logo.png");

		this.setIconImage(image.getImage());

		JLabel label = new JLabel("", image, JLabel.CENTER);

		JPanel panel = new JPanel(new BorderLayout());

		panel.add(label, BorderLayout.CENTER);

		this.add(panel);

		JLabel descripcion = new JLabel("Copyrigth MSHoteles 2015-2016");

		descripcion.setFont(new java.awt.Font("Tahoma", 1, 11));

		panel.add(descripcion, BorderLayout.SOUTH);

		pack();
	}// </editor-fold>

	// ACCIONES HABITACIONES
	private void botonNuevaHabitacionActionPerformed(java.awt.event.ActionEvent evt) {
		GUIAltaHabitacion.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarHabitacion.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarHabitacionNReservasActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarHabitacionesNReservas.obtenerInstancia().setVisible(true);
	}

	// ACCIONES ClienteS
	private void botonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {
		GUIAltaCliente.obtenerInstancia().setVisible(true);
	}

	private void botonBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {
		GUIBajaCliente.obtenerInstancia().setVisible(true);
	}

	private void botonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {
		GUIModificarCliente.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarCliente.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarClientes.obtenerInstancia().mostrar();
		GUIMostrarClientes.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarClientesNReservasActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarClientesNReservas.obtenerInstancia().setVisible(true);
	}

	// ACCIONES Reservas
	private void botonNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {
		GUINuevaReserva.obtenerInstancia().setVisible(true);
	}

	private void botonAnadirHabitacionActionPerformed(java.awt.event.ActionEvent evt) {
		GUIAnadirHabitacion.obtenerInstancia().setVisible(true);
	}

	private void botonQuitarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {
		GUIQuitarHabitacion.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarReservaActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarReserva.obtenerInstancia().setVisible(true);
	}

	// ACCIONES EMPLEADOS
	private void botonNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
		GUIAltaEmpleado.obtenerInstancia().setVisible(true);
	}

	private void botonBajaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void botonMostrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarEmpleado.obtenerInstancia().setVisible(true);

	}

	private void botonMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void botonAsignarTareaActionPerformed(java.awt.event.ActionEvent evt) {
		GUIAsignarEmpleadoTarea.obtenerInstancia().setVisible(true);

	}
	
	private void botonEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {
		GUIEliminarEmpleadoTarea.obtenerInstancia().setVisible(true);

	}

	// ACCIONES DEPARTAMENTOS

	private void botonNuevoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {
		
		GUIAltaDepartamento.obtenerInstancia().setVisible(true);
	}

	private void botonBajaDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {
		GUIBajaDepartamento.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarDepartamento.obtenerInstancia().setVisible(true);
	}
	
	private void botonModificarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {
		GUIModificarDepartamento.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarDepartamentos.obtenerInstancia().mostrar();
		GUIMostrarDepartamentos.obtenerInstancia().setVisible(true);
	}
	
	private void botonCalcularSalarioDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {
		GUICalcularSalarioDepartamento.obtenerInstancia().setVisible(true);
	}

	// ACCIONES TAREAS
	private void botonNuevaTareaActionPerformed(java.awt.event.ActionEvent evt) {
		GUIAltaTarea.obtenerInstancia().setVisible(true);
	}

	private void botonBajaTareaActionPerformed(java.awt.event.ActionEvent evt) {
		GUIBajaTarea.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarTareaActionPerformed(java.awt.event.ActionEvent evt) {
		GUIMostrarTarea.obtenerInstancia().setVisible(true);
	}

	private void botonMostrarTareasActionPerformed(java.awt.event.ActionEvent evt) {
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PanelPrincipal().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify

	private javax.swing.JMenuItem botonAsignarTarea;
	private javax.swing.JMenuItem botonEliminarTarea;
	private javax.swing.JMenuItem botonBajaDepartamento;
	private javax.swing.JMenuItem botonCalcularSalarioDepartamento;
	private javax.swing.JMenuItem botonBajaEmpleado;
	private javax.swing.JMenuItem botonBajaTarea;
	private javax.swing.JMenuItem botonAnadirHabitacion;
	private javax.swing.JMenuItem botonBorrarCliente;
	private javax.swing.JMenuItem botonModifcarCliente;
	private javax.swing.JMenuItem botonQuitarHabitacion;
	private javax.swing.JMenuItem botonMostrarDepartamento;
	private javax.swing.JMenuItem botonModificarDepartamento;
	private javax.swing.JMenuItem botonMostrarDepartamentos;
	private javax.swing.JMenuItem botonMostrarEmpleado;
	private javax.swing.JMenuItem botonMostrarEmpleados;
	private javax.swing.JMenuItem botonMostrarReserva;
	private javax.swing.JMenuItem botonMostrarHabitacion;
	private javax.swing.JMenuItem botonMostrarHabitacionNReservas;

	private javax.swing.JMenuItem botonMostrarCliente;
	private javax.swing.JMenuItem botonMostrarClientes;
	private javax.swing.JMenuItem botonMostrarClientesNReservas;
	private javax.swing.JMenuItem botonMostrarTarea;
	private javax.swing.JMenuItem botonMostrarTareas;
	private javax.swing.JMenuItem botonNuevaReserva;
	private javax.swing.JMenuItem botonNuevaHabitacion;
	private javax.swing.JMenuItem botonNuevaTarea;
	private javax.swing.JMenuItem botonNuevoDepartamento;
	private javax.swing.JMenuItem botonNuevoEmpleado;
	private javax.swing.JMenuItem botonNuevoCliente;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenu pestanaDepartamento;
	private javax.swing.JMenu pestanaEmpleado;
	private javax.swing.JMenu pestanaReserva;
	private javax.swing.JMenu pestanaHabitacion;
	private javax.swing.JMenu pestanaCliente;
	private javax.swing.JMenu pestanaTarea;
	// End of variables declaration

}
