/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarVentas;

import Control.ControlProducto;
import Dominio.Producto;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class PnAgregarProducto extends javax.swing.JPanel {

    private ControlProducto negocios = new ControlProducto();

    public PnAgregarProducto() {
        initComponents();
        txtNombreCliente.setEditable(false);
        mostrarArticulos();
        DefaultListModel<String> modelo = new DefaultListModel<>();
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

        setBackground(new java.awt.Color(255, 255, 255));

        lblTextoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoCliente.setText("Cliente:");

        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNombreCliente.setBorder(null);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        lblTextoTipo.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoTipo.setText("Tipo:");

        cmbTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        lblTextoMarca.setText("Marca:");

        cmbMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nissan", "Ford", "Toyota", "Kia" }));
        cmbMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTextoModelo.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoModelo.setText("Modelo:");

        cmbModelos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbModelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Altima", "Sentra", "Versa", "Tsuru" }));
        cmbModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTextoAnios.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoAnios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoAnios.setText("Año:");

        cmbAnios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbAnios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1990", "2001", "2010" }));
        cmbAnios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbAnios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAniosActionPerformed(evt);
            }
        });

        listArticulos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        listArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listArticulos);

        btnBuscarProducto.setBackground(new java.awt.Color(204, 204, 0));
        btnBuscarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnContinuarVenta.setBackground(new java.awt.Color(153, 153, 0));
        btnContinuarVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        lblTextoProductoSelec.setText("Productos seleccionados:");

        btnAgregarProducto.setBackground(new java.awt.Color(153, 153, 0));
        btnAgregarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.setBorder(null);
        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarProducto.setFocusPainted(false);
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        listProductosSeleccionados.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(listProductosSeleccionados);

        btnEliminarProducto.setBackground(new java.awt.Color(153, 153, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        btnMostrarProductos.setText("Mostrar Todo");
        btnMostrarProductos.setBorder(null);
        btnMostrarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMostrarProductos.setFocusPainted(false);
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(cmbAnios, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblTextoCliente)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lblTextoProductoSelec)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextoProductoSelec)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addGap(13, 13, 13)
                        .addComponent(cmbAnios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnContinuarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
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
        // TODO add your handling code here:
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
    private javax.swing.JLabel lblTextoMarca;
    private javax.swing.JLabel lblTextoModelo;
    private javax.swing.JLabel lblTextoProductoSelec;
    private javax.swing.JLabel lblTextoTipo;
    private javax.swing.JList<String> listArticulos;
    private javax.swing.JList<String> listProductosSeleccionados;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables

    private void buscarArituclo() {
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

        if (conjunto == 0) {
            JOptionPane.showConfirmDialog(null, "Por favor seleccióne al menos un parametro de busqueda", "ERROR", JOptionPane.OK_OPTION);
            return;
        } else if (conjunto == 1) {
            if (tipo!=null) {
                ArrayList<Producto> productos = negocios.consultarProductoByTipo(tipo);
                if (productos != null) {
                    DefaultListModel<String> modelo = new DefaultListModel<>();
                    for (Producto producto : productos) {
                        modelo.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                    }
                    listArticulos.setModel(modelo);
                } else {
                    JOptionPane.showConfirmDialog(null, "No se encontró ningun producto", "ERROR", JOptionPane.OK_OPTION);
                }
            } else if (marca!=null) {
                ArrayList<Producto> productos = negocios.consultarProductoByMarca(marca);
                if (productos != null) {
                    System.out.println(productos);
                    DefaultListModel<String> modelo = new DefaultListModel<>();
                    for (Producto producto : productos) {
                        modelo.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                    }
                    listArticulos.setModel(modelo);
                } else {
                    JOptionPane.showConfirmDialog(null, "No se encontró ningun producto", "ERROR", JOptionPane.OK_OPTION);
                }
            } else if (model!=null) {
                ArrayList<Producto> productos = negocios.consultarProductoByModelo(model);
                System.out.println(productos);
                if (productos != null) {
                    System.out.println("encuentra el producto por model");
                    DefaultListModel<String> modelo = new DefaultListModel<>();
                    for (Producto producto : productos) {
                        modelo.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                    }
                    listArticulos.setModel(modelo);
                } else {
                    JOptionPane.showConfirmDialog(null, "No se encontró ningun producto", "ERROR", JOptionPane.OK_OPTION);
                }
            } else if (anio!=null) {
                int anioActualizado = Integer.parseInt(anio);
                ArrayList<Producto> productos = negocios.consultarProductoByAnio(anioActualizado);
                if (productos != null) {
                    DefaultListModel<String> modelo = new DefaultListModel<>();
                    for (Producto producto : productos) {
                        modelo.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                    }
                    listArticulos.setModel(modelo);
                } else {
                    JOptionPane.showConfirmDialog(null, "No se encontró ningun producto", "ERROR", JOptionPane.OK_OPTION);
                }
            }
        } else {
            int anioActualizado = Integer.parseInt(anio);
            ArrayList<Producto> productos = negocios.consultarProductoCompleto(tipo,marca,model,anioActualizado);
            if (productos != null) {
                DefaultListModel<String> modelo = new DefaultListModel<>();
                for (Producto producto : productos) {
                    modelo.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
                }
                listArticulos.setModel(modelo);
            } else {
                JOptionPane.showConfirmDialog(null, "No se encontró ningun producto", "ERROR", JOptionPane.OK_OPTION);
            }
        }
    }

    private void eliminarProducto() {
        int productoSeleccionado = 0;
        try {
            productoSeleccionado = listProductosSeleccionados.getSelectedIndex();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Por favor seleccióne uno o mas articulos", "ERROR", JOptionPane.OK_OPTION);
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

            JOptionPane.showConfirmDialog(null, "Por favor seleccióne uno o mas articulos", "ERROR", JOptionPane.OK_OPTION);
        }
        DefaultListModel<String> listaProductosSeleccionados = (DefaultListModel<String>) listProductosSeleccionados.getModel();
        Object[] productosEnLista = listaProductosSeleccionados.toArray();
        ArrayList<Producto> productos = new ArrayList<Producto>();
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
            DefaultListModel<String> modelo = new DefaultListModel<>();
            for (Producto product : productos) {
                modelo.addElement(product.getIdProducto() + "-" + product.toString().trim());
            }
            listProductosSeleccionados.setModel(modelo);
        }
        listArticulos.clearSelection();
        listProductosSeleccionados.clearSelection();
    }

    private void mostrarArticulos() {
        ArrayList<Producto> productos = negocios.consultarTodo();
        if (productos != null) {
            DefaultListModel<String> modelo = new DefaultListModel<>();
            for (Producto producto : productos) {
                modelo.addElement(producto.getIdProducto() + "-" + producto.toString().trim());
            }
            listArticulos.setModel(modelo);
        } else {
            System.out.println("No sirve");
        }
    }

    private boolean confirmarListaVacia() {
        if (listProductosSeleccionados.getComponentCount() == 0) {
            System.out.println("ta con datos");
            return true;
        } else {
            System.out.println("trai datos");
            return false;
        }
    }
}
