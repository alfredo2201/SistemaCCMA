/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarCliente;

//import DAO.ClienteDAO;
import Control.Control;
import Dominio.Cliente;
import Fachada.FabricaNegocios;
import Fachada.INegocios;
import PanelesGlobales.PnContenido;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class PnRegistrarCliente extends javax.swing.JPanel {

    //private final ClienteDAO clDao;
    private PnContenido pnContenido = PnContenido.getInstance();
    private INegocios negocios = FabricaNegocios.getInstance();

    /**
     * Creates new form PnRegistrarCliente
     */
    public PnRegistrarCliente() {
        initComponents();
        //clDao = new ClienteDAO();
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
        btnAgregarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        txtApellidosCliente = new javax.swing.JTextField();
        spNombre1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registrar Cliente Nuevo");

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

        lblTextoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTextoNombre.setText("Nombre:");

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNombreCliente.setBorder(null);

        lblTextoEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTextoEmail.setText("Correo electrónico:");

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCorreo.setBorder(null);

        lblTextoTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTextoTelefono.setText("Teléfono:");

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTelefono.setBorder(null);

        lblTextoRFC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoRFC.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoRFC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTextoRFC.setText("RFC:");

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtRFC.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Apellidos:");

        txtApellidosCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidosCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtApellidosCliente.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtTelefono)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spRFC)
                                .addComponent(txtRFC)))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitulo)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoNombre))
                .addGap(0, 0, 0)
                .addComponent(spNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addComponent(spNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoEmail))
                .addGap(0, 0, 0)
                .addComponent(spEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoRFC))
                .addGap(0, 0, 0)
                .addComponent(spRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PnMenuClientes pnMnCliente = new PnMenuClientes();
        Control ctl = new Control();
        ctl.muestraPantalla(pnContenido, pnMnCliente);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        agregarCliente();
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

    private void agregarCliente() {
        Control ctl = new Control();
        String nombre = txtNombreCliente.getText();
        String apellidos = txtApellidosCliente.getText();
        String email = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String RFC = txtRFC.getText();
        if (nombre.isEmpty() || apellidos.isEmpty() || email.isEmpty() || telefono.isEmpty() || RFC.isEmpty()) {
            ctl.muestraMsj("Campos vacios. Verifique su información", "Error de campos de entrada", JOptionPane.INFORMATION_MESSAGE, "src/iconos/warning.png");
        } else {
            Cliente cl = new Cliente(nombre + " " + apellidos, email, RFC, telefono);
            negocios.registrarClienteNuevo(cl);
            ctl.muestraMsj("Se eliminaron los clientes seleccionados.", "No se elimino el cliente", JOptionPane.INFORMATION_MESSAGE, "src/iconos/comprobado.png");   
            limpiarCampos();
        }
    }

    private void limpiarCampos() {
        txtNombreCliente.setText("");
        txtApellidosCliente.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtRFC.setText("");
    }
}
