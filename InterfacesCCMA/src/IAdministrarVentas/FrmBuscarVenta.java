/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAdministrarVentas;

import PanelesGlobales.PnContenido;

/**
 *
 * @author crist
 */
public class FrmBuscarVenta extends javax.swing.JFrame {

    /**
     * Creates new form FrmBuscarVenta
     */
    private PnConsultarVenta pnConsultar = new PnConsultarVenta();
    private PnEliminarVenta pnEliminar = new PnEliminarVenta();
    private PnContenido contenido = PnContenido.getInstance();
    private int tipoPantalla;
    private static int CONSULTAR = 0;
    private static int ELIMINAR = 1;

    public FrmBuscarVenta() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTop = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnContent = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbMedioMes = new javax.swing.JRadioButton();
        rbMesAnterior = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        dpInicio = new com.toedter.calendar.JDateChooser();
        dpFin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnTop.setBackground(new java.awt.Color(232, 228, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel7.setText("Buscar venta");

        javax.swing.GroupLayout pnTopLayout = new javax.swing.GroupLayout(pnTop);
        pnTop.setLayout(pnTopLayout);
        pnTopLayout.setHorizontalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        pnTopLayout.setVerticalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnContent.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Fecha Inicio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Fecha Fin:");

        rbMedioMes.setBackground(new java.awt.Color(255, 255, 255));
        rbMedioMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMedioMes.setText("15 Días");
        rbMedioMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMedioMesActionPerformed(evt);
            }
        });

        rbMesAnterior.setBackground(new java.awt.Color(255, 255, 255));
        rbMesAnterior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMesAnterior.setText("1 Mes");
        rbMesAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesAnteriorActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(232, 228, 60));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        dpInicio.setBackground(new java.awt.Color(255, 255, 255));
        dpInicio.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        dpFin.setBackground(new java.awt.Color(255, 255, 255));
        dpFin.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel9))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dpInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(dpFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbMesAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbMedioMes))))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(rbMedioMes))
                    .addComponent(dpInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbMesAnterior)
                    .addComponent(dpFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMedioMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMedioMesActionPerformed
        buscarVentaMedioMes();
    }//GEN-LAST:event_rbMedioMesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarVenta();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbMesAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesAnteriorActionPerformed
        buscarVentaMesAnterior();
    }//GEN-LAST:event_rbMesAnteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private com.toedter.calendar.JDateChooser dpFin;
    private com.toedter.calendar.JDateChooser dpInicio;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnTop;
    private javax.swing.JRadioButton rbMedioMes;
    private javax.swing.JRadioButton rbMesAnterior;
    // End of variables declaration//GEN-END:variables

    public int getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(int tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public void buscarVentaMedioMes() {

        if (rbMedioMes.isSelected()) {
            rbMesAnterior.setSelected(false);
            dpInicio.setEnabled(false);
            dpFin.setEnabled(false);
        } else {
            dpInicio.setEnabled(true);
            dpFin.setEnabled(true);
        }
    }

    public void buscarVentaMesAnterior() {

        if (rbMesAnterior.isSelected()) {
            rbMedioMes.setSelected(false);
            dpInicio.setEnabled(false);
            dpFin.setEnabled(false);
        } else {
            dpInicio.setEnabled(true);
            dpFin.setEnabled(true);
        }
    }

    public void buscarVenta() {

        if (getTipoPantalla() == CONSULTAR) {
            contenido.removeAll();
            pnConsultar.setSize(contenido.getSize().width,
                    contenido.getSize().height);
            pnConsultar.setLocation(0, -40);
            contenido.add(pnConsultar);
            contenido.revalidate();
            contenido.repaint();
            dispose();
        } else if (getTipoPantalla() == ELIMINAR) {
            contenido.removeAll();
            pnEliminar.setSize(contenido.getSize().width,
                    contenido.getSize().height);
            pnEliminar.setLocation(0, -40);
            contenido.add(pnEliminar);
            contenido.revalidate();
            contenido.repaint();
            dispose();
        }
    }

}
