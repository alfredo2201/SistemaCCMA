/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Presupuesto;
import Dominio.PresupuestoProducto;
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
public class PresupuestoProductosDAO extends BaseDAO<PresupuestoProducto> {

    @Override
    public void insertar(PresupuestoProducto entidad) throws Exception {
        PresupuestoProducto inventario = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String insertarSLQ;
            insertarSLQ = String.format(
                    "INSERT INTO inventarioproducto(idPresupuesto, idProducto, cantidad,precioUnitario) "
                    + "VALUES('%d','%d')",
                    inventario.getPresupuesto().getIdPresupuesto(),
                    inventario.getProducto().getIdProducto(),
                    inventario.getCantidad(),
                    inventario.getPrecioUnitario()
            );
            comando.executeUpdate(insertarSLQ);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(PresupuestoProducto entidad) throws DAOException, Exception {
        if (entidad.getIdPresupuestoProducto() == null) {
            throw new DAOException("Id del presupuestoProducto no encontrado");
        }

        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String actualizarSQL;
                actualizarSQL = String.format("UPDATE presupuestoproductos"
                        + "SET idPresupuesto='%d',idProducto='%d',cantidad='%d',precioUnitario='%d' "
                        + "WHERE idPP='%d'",
                        entidad.getPresupuesto().getIdPresupuesto(),
                        entidad.getProducto().getIdProducto(),
                        entidad.getCantidad(),
                        entidad.getPrecioUnitario(),
                        entidad.getIdPresupuestoProducto());
                int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
                if (conteoRegistrosAfectados == 1) {
                    System.out.println("Se ha actualizado al presupusetoProducto");
                } else {
                    throw new DAOException("No existe el presupuestoProducto");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public PresupuestoProducto consultarById(Long id) throws DAOException, Exception {
        if (id == null) {
            throw new DAOException("ID del empleado no encontrado");
        }
        PresupuestoDAO presupuestoDAO = new PresupuestoDAO();
        ProductosDAO productoDAO = new ProductosDAO();
        PresupuestoProducto pp = new PresupuestoProducto();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultarSQL;
                consultarSQL = String.format("SELECT idPP, idPresupuesto, idProducto, cantidad, precioUnitario,"
                        + "FROM presupuestoproductos "
                        + "WHERE idPP=%d",
                        id);
                ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
                if (resultadoConsulta.next()) {
                    Presupuesto presupuesto = null;
                    Producto producto = null;
                    pp.setIdPresupuestoProducto(resultadoConsulta.getInt("idPP"));
                    Long idPresupuesto = resultadoConsulta.getLong("idPresupuesto");
                    Long idProducto = resultadoConsulta.getLong("idProducto");
                    if (idPresupuesto > 0) {
                        presupuesto = presupuestoDAO.consultarById(idPresupuesto);
                    }
                    if (idProducto > 0) {
                        producto = productoDAO.consultarById(idProducto);
                    }
                    pp.setPresupuesto(presupuesto);
                    pp.setProducto(producto);
                    pp.setCantidad(resultadoConsulta.getInt("cantidad"));
                    pp.setPrecioUnitario(resultadoConsulta.getFloat("precioUnitario"));
                }
            }
            return pp;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return pp;
        }
    }

    @Override
    public void eliminar(Long id) throws DAOException {
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String eliminarSQL;
                eliminarSQL = String.format("DELETE FROM presupuestoproductos WHERE idPP='%d'", id);
                int conteoRegistroAfectados = comando.executeUpdate(eliminarSQL);
                if (conteoRegistroAfectados == 0) {
                    throw new Exception("No se encontró el empleado con el ID ingresado");
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<PresupuestoProducto> consultar() throws DAOException {
        ArrayList<PresupuestoProducto> listaPresupuesto = new ArrayList<>();
        PresupuestoDAO presupuestoDAO = new PresupuestoDAO();
        ProductosDAO productoDAO = new ProductosDAO();        
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultarSQL;
                consultarSQL = String.format("SELECT idPP, idPresupuesto, idProducto, cantidad, precioUnitario,"
                        + "FROM presupuestoproductos ");
                ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
                while (resultadoConsulta.next()) {
                    PresupuestoProducto pp = new PresupuestoProducto();
                    Presupuesto presupuesto = null;
                    Producto producto = null;
                    pp.setIdPresupuestoProducto(resultadoConsulta.getInt("idPP"));
                    Long idPresupuesto = resultadoConsulta.getLong("idPresupuesto");
                    Long idProducto = resultadoConsulta.getLong("idProducto");
                    if (idPresupuesto > 0) {
                        presupuesto = presupuestoDAO.consultarById(idPresupuesto);
                    }
                    if (idProducto > 0) {
                        producto = productoDAO.consultarById(idProducto);
                    }
                    pp.setPresupuesto(presupuesto);
                    pp.setProducto(producto);
                    pp.setCantidad(resultadoConsulta.getInt("cantidad"));
                    pp.setPrecioUnitario(resultadoConsulta.getFloat("precioUnitario"));
                    listaPresupuesto.add(pp);
                }
            }
            return listaPresupuesto;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaPresupuesto;
        }
    }

}
