/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IAdministrarVentas;

import Control.Control;
import Dominio.Cliente;
import Dominio.Empleado;
import Dominio.Producto;
import Dominio.TipoPago;
import Dominio.Venta;
import Dominio.VentaProducto;
import Fachada.INegocios;
import PanelesGlobales.PnContenido;
import Principal.FrmPrincipal;
import java.awt.event.KeyEvent;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samuel Medellin
 */
public class RegistrarVenta extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarVenta
     */
    private FrmPrincipal main = FrmPrincipal.getInstance();
    private Empleado empleado = main.getEmpleado();
    private PnContenido pnContenido = PnContenido.getInstance();
    private PnAgregarProducto pnAgregarProducto;
    private ArrayList<Producto> pdLista;
    private Cliente cliente;
    private static RegistrarVenta instance;
    private TipoPago metodoPago = null;

    private float subTotal = 0f;
    private float totalIva = 0f;
    private float totalVenta = 0f;

    private RegistrarVenta() {
        initComponents();
        LocalDate fecha = LocalDate.now();
        txtFecha.setText(fecha.toString());
        txtIva.setEditable(false);
        txtSubTotal.setEditable(false);
        txtFecha.setEditable(false);
        txtTotal.setEditable(false);
        pdLista = new ArrayList<>();
        System.out.println(empleado);
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
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbClienteTemporal = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnMetodoPago = new javax.swing.JButton();
        btnAgregarProductos = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cliente:");

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliente.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha:");

        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cliente temporal");

        rbClienteTemporal.setBackground(new java.awt.Color(255, 255, 255));
        rbClienteTemporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbClienteTemporalActionPerformed(evt);
            }
        });

        tbProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Marca", "Modelo", "Año", "Precio", "Cantidad", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProductos.setRowHeight(24);
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbProductosMousePressed(evt);
            }
        });
        tbProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbProductosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbProductos);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Subtotal: $");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Descuento: $");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("IVA (16%):");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Total: $");

        txtSubTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSubTotal.setToolTipText("");
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        txtDescuento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDescuentoMouseExited(evt);
            }
        });
        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyPressed(evt);
            }
        });

        txtIva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubTotal)
                    .addComponent(txtDescuento)
                    .addComponent(txtIva)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        btnMetodoPago.setBackground(new java.awt.Color(153, 153, 0));
        btnMetodoPago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMetodoPago.setText("Método de pago");
        btnMetodoPago.setBorder(null);
        btnMetodoPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetodoPagoActionPerformed(evt);
            }
        });

        btnAgregarProductos.setBackground(new java.awt.Color(255, 204, 0));
        btnAgregarProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarProductos.setText("Agregar producto");
        btnAgregarProductos.setBorder(null);
        btnAgregarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductosActionPerformed(evt);
            }
        });

        btnCobrar.setBackground(new java.awt.Color(232, 228, 60));
        btnCobrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.setBorder(null);
        btnCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nueva venta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(342, 342, 342)
                                .addComponent(btnAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbClienteTemporal))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMetodoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(rbClienteTemporal)))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbClienteTemporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbClienteTemporalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbClienteTemporalActionPerformed

    private void btnMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetodoPagoActionPerformed
        FrmMetodoPago pnMetodoPago = new FrmMetodoPago();
        pnMetodoPago.setVisible(true);
    }//GEN-LAST:event_btnMetodoPagoActionPerformed

    private void btnAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductosActionPerformed
        pnAgregarProducto = new PnAgregarProducto();
        Control ctl = new Control();
        ctl.muestraPantalla(pnContenido, pnAgregarProducto);
    }//GEN-LAST:event_btnAgregarProductosActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        txtDescuento.setEditable(false);
        registrarVenta();
        borrarCampos();
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PnMenuVenta pnMnVenta = new PnMenuVenta();
        Control ctl = new Control();
        ctl.muestraPantalla(pnContenido, pnMnVenta);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void tbProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMousePressed
        int fila = this.tbProductos.getSelectedRow();
        int columna = this.tbProductos.getSelectedColumn();
        if (columna == 7) {
            int resp;
            resp = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar este producto?", "Eliminar Producto", JOptionPane.YES_NO_CANCEL_OPTION, 1, new ImageIcon("src/iconos/signo-de-interrogacion.png"));
            if (resp == 0) {
                DefaultTableModel modelo = (DefaultTableModel) tbProductos.getModel();
                modelo.removeRow(fila);
                txtDescuento.setEnabled(true);
                calcularSubTotal(pdLista);
            }
        }
    }//GEN-LAST:event_tbProductosMousePressed

    private void tbProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseExited
        //calcularSubTotal();
        //calcularTotali();
    }//GEN-LAST:event_tbProductosMouseExited

    private void txtDescuentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescuentoMouseExited
        //calcularTotali();
    }//GEN-LAST:event_txtDescuentoMouseExited

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        calcularSubTotal(pdLista);
    }//GEN-LAST:event_tbProductosMouseClicked

    private void tbProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProductosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcularSubTotal(pdLista);
        }
    }//GEN-LAST:event_tbProductosKeyPressed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtDescuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcularTotali();
        }
    }//GEN-LAST:event_txtDescuentoKeyPressed

    public static RegistrarVenta getInstance() {
        if (instance == null) {
            instance = new RegistrarVenta();
        }
        return instance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setMetodoPago(TipoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cargarInformacion(cliente.getNombre());
    }

    public ArrayList<Producto> getPdLista() {
        return pdLista;
    }

    public void setPdLista(ArrayList<Producto> pdLista) {
        this.pdLista = pdLista;
    }

    public void cargarInformacion(String nombre) {
        txtCliente.setText(nombre);
        LocalDate fecha = LocalDate.now();
        txtFecha.setText(fecha.toString());
    }

    public void mostrarVenta() {
        DefaultTableModel dtm = (DefaultTableModel) tbProductos.getModel();
        Control ctl = new Control();

        try {
            pdLista = PnAgregarProducto.auxProducts;
            if (pdLista.isEmpty()) {
                ctl.muestraMsj("No se ha encontrado ningun producto", "Sin producto", JOptionPane.INFORMATION_MESSAGE, "src/iconos/warning.png");
                return;
            }

            pdLista.forEach(pd -> {
                dtm.addRow(new Object[]{pd.getIdProducto(), pd.getDescripcion(),
                    pd.getMarca(), pd.getModelo(), pd.getAnio(), pd.getPrecio(), 1, "ELIMINAR"});
            });

            calcularSubTotal(pdLista);
            calcularTotali();
        } catch (Exception e) {
            ctl.muestraMsj("No se han podido recuperar los productos.", "Error al buscar productos", JOptionPane.INFORMATION_MESSAGE, "src/iconos/warning.png");
        }
    }

    public void borraDatos() {
        txtSubTotal.setText(" ");
        txtDescuento.setText(" ");
        txtIva.setText(" ");
        txtTotal.setText(" ");
        subTotal = 0f;
        totalIva = 0f;
        totalVenta = 0f;
    }

    public void calcularSubTotal(ArrayList<Producto> precios) {
        float iva = 0.16f;
        System.out.println("AQUI ANDAMOS EN CALCULAR VENTA");
        System.out.println(precios);
        borraDatos();
        int[] cantidades;
        cantidades = new int[tbProductos.getRowCount()];
        for (int i = 0; i < tbProductos.getRowCount(); i++) {
            cantidades[i] = (int) tbProductos.getValueAt(i, 6);
        }
        System.out.println(Arrays.toString(cantidades));
        for (int i = 0; i < tbProductos.getRowCount(); i++) {
            subTotal += (float) tbProductos.getValueAt(i, 5) * cantidades[i];
        }
        totalIva = Math.round(subTotal * iva);
        txtSubTotal.setText(Float.toString(subTotal));
        txtIva.setText(Float.toString(totalIva));
        calcularTotali();
    }

    public void calcularTotali() {
        Control ctl = new Control();
        try {
            System.out.println(":" + txtDescuento.getText() + "<<<<");
            if (!" ".equals(txtDescuento.getText()) && !txtDescuento.getText().isEmpty()) {
                Float descuento = Float.parseFloat(txtDescuento.getText());
                descuento = subTotal * (descuento / 100);
                totalVenta = subTotal - descuento + totalIva;
                txtTotal.setText(Float.toString(totalVenta));
            } else {
                totalVenta = subTotal + totalIva;
                txtTotal.setText(Float.toString(totalVenta));
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace(System.out);
            ctl.muestraMsj("Debes ingresar una cantidad mayor a 0% ", "Catidad de descuento no ingresada", JOptionPane.ERROR_MESSAGE, "src/iconos/warning.png");
        }

    }

    public void clienteAnonimo() {
        rbClienteTemporal.setSelected(true);
        rbClienteTemporal.setEnabled(false);
        txtCliente.setEnabled(false);
    }

    private void registrarVenta() {
        Control ctl = new Control();
        INegocios negocio = Fachada.FabricaNegocios.getInstance();
        if (tbProductos.getRowCount() != 0 && this.metodoPago != null) {
            Date time = Date.from(Instant.now());
            Venta venta;
            venta = new Venta(new ArrayList<VentaProducto>(), this.cliente, time, this.subTotal, this.totalVenta, this.empleado, this.metodoPago);
            ArrayList<VentaProducto> ventaProducto = new ArrayList<>();
            for (int i = 0; i < tbProductos.getRowCount(); i++) {
                //   Producto producto, Venta venta, Integer cantidad, Float precioVenta
                Producto prod = negocio.consultarProductoById(pdLista.get(i).getIdProducto());
                DefaultTableModel modelo = (DefaultTableModel) tbProductos.getModel();
                int cantidad = (int) modelo.getValueAt(i, 6);
                VentaProducto produ = new VentaProducto();
                produ.setProducto(prod);
                produ.setCantidad(cantidad);
                produ.setVenta(venta);
                produ.setPrecioVenta(prod.getPrecio() * cantidad);
                ventaProducto.add(produ);
            }
            negocio.registrarVenta(venta, ventaProducto);
            System.out.println("Se puede registrar");

        } else {
            ctl.muestraMsj("Debes ingresar una cantidad minima en descuento -> '$0' ", "Catidad de descuento no ingresada", JOptionPane.ERROR_MESSAGE, "src/iconos/warning.png");
        }
    }

    private void borrarCampos() {
        txtCliente.setText("");
        rbClienteTemporal.setSelected(false);
        rbClienteTemporal.setEnabled(true);
        txtCliente.setEnabled(true);
        borraDatos();
        tbProductos.removeAll();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbClienteTemporal;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
