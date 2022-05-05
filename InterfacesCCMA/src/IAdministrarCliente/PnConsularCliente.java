/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarCliente;

import Control.Control;
import Dominio.Cliente;
import PanelesGlobales.PnContenido;

/**
 *
 * @author crist
 */
public class PnConsularCliente extends javax.swing.JPanel {

    /**
     * Creates new form PnConsularCliente
     */
    private Cliente cliente;
    private PnContenido pnContenido = PnContenido.getInstance();

    public PnConsularCliente() {
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

        lblTitulo = new javax.swing.JLabel();
        lblTextoNombre = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblTextoEmail = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblTextoTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblTextoRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Consultar cliente");

        lblTextoNombre.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblTextoNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTextoNombre.setText("Nombre:");

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombreCliente.setBorder(null);

        lblTextoEmail.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblTextoEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTextoEmail.setText("Correo electrónico:");

        txtCorreo.setEditable(false);
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCorreo.setBorder(null);

        lblTextoTelefono.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblTextoTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTextoTelefono.setText("Teléfono:");

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTelefono.setBorder(null);

        lblTextoRFC.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblTextoRFC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTextoRFC.setText("RFC:");

        txtRFC.setEditable(false);
        txtRFC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtRFC.setBorder(null);
        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnMenu.setBackground(new java.awt.Color(153, 153, 0));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu.setText("Regresar al menú");
        btnMenu.setBorder(null);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTextoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTextoTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitulo)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextoNombre)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoEmail))
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        PnMenuClientes pnMnCliente = new PnMenuClientes();
        Control ctl = new Control();
        ctl.muestraPantalla(pnContenido, pnMnCliente);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblTextoEmail;
    private javax.swing.JLabel lblTextoNombre;
    private javax.swing.JLabel lblTextoRFC;
    private javax.swing.JLabel lblTextoTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    public void cargarCliente() {
        if (getCliente() != null) {
            txtNombreCliente.setText(getCliente().getNombre());
            txtCorreo.setText(getCliente().getCorreo());
            txtRFC.setText(getCliente().getRfc());
            txtTelefono.setText(getCliente().getTelefono());
        }

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
