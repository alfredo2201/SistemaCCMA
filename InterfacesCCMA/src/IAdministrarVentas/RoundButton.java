/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IAdministrarVentas;

/**
 *
 * @author Samuel Medellin
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class RoundButton extends JFrame {

    private static final long serialVersionUID = 34534511L;

    public static void main(String[] args) {
        //       
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Rounded Button Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(150, 150);

        BordeRedondo border = new BordeRedondo(10); // radio = 10

        JButton addBtn = new JButton("X");
        addBtn.setBounds(10,10, 30, 30);
        addBtn.setBorder(border); // radio

        frame.add(addBtn);

        frame.setVisible(true);    

    }

}

class BordeRedondo implements Border {

    private int radio;  

    BordeRedondo(int radius) {
        this.radio = radius;
    }  

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radio+1, this.radio+1, this.radio+2, this.radio);
    }  

    public boolean isBorderOpaque() {
        return true;
    }  

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radio, radio);
    }

  }
