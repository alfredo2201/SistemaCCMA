/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.InventarioProducto;
import Dominio.Producto;
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
public class InventarioProductoDAO extends BaseDAO<InventarioProducto> {

    @Override
    public void insertar(InventarioProducto entidad) throws Exception {
        InventarioProducto inventario = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String insertarSLQ;
            insertarSLQ = String.format(
                    "INSERT INTO inventarioproducto(idProducto, disponible) "
                    + "VALUES('%d','%d')",
                    inventario.getProducto().getIdProducto(),
                    inventario.getDisponible());
            comando.executeUpdate(insertarSLQ);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(InventarioProducto entidad) throws DAOException {
        if (entidad.getIdInventarioProducto() == null) {
            throw new DAOException("ID de inventario no encontrado");
        }
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String actualizarSQL;
                actualizarSQL = String.format("UPDATE inventarioproducto "
                        + "SET idProducto='%d', disponible='%d'"
                        + "WHERE idInventarioProducto='%d'",
                        entidad.getProducto().getIdProducto(),
                        entidad.getDisponible(),
                        entidad.getIdInventarioProducto());
                int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
                if (conteoRegistrosAfectados == 1) {
                    System.out.println("Se ha actualizado el inventario");
                } else {
                    throw new Exception("No existe el inventario");
                }
            }
        }  catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public InventarioProducto consultarById(Long id) throws DAOException {
        if (id == null) {
            throw new DAOException("ID del inventario no encontrado");
        }
        InventarioProducto ip = new InventarioProducto();
        ProductosDAO productoDAO = new ProductosDAO();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultarSQL;
                consultarSQL = String.format("SELECT idInventarioProducto, idProducto, dispobible "
                        + "FROM inventarioproducto "
                        + "WHERE idInventarioProducto ='%d'", 
                        id);
                ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
                if (resultadoConsulta.next()) {
                    ip.setIdInventarioProducto(resultadoConsulta.getInt("idInventarioProducto"));
                    long valor = resultadoConsulta.getLong("idProducto");
                    if (valor > 0) {
                        Producto producto = productoDAO.consultarById(valor);
                        ip.setProducto(producto);
                    }
                    ip.setDisponible(resultadoConsulta.getInt("disponible"));
                }
                return ip;
            }
        } catch (DAOException | SQLException e) {
            System.err.println(e.getMessage());
            return ip;
        }
    }

    @Override
    public void eliminar(Long id) throws DAOException {
        try {
            int conteoRegistroAfectados;
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String eliminarSQL;
                eliminarSQL = String.format("DELETE FROM inventarioproducto WHERE idInvantarioProducto='%d'",
                        id);
            conteoRegistroAfectados = comando.executeUpdate(eliminarSQL);
            }
            if (conteoRegistroAfectados == 0) {
                throw new Exception("No se encontró el cliente con el ID ingresado");
            }
        } catch (Exception e) {
             System.err.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<InventarioProducto> consultar() throws DAOException {
        ArrayList<InventarioProducto> listaInventario = new ArrayList<>();
        ProductosDAO productoDAO = new ProductosDAO();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultarSQL;
                consultarSQL = String.format("SELECT idInventarioProducto, idProducto,disponible");
                ResultSet resultadoConsulta=comando.executeQuery(consultarSQL);
                while(resultadoConsulta.next()){
                    InventarioProducto inventario = new InventarioProducto();
                    inventario.setIdInventarioProducto(resultadoConsulta.getInt("idInventarioProducto"));
                    long valor = resultadoConsulta.getLong("idProducto");
                    if (valor > 0) {
                        Producto producto = productoDAO.consultarById(valor);
                        inventario.setProducto(producto);
                    }
                    inventario.setDisponible(resultadoConsulta.getInt("disponible"));
                    listaInventario.add(inventario);
                }
                return listaInventario;
            }
        } catch (DAOException | SQLException e) {
            System.err.println(e.getMessage());
            return listaInventario;
        }
    }

}
