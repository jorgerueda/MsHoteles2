package segundaEntrega.Presentacion.Departamento;

import javax.swing.JOptionPane;

import segundaEntrega.Negocio.Departamento.Departamento;
import segundaEntrega.Presentacion.Vista;
import segundaEntrega.Presentacion.Controlador.Evento;
import segundaEntrega.Presentacion.Controlador.Implementacion.ControladorImp;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class GUIBajaDepartamento extends javax.swing.JFrame implements Vista {
	
	static private GUIBajaDepartamento bajaDepartamento;

	  /** Creates new form nueva Departamento */
	  private GUIBajaDepartamento() {
	      initComponents();
	  }
	  
	  /**
	   * Obtiene la instancia de la ventana
	   * @return la instancia de la ventana
	   */
	  static public GUIBajaDepartamento obtenerInstancia(){
		   if(bajaDepartamento == null){
			   bajaDepartamento = new GUIBajaDepartamento();
		   }
		   
		   return bajaDepartamento;
	  }

                        
	  private void initComponents() {

	        jLabelActividad = new javax.swing.JLabel();
	        jLabelID = new javax.swing.JLabel();
	        jFormattedTextFieldID = new javax.swing.JFormattedTextField();
	        jButtonAceptar = new javax.swing.JButton();
	        jFormattedTextFieldActividad = new javax.swing.JFormattedTextField();
	        jFormattedTextFieldActividad.setVisible(false);

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

	        jLabelActividad.setText("Actividad");
	        jLabelActividad.setVisible(false);

	        jLabelID.setText("ID");

	        jButtonAceptar.setText("Aceptar");
	        
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
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(15, 15, 15)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabelActividad)
	                            .addComponent(jLabelID))
	                        .addGap(40, 40, 40)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jFormattedTextFieldActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jFormattedTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(66, 66, 66)
	                        .addComponent(jButtonAceptar)))
	                .addContainerGap(36, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jFormattedTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabelID))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jFormattedTextFieldActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabelActividad))
	                .addGap(18, 18, 18)
	                .addComponent(jButtonAceptar)
	                .addContainerGap(18, Short.MAX_VALUE))
	        );
	        pack();
	    }// </editor-fold>                        

	    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {  
	   	 if(jFormattedTextFieldID.getText().isEmpty()){
	   		JOptionPane.showMessageDialog(null, "ERROR!! Rellene todos los campos", "Baja Departamento", JOptionPane.ERROR_MESSAGE); 
	   	 }else{
	   		  
	         ControladorImp.getInstancia().execute(Evento.BAJA_DEPARTAMENTO, Integer.valueOf(jFormattedTextFieldID.getText()));
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
	            java.util.logging.Logger.getLogger(GUIBajaDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(GUIBajaDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(GUIBajaDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(GUIBajaDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new GUIBajaDepartamento().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButtonAceptar;
	    private javax.swing.JFormattedTextField jFormattedTextFieldActividad;
	    private javax.swing.JFormattedTextField jFormattedTextFieldID;
	    private javax.swing.JLabel jLabelActividad;
	    private javax.swing.JLabel jLabelID;
	    // End of variables declaration
	    @Override
		public void actualizar(int id_evento_vista, Object datos) {
			//Borra lo anterior
	    	
	         jFormattedTextFieldID.setText("");	         
			
			if(id_evento_vista == EventoVista.BAJA_DEPARTAMENTO_EXITO){
				JOptionPane.showMessageDialog(null, "Se ha Eliminado el Departamento con exito ","Baja Departamento", JOptionPane.INFORMATION_MESSAGE);		
			}	
		
			else if (id_evento_vista == EventoVista.BAJA_DEPARTAMENTO_FALLO){
				JOptionPane.showMessageDialog(null,  "ERROR!! No se ha encontrado el departamento que se desea dar de baja o tiene empleados", "Baja Departamento", JOptionPane.ERROR_MESSAGE);
			}
			
		}
	}

