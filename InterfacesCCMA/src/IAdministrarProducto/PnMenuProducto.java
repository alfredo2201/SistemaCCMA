/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarProducto;

import Control.Control;
import PanelesGlobales.PnContenido;

/**
 *
 * @author crist
 */
public class PnMenuProducto extends javax.swing.JPanel {

    /**
     * Creates new form PnMenuProducto
     */
    private PnRegistrarProducto registrar;
    private PnActualizarProducto actualizar;
    private PnEliminarProducto eliminar;    
    private final PnContenido pnContenido = PnContenido.getInstance();

    public PnMenuProducto() {
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

        btnOpcionRegistrarProducto = new javax.swing.JButton();
        btnOpcionConsultarProductos = new javax.swing.JButton();
        btnOpcionEliminarProducto = new javax.swing.JButton();
        btnOpcionActualizarProducto = new javax.swing.JButton();
        lblTextoMenuClientes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnOpcionRegistrarProducto.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionRegistrarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionRegistrarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionRegistrarProducto.setText("Agregar Prodcuto Nuevo");
        btnOpcionRegistrarProducto.setBorder(null);
        btnOpcionRegistrarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOpcionRegistrarProducto.setFocusPainted(false);
        btnOpcionRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionRegistrarProductoActionPerformed(evt);
            }
        });

        btnOpcionConsultarProductos.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionConsultarProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionConsultarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionConsultarProductos.setText("Consultar Productos");
        btnOpcionConsultarProductos.setBorder(null);
        btnOpcionConsultarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOpcionConsultarProductos.setFocusPainted(false);
        btnOpcionConsultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionConsultarProductosActionPerformed(evt);
            }
        });

        btnOpcionEliminarProducto.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionEliminarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionEliminarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionEliminarProducto.setText("Eliminar Producto");
        btnOpcionEliminarProducto.setToolTipText("");
        btnOpcionEliminarProducto.setBorder(null);
        btnOpcionEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOpcionEliminarProducto.setFocusPainted(false);
        btnOpcionEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionEliminarProductoActionPerformed(evt);
            }
        });

        btnOpcionActualizarProducto.setBackground(new java.awt.Color(204, 204, 0));
        btnOpcionActualizarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpcionActualizarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnOpcionActualizarProducto.setText("Actualizar Producto");
        btnOpcionActualizarProducto.setBorder(null);
        btnOpcionActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOpcionActualizarProducto.setFocusPainted(false);
        btnOpcionActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionActualizarProductoActionPerformed(evt);
            }
        });

        lblTextoMenuClientes.setFont(new java.awt.Font("Segoe UI", 2, 26)); // NOI18N
        lblTextoMenuClientes.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoMenuClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoMenuClientes.setText("Menú de Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpcionConsultarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnOpcionRegistrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOpcionActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOpcionEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTextoMenuClientes, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblTextoMenuClientes)
                .addGap(75, 75, 75)
                .addComponent(btnOpcionRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnOpcionActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnOpcionEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnOpcionConsultarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcionRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionRegistrarProductoActionPerformed
        Control ctl = new Control();
        registrar = new PnRegistrarProducto();
        ctl.muestraPantalla(pnContenido, registrar);
    }//GEN-LAST:event_btnOpcionRegistrarProductoActionPerformed

    private void btnOpcionActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionActualizarProductoActionPerformed
        actualizar = new PnActualizarProducto();
        Control ctl = new Control();
        ctl.muestraPantalla(pnContenido, actualizar);
        actualizar.buscarProducto();
    }//GEN-LAST:event_btnOpcionActualizarProductoActionPerformed

    private void btnOpcionEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionEliminarProductoActionPerformed
        Control ctl = new Control();
        eliminar = new PnEliminarProducto();
        ctl.muestraPantalla(pnContenido, eliminar);
        eliminar.cargarProducto();
    }//GEN-LAST:event_btnOpcionEliminarProductoActionPerformed

    private void btnOpcionConsultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionConsultarProductosActionPerformed
        FrmBuscarProducto buscar = new FrmBuscarProducto();
        buscar.setVisible(true);
    }//GEN-LAST:event_btnOpcionConsultarProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcionActualizarProducto;
    private javax.swing.JButton btnOpcionConsultarProductos;
    private javax.swing.JButton btnOpcionEliminarProducto;
    private javax.swing.JButton btnOpcionRegistrarProducto;
    private javax.swing.JLabel lblTextoMenuClientes;
    // End of variables declaration//GEN-END:variables
}
