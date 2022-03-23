/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IAdministrarProducto;

import Control.Control;
import Dominio.Producto;
import Fachada.FabricaNegocios;
import Fachada.INegocios;
import PanelesGlobales.PnContenido;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samuel Medellin
 */
public class PnEliminarProducto extends javax.swing.JPanel {

    /**
     * Creates new form EliminarProducto
     */
    private PnContenido pnContenido = PnContenido.getInstance();
    private ArrayList<Producto> pdLista;
    private ArrayList<Producto> pdListaEliminar;
    private INegocios negocios;

    public PnEliminarProducto() {
        initComponents();
        negocios = FabricaNegocios.getInstance();
        pdLista = new ArrayList<>();
        pdListaEliminar = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();
        btnEliminarProduc = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        pnTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbProducto.setBackground(new java.awt.Color(255, 255, 255));
        tbProducto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbProducto.setForeground(new java.awt.Color(0, 0, 0));
        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción", "Tipo", "Marca", "Modelo", "Año", "Precio", "Cantidad", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProducto);

        javax.swing.GroupLayout pnTablaLayout = new javax.swing.GroupLayout(pnTabla);
        pnTabla.setLayout(pnTablaLayout);
        pnTablaLayout.setHorizontalGroup(
            pnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(pnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE))
        );
        pnTablaLayout.setVerticalGroup(
            pnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(pnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
        );

        btnEliminarProduc.setBackground(new java.awt.Color(153, 153, 0));
        btnEliminarProduc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarProduc.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProduc.setText("Eliminar");
        btnEliminarProduc.setBorder(null);
        btnEliminarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProducActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Eliminar producto");

        btnMenu.setBackground(new java.awt.Color(204, 204, 0));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setText("Regresar al menú");
        btnMenu.setBorder(null);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(pnTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(pnTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(btnEliminarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProducActionPerformed
        eliminarProductos();
        cargarProducto();
    }//GEN-LAST:event_btnEliminarProducActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cargarProducto();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        PnMenuProducto pnMnProducto = new PnMenuProducto();
        Control ctl = new Control();
        ctl.muestraPantalla(pnContenido, pnMnProducto);
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarProduc;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnTabla;
    private javax.swing.JTable tbProducto;
    // End of variables declaration//GEN-END:variables
    public void cargarProducto() {
        DefaultTableModel dtm = (DefaultTableModel) tbProducto.getModel();
        Control ctl = new Control();
        limpiarTabla();
        try {
            pdLista = negocios.consultarTodoProducto();
            if (pdLista.isEmpty()) {
                ctl.muestraMsj("No se ha encontrado ningun producto", "Sin producto", JOptionPane.INFORMATION_MESSAGE, "src/iconos/warning.png");
                return;
            }
            pdLista.forEach(pd -> {
                dtm.addRow(new Object[]{pd.getIdProducto(), pd.getDescripcion(),
                    pd.getTipo(), pd.getMarca(), pd.getModelo(), pd.getAnio(), pd.getPrecio(), pd.getDisponible(), false});
            });
        } catch (Exception e) {
            ctl.muestraMsj("No se han podido recuperar los productos.", "Error al buscar productos", JOptionPane.INFORMATION_MESSAGE, "src/iconos/warning.png");
        }
    }

    private void eliminarProductos() {
        DefaultTableModel dtm = (DefaultTableModel) tbProducto.getModel();
        Control ctl = new Control();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            if (((Vector) dtm.getDataVector().elementAt(i)).elementAt(8).equals(true)) {
                pdListaEliminar.add(pdLista.get(i));
            }
        }

        if (pdListaEliminar.isEmpty()) {
            ctl.muestraMsj("No se ha seleccionado ningun producto", "Error de productos", JOptionPane.INFORMATION_MESSAGE, "src/iconos/warning.png");
            return;
        }
        pdListaEliminar.forEach(pd -> {
            try {
                negocios.eliminarProdcuto(pd);
                ctl.muestraMsj("Los productos se eliminaron correctamente", "Productos eliminados", JOptionPane.INFORMATION_MESSAGE, "src/iconos/comprobado.png");
            } catch (Error e) {
                ctl.muestraMsj(("No se ha podido eliminar el producto seleccionado: " + pd.getIdProducto().toString()), "Error al buscar productos", JOptionPane.INFORMATION_MESSAGE, "src/iconos/warning.png");
            }

        });
    }

    private void limpiarTabla() {
        DefaultTableModel temp = (DefaultTableModel) tbProducto.getModel();
        int filas = tbProducto.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }
}
