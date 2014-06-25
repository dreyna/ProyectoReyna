/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.reyna.vista;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import pe.edu.upeu.reyna.DAO.DistritoDAO;
import pe.edu.upeu.reyna.DAO.IglesiaDAO;
import pe.edu.upeu.reyna.DAO.TipoIglesiaDAO;
import pe.edu.upeu.reyna.modelo.Distrito;
import pe.edu.upeu.reyna.modelo.TipoIglesia;

/**
 *
 * @author admin-harold.rojas
 */
public class IglesiaForm extends javax.swing.JFrame {
    ArrayList<Distrito> lista1 = new ArrayList();
    ArrayList<TipoIglesia> lista2 = new ArrayList();
    DistritoDAO dAO1 = new DistritoDAO();
    TipoIglesiaDAO dAO2 = new TipoIglesiaDAO();
    IglesiaDAO dAo3 = new IglesiaDAO();
    DefaultComboBoxModel<Object> modelodistrito = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<Object> modelotipo = new DefaultComboBoxModel<>();
    /**
     * Creates new form IglesiaForm
     */
    public IglesiaForm() {
        initComponents();
        setLocationRelativeTo(null);
        cargarDistrito();
        cargartipoiglesia();
    }
final void cargarDistrito(){
    lista1 = dAO1.listarDistrito();
    modelodistrito.addElement("Seleccionar Distrito");
    cbodistrito.setModel(modelodistrito);
    for(int i=0;i<lista1.size();i++){
        modelodistrito.addElement(lista1.get(i).getDisc());
    }
    cbodistrito.setModel(modelodistrito);
}
final void cargartipoiglesia(){
    lista2 = dAO2.listarTipoIglesia();
    modelotipo.addElement("Seleccionar Tipo Iglesia");
    cbotipoiglesia.setModel(modelotipo);
    for(int i=0;i<lista2.size();i++){
        modelotipo.addElement(lista2.get(i).getNomtipo());
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbodistrito = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbotipoiglesia = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtiglesia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcuenta = new javax.swing.JTextField();
        tbningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Distrito:");

        jLabel2.setText("Tipo Iglesia:");

        jLabel3.setText("Iglesia:");

        jLabel4.setText("Cuenta:");

        tbningresar.setText("Registrar");
        tbningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbningresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbningresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipoiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbotipoiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbningresar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbningresarActionPerformed
        // TODO add your handling code here:
        int idd = dAO1.idDistrito(cbodistrito.getSelectedItem().toString());
        int idti = dAO2.idTipoIglesia(cbotipoiglesia.getSelectedItem().toString());
        String iglesia = txtiglesia.getText();
        int cuenta = Integer.parseInt(txtcuenta.getText());
        int x = dAo3.registrarIglesia(idd, idti, iglesia, cuenta);
        if(x>0){
            JOptionPane.showMessageDialog(null, "Exito");
        }else{
            JOptionPane.showMessageDialog(null, "Falla");
        }
    }//GEN-LAST:event_tbningresarActionPerformed

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
            java.util.logging.Logger.getLogger(IglesiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IglesiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IglesiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IglesiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IglesiaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbodistrito;
    private javax.swing.JComboBox cbotipoiglesia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton tbningresar;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtiglesia;
    // End of variables declaration//GEN-END:variables
}
