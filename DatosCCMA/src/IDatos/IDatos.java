/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDatos;

import Dominio.Cliente;
import Dominio.Empleado;
import Dominio.Presupuesto;
import Dominio.PresupuestoProducto;
import Dominio.Producto;
import Dominio.Venta;
import Dominio.VentaProducto;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Isai Perez
 */
public interface IDatos {

    public void insertarCliente(Cliente cliente);

    public void actualizaCliente(Cliente cliente);

    public Cliente consultarClienteById(Integer id);

    public Cliente consultarClienteByRFC(String RFC);

    public void eliminarCliente(Integer id);

    public ArrayList<Cliente> obtenerTodoClientes();

    public ArrayList<Cliente> consultarCliente(String nombreParametro, String nombreEntidad);

    public void insertarEmpleado(Empleado empleado);

    public void actualizaEmpleado(Empleado empleado);

    public Empleado consultarEmpleadoById(Integer id);

    public void eliminarEmpleado(Integer id);

    public ArrayList<Empleado> obtenerTodoEmpleado();

    public void insertarPresupuesto(Presupuesto presupuesto);

    public void actualizaPresupuesto(Presupuesto presupuesto);

    public Presupuesto consultarPresupuestoById(Integer id);

    public void eliminarPresupuesto(Integer id);

    public ArrayList<Presupuesto> obtenerTodoPresupuesto();

    public ArrayList<Presupuesto> consultarPresupuestoByFecha(Date fecha);

    public ArrayList<Presupuesto> consultarByPresupuestoRFCCliente(String RFC);

    public void insertarPresupuestoProducto(PresupuestoProducto pp);

    public void actualizaPresupuestoProducto(PresupuestoProducto pp);

    public PresupuestoProducto consultarPresupuestoProductoById(Integer id);

    public void eliminarPresupuestoProducto(Integer id);

    public ArrayList<PresupuestoProducto> obtenerTodoPresupuestoProducto();

    public PresupuestoProducto consultarPresupuestoProductoByIdPresupuesto(Integer id);

    public void insertarProducto(Producto producto);

    public void actualizaProducto(Producto producto);

    public Producto consultarProductoById(Integer id);

    public void eliminarProducto(Integer id);

    public ArrayList<Producto> obtenerTodoProducto();

    public ArrayList<Producto> consultarProductoByConjunto(String tipo, String marca, String modelo, int año);

    public ArrayList<Producto> consultarProductoByTipo(String tipo);

    public ArrayList<Producto> consultarProductoByMarca(String marca);

    public ArrayList<Producto> consultarProductoByModelo(String modelo);

    public ArrayList<Producto> consultarProductoByAño(int año);

    public void insertarVenta(Venta venta);

    public void actualizaVenta(Venta venta);

    public Venta consultarVentaById(Integer id);

    public void eliminarVenta(Integer id);

    public ArrayList<Venta> obtenerTodoVenta();

    public ArrayList<Venta> consultarVentaByFecha(Date fecha);

    public ArrayList<Venta> consultarVentaByRangoFechas(Date inicio, Date fin);

    public void insertarVentaProducto(VentaProducto producto);

    public void actualizaProducto(VentaProducto producto);

    public VentaProducto consultarVentaProductoById(Integer id);

    public void eliminarVentasProducto(Integer id);

    public ArrayList<VentaProducto> obtenerTodoVentaProducto();

    public VentaProducto consultarVentaProductoByIdVenta(Integer id);

}
