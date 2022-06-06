/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarProducto;

//import DAO.ClienteDAO;
import Control.Control;
import Dominio.Producto;
import Fachada.FabricaNegocios;
import Fachada.INegocios;
import PanelesGlobales.PnContenido;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alberto Hernandez
 */
public final class FrmBuscarProducto extends javax.swing.JFrame {

    private final PnContenido contenido = PnContenido.getInstance();
    private final PnConsultarProducto consultar = new PnConsultarProducto();
    private final INegocios negocios = FabricaNegocios.getInstance();
    private ArrayList<Producto> cLista;
    private final DefaultTableModel dtm;

    /**
     * Creates new form IBuscarCliente
     */
    public FrmBuscarProducto() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.dtm = (DefaultTableModel) clienteTable.getModel();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        cLista = new ArrayList<>();
        buscarProducto();
        setIconImage(getIconImage());
    }

    @Override
    public Image getIconImage() {
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
        pnListaClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(232, 228, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Producto");

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

        pnListaClientes.setBackground(new java.awt.Color(255, 255, 255));

        clienteTable.setBackground(new java.awt.Color(255, 255, 255));
        clienteTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, null, null));
        clienteTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clienteTable.setForeground(new java.awt.Color(0, 0, 0));
        clienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Marca", "Modelo", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clienteTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clienteTable.setRowHeight(24);
        clienteTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(clienteTable);

        javax.swing.GroupLayout pnListaClientesLayout = new javax.swing.GroupLayout(pnListaClientes);
        pnListaClientes.setLayout(pnListaClientesLayout);
        pnListaClientesLayout.setHorizontalGroup(
            pnListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        pnListaClientesLayout.setVerticalGroup(
            pnListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        btnContinuar.setBackground(new java.awt.Color(232, 228, 60));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pnListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JTable clienteTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnListaClientes;
    // End of variables declaration//GEN-END:variables

    public void buscarProducto() {
        // Borra todos los rows
        dtm.setRowCount(0);
        cLista = negocios.consultarTodoProducto();
        cLista.forEach(pr -> {
            dtm.addRow(new Object[]{pr.getTipo(), pr.getMarca(),
                pr.getModelo(), pr.getAnio()});
        });
    }

    private void continuar() {
        Control ctl = new Control();
        int i = clienteTable.getSelectedRow();
        Producto aux = null;
        if (i >= 0) {
            int id = cLista.get(i).getIdProducto();
            aux = negocios.consultarProductoById(id);
            consultar.setProducto(aux);
            ctl.muestraPantalla(contenido, consultar);
            consultar.cargarProducto();
            dispose();
        } else {
            ctl.muestraMsj("Seleccione un producto para continuar.",
                    "Producto no seleccionado", JOptionPane.ERROR_MESSAGE,
                    "src/iconos/warning.png");
        }
    }

}
