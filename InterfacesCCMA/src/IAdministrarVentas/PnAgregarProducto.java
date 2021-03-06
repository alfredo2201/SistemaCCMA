/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarVentas;

import Control.Control;
import Control.ControlProducto;
import Dominio.Producto;
import PanelesGlobales.PnContenido;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class PnAgregarProducto extends javax.swing.JPanel {

    private final ControlProducto negocios = new ControlProducto();
    private final PnContenido pnContenido = PnContenido.getInstance();
    public DefaultListModel<String> modelo;
    public static ArrayList<Producto> auxProducts;

    public PnAgregarProducto() {
        initComponents();
        txtNombreCliente.setEditable(false);
        mostrarArticulos();
        modelo = new DefaultListModel<>();
        listProductosSeleccionados.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTextoCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblTextoTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        lblTextoMarca = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        lblTextoModelo = new javax.swing.JLabel();
        cmbModelos = new javax.swing.JComboBox<>();
        lblTextoAnios = new javax.swing.JLabel();
        cmbAnios = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listArticulos = new javax.swing.JList<>();
        btnBuscarProducto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnContinuarVenta = new javax.swing.JButton();
        lblTextoProductoSelec = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listProductosSeleccionados = new javax.swing.JList<>();
        btnEliminarProducto = new javax.swing.JButton();
        btnMostrarProductos = new javax.swing.JButton();
        lblTextoListaProductos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTextoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoCliente.setText("Cliente:");

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNombreCliente.setBorder(null);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        lblTextoTipo.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoTipo.setText("Tipo:");

        cmbTipo.setBackground(new java.awt.Color(204, 204, 204));
        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Freno de mano", "Clutch", "Acelerador", "" }));
        cmbTipo.setToolTipText("");
        cmbTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        lblTextoMarca.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoMarca.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoMarca.setText("Marca:");

        cmbMarca.setBackground(new java.awt.Color(204, 204, 204));
        cmbMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbMarca.setForeground(new java.awt.Color(0, 0, 0));
        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nissan", "Ford", "Toyota", "Kia" }));
        cmbMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTextoModelo.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoModelo.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoModelo.setText("Modelo:");

        cmbModelos.setBackground(new java.awt.Color(204, 204, 204));
        cmbModelos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbModelos.setForeground(new java.awt.Color(0, 0, 0));
        cmbModelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Altima", "Sentra", "Versa", "Tsuru" }));
        cmbModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTextoAnios.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoAnios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoAnios.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoAnios.setText("A??o:");

        cmbAnios.setBackground(new java.awt.Color(204, 204, 204));
        cmbAnios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbAnios.setForeground(new java.awt.Color(0, 0, 0));
        cmbAnios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        cmbAnios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbAnios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAniosActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        listArticulos.setBackground(new java.awt.Color(255, 255, 255));
        listArticulos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        listArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listArticulos.setSelectionBackground(new java.awt.Color(204, 204, 0));
        listArticulos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        listArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listArticulos);

        btnBuscarProducto.setBackground(new java.awt.Color(204, 204, 0));
        btnBuscarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.setBorder(null);
        btnBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarProducto.setFocusPainted(false);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnContinuarVenta.setBackground(new java.awt.Color(232, 228, 60));
        btnContinuarVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnContinuarVenta.setForeground(new java.awt.Color(0, 0, 0));
        btnContinuarVenta.setText("Continuar Venta");
        btnContinuarVenta.setBorder(null);
        btnContinuarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuarVenta.setFocusPainted(false);
        btnContinuarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarVentaActionPerformed(evt);
            }
        });

        lblTextoProductoSelec.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoProductoSelec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoProductoSelec.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoProductoSelec.setText("Productos seleccionados:");

        btnAgregarProducto.setBackground(new java.awt.Color(140, 240, 4));
        btnAgregarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.setBorder(null);
        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarProducto.setFocusPainted(false);
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        listProductosSeleccionados.setBackground(new java.awt.Color(255, 255, 255));
        listProductosSeleccionados.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        listProductosSeleccionados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listProductosSeleccionados.setSelectionBackground(new java.awt.Color(204, 204, 0));
        listProductosSeleccionados.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(listProductosSeleccionados);

        btnEliminarProducto.setBackground(new java.awt.Color(204, 102, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.setBorder(null);
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarProducto.setFocusPainted(false);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnMostrarProductos.setBackground(new java.awt.Color(204, 204, 0));
        btnMostrarProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMostrarProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrarProductos.setText("Mostrar Todo");
        btnMostrarProductos.setBorder(null);
        btnMostrarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrarProductos.setFocusPainted(false);
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });

        lblTextoListaProductos.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoListaProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoListaProductos.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoListaProductos.setText("Lista de Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTextoTipo)
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTextoMarca)
                            .addComponent(lblTextoModelo)
                            .addComponent(cmbModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTextoAnios)
                            .addComponent(cmbAnios, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTextoCliente)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                            .addComponent(lblTextoListaProductos))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTextoProductoSelec))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addGap(62, 62, 62))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnContinuarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoCliente)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextoProductoSelec)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(lblTextoTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTextoMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTextoModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTextoAnios)
                .addGap(12, 12, 12)
                .addComponent(cmbAnios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblTextoListaProductos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void cmbAniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAniosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAniosActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        buscarArituclo();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnContinuarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarVentaActionPerformed
        continuarVenta();
    }//GEN-LAST:event_btnContinuarVentaActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void listArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listArticulosMouseClicked

    }//GEN-LAST:event_listArticulosMouseClicked

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        eliminarProducto();
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
        mostrarArticulos();
    }//GEN-LAST:event_btnMostrarProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuarVenta;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnMostrarProductos;
    private javax.swing.JComboBox<String> cmbAnios;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelos;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTextoAnios;
    private javax.swing.JLabel lblTextoCliente;
    private javax.swing.JLabel lblTextoListaProductos;
    private javax.swing.JLabel lblTextoMarca;
    private javax.swing.JLabel lblTextoModelo;
    private javax.swing.JLabel lblTextoProductoSelec;
    private javax.swing.JLabel lblTextoTipo;
    private javax.swing.JList<String> listArticulos;
    private javax.swing.JList<String> listProductosSeleccionados;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables

    public void continuarVenta() {

        RegistrarVenta venta = RegistrarVenta.getInstance();
        Control ctl = new Control();
        ctl.muestraPantalla(pnContenido, venta);
        venta.setPdLista(auxProducts);
        venta.verificarProductosRepetidos(auxProducts);
        venta.mostrarVenta();
    }

    private void buscarArituclo() {
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        String tipo = (String) cmbTipo.getSelectedItem();
        String marca = (String) cmbMarca.getSelectedItem();
        String model = (String) cmbModelos.getSelectedItem();
        String anio = (String) cmbAnios.getSelectedItem();

        System.out.println(tipo);
        System.out.println(marca);
        System.out.println(model);
        System.out.println(anio);

        int conjunto = 0;

        if (tipo.equalsIgnoreCase("seleccione")) {
            tipo = null;
        } else {
            conjunto++;
        }

        if (marca.equalsIgnoreCase("seleccione")) {
            marca = null;
        } else {
            conjunto++;
        }

        if (model.equalsIgnoreCase("seleccione")) {
            model = null;
        } else {
            conjunto++;
        }

        if (anio.equalsIgnoreCase("seleccione")) {
            anio = null;
        } else {
            conjunto++;
        }

        switch (conjunto) {
            case 0:
                JOptionPane.showConfirmDialog(null,
                        "Por favor selecci??ne al menos un parametro de busqueda",
                        "ERROR", JOptionPane.OK_OPTION);
                return;
            case 1:
                if (tipo != null) {
                    ArrayList<Producto> productos = negocios.consultarProductoByTipo(tipo);
                    if (productos != null) {
                        for (Producto producto : productos) {
                            modeloLista.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                        }
                        listArticulos.setModel(modeloLista);
                    } else {
                        JOptionPane.showConfirmDialog(null,
                                "No se encontr?? ningun producto", "ERROR", JOptionPane.OK_OPTION);
                    }
                } else if (marca != null) {
                    ArrayList<Producto> productos = negocios.consultarProductoByMarca(marca);
                    if (productos != null) {
                        System.out.println(productos);

                        for (Producto producto : productos) {
                            modeloLista.addElement(producto.getIdProducto()
                                    + "-" + producto.toString().trim());
                        }
                        listArticulos.setModel(modeloLista);
                    } else {
                        JOptionPane.showConfirmDialog(null,
                                "No se encontr?? ningun producto", "ERROR", JOptionPane.OK_OPTION);
                    }
                } else if (model != null) {
                    ArrayList<Producto> productos = negocios.consultarProductoByModelo(model);
                    System.out.println(productos);
                    if (productos != null) {
                        System.out.println("encuentra el producto por model");

                        for (Producto producto : productos) {
                            modeloLista.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                        }
                        listArticulos.setModel(modeloLista);
                    } else {
                        JOptionPane.showConfirmDialog(null,
                                "No se encontr?? ningun producto", "ERROR", JOptionPane.OK_OPTION);
                    }
                } else if (anio != null) {
                    int anioActualizado = Integer.parseInt(anio);
                    ArrayList<Producto> productos = negocios.consultarProductoByAnio(anioActualizado);
                    if (productos != null) {

                        for (Producto producto : productos) {
                            modeloLista.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                        }
                        listArticulos.setModel(modeloLista);
                    } else {
                        JOptionPane.showConfirmDialog(null,
                                "No se encontr?? ningun producto", "ERROR", JOptionPane.OK_OPTION);
                    }
                }
                break;
            default:
                int anioActualizado = Integer.parseInt(anio);
                ArrayList<Producto> productos = negocios.consultarProductoCompleto(tipo, marca, model, anioActualizado);
                if (productos != null) {

                    for (Producto producto : productos) {
                        modeloLista.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                    }
                    listArticulos.setModel(modeloLista);
                } else {
                    JOptionPane.showConfirmDialog(null,
                            "No se encontr?? ningun producto", "ERROR", JOptionPane.OK_OPTION);
                }
                break;
        }
    }

    private void eliminarProducto() {
        int productoSeleccionado = 0;
        try {
            productoSeleccionado = listProductosSeleccionados.getSelectedIndex();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,
                    "Por favor selecci??ne uno o mas articulos", "ERROR", JOptionPane.OK_OPTION);
        }
        DefaultListModel model = (DefaultListModel) listProductosSeleccionados.getModel();
        model.remove(productoSeleccionado);
        listArticulos.clearSelection();
        listProductosSeleccionados.clearSelection();
    }

    private void agregarProducto() {
        ArrayList<String> listaProductos = null;
        try {
            listaProductos = (ArrayList<String>) listArticulos.getSelectedValuesList();
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null,
                    "Por favor selecci??ne uno o mas articulos", "ERROR", JOptionPane.OK_OPTION);
        }
        DefaultListModel<String> listaProductosSeleccionados = (DefaultListModel<String>) listProductosSeleccionados.getModel();
        Object[] productosEnLista = listaProductosSeleccionados.toArray();
        ArrayList<Producto> productos = new ArrayList<>();
        if (listaProductos != null) {
            if (productosEnLista.length > 0) {
                for (Object prod : productosEnLista) {
                    String id[] = prod.toString().split("-");
                    Producto productoTemp = negocios.consultarProductoById(Integer.parseInt(id[0]));
                    productos.add(productoTemp);
                }
            }
            if (!(productos.isEmpty())) {
                for (String string : listaProductos) {
                    String id[] = string.split("-");
                    Producto productoTemp = negocios.consultarProductoById(Integer.parseInt(id[0]));
                    for (int i = 0; i < productos.size(); i++) {
                        if (!(productos.contains(productoTemp))) {
                            productos.add(productoTemp);
                        }
                    }
                }
            } else {
                for (String string : listaProductos) {
                    String id[] = string.split("-");
                    Producto productoTemp = negocios.consultarProductoById(Integer.parseInt(id[0]));
                    productos.add(productoTemp);
                }
            }
            DefaultListModel<String> auxModel = new DefaultListModel<>();
            for (Producto product : productos) {
                auxModel.addElement(product.getIdProducto() + "-" + product.toString().trim());
            }
            auxProducts = productos;
            listProductosSeleccionados.setModel(auxModel);

        }
        listArticulos.clearSelection();
        listProductosSeleccionados.clearSelection();
    }

    private void mostrarArticulos() {
        ArrayList<Producto> productos = negocios.consultarTodo();
        if (productos != null) {
            DefaultListModel<String> auxModelo = new DefaultListModel<>();
            for (Producto producto : productos) {
                auxModelo.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
            }
            listArticulos.setModel(auxModelo);
        } else {
            System.out.println("No sirve");
        }
    }
}
