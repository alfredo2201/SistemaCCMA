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
import Exceptions.DAOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Isai Perez
 */
public interface IDatos {

    public void insertarCliente(Cliente cliente)throws Exception;

    public void actualizaCliente(Cliente cliente)throws Exception;

    public Cliente consultarClienteById(Integer id)throws Exception;

    public Cliente consultarClienteByRFC(String RFC)throws Exception;

    public void eliminarCliente(Integer id)throws Exception;

    public ArrayList<Cliente> obtenerTodoClientes()throws Exception;

    public ArrayList<Cliente> consultarCliente(String nombreParametro, String nombreEntidad)throws Exception;

    public void insertarEmpleado(Empleado empleado)throws Exception;

    public void actualizaEmpleado(Empleado empleado)throws Exception;

    public Empleado consultarEmpleadoById(Integer id)throws Exception;

    public void eliminarEmpleado(Integer id)throws Exception;

    public ArrayList<Empleado> obtenerTodoEmpleado()throws Exception;
    
    public Empleado consultarByCredenciales(String user, String password) throws DAOException ;

    public void insertarPresupuesto(Presupuesto presupuesto)throws Exception;

    public void actualizaPresupuesto(Presupuesto presupuesto)throws Exception;

    public Presupuesto consultarPresupuestoById(Integer id)throws Exception;

    public void eliminarPresupuesto(Integer id)throws Exception;

    public ArrayList<Presupuesto> obtenerTodoPresupuesto()throws Exception;

    public ArrayList<Presupuesto> consultarPresupuestoByFecha(Date fecha)throws Exception;

    public ArrayList<Presupuesto> consultarByPresupuestoRFCCliente(String RFC)throws Exception;

    public void insertarPresupuestoProducto(PresupuestoProducto pp)throws Exception;

    public void actualizaPresupuestoProducto(PresupuestoProducto pp)throws Exception;

    public PresupuestoProducto consultarPresupuestoProductoById(Integer id)throws Exception;

    public void eliminarPresupuestoProducto(Integer id)throws Exception;

    public ArrayList<PresupuestoProducto> obtenerTodoPresupuestoProducto()throws Exception;

    public PresupuestoProducto consultarPresupuestoProductoByIdPresupuesto(Integer id)throws Exception;

    public void insertarProducto(Producto producto)throws Exception;

    public void actualizaProducto(Producto producto)throws Exception;

    public Producto consultarProductoById(Integer id)throws Exception;

    public void eliminarProducto(Integer id)throws Exception;

    public ArrayList<Producto> obtenerTodoProducto()throws Exception;

    public ArrayList<Producto> consultarProductoByConjunto(String tipo, String marca, String modelo, int año)throws Exception;

    public ArrayList<Producto> consultarProductoByTipo(String tipo)throws Exception;

    public ArrayList<Producto> consultarProductoByMarca(String marca)throws Exception;

    public ArrayList<Producto> consultarProductoByModelo(String modelo)throws Exception;

    public ArrayList<Producto> consultarProductoByAño(int año)throws Exception;

    public void insertarVenta(Venta venta)throws Exception;

    public void actualizaVenta(Venta venta)throws Exception;

    public Venta consultarVentaById(Integer id)throws Exception;

    public void eliminarVenta(Integer id)throws Exception;

    public ArrayList<Venta> obtenerTodoVenta()throws Exception;

    public ArrayList<Venta> consultarVentaByFecha(Date fecha)throws Exception;

    public ArrayList<Venta> consultarVentaByRangoFechas(Date inicio, Date fin)throws Exception;

    public void insertarVentaProducto(VentaProducto producto)throws Exception;

    public void actualizaProducto(VentaProducto producto)throws Exception;

    public VentaProducto consultarVentaProductoById(Integer id)throws Exception;

    public void eliminarVentasProducto(Integer id)throws Exception;

    public ArrayList<VentaProducto> obtenerTodoVentaProducto()throws Exception;

    public ArrayList<VentaProducto> consultarVentaProductoByIdVenta(Integer id)throws Exception;

}
