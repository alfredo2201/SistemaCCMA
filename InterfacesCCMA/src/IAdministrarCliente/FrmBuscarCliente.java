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
import IAdministrarVentas.RegistrarVenta;
import PanelesGlobales.PnContenido;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author herna
 */
public class FrmBuscarCliente extends javax.swing.JFrame {

    private PnContenido contenido = PnContenido.getInstance();
    private PnConsularCliente consultar = new PnConsularCliente();
    private RegistrarVenta registrarVenta;
    private INegocios negocios = FabricaNegocios.getInstance();
    private int tipoPantalla;
    private static int CONSULTAR_CLIENTE = 1;
    private static int REGISTRAR_VENTA = 3;
    private DefaultTableModel dtm;

    /**
     * Creates new form IBuscarCliente
     */
    public FrmBuscarCliente() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.dtm = (DefaultTableModel) clienteTable.getModel();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconos/pos-terminal.png"));
        return retValue;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTextoRFC = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pnListaClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();
        btnContinuar = new javax.swing.JButton();
        btnCSinCliente = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(232, 228, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre:");

        lblTextoRFC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTextoRFC.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoRFC.setText("RFC:");

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setBorder(null);

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setBorder(null);

        pnListaClientes.setBackground(new java.awt.Color(255, 255, 255));

        clienteTable.setAutoCreateRowSorter(true);
        clienteTable.setBackground(new java.awt.Color(255, 255, 255));
        clienteTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clienteTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clienteTable.setForeground(new java.awt.Color(0, 0, 0));
        clienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "RFC", "Correo Electrónico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clienteTable.setRowHeight(24);
        jScrollPane1.setViewportView(clienteTable);

        javax.swing.GroupLayout pnListaClientesLayout = new javax.swing.GroupLayout(pnListaClientes);
        pnListaClientes.setLayout(pnListaClientesLayout);
        pnListaClientesLayout.setHorizontalGroup(
            pnListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        pnListaClientesLayout.setVerticalGroup(
            pnListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        btnContinuar.setBackground(new java.awt.Color(255, 255, 0));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(0, 0, 0));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(null);
        btnContinuar.setBorderPainted(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnCSinCliente.setBackground(new java.awt.Color(153, 153, 0));
        btnCSinCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCSinCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnCSinCliente.setText("Continuar sin cliente");
        btnCSinCliente.setBorder(null);
        btnCSinCliente.setBorderPainted(false);
        btnCSinCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCSinCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSinClienteActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarIcon.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnCSinCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTextoRFC)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(pnListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(pnListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCSinCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        continuar();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre, RFC;
        nombre = txtNombreCliente.getText();
        RFC = txtRFC.getText();
        buscarClientes(nombre, RFC);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCSinClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSinClienteActionPerformed
        continuarSinCliente();
    }//GEN-LAST:event_btnCSinClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCSinCliente;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JTable clienteTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTextoRFC;
    private javax.swing.JPanel pnListaClientes;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables

    public int getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(int tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
        if (tipoPantalla == CONSULTAR_CLIENTE) {
            btnCSinCliente.setVisible(false);
        }
    }

    public void buscarClientes(String nombre, String RFC) {
        ArrayList<Cliente> cLista = new ArrayList<>();

        // Borra todos los rows
        dtm.setRowCount(0);
        if (!nombre.isEmpty() && RFC.isEmpty()) {
            cLista = negocios.consultarClienteNombre(nombre);
        } else if (nombre.isEmpty() && !RFC.isEmpty()) {
            cLista.add(negocios.consultarClienteByRFC(RFC));
        } else {
            cLista = negocios.obtenerClientes();
        }
        cLista.forEach(cl -> {
            dtm.addRow(new Object[]{cl.getNombre(), cl.getRfc(), cl.getCorreo()});
        });
    }


    private void continuar() {
        Control ctl = new Control();
        int i = clienteTable.getSelectedRow();
        Cliente aux = null;
        if (i >= 0) {
            if (getTipoPantalla() == REGISTRAR_VENTA) {
                String c = (String) dtm.getValueAt(i, 1);
                aux = negocios.consultarClienteByRFC(c);
                registrarVenta = RegistrarVenta.getInstance();
                registrarVenta.limpiarTabla();
                ctl.muestraPantalla(contenido, registrarVenta);
                registrarVenta.setCliente(aux);
            } else if (getTipoPantalla() == CONSULTAR_CLIENTE) {
                String c = (String) dtm.getValueAt(i, 1);
                aux = negocios.consultarClienteByRFC(c);
                consultar.setCliente(aux);
                ctl.muestraPantalla(contenido, consultar);
                consultar.cargarCliente();
            }
            dispose();
        } else {
            ctl.muestraMsj("Por favor seleccione un cliente.",
                    "Cliente no seleccionado", JOptionPane.ERROR_MESSAGE, "src/iconos/warning.png");

        }

    }

    private void continuarSinCliente() {
        Control ctl = new Control();
        registrarVenta = RegistrarVenta.getInstance();
        Cliente cliente = new Cliente(1, "None", "None@gmail.com", "AAAA000000AAA", "0000000000");
        ctl.muestraPantalla(contenido, registrarVenta);
        registrarVenta.setCliente(cliente);
        registrarVenta.clienteAnonimo();
        dispose();
    }

}
