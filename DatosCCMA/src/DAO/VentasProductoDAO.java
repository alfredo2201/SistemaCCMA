/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.VentaProducto;
import Exceptions.DAOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Isai Perez
 */
public class VentasProductoDAO extends BaseDAO<VentaProducto> {

    @Override
    public void insertar(VentaProducto entidad) throws Exception {
        VentaProducto ventaProducto = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String insertarSLQ;
            insertarSLQ = String.format(
                    "INSERT INTO ventaproductos(idProducto, IdVenta, cantidad, precioUnitario) "
                    + "VALUES('%d','%d','%s','%s')",
                    ventaProducto.getProducto().getIdProducto(),
                    ventaProducto.getVenta().getIdVenta(),
                    ventaProducto.getCantidad(),
                    ventaProducto.getPrecioVenta());
            comando.executeUpdate(insertarSLQ);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(VentaProducto entidad) throws DAOException {
        if (entidad.getIdProductoVenta() == null) {
            throw new DAOException("ID de la venta producto no encontrado");
        }
        VentaProducto ventaProducto = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String actualizarSQL;
            actualizarSQL = String.format("UPDATE ventaproductos "
                    + "SET idProducto='%s', IdVenta='%s',cantidad='%s',precioUnitario='%s'"
                    + "WHERE id = '%d' ",
                    ventaProducto.getProducto().getIdProducto(),
                    ventaProducto.getVenta().getIdVenta(),
                    ventaProducto.getCantidad(),
                    ventaProducto.getPrecioVenta(),
                    ventaProducto.getIdProductoVenta());
            int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
            if (conteoRegistrosAfectados == 1) {
                System.out.println("Se ha actualizado la venta producto");
            } else {
                throw new Exception("No existe la venta producto");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public VentaProducto consultarById(Long id) throws DAOException {
        if (id == null) {
            throw new DAOException("ID de la venta producto no encontrado");
        }
        VentaProducto ventaProducto = new VentaProducto();
        try {
            ProductosDAO prod = new ProductosDAO();
            VentasDAO vent = new VentasDAO();
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT idProducto, IdVenta, cantidad, precioUnitario FROM ventaproductos WHERE id=%d",
                    id);
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            if (resultadoConsulta.next()) {
                ventaProducto.setProducto(prod.consultarById(resultadoConsulta.getLong("idProducto")));
                ventaProducto.setVenta(vent.consultarById(resultadoConsulta.getLong("IdVenta")));
                ventaProducto.setCantidad(resultadoConsulta.getInt("cantidad"));
                ventaProducto.setPrecioVenta(resultadoConsulta.getFloat("precioUnitario"));
            }

            return ventaProducto;
        } catch (DAOException | SQLException e) {
            System.err.println(e.getMessage());
            return ventaProducto;
        }
    }

    @Override
    public void eliminar(Long id) throws DAOException {
        try {
            int conteoRegistroAfectados;
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String eliminarSQL;
                eliminarSQL = String.format("DELETE FROM ventaproductos WHERE id=%d",
                        id);
                conteoRegistroAfectados = comando.executeUpdate(eliminarSQL);
            }
            if (conteoRegistroAfectados == 0) {
                throw new Exception("No se encontró la venta producto con el ID ingresado");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<VentaProducto> consultar() throws DAOException {
        ArrayList<VentaProducto> listaVentaProducto = new ArrayList<>();
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            ProductosDAO prod = new ProductosDAO();
            VentasDAO vent = new VentasDAO();
            String consultarSQL;
            consultarSQL = String.format("SELECT id, nombre, apellidos, RFC, correo, telefono FROM clientes");
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            while (resultadoConsulta.next()) {
                VentaProducto ventaProducto = new VentaProducto();
                ventaProducto.setIdProductoVenta(resultadoConsulta.getInt("idVentaProductos"));
                ventaProducto.setProducto(prod.consultarById(resultadoConsulta.getLong("idProducto")));
                ventaProducto.setVenta(vent.consultarById(resultadoConsulta.getLong("IdVenta")));
                ventaProducto.setCantidad(resultadoConsulta.getInt("cantidad"));
                ventaProducto.setPrecioVenta(resultadoConsulta.getFloat("precioUnitario"));
                listaVentaProducto.add(ventaProducto);
            }

            return listaVentaProducto;
        } catch (DAOException | SQLException e) {
            System.err.println(e.getMessage());
            return listaVentaProducto;
        }
    }

    public VentaProducto consultarByIdVenta(Long id) throws DAOException {
        if (id == null) {
            throw new DAOException("ID de la venta no encontrado");
        }
        VentaProducto ventaProducto = new VentaProducto();
        try {
            ProductosDAO prod = new ProductosDAO();
            VentasDAO vent = new VentasDAO();
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT idProducto, IdVenta, cantidad, precioUnitario FROM ventaproductos WHERE IdVenta=%d",
                    id);
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            if (resultadoConsulta.next()) {
                ventaProducto.setProducto(prod.consultarById(resultadoConsulta.getLong("idProducto")));
                ventaProducto.setVenta(vent.consultarById(resultadoConsulta.getLong("IdVenta")));
                ventaProducto.setCantidad(resultadoConsulta.getInt("cantidad"));
                ventaProducto.setPrecioVenta(resultadoConsulta.getFloat("precioUnitario"));
            }

            return ventaProducto;
        } catch (DAOException | SQLException e) {
            System.err.println(e.getMessage());
            return ventaProducto;
        }
    }

}
