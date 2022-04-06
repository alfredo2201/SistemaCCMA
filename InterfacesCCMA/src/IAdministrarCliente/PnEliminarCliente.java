/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarCliente;

//import DAO.ClienteDAO;
//import Dominio.Cliente;
//import Exceptions.DAOException;
import Control.Control;
import Dominio.Cliente;
import Fachada.FabricaNegocios;
import Fachada.INegocios;
import PanelesGlobales.PnContenido;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import java.util.ArrayList;
//import java.util.Vector;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class PnEliminarCliente extends javax.swing.JPanel {

    ArrayList<Cliente> cLIsta;
    ArrayList<Cliente> cLIstaEliminar;
    private INegocios iNegocios;
    private PnContenido pnContenido = PnContenido.getInstance();

    /**
     * Creates new form PnEliminarCliente
     */
    public PnEliminarCliente() {
        initComponents();
        iNegocios = FabricaNegocios.getInstance();
        cargarClienteTabla();
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
        pnTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Eliminar cliente");

        pnTabla.setBackground(new java.awt.Color(255, 255, 255));

        clienteTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        clienteTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Correo electrónico", "Teléfono", "RFC", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clienteTable.setGridColor(new java.awt.Color(232, 228, 60));
        clienteTable.setRowHeight(24);
        clienteTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        clienteTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        clienteTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(clienteTable);

        javax.swing.GroupLayout pnTablaLayout = new javax.swing.GroupLayout(pnTabla);
        pnTabla.setLayout(pnTablaLayout);
        pnTablaLayout.setHorizontalGroup(
            pnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnTablaLayout.setVerticalGroup(
            pnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTablaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        btnEliminar.setBackground(new java.awt.Color(255, 255, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar1.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setBorder(null);
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnMenu.setBackground(new java.awt.Color(153, 153, 0));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pnTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitulo)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarCliente();
        cargarClienteTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        PnMenuClientes pnMnCliente = new PnMenuClientes();
        Control ctl = new Control();
        ctl.muestraPantalla(pnContenido, pnMnCliente);
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JTable clienteTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnTabla;
    // End of variables declaration//GEN-END:variables

    private void cargarClienteTabla() {
        DefaultTableModel dtm = (DefaultTableModel) clienteTable.getModel();
        Control ctl = new Control();
        clienteTable.removeAll();
        cLIsta = iNegocios.obtenerClientes(); // No se pudo obtener
        if (cLIsta.isEmpty()) {
            // No hay carnales
            ctl.muestraMsj("No se ha encontrado ningun cliente", "No se encontro el cliente", JOptionPane.INFORMATION_MESSAGE, "src/iconos/warning.png");
            return;
        }
        cLIsta.forEach(cl -> {
            dtm.addRow(new Object[]{cl.getId_cliente(), cl.getNombre(), cl.getCorreo(), cl.getTelefono(), cl.getRfc(), false});
        });
    }

    private void eliminarCliente() {
        DefaultTableModel dtm = (DefaultTableModel) clienteTable.getModel();
        cLIstaEliminar = new ArrayList<>();
        Control ctl = new Control();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            // TODO: Buscar que otro puede ser vector, ya esta deprecated
            if (((Vector) dtm.getDataVector().elementAt(i)).elementAt(5).equals(true)) {
                cLIstaEliminar.add(cLIsta.get(i));
            }
        }

        if (cLIstaEliminar.isEmpty()) {
            ctl.muestraMsj("No se ha seleccionado ningun cliente",  "No se selecciono ningun cliente", JOptionPane.ERROR_MESSAGE, "src/iconos/warning.png");            
            return;
        }
        cLIstaEliminar.forEach(cl -> {
            iNegocios.eliminarCliente(cl);
        });
        ctl.muestraMsj("Se eliminaron los clientes seleccionados.", "No se elimino el cliente", JOptionPane.INFORMATION_MESSAGE, "src/iconos/comprobado.png");                    
    }

}
