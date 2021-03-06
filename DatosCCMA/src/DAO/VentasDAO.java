/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.TipoPago;
import Dominio.Venta;
import Exceptions.DAOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Isai Perez
 */
public class VentasDAO extends BaseDAO<Venta> {

    /**
     * Método para agregar una nueva entidad a la base de datos de CCMA
     * @param entidad
     * @throws Exception 
     */
    @Override
    public void insertar(Venta entidad) throws Exception {
        Venta venta = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String insertarSLQ;
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = formato.format(venta.getFecha());
            insertarSLQ = String.format(
                    "INSERT INTO ventas(idCliente, fecha ,servicio, subtotal, total, metodoPago, idUsuario)"
                    + "VALUES('%s','%s','%s','%s','%s','%s','%s')",
                    venta.getCliente().getId_cliente(),
                    time,
                    venta.getServicio(),
                    venta.getSubtotal(),
                    venta.getTotal(),
                    venta.getPago(),
                    venta.getEmpleado().getIdUsuario());
            comando.executeUpdate(insertarSLQ);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Método que actualiza una venta, con los nuevos valores dados por el parametro
     * @param entidad
     * @throws DAOException
     * @throws Exception 
     */
    @Override
    public void actualizar(Venta entidad) throws DAOException, Exception {
        if (entidad.getIdVenta() == null) {
            throw new Exception("ID de la venta no encontrado");
        }
        Venta venta = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String actualizarSQL;
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = formato.format(venta.getFecha());
            actualizarSQL = String.format("UPDATE ventas "
                    + "SET idCliente='%s', fecha='%s',servicio ='%s', subtotal='%s',total='%s',idUsuario='%s', metodoPago = '%s' "
                    + "WHERE id = '%d' ",
                    venta.getCliente().getId_cliente(),
                    time,
                    venta.getServicio(),
                    venta.getSubtotal(),
                    venta.getTotal(),
                    venta.getEmpleado().getIdUsuario(),
                    venta.getPago(),
                    venta.getIdVenta());
            int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
            if (conteoRegistrosAfectados == 1) {
                System.out.println("Se ha actualizado la venta");
            } else {
                throw new Exception("No existe la venta");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Método que consula una venta por su identificador unico.
     * @param id
     * @return Venta si la encuentra.
     * @throws DAOException 
     */
    @Override
    public Venta consultarById(Integer id) throws DAOException {
        if (id == null) {
            throw new DAOException("ID de la venta no encontrado");
        }
        Venta venta = new Venta();
        try {
            ClienteDAO clt = new ClienteDAO();
            EmpleadosDAO empl = new EmpleadosDAO();
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT idventa, idCliente, fecha,servicio, subtotal, total, metodoPago, idUsuario "
                    + "FROM ventas WHERE idventa='%d'",
                    id);
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            if (resultadoConsulta.next()) {
                venta.setIdVenta(resultadoConsulta.getInt("idventa"));
                venta.setCliente(clt.consultarById(resultadoConsulta.getInt("idCliente")));
                venta.setFecha(resultadoConsulta.getTimestamp("fecha"));
                venta.setServicio(resultadoConsulta.getFloat("servicio"));
                venta.setSubtotal(resultadoConsulta.getFloat("subtotal"));
                String i = resultadoConsulta.getString("metodoPago");
                if (i.equalsIgnoreCase("EFECTIVO")) {
                    venta.setPago(TipoPago.EFECTIVO);
                } else {
                    venta.setPago(TipoPago.TARJETA);
                }
                venta.setEmpleado(empl.consultarById(resultadoConsulta.getInt("idUsuario")));
                venta.setTotal(resultadoConsulta.getFloat("total"));
            }
            return venta;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return venta;
        }
    }

    /**
     * Método que elimina una venta dada por el identificador especificado por el 
     * parametro Id
     * @param id
     * @throws DAOException 
     */
    @Override
    public void eliminar(Integer id) throws DAOException {
        try {
            int conteoRegistroAfectados;
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String eliminarSQL;
                eliminarSQL = String.format("DELETE FROM ventas WHERE idventa=%d",
                        id);
                conteoRegistroAfectados = comando.executeUpdate(eliminarSQL);
            }
            if (conteoRegistroAfectados == 0) {
                throw new Exception("No se encontró la venta con el ID ingresado");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * Método que regresa todas las ventas de la base de datos.
     * @return
     * @throws DAOException 
     */
    @Override
    public ArrayList<Venta> obtenerTodo() throws DAOException {
        ArrayList<Venta> listaVentas = new ArrayList<>();
        try {
            ClienteDAO clt = new ClienteDAO();
            EmpleadosDAO empl = new EmpleadosDAO();
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT * FROM ventas");
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            while (resultadoConsulta.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(resultadoConsulta.getInt("idventa"));
                venta.setCliente(clt.consultarById(resultadoConsulta.getInt("idCliente")));
                venta.setFecha(resultadoConsulta.getTimestamp("fecha"));
                venta.setServicio(resultadoConsulta.getFloat("servicio"));
                venta.setSubtotal(resultadoConsulta.getFloat("subtotal"));
                venta.setTotal(resultadoConsulta.getFloat("total"));
                String i = resultadoConsulta.getString("metodoPago");
                if (i.equalsIgnoreCase("EFECTIVO")) {
                    venta.setPago(TipoPago.EFECTIVO);
                } else {
                    venta.setPago(TipoPago.TARJETA);
                }
                venta.setEmpleado(empl.consultarById(resultadoConsulta.getInt("idUsuario")));

                listaVentas.add(venta);
            }

            return listaVentas;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return listaVentas;
        }
    }
    /**
     * Método que regresa una venta especificando una fecha en particular
     * @param fecha
     * @return
     * @throws DAOException 
     */
    public ArrayList<Venta> consultarByFecha(String fecha) throws DAOException {
        if (fecha == null) {
            throw new DAOException("fecha de la venta no encontrado");
        }
        ArrayList<Venta> ventas = new ArrayList<>();
        try {
            ClienteDAO clt = new ClienteDAO();
            EmpleadosDAO empl = new EmpleadosDAO();
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT idventa, idCliente, fecha, servicio, subtotal, total, metodoPago, idUsuario FROM ventas WHERE fecha='%s'",
                    fecha);
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            while (resultadoConsulta.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(resultadoConsulta.getInt("idventa"));
                venta.setCliente(clt.consultarById(resultadoConsulta.getInt("idCliente")));
                venta.setFecha(resultadoConsulta.getTimestamp("fecha"));
                venta.setServicio(resultadoConsulta.getFloat("servicio"));
                venta.setSubtotal(resultadoConsulta.getFloat("subtotal"));
                venta.setTotal(resultadoConsulta.getFloat("total"));
                String i = resultadoConsulta.getString("metodoPago");
                if (i.equalsIgnoreCase("EFECTIVO")) {
                    venta.setPago(TipoPago.EFECTIVO);
                } else {
                    venta.setPago(TipoPago.TARJETA);
                }
                venta.setEmpleado(empl.consultarById(resultadoConsulta.getInt("idUsuario")));
                ventas.add(venta);
            }
            return ventas;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return ventas;
        }
    }
    /**
     * Método que regresa una lista de ventas mediante un rango de fechas
     * 
     * @param inicio
     * @param fin
     * @return
     * @throws DAOException 
     */
    public ArrayList<Venta> consultarByRangoFechas(String inicio, String fin) throws DAOException {
        if (inicio == null || fin == null) {
            throw new DAOException("fecha de la venta no encontrado");
        }
        ArrayList<Venta> listaVentas = new ArrayList<>();
        try {
            ClienteDAO clt = new ClienteDAO();
            EmpleadosDAO empl = new EmpleadosDAO();
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT idventa, idCliente, fecha,servicio, subtotal, total, metodoPago, idUsuario "
                    + "FROM ventas WHERE fecha BETWEEN '%s' AND '%s'",
                    inicio, fin);
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            while (resultadoConsulta.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(resultadoConsulta.getInt("idventa"));
                venta.setCliente(clt.consultarById(resultadoConsulta.getInt("idCliente")));
                venta.setFecha(resultadoConsulta.getTimestamp("fecha"));
                venta.setServicio(resultadoConsulta.getFloat("servicio"));
                venta.setSubtotal(resultadoConsulta.getFloat("subtotal"));
                venta.setTotal(resultadoConsulta.getFloat("total"));
                String i = resultadoConsulta.getString("metodoPago");
                if (i.equalsIgnoreCase("EFECTIVO")) {
                    venta.setPago(TipoPago.EFECTIVO);
                } else {
                    venta.setPago(TipoPago.TARJETA);
                }
                venta.setEmpleado(empl.consultarById(resultadoConsulta.getInt("idUsuario")));
                listaVentas.add(venta);
            }
            return listaVentas;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return listaVentas;
        }
    }

}
