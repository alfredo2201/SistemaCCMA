/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Control.ControlCliente;
import ControlEmpleado.ControlEmpleado;
import Dominio.Cliente;
import Dominio.Empleado;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Isai Perez
 */
public class FachadaNegocos implements INegocios {

    private ControlEmpleado ctlEmpleado = new ControlEmpleado();
    private ControlCliente ctlCliente = new ControlCliente();

    @Override
    public void registrarClienteNuevo(Cliente cliente) {
        String mensaje = ctlCliente.agregarCliente(cliente);
        if (mensaje.contains("Error")) {
            muestraMsj(mensaje, "Mensaje de error", JOptionPane.ERROR_MESSAGE, "src/iconos/warning.png");
        } else {
            muestraMsj(mensaje, "Cliente nuevo", JOptionPane.OK_OPTION, "src/iconos/comprobado.png");
        }
    }

    @Override
    public ArrayList<Cliente> consultarClienteNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            return ctlCliente.consultarClienteByNombre(nombre);
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> consultarCliente(String campo, String parametro) {
        return ctlCliente.consultarClientePersonalizado(parametro, campo);
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return ctlCliente.consultaTodoCliente();
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        if (cliente.getId_cliente() != null && cliente.getId_cliente() > 0) {
            String mensaje = ctlCliente.actualizarCliente(cliente);
            if (mensaje.contains("Error")) {
                muestraMsj(mensaje, "Mensaje de error", JOptionPane.ERROR_MESSAGE, "src/iconos/warning.png");
            } else {
                muestraMsj(mensaje, "Cliente Actualizado", JOptionPane.OK_OPTION, "src/iconos/comprobado.png");
            }
        }
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        if (cliente.getId_cliente() != null && cliente.getId_cliente() > 0) {
            String mensaje = ctlCliente.eliminarCliente(cliente.getId_cliente());
            if (mensaje.contains("Error")) {
                muestraMsj(mensaje, "Mensaje de error", JOptionPane.ERROR_MESSAGE, "src/iconos/warning.png");
            } else {
                muestraMsj(mensaje, "Cliente Actualizado", JOptionPane.OK_OPTION, "src/iconos/comprobado.png");
            }
        }
    }

    @Override
    public Empleado obtenEmpleado(String username, String password) {
        if (!username.isEmpty() || !password.isEmpty()) {
            return ctlEmpleado.obtenEmpleado(username, password);
        }
        return null;
    }

    @Override
    public void muestraMsj(String mensaje, String titulo, int tipo, String urlImagen) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo, new ImageIcon(urlImagen));
    }

    @Override
    public Cliente consultarClienteByRFC(String RFC) {
        if (!RFC.isEmpty()) {
            return ctlCliente.consultarClienteByRFC(RFC);
        }
        return null;
    }

}
