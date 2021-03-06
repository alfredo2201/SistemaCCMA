/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IGenerarReportes;

import Dominio.Venta;
import Fachada.INegocios;
import PanelesGlobales.PnContenido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Medellin
 */
public class PnGenerarReporte extends javax.swing.JPanel {

    /**
     * Creates new form GenerarReporte
     */
    private PnContenido contenido = PnContenido.getInstance();
    private PnReporteGenerado reporte = new PnReporteGenerado();
    private INegocios negocios = Fachada.FabricaNegocios.getInstance();

    public PnGenerarReporte() {
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

        btnGenReporte = new javax.swing.JButton();
        txtCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dcFechaInicio = new com.toedter.calendar.JDateChooser();
        dcFechaFin = new com.toedter.calendar.JDateChooser();
        rbMesAnterior = new javax.swing.JRadioButton();
        rbMedioMes = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnGenReporte.setBackground(new java.awt.Color(153, 153, 0));
        btnGenReporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenReporte.setForeground(new java.awt.Color(0, 0, 0));
        btnGenReporte.setText("Generar reporte");
        btnGenReporte.setBorder(null);
        btnGenReporte.setBorderPainted(false);
        btnGenReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenReporteActionPerformed(evt);
            }
        });

        txtCancelar.setBackground(new java.awt.Color(153, 153, 153));
        txtCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCancelar.setForeground(new java.awt.Color(0, 0, 0));
        txtCancelar.setText("Cancelar");
        txtCancelar.setBorder(null);
        txtCancelar.setBorderPainted(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha Inicio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha fin:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Genear Reporte");

        dcFechaInicio.setBackground(new java.awt.Color(255, 255, 255));

        dcFechaFin.setBackground(new java.awt.Color(255, 255, 255));

        rbMesAnterior.setBackground(new java.awt.Color(255, 255, 255));
        rbMesAnterior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMesAnterior.setForeground(new java.awt.Color(0, 0, 0));
        rbMesAnterior.setText("1 Mes");
        rbMesAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMesAnteriorActionPerformed(evt);
            }
        });

        rbMedioMes.setBackground(new java.awt.Color(255, 255, 255));
        rbMedioMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMedioMes.setForeground(new java.awt.Color(0, 0, 0));
        rbMedioMes.setText("15 D??as");
        rbMedioMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMedioMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(rbMedioMes)
                        .addGap(26, 26, 26)
                        .addComponent(rbMesAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(239, 239, 239))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(dcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMesAnterior)
                    .addComponent(rbMedioMes))
                .addGap(34, 34, 34)
                .addComponent(btnGenReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenReporteActionPerformed
        generarReporte();
    }//GEN-LAST:event_btnGenReporteActionPerformed

    private void rbMesAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMesAnteriorActionPerformed
        reportesMesAnterior();
    }//GEN-LAST:event_rbMesAnteriorActionPerformed

    private void rbMedioMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMedioMesActionPerformed
        reportesMedioMes();
    }//GEN-LAST:event_rbMedioMesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenReporte;
    private com.toedter.calendar.JDateChooser dcFechaFin;
    private com.toedter.calendar.JDateChooser dcFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbMedioMes;
    private javax.swing.JRadioButton rbMesAnterior;
    private javax.swing.JButton txtCancelar;
    // End of variables declaration//GEN-END:variables

    public void generarReporte() {
        ArrayList<Venta> ventas = null;

        if (!dcFechaInicio.isEnabled() || !dcFechaFin.isEnabled()) {
            boolean medioMes = rbMedioMes.isSelected();
            boolean mesAnterior = rbMesAnterior.isSelected();
            if (medioMes) {
                ventas = negocios.consultarVentasByDias(15);
            } else if (mesAnterior) {
                ventas = negocios.consultarVentasByDias(30);
            }
        } else {
            Date fechaI = dcFechaInicio.getDate();
            Date fechaF = dcFechaFin.getDate();
            ventas = negocios.consultarVentaRangoFechas(fechaI, fechaF);
        }

        System.out.println("vnt" + ventas);

        reporte = new PnReporteGenerado(ventas);
        contenido.removeAll();
        reporte.setVisible(true);
        reporte.setSize(contenido.getSize().width, contenido.getSize().height);
        reporte.setLocation(0, 0);
        contenido.add(reporte);
        contenido.revalidate();
        contenido.repaint();
    }

    public void reportesMesAnterior() {

        if (rbMesAnterior.isSelected()) {
            rbMedioMes.setSelected(false);
            dcFechaInicio.setEnabled(false);
            dcFechaFin.setEnabled(false);
        } else {
            dcFechaInicio.setEnabled(true);
            dcFechaFin.setEnabled(true);
        }
    }

    public void reportesMedioMes() {
        if (rbMedioMes.isSelected()) {
            rbMesAnterior.setSelected(false);
            dcFechaInicio.setEnabled(false);
            dcFechaFin.setEnabled(false);
        } else {
            dcFechaInicio.setEnabled(true);
            dcFechaFin.setEnabled(true);
        }
    }

}
