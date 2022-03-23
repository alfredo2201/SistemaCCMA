/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Dominio.*;
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

    public void registrarProductoNuevo(Producto producto);

    public Producto consultarProducto(Producto producto);

    public ArrayList<Producto> consultarTodoProducto();

    public void actualizarProducto(Producto prodcuto);

    public void eliminarProdcuto(Producto producto);
    
    public ArrayList<Producto>consultarPersonalizadoProducto(String tipo, String marca,String modelo, int anio);
    
    public Producto consultarProductoById(int id);

}
