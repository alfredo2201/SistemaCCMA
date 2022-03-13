/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarCliente;

/**
 *
 * @author crist
 */
public class PnMenuClientes extends javax.swing.JPanel {

    /**
     * Creates new form PnMenuClientes
     */
    public PnMenuClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOpcionRegistrarCliente = new javax.swing.JButton();
        lblTextoMenuClientes = new javax.swing.JLabel();
        btnOpcionActualizarCliente = new javax.swing.JButton();
        btnOpcionEliminarCliente = new javax.swing.JButton();
        btnOpcionConsultarCliente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnOpcionRegistrarCliente.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionRegistrarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionRegistrarCliente.setText("Registrar Cliente Nuevo");
        btnOpcionRegistrarCliente.setBorder(null);
        btnOpcionRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcionRegistrarCliente.setFocusPainted(false);

        lblTextoMenuClientes.setFont(new java.awt.Font("Segoe UI", 2, 26)); // NOI18N
        lblTextoMenuClientes.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoMenuClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoMenuClientes.setText("Menú de Clientes");

        btnOpcionActualizarCliente.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionActualizarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionActualizarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionActualizarCliente.setText("Actualizar Cliente ");
        btnOpcionActualizarCliente.setBorder(null);
        btnOpcionActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcionActualizarCliente.setFocusPainted(false);

        btnOpcionEliminarCliente.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionEliminarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionEliminarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionEliminarCliente.setText("Eliminar Cliente");
        btnOpcionEliminarCliente.setBorder(null);
        btnOpcionEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcionEliminarCliente.setFocusPainted(false);

        btnOpcionConsultarCliente.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionConsultarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionConsultarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionConsultarCliente.setText("Consultar Clientes");
        btnOpcionConsultarCliente.setBorder(null);
        btnOpcionConsultarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcionConsultarCliente.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOpcionRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTextoMenuClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(btnOpcionActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcionEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcionConsultarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblTextoMenuClientes)
                .addGap(55, 55, 55)
                .addComponent(btnOpcionRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnOpcionActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnOpcionEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnOpcionConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcionActualizarCliente;
    private javax.swing.JButton btnOpcionConsultarCliente;
    private javax.swing.JButton btnOpcionEliminarCliente;
    private javax.swing.JButton btnOpcionRegistrarCliente;
    private javax.swing.JLabel lblTextoMenuClientes;
    // End of variables declaration//GEN-END:variables
}