/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDatos;

import DAO.ClienteDAO;
import DAO.EmpleadosDAO;
import DAO.PresupuestoDAO;
import DAO.PresupuestoProductosDAO;
import DAO.ProductosDAO;
import DAO.VentasDAO;
import DAO.VentasProductoDAO;
import Dominio.Cliente;
import Dominio.Empleado;
import Dominio.Presupuesto;
import Dominio.PresupuestoProducto;
import Dominio.Producto;
import Dominio.Venta;
import Dominio.VentaProducto;
import Exceptions.DAOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Isai Perez
 */
public class FachadaDatos implements IDatos {

    private ClienteDAO clienteDao;
    private EmpleadosDAO empleadoDao;
    private PresupuestoDAO presupuestoDao;
    private PresupuestoProductosDAO ppDao;
    private ProductosDAO productoDao;
    private VentasDAO ventasDao;
    private VentasProductoDAO vpDao;

    public FachadaDatos() {
        this.clienteDao = new ClienteDAO();
        this.empleadoDao = new EmpleadosDAO();
        this.presupuestoDao = new PresupuestoDAO();
        this.ppDao = new PresupuestoProductosDAO();
        this.productoDao = new ProductosDAO();
        this.ventasDao = new VentasDAO();
        this.vpDao = new VentasProductoDAO();
    }

    @Override
    public void insertarCliente(Cliente cliente) throws Exception {

        clienteDao.insertar(cliente);

    }

    @Override
    public void actualizaCliente(Cliente cliente) throws Exception {

        clienteDao.actualizar(cliente);

    }

    @Override
    public Cliente consultarClienteById(Integer id) throws Exception {

        return clienteDao.consultarById(id);

    }

    @Override
    public Cliente consultarClienteByRFC(String RFC) throws Exception {
        return clienteDao.consultarByRFC(RFC);

    }

    @Override
    public void eliminarCliente(Integer id) throws DAOException {

        clienteDao.eliminar(id);

    }

    @Override
    public ArrayList<Cliente> obtenerTodoClientes() throws DAOException {

        return clienteDao.obtenerTodo();

    }

    @Override
    public ArrayList<Cliente> consultarCliente(String nombreParametro, String nombreEntidad) throws DAOException {

        return clienteDao.consultar(nombreParametro, nombreEntidad);

    }

    @Override
    public void insertarEmpleado(Empleado empleado) throws Exception {

        empleadoDao.insertar(empleado);

    }

    @Override
    public void actualizaEmpleado(Empleado empleado) throws DAOException {

        empleadoDao.actualizar(empleado);

    }

    @Override
    public Empleado consultarEmpleadoById(Integer id) throws DAOException {

        return empleadoDao.consultarById(id);

    }

    @Override
    public void eliminarEmpleado(Integer id) throws DAOException {

        empleadoDao.eliminar(id);

    }

    @Override
    public ArrayList<Empleado> obtenerTodoEmpleado() throws DAOException {

        return empleadoDao.obtenerTodo();

    }

    @Override
    public void insertarPresupuesto(Presupuesto presupuesto) throws Exception {

        presupuestoDao.insertar(presupuesto);

    }

    @Override
    public void actualizaPresupuesto(Presupuesto presupuesto) throws Exception {

        presupuestoDao.actualizar(presupuesto);

    }

    @Override
    public Presupuesto consultarPresupuestoById(Integer id) throws Exception {

        return presupuestoDao.consultarById(id);
    }

    @Override
    public void eliminarPresupuesto(Integer id) throws DAOException {

        presupuestoDao.eliminar(id);

    }

    @Override
    public ArrayList<Presupuesto> obtenerTodoPresupuesto() throws DAOException {

        return presupuestoDao.obtenerTodo();

    }

