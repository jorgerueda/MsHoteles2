package segundaEntrega.Presentacion.Departamento;

import javax.swing.JOptionPane;

import segundaEntrega.Negocio.Departamento.Departamento;
import segundaEntrega.Presentacion.Vista;
import segundaEntrega.Presentacion.Controlador.Evento;
import segundaEntrega.Presentacion.Controlador.Implementacion.ControladorImp;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class GUIModificarDepartamento extends javax.swing.JFrame implements Vista {
	
	static private GUIModificarDepartamento modificarDepartamento;

	  /** Creates new form nueva Departamento */
	  private GUIModificarDepartamento() {
	      initComponents();
	  }
	  
	  /**
	   * Obtiene la instancia de la ventana
	   * @return la instancia de la ventana
	   */
	  static public GUIModificarDepartamento obtenerInstancia(){
		   if(modificarDepartamento == null){
			   modificarDepartamento = new GUIModificarDepartamento();
		   }
		   
		   return modificarDepartamento;
	  }

                    
          private void initComponents() {

              jLabelActividad = new javax.swing.JLabel();
              jLabelNombre = new javax.swing.JLabel();
              jFormattedTextFieldNombre = new javax.swing.JFormattedTextField();
              jButtonAceptar = new javax.swing.JButton();
              jFormattedTextFieldActividad = new javax.swing.JFormattedTextField();
              jLabelID = new javax.swing.JLabel();
              jFormattedTextFieldID = new javax.swing.JFormattedTextField();

              setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

              jLabelActividad.setText("Actividad");

              jLabelNombre.setText("Nombre");

              jButtonAceptar.setText("Aceptar");

              jLabelID.setText("Id");
              
				 jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
					            public void actionPerformed(java.awt.event.ActionEvent evt) {
					            	jButtonAceptarActionPerformed(evt);
					            }
					        });
				 
              javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
              getContentPane().setLayout(layout);
              layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                      .addGap(66, 66, 66)
                      .addComponent(jButtonAceptar)
                      .addContainerGap(82, Short.MAX_VALUE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(jLabelActividad)
                          .addComponent(jLabelNombre)
                          .addComponent(jLabelID))
                      .addGap(40, 40, 40)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(jFormattedTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jFormattedTextFieldActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jFormattedTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(23, 23, 23))
              );
              layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                      .addContainerGap(9, Short.MAX_VALUE)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                          .addComponent(jLabelID)
                          .addComponent(jFormattedTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(12, 12, 12)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                          .addComponent(jFormattedTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jLabelNombre))
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                          .addComponent(jFormattedTextFieldActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jLabelActividad))
                      .addGap(18, 18, 18)
                      .addComponent(jButtonAceptar)
                      .addGap(17, 17, 17))
              );

              pack();
	    }// </editor-fold>                        

	    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {  
	   	 if(jFormattedTextFieldNombre.getText().isEmpty()&&jFormattedTextFieldActividad.getText().isEmpty()){
	   		JOptionPane.showMessageDialog(null, "ERROR!! Rellene todos los campos", "Modificar Departamento", JOptionPane.ERROR_MESSAGE); 
	   	 }else{
	   		 
	    	Departamento transferDepartamento = new Departamento();
	    	transferDepartamento.setId( Integer.valueOf(jFormattedTextFieldID.getText()));
	  	   transferDepartamento.setNombre(jFormattedTextFieldNombre.getText());
	  	   transferDepartamento.setActividad(jFormattedTextFieldActividad.getText());  
	  	   
	         ControladorImp.getInstancia().execute(Evento.MODIFICAR_DEPARTAMENTO, transferDepartamento);
	   	 }
	        // TODO add your handling code here:
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
	            java.util.logging.Logger.getLogger(GUIModificarDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(GUIModificarDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(GUIModificarDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(GUIModificarDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new GUIModificarDepartamento().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButtonAceptar;
	    private javax.swing.JFormattedTextField jFormattedTextFieldActividad;
	    private javax.swing.JFormattedTextField jFormattedTextFieldID;
	    private javax.swing.JFormattedTextField jFormattedTextFieldNombre;
	    private javax.swing.JLabel jLabelActividad;
	    private javax.swing.JLabel jLabelID;
	    private javax.swing.JLabel jLabelNombre;
	    // End of variables declaration
	    @Override
		public void actualizar(int id_evento_vista, Object datos) {
			//Borra lo anterior
	    	jFormattedTextFieldID.setText("");
	         jFormattedTextFieldNombre.setText("");
	         jFormattedTextFieldActividad.setText("");
	         
			
			if(id_evento_vista == EventoVista.MODIFICAR_DEPARTAMENTO_EXITO){
				JOptionPane.showMessageDialog(null, "Se ha modificado el Departamento con exito","Modificar Departamento", JOptionPane.INFORMATION_MESSAGE);		
			}	
		
			else if (id_evento_vista == EventoVista.MODIFICAR_DEPARTAMENTO_FALLO){
				JOptionPane.showMessageDialog(null, "ERROR!! Ha ocurrido un error, el departamento no existe o no esta activo", "Modificar Departamento", JOptionPane.ERROR_MESSAGE);
			}
			
		}
	}

