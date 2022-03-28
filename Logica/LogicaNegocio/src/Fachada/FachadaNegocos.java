/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Control.ControlCliente;
import Control.ControlProducto;
import Control.ControlVenta;
import ControlEmpleado.ControlEmpleado;
import Dominio.Cliente;
import Dominio.Empleado;
import Dominio.Producto;
import Dominio.Venta;
import Dominio.VentaProducto;
import java.util.ArrayList;

/**
 *
 * @author Isai Perez
 */
public class FachadaNegocos implements INegocios {

    private ControlEmpleado ctlEmpleado = new ControlEmpleado();
    private ControlCliente ctlCliente = new ControlCliente();
    private ControlProducto ctlProducto = new ControlProducto();
    private ControlVenta ctlVenta = new ControlVenta();

    @Override
    public void registrarClienteNuevo(Cliente cliente) {
        ctlCliente.agregarCliente(cliente);
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
            ctlCliente.actualizarCliente(cliente);

        }
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        if (cliente.getId_cliente() != null && cliente.getId_cliente() > 0) {
            ctlCliente.eliminarCliente(cliente.getId_cliente());
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
    public Cliente consultarClienteByRFC(String RFC) {
        if (!RFC.isEmpty()) {
            return ctlCliente.consultarClienteByRFC(RFC);
        }
        return null;
    }

    @Override
    public void registrarProductoNuevo(Producto producto) {
        if (producto != null) {
            ctlProducto.agregar(producto);
        }
    }

    @Override
    public Producto consultarProducto(Producto producto) {
        if (producto != null) {
            return null;
        }
        return null;
    }

    @Override
    public ArrayList<Producto> consultarTodoProducto() {
        return ctlProducto.consultarTodo();
    }

    @Override
    public void actualizarProducto(Producto prodcuto) {
        if (prodcuto != null) {
            ctlProducto.actualizar(prodcuto);
        }
    }

    @Override
    public void eliminarProdcuto(Producto producto) {
        if (producto != null) {
            ctlProducto.eliminar(producto.getIdProducto());
        }
    }

    @Override
    public ArrayList<Producto> consultarPersonalizadoProducto(String tipo, String marca, String modelo, int anio) {
        return ctlProducto.consultarProductoCompleto(tipo, marca, modelo, anio);
    }

    @Override
    public Producto consultarProductoById(int id) {
        return ctlProducto.consultarProductoById(id);
    }

    @Override
    public void registrarVenta(Venta venta, ArrayList<VentaProducto> listaProductos) {
        if (venta != null & listaProductos != null) {
            ctlVenta.agregar(venta, listaProductos);
        }
    }

    @Override
    public void eliminarVenta(Venta venta) {
        if (venta.getIdVenta() != null) {
            ctlVenta.eliminar(venta.getIdVenta());
        }
    }

    @Override
    public ArrayList<Venta> consultarVenta(int dias) {
        return ctlVenta.consultaVentaPeriodoDeterminado(dias);
    }

    @Override
    public ArrayList<Venta> consultarVentas() {
        return ctlVenta.consultarTodo();
    }

}
