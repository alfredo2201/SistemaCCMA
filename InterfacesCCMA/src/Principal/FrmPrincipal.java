/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Control.Control;
import Dominio.Empleado;
import PanelesGlobales.PnContenido;
import PanelesGlobales.PnMenu;
import java.awt.Dimension;
import java.time.LocalDate;
import javax.swing.JFrame;

/**
 *
 * @author Isai Perez
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    private PnMenu pnMenu = new PnMenu();
    private PnContenido pnContenido = PnContenido.getInstance();
    private static FrmPrincipal instance = null;
    private Empleado empleado;

    private FrmPrincipal() {
        initComponents();        
        iniciarPantalla();          
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
        lblIcono = new javax.swing.JLabel();
        lblFotoUsuario = new javax.swing.JLabel();
        lblHoraTexto = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblTextoVentas = new javax.swing.JLabel();
        lblTextoUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblVentasEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        pnTop.setBackground(new java.awt.Color(232, 228, 60));
        pnTop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblIcono.setBackground(new java.awt.Color(0, 51, 204));
        lblIcono.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblIcono.setForeground(new java.awt.Color(255, 255, 255));
        lblIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Logo.png"))); // NOI18N

        lblFotoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblFotoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblFotoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblFotoUsuario.setText("Foto Usuario");

        lblHoraTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoraTexto.setForeground(new java.awt.Color(0, 0, 0));
        lblHoraTexto.setText("Fecha:");

        lblHora.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 0));
        lblHora.setText("set hora");

        lblTextoVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoVentas.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoVentas.setText("Ventas:");

        lblTextoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblTextoUsuario.setText("Usuario:");

        lblNombreUsuario.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreUsuario.setText("Nombre Usuario");

        lblVentasEstado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblVentasEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblVentasEstado.setText("En linea");

        javax.swing.GroupLayout pnTopLayout = new javax.swing.GroupLayout(pnTop);
        pnTop.setLayout(pnTopLayout);
        pnTopLayout.setHorizontalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblIcono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1179, Short.MAX_VALUE)
                .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoraTexto)
                    .addComponent(lblHora)
                    .addGroup(pnTopLayout.createSequentialGroup()
                        .addComponent(lblTextoVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVentasEstado))
                    .addGroup(pnTopLayout.createSequentialGroup()
                        .addComponent(lblTextoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreUsuario)))
                .addGap(31, 31, 31)
                .addComponent(lblFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        pnTopLayout.setVerticalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTopLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnTopLayout.createSequentialGroup()
                        .addComponent(lblHoraTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoVentas)
                            .addComponent(lblVentasEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoUsuario)
                            .addComponent(lblNombreUsuario))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 918, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFotoUsuario;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHoraTexto;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblTextoUsuario;
    private javax.swing.JLabel lblTextoVentas;
    private javax.swing.JLabel lblVentasEstado;
    private javax.swing.JPanel pnTop;
    // End of variables declaration//GEN-END:variables
  
    public static FrmPrincipal getInstance() {
        if (instance == null) {
            instance = new FrmPrincipal();
        }
        return instance;
    }

    public void cerrar() {
        dispose();
    }

    private void iniciarPantalla() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension screenSize = new Dimension(getSize().width, getSize().width);
        Control ctl = new Control();
        this.getSize(screenSize);
        setLocationRelativeTo(null);        
        pnMenu.setVisible(true);
        pnMenu.setLocation(0, 143);
        int h = screenSize.height;
        int w = screenSize.width;
        pnMenu.setSize(321, h - 143);
        pnContenido.setVisible(true);
        pnContenido.setLocation(320, 143);
        pnContenido.setSize(w - 321, h - 143);
        this.setTitle("Sismema de Punto de Venta");
        this.add(pnMenu);
        this.add(pnContenido);               
        LocalDate fecha = LocalDate.now();
        lblHora.setText(fecha.toString());
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
        cargarEmpleado();
    }
    
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    private void cargarEmpleado(){
        lblNombreUsuario.setText(this.empleado.getNombre());
    }
    
}
