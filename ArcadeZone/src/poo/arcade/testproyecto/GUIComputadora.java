package poo.arcade.testproyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;
import poo.clases.proyecto.Computadora;

/**
 *
 * @author Milton
 */
public class GUIComputadora extends javax.swing.JFrame {
Computadora computadora;
private double cobro;

    /**
     * Creates new form GUIComputadora
     */
    public GUIComputadora() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        btnGuardarCobro.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbComputasoras = new javax.swing.JComboBox<>();
        lblTipoDeComputadora = new javax.swing.JLabel();
        lblHorasAlquiladas = new javax.swing.JLabel();
        txtHorasAlquiladas = new javax.swing.JTextField();
        btnCalcularpago = new javax.swing.JButton();
        btnGuardarCobro = new javax.swing.JButton();
        btnCancelarCobro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Computadora");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Computadora"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbComputasoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computadora Gamer", "Computadora Oficina" }));
        cmbComputasoras.setSelectedIndex(-1);
        cmbComputasoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComputasorasActionPerformed(evt);
            }
        });
        jPanel1.add(cmbComputasoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 164, -1));

        lblTipoDeComputadora.setBackground(new java.awt.Color(255, 255, 255));
        lblTipoDeComputadora.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoDeComputadora.setText("Tipo de computadora:");
        jPanel1.add(lblTipoDeComputadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 20));

        lblHorasAlquiladas.setForeground(new java.awt.Color(255, 255, 255));
        lblHorasAlquiladas.setText("Horas alquiladas:");
        jPanel1.add(lblHorasAlquiladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 20));
        jPanel1.add(txtHorasAlquiladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 48, -1));

        btnCalcularpago.setText("Calcular Cobro");
        btnCalcularpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularpagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnGuardarCobro.setText("Guardar Cobro");
        btnGuardarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCobroActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        btnCancelarCobro.setText("Cancelar Cobro");
        btnCancelarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCobroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/background/LogoAZMarco.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbComputasorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbComputasorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbComputasorasActionPerformed

    private void btnCalcularpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularpagoActionPerformed
        // TODO add your handling code here:
        try{
            if(llenos()){
                int horasAlquiladas=Integer.parseInt(txtHorasAlquiladas.getText());
                String tipoDeCompu= (String) cmbComputasoras.getSelectedItem();
                bloquearCampos();
                computadora=new Computadora();
                computadora.setTipoDeComputadora(tipoDeCompu);
                computadora.setHorasDealquiler(horasAlquiladas);
                cobro=computadora.calcularPago();
                JOptionPane.showMessageDialog(rootPane,"Valor a cobrar: "+cobro+"$"
                           ,"Cobro",JOptionPane.INFORMATION_MESSAGE);
                btnGuardarCobro.setEnabled(true);  
            }else{
                JOptionPane.showMessageDialog(rootPane,"Llenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane,"Ingresar números enteros en horas","ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(rootPane,"No se calculó el cobro","ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"otro error"+e.toString(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularpagoActionPerformed

    private void btnGuardarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCobroActionPerformed
        // TODO add your handling code here:
        PnlCobro.setCobroTotal(cobro);
        FmrMenu.equiposAlquilados.add(computadora);
        llimpiar();
        btnGuardarCobro.setEnabled(false);
        desbloquearCampos();       
    }//GEN-LAST:event_btnGuardarCobroActionPerformed

    private void btnCancelarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCobroActionPerformed
        // TODO add your handling code here:
        llimpiar();
        desbloquearCampos();
        btnGuardarCobro.setEnabled(false);
    }//GEN-LAST:event_btnCancelarCobroActionPerformed

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
            java.util.logging.Logger.getLogger(GUIComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIComputadora().setVisible(true);
            }
        });
    }
public boolean llenos(){
    boolean txt1=txtHorasAlquiladas.getText().isEmpty();
        if(cmbComputasoras.getSelectedIndex()!=-1&&txt1!=true){
            return true;
        }else{
            return false;
        }
    }
public void llimpiar(){
    cmbComputasoras.setSelectedIndex(-1);
    txtHorasAlquiladas.setText(null);
}
public void bloquearCampos(){
    cmbComputasoras.setEnabled(false);
    txtHorasAlquiladas.setEnabled(false);
}
public void desbloquearCampos(){
    cmbComputasoras.setEnabled(true);
    txtHorasAlquiladas.setEnabled(true);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularpago;
    private javax.swing.JButton btnCancelarCobro;
    private javax.swing.JButton btnGuardarCobro;
    private javax.swing.JComboBox<String> cmbComputasoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHorasAlquiladas;
    private javax.swing.JLabel lblTipoDeComputadora;
    private javax.swing.JTextField txtHorasAlquiladas;
    // End of variables declaration//GEN-END:variables
}
