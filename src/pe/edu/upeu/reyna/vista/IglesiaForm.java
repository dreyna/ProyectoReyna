/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.reyna.vista;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.edu.upeu.reyna.DAO.DistritoDAO;
import pe.edu.upeu.reyna.DAO.IglesiaDAO;
import pe.edu.upeu.reyna.DAO.TipoIglesiaDAO;
import pe.edu.upeu.reyna.modelo.Distrito;
import pe.edu.upeu.reyna.modelo.Iglesia;
import pe.edu.upeu.reyna.modelo.TipoIglesia;

/**
 *
 * @author admin-harold.rojas
 */
public class IglesiaForm extends javax.swing.JFrame {
    ArrayList<Distrito> lista1 = new ArrayList();
    ArrayList<TipoIglesia> lista2 = new ArrayList();
    ArrayList<Iglesia> lista3= new ArrayList();
    DistritoDAO dAO1 = new DistritoDAO();
    TipoIglesiaDAO dAO2 = new TipoIglesiaDAO();
    IglesiaDAO dAo3 = new IglesiaDAO();
    DefaultComboBoxModel<Object> modelodistrito = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<Object> modelotipo = new DefaultComboBoxModel<>();
     DefaultTableModel model = new DefaultTableModel();
     int op;
     
    /**
     * Creates new form IglesiaForm
     */
    public IglesiaForm() {
        initComponents();
        setLocationRelativeTo(null);
        cargarDistrito();
        cargartipoiglesia();
        listarIglesias();
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
        jLabel4 = new javax.swing.JLabel();
        tbningresar = new javax.swing.JButton();
        txtTipoIglesia = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        txtcuenta1 = new javax.swing.JTextField();
        txtiglesia1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatosIglesia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Distrito:");

        cbodistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodistritoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo Iglesia:");

        cbotipoiglesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipoiglesiaActionPerformed(evt);
            }
        });

        jLabel3.setText("Iglesia:");

        jLabel4.setText("Cuenta:");

        tbningresar.setText("Registrar");
        tbningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbningresarActionPerformed(evt);
            }
        });

        txtTipoIglesia.setEnabled(false);

        txtDistrito.setEnabled(false);

        txtcuenta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuenta1KeyTyped(evt);
            }
        });

        txtiglesia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtiglesia1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtiglesia1KeyTyped(evt);
            }
        });

        jtDatosIglesia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Distrito", "Tipo Iglesia", "Iglesia", "Cuenta"
            }
        ));
        jScrollPane1.setViewportView(jtDatosIglesia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtiglesia1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbningresar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbotipoiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(71, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbotipoiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTipoIglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tbningresar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtiglesia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtcuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbningresarActionPerformed
        // TODO add your handling code here:
        int idd = dAO1.idDistrito(cbodistrito.getSelectedItem().toString());
        int idti = dAO2.idTipoIglesia(cbotipoiglesia.getSelectedItem().toString());
        String iglesia = txtiglesia1.getText();
        int cuenta = Integer.parseInt(txtcuenta1.getText());
        int x = dAo3.registrarIglesia(idd, idti, iglesia, cuenta);
        if(x>0){
            JOptionPane.showMessageDialog(null, "Exito");
            updateComponets();
            //listarEquipo();
            limpiar();
            
        }else{
            JOptionPane.showMessageDialog(null, "Falla");
        }
    }//GEN-LAST:event_tbningresarActionPerformed

    private void txtcuenta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuenta1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtcuenta1KeyTyped

    private void txtiglesia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiglesia1KeyTyped
        // TODO add your handling code here:
        char a=evt.getKeyChar();
        if((a<'a' || a>'z')&&(a<'A')|a>'Z')evt.consume();
    }//GEN-LAST:event_txtiglesia1KeyTyped

    private void cbodistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodistritoActionPerformed
        // TODO add your handling code here:
        String distrito= cbodistrito.getSelectedItem().toString();
        
        int id;
        int x= cbodistrito.getSelectedIndex();
        if(x!=0)
        {
            id=dAO1.idDistrito(distrito);
            txtDistrito.setText(""+id);
        }
    }//GEN-LAST:event_cbodistritoActionPerformed

    private void cbotipoiglesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipoiglesiaActionPerformed
        // TODO add your handling code here:
         String TipoIglesia= cbotipoiglesia.getSelectedItem().toString();
        
        int id;
        int x= cbotipoiglesia.getSelectedIndex();
        if(x!=0)
        {
            id=dAO2.idTipoIglesia(TipoIglesia);
            txtTipoIglesia.setText(""+id);
        }
    }//GEN-LAST:event_cbotipoiglesiaActionPerformed

    private void txtiglesia1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiglesia1KeyPressed
        // TODO add your handling code here:
        int key= evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        {
            if(!txtiglesia1.getText().equals("")){
                op = dAo3.verificarIglesia(txtiglesia1.getText());
                if(op==1){
                    JOptionPane.showMessageDialog(null,"Iglesia EXISTE" );
                    txtiglesia1.setText(null);
                    txtiglesia1.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null,"Iglesia NO EXISTE" );
                    txtcuenta1.requestFocus();
                }
            }else{
                   JOptionPane.showMessageDialog(null,"Escriba algo " );
                    txtiglesia1.requestFocus(); 
            }
        }
    }//GEN-LAST:event_txtiglesia1KeyPressed

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
   void listarIglesias(){
    lista3 =dAo3.listarIglesia();
    model = (DefaultTableModel) jtDatosIglesia.getModel();
        Object[] usu = new Object[5];
        for(int i=0;i<lista3.size();i++){
            usu[0]=lista3.get(i).getIdi();
            usu[1]=lista3.get(i).getIdd();
            usu[2]=lista3.get(i).getIdti();
            usu[3]=lista3.get(i).getNomiglesia();
            usu[4]=lista3.get(i).getCuenta();
           
            model.addRow(usu);
               
        jtDatosIglesia.setModel(model);
        }
}
void limpiar(){
        txtDistrito.setText(null);
        txtTipoIglesia.setText(null);
        txtcuenta1.setText(null);
        txtiglesia1.setText(null);
        cbodistrito.setSelectedIndex(0);
        cbotipoiglesia.setSelectedIndex(0);
        
        }
void updateComponets(){
    LimpiarTabla(model);
    listarIglesias();
//    modelocombo.removeAllElements();
    //cargarCombo();
    //modelolista.clear();
    //cargarList();    
    }
    void LimpiarTabla(DefaultTableModel modelo){
        int a =modelo.getRowCount()-1;
        for(int i=a;i>=0;i--){  
            modelo.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbodistrito;
    private javax.swing.JComboBox cbotipoiglesia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtDatosIglesia;
    private javax.swing.JButton tbningresar;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtTipoIglesia;
    private javax.swing.JTextField txtcuenta1;
    private javax.swing.JTextField txtiglesia1;
    // End of variables declaration//GEN-END:variables
}
