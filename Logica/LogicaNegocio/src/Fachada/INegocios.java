/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Dominio.Cliente;
import Dominio.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Isai Perez
 */
public interface INegocios {

    public Empleado obtenEmpleado(String username, String password);

    public void registrarClienteNuevo(Cliente cliente);

    public ArrayList<Cliente> consultarClienteNombre(String nombre);
    
    public Cliente consultarClienteByRFC(String RFC);

    public ArrayList<Cliente> obtenerClientes();

    public void actualizarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);
    
    public ArrayList<Cliente> consultarCliente(String campo, String parametro);

    public void muestraMsj(String mensaje, String titulo, int tipo, String urlImagen);
        

}
