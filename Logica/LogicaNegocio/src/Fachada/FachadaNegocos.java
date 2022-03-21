/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import ControlEmpleado.ControlEmpleado;
import Dominio.Cliente;
import Dominio.Empleado;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Isai Perez
 */
public class FachadaNegocos implements INegocios {

    private ControlEmpleado ctlEmpleado = new ControlEmpleado();

    @Override
    public void registrarClienteNuevo(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente consultarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado obtenEmpleado(String username, String password) {
        if (!username.isEmpty() || !password.isEmpty()) {
            return ctlEmpleado.obtenEmpleado(username, password);    
        }
        return null;
    }

    @Override
    public void muestraMsj(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }

}