    @Override
    public ArrayList<Presupuesto> consultarPresupuestoByFecha(Date fecha) throws DAOException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = formato.format(fecha);
        System.out.println(time);
        return presupuestoDao.consultarByFecha(time);
    }

    @Override
    public ArrayList<Presupuesto> consultarByPresupuestoRFCCliente(String RFC) throws DAOException {

        return presupuestoDao.consultarByRFC(RFC);

    }

    @Override
    public void insertarPresupuestoProducto(PresupuestoProducto pp) throws Exception {

        ppDao.insertar(pp);

    }

    @Override
    public void actualizaPresupuestoProducto(PresupuestoProducto pp) throws Exception {

        ppDao.actualizar(pp);

    }

    @Override
    public PresupuestoProducto consultarPresupuestoProductoById(Integer id) throws Exception {

        return ppDao.consultarById(id);

    }

    @Override
    public void eliminarPresupuestoProducto(Integer id) throws DAOException {

        ppDao.eliminar(id);
    }

    @Override
    public ArrayList<PresupuestoProducto> obtenerTodoPresupuestoProducto() throws DAOException {

        return ppDao.obtenerTodo();

    }

    @Override
    public PresupuestoProducto consultarPresupuestoProductoByIdPresupuesto(Integer id) throws Exception {

        return ppDao.consultarByIdPresupuesto(id);

    }

    @Override
    public void insertarProducto(Producto producto) throws Exception {

        productoDao.insertar(producto);

    }

    @Override
    public void actualizaProducto(Producto producto) throws DAOException {

        productoDao.actualizar(producto);

    }

    @Override
    public Producto consultarProductoById(Integer id) throws DAOException {

        return productoDao.consultarById(id);

    }

    @Override
    public void eliminarProducto(Integer id) throws DAOException {
        productoDao.eliminar(id);

    }

    @Override
    public ArrayList<Producto> obtenerTodoProducto() throws DAOException {

        return productoDao.obtenerTodo();

    }

    @Override
    public ArrayList<Producto> consultarProductoByConjunto(String tipo, String marca, String modelo, int año) throws DAOException {

        return productoDao.consultarConjunto(tipo, marca, modelo, año);

    }

    @Override
    public ArrayList<Producto> consultarProductoByTipo(String tipo) throws DAOException {

        return productoDao.consultarByTipo(tipo);

    }

    @Override
    public ArrayList<Producto> consultarProductoByMarca(String marca) throws DAOException {

        return productoDao.consultarByMarca(marca);

    }

    @Override
    public ArrayList<Producto> consultarProductoByModelo(String modelo) throws DAOException {

        return productoDao.consultarByModelo(modelo);

    }

    @Override
    public ArrayList<Producto> consultarProductoByAño(int año) throws DAOException {

        return productoDao.consultarByAño(año);

    }

    @Override
    public void insertarVenta(Venta venta) throws Exception {

        ventasDao.insertar(venta);
    }

    @Override
    public void actualizaVenta(Venta venta) throws Exception {

        ventasDao.actualizar(venta);

    }

    @Override
    public Venta consultarVentaById(Integer id) throws DAOException {

        return ventasDao.consultarById(id);

    }

    @Override
    public void eliminarVenta(Integer id) throws DAOException {

        ventasDao.eliminar(id);

    }

    @Override
    public ArrayList<Venta> obtenerTodoVenta() throws DAOException {

        return ventasDao.obtenerTodo();

    }

    @Override
    public ArrayList<Venta> consultarVentaByFecha(Date fecha) throws DAOException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = formato.format(fecha);
        System.out.println(time);
        return ventasDao.consultarByFecha(time);

    }

    @Override
    public ArrayList<Venta> consultarVentaByRangoFechas(Date inicio, Date fin) throws DAOException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String inicioS = formato.format(inicio);
        String finS = formato.format(fin);        
        return ventasDao.consultarByRangoFechas(inicioS,finS);

    }

    @Override
    public void insertarVentaProducto(VentaProducto producto) throws Exception {

        vpDao.insertar(producto);

    }

    @Override
    public void actualizaProducto(VentaProducto producto) throws DAOException {

        vpDao.actualizar(producto);

    }

    @Override
    public VentaProducto consultarVentaProductoById(Integer id) throws DAOException {

        return vpDao.consultarById(id);

    }

    @Override
    public void eliminarVentasProducto(Integer id) throws DAOException {

        vpDao.eliminar(id);

    }

    @Override
    public ArrayList<VentaProducto> obtenerTodoVentaProducto() throws DAOException {

        return vpDao.obtenerTodo();

    }

    @Override
    public ArrayList<VentaProducto> consultarVentaProductoByIdVenta(Integer id) throws DAOException {

        return vpDao.consultarByIdVenta(id);

    }

    @Override
    public Empleado consultarByCredenciales(String user, String password) throws DAOException {
        return empleadoDao.consultarByCredenciales(user, password);
    }

}
