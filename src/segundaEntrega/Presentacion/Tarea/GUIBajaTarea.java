package segundaEntrega.Presentacion.Tarea;

import javax.swing.JOptionPane;

import segundaEntrega.Negocio.Tarea.Tarea;
import segundaEntrega.Presentacion.Vista;
import segundaEntrega.Presentacion.Controlador.Evento;
import segundaEntrega.Presentacion.Controlador.Implementacion.ControladorImp;
import segundaEntrega.Presentacion.Dispatcher.EventoVista;

public class GUIBajaTarea extends javax.swing.JFrame implements Vista {

	static private GUIBajaTarea bajaTarea;

    /**
     * Creates new form GUIAltaCliente
     */
    public GUIBajaTarea() {
        initComponents();
    }

    static public GUIBajaTarea obtenerInstancia(){
		   if(bajaTarea == null){
			   bajaTarea = new GUIBajaTarea();
		   }
		   
		   return bajaTarea;
	  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jFormattedTextFieldID = new javax.swing.JFormattedTextField();
        jButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelID.setText("ID:");

      

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
                .addGap(29, 29, 29)
                .addComponent(jLabelID)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAceptar)
                    .addComponent(jFormattedTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jFormattedTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButtonAceptar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {  
	   	 if(jFormattedTextFieldID.getText().isEmpty()){
	   		JOptionPane.showMessageDialog(null, "ERROR!! Rellene todos los campos", "Baja Tarea", JOptionPane.ERROR_MESSAGE); 
	   	 }else{
	   		 
	  	  
	         ControladorImp.getInstancia().execute(Evento.BAJA_TAREA, Integer.valueOf(jFormattedTextFieldID.getText()));
	   	 }
	        // TODO add your handling code here:
	    }                                           
                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIBajaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBajaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBajaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBajaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBajaTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JFormattedTextField jFormattedTextFieldID;
    private javax.swing.JLabel jLabelID;
    // End of variables declaration                   
	@Override
	public void actualizar(int id_evento_vista, Object datos) {
		jFormattedTextFieldID.setText("");
		
		
		if(id_evento_vista == EventoVista.BAJA_TAREA_EXITO){
			JOptionPane.showMessageDialog(null, "Se ha eliminado la Tarea con exito","Baja Tarea", JOptionPane.INFORMATION_MESSAGE);		
		}	
	
		else if (id_evento_vista == EventoVista.BAJA_TAREA_FALLO){
			JOptionPane.showMessageDialog(null, "ERROR!! Ha ocurrido un error", "Baja Tarea", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
