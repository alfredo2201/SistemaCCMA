/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarCliente;

import DAO.ClienteDAO;
import Dominio.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class PnRegistrarCliente extends javax.swing.JPanel {

    private final ClienteDAO clDao;

    /**
     * Creates new form PnRegistrarCliente
     */
    public PnRegistrarCliente() {
        initComponents();
        clDao = new ClienteDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTextoNombre = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        spNombre = new javax.swing.JSeparator();
        lblTextoEmail = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        spEmail = new javax.swing.JSeparator();
        lblTextoTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        spTelefono = new javax.swing.JSeparator();
        lblTextoRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        spRFC = new javax.swing.JSeparator();
        btnAgregarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtApellidosCliente = new javax.swing.JTextField();
        spNombre1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Registrar Cliente Nuevo");

        lblTextoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoNombre.setText("Nombre:");

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNombreCliente.setBorder(null);

        lblTextoEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoEmail.setText("Correo electrónico:");

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCorreo.setBorder(null);

        lblTextoTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoTelefono.setText("Teléfono:");

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTelefono.setBorder(null);

        lblTextoRFC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoRFC.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoRFC.setText("RFC:");

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtRFC.setBorder(null);

        btnAgregarCliente.setBackground(new java.awt.Color(255, 255, 0));
        btnAgregarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCliente.setText("Guardar Cliente Nuevo");
        btnAgregarCliente.setBorder(null);
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apellidos:");

        txtApellidosCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidosCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtApellidosCliente.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 264, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(spRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTextoRFC)
                                        .addComponent(lblTextoTelefono))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(317, 317, 317)
                            .addComponent(spNombre))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(198, 198, 198)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTextoEmail)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblTextoNombre)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblTitulo)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(txtNombreCliente))
                                    .addGap(0, 2, Short.MAX_VALUE))
                                .addComponent(txtCorreo)
                                .addComponent(txtApellidosCliente)
                                .addComponent(spNombre1, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(spEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(260, 260, 260))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitulo)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextoNombre)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(spNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoEmail))
                .addGap(2, 2, 2)
                .addComponent(spEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(spTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(spRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        remove(this);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombreCliente.getText();
        String apellidos = txtApellidosCliente.getText();
        String email = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String RFC = txtRFC.getText();

        if (nombre.isEmpty() || apellidos.isEmpty() || email.isEmpty() || telefono.isEmpty() || RFC.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor de llenar todas las casillas.", "No se pudo agregar el cliente.", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Cliente cl = new Cliente(nombre, apellidos, email, RFC, telefono);
                clDao.insertar(cl);
                JOptionPane.showMessageDialog(this, "Error al intentar añadir al cliente.", "ERROR: Agregar cliente", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al intentar añadir al cliente.", "ERROR: Agregar cliente", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTextoEmail;
    private javax.swing.JLabel lblTextoNombre;
    private javax.swing.JLabel lblTextoRFC;
    private javax.swing.JLabel lblTextoTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator spEmail;
    private javax.swing.JSeparator spNombre;
    private javax.swing.JSeparator spNombre1;
    private javax.swing.JSeparator spRFC;
    private javax.swing.JSeparator spTelefono;
    private javax.swing.JTextField txtApellidosCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
