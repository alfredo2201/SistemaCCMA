/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarVentas;

/**
 *
 * @author crist
 */
public class PnMenuVenta extends javax.swing.JPanel {

    /**
     * Creates new form PnMenuVenta
     */
    public PnMenuVenta() {
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

        lblTextoMenuClientes = new javax.swing.JLabel();
        btnOpcionNuevaVenta = new javax.swing.JButton();
        btnOpcionEliminarVenta = new javax.swing.JButton();
        btnOpcionConsultarCliente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTextoMenuClientes.setFont(new java.awt.Font("Segoe UI", 2, 26)); // NOI18N
        lblTextoMenuClientes.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoMenuClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoMenuClientes.setText("Menú de Ventas");

        btnOpcionNuevaVenta.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionNuevaVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionNuevaVenta.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionNuevaVenta.setText("Nueva Venta");
        btnOpcionNuevaVenta.setBorder(null);
        btnOpcionNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcionNuevaVenta.setFocusPainted(false);

        btnOpcionEliminarVenta.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionEliminarVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionEliminarVenta.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionEliminarVenta.setText("Eliminar Venta");
        btnOpcionEliminarVenta.setBorder(null);
        btnOpcionEliminarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcionEliminarVenta.setFocusPainted(false);

        btnOpcionConsultarCliente.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionConsultarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionConsultarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionConsultarCliente.setText("Consultar Ventas");
        btnOpcionConsultarCliente.setBorder(null);
        btnOpcionConsultarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcionConsultarCliente.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOpcionNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTextoMenuClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcionEliminarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcionConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblTextoMenuClientes)
                .addGap(55, 55, 55)
                .addComponent(btnOpcionNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnOpcionEliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnOpcionConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcionConsultarCliente;
    private javax.swing.JButton btnOpcionEliminarVenta;
    private javax.swing.JButton btnOpcionNuevaVenta;
    private javax.swing.JLabel lblTextoMenuClientes;
    // End of variables declaration//GEN-END:variables
}
