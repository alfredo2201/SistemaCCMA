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
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isai Perez
 */
public class FachadaDatos implements IDatos{
    private ClienteDAO clienteDao;
    private EmpleadosDAO empleadoDao;
    private PresupuestoDAO presupuestoDao;
    private PresupuestoProductosDAO ppDao ;
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
    public void insertarCliente(Cliente cliente) {
        try {
            clienteDao.insertar(cliente);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizaCliente(Cliente cliente) {
        try {
            clienteDao.actualizar(cliente);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Cliente consultarClienteById(Integer id) {
        try {
            return clienteDao.consultarById(id);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Cliente consultarClienteByRFC(String RFC) {
        try {
            return clienteDao.consultarByRFC(RFC);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void eliminarCliente(Integer id) {
        try {
            clienteDao.eliminar(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Cliente> obtenerTodoClientes() {
        try {
            return clienteDao.obtenerTodo();
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Cliente> consultarCliente(String nombreParametro, String nombreEntidad) {
        try {
           return clienteDao.consultar(nombreParametro, nombreEntidad);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void insertarEmpleado(Empleado empleado) {
        try {
            empleadoDao.insertar(empleado);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizaEmpleado(Empleado empleado) {
        try {
            empleadoDao.actualizar(empleado);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Empleado consultarEmpleadoById(Integer id) {
        try {
           return empleadoDao.consultarById(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void eliminarEmpleado(Integer id) {
        try {
            empleadoDao.eliminar(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Empleado> obtenerTodoEmpleado() {
        try {
            return empleadoDao.obtenerTodo();
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }

    @Override
    public void insertarPresupuesto(Presupuesto presupuesto) {
        try {
            presupuestoDao.insertar(presupuesto);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizaPresupuesto(Presupuesto presupuesto) {
        try {
            presupuestoDao.actualizar(presupuesto);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Presupuesto consultarPresupuestoById(Integer id) {
        try {
            return  presupuestoDao.consultarById(id);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }

    @Override
    public void eliminarPresupuesto(Integer id) {
        try {
            presupuestoDao.eliminar(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Presupuesto> obtenerTodoPresupuesto() {
        try {
            return   presupuestoDao.obtenerTodo();
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Presupuesto> consultarPresupuestoByFecha(Date fecha) {
        try {
            return  presupuestoDao.consultarByFecha(fecha);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Presupuesto> consultarByPresupuestoRFCCliente(String RFC) {
        try {
            return   presupuestoDao.consultarByRFC(RFC);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void insertarPresupuestoProducto(PresupuestoProducto pp) {
        try {
            ppDao.insertar(pp);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizaPresupuestoProducto(PresupuestoProducto pp) {
        try {
            ppDao.actualizar(pp);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PresupuestoProducto consultarPresupuestoProductoById(Integer id) {
        try {
            return ppDao.consultarById(id);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void eliminarPresupuestoProducto(Integer id) {
        try {
            ppDao.eliminar(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<PresupuestoProducto> obtenerTodoPresupuestoProducto() {
        try {
            return  ppDao.obtenerTodo();
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public PresupuestoProducto consultarPresupuestoProductoByIdPresupuesto(Integer id) {
        try {
            return  ppDao.consultarByIdPresupuesto(id);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void insertarProducto(Producto producto) {
        try {
            productoDao.insertar(producto);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizaProducto(Producto producto) {
        try {
            productoDao.actualizar(producto);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Producto consultarProductoById(Integer id) {
        try {
            return productoDao.consultarById(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void eliminarProducto(Integer id) {
        try {
            productoDao.eliminar(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Producto> obtenerTodoProducto() {
        try {
            return  productoDao.obtenerTodo();
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Producto> consultarProductoByConjunto(String tipo, String marca, String modelo, int año) {
        try {        
            return  productoDao.consultarConjunto(tipo, marca, modelo, año);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Producto> consultarProductoByTipo(String tipo) {
        try {
            return  productoDao.consultarByTipo(tipo);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Producto> consultarProductoByMarca(String marca) {
        try {
            return  productoDao.consultarByMarca(marca);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Producto> consultarProductoByModelo(String modelo) {
        try {
            return  productoDao.consultarByModelo(modelo);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Producto> consultarProductoByAño(int año) {
        try {
            return  productoDao.consultarByAño(año);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void insertarVenta(Venta venta) {
        try {
            ventasDao.insertar(venta);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizaVenta(Venta venta) {
        try {
            ventasDao.actualizar(venta);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Venta consultarVentaById(Integer id) {
        try {
            return  ventasDao.consultarById(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void eliminarVenta(Integer id) {
        try {
            ventasDao.eliminar(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Venta> obtenerTodoVenta() {
        try {
            return  ventasDao.obtenerTodo();
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Venta> consultarVentaByFecha(Date fecha) {
        try {
            return  ventasDao.consultarByFecha(fecha);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Venta> consultarVentaByRangoFechas(Date inicio, Date fin) {
        try {
            return ventasDao.consultarByRangoFechas(inicio, fin);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void insertarVentaProducto(VentaProducto producto) {
        try {
            vpDao.insertar(producto);
        } catch (Exception ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizaProducto(VentaProducto producto) {
        try {
            vpDao.actualizar(producto);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public VentaProducto consultarVentaProductoById(Integer id) {
        try {
            return  vpDao.consultarById(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void eliminarVentasProducto(Integer id) {
        try {
            vpDao.eliminar(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<VentaProducto> obtenerTodoVentaProducto() {
        try {
            return  vpDao.obtenerTodo();
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public VentaProducto consultarVentaProductoByIdVenta(Integer id) {
        try {
            return vpDao.consultarByIdVenta(id);
        } catch (DAOException ex) {
            Logger.getLogger(FachadaDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        
}
