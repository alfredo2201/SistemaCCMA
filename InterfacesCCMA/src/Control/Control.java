/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author crist
 */
public class Control {    
    public void muestraPantalla(JPanel contenido, JPanel lienzo) {
        contenido.removeAll();
        lienzo.setVisible(true);
        lienzo.setSize(contenido.getSize().width, contenido.getSize().height);
        lienzo.setLocation(0, 0);
        contenido.add(lienzo);
        contenido.revalidate();
        contenido.repaint();
    }

    public void muestraMsj(String mensaje, String titulo, int tipo, String urlImagen) {                        
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo, new ImageIcon(urlImagen));
    }
}
