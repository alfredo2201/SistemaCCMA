/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Dominio.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Isai Perez
 */
public interface INegocios {
    public void registrarClienteNuevo(Cliente cliente);
    public Cliente consultarCliente(Cliente cliente);
    public ArrayList<Cliente>obtenerClientes();   
    public void actualizarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
    
}
