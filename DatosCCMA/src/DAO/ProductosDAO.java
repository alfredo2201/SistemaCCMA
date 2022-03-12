/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class ProductosDAO extends BaseDAO<Producto> {

    @Override
    public void insertar(Producto entidad) throws Exception {
        Producto producto = entidad;
        try (Connection conexion = this.generarConexion()) {
            Statement comando = conexion.createStatement();
            String insertarSLQ;
            insertarSLQ = String.format(
                    "INSERT INTO productos(descripcion, marca, modelo, año, precio) "
                            + "VALUES('%s','%s','%s','%s','%s')",
                    producto.getDescripcion(),
                    producto.getMarca(),
                    producto.getModelo(),
                    producto.getAnio(),
                    producto.getPrecio());
            comando.executeUpdate(insertarSLQ);
        }
    }

    @Override
    public void actualizar(Producto producto) throws DAOException {
        if (producto.getIdProducto() == null) {
            throw new DAOException("Id Producto no encontrado");
        }
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            
            String actualizarSQL;
            actualizarSQL = String.format(
                    "UPDATE productos "
                            + "SET tipo='%s',descripcion='%s', marca='%s',modelo='%s',año='%d',precio='%s' "
                            + "WHERE idProducto='%d'",
                    producto.getTipo(),
                    producto.getDescripcion(),
                    producto.getMarca(),
                    producto.getModelo(),
                    producto.getAnio(),
                    producto.getPrecio(),
                    producto.getIdProducto());
            int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
            if (conteoRegistrosAfectados == 1) {
                System.out.println("Se ha actualizado un producto");
            }else{
                throw new DAOException("No existe el producto");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public Producto consultarById(Long id) throws DAOException {
        if (id == null) {
            throw new DAOException("Id del producto no encontrado");
        }
        Producto producto = new Producto();
        
        try {
            try(Connection conexion = this.generarConexion()){
               Statement comando = conexion.createStatement();
               String consultaSQL;
               consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio FROM productos WHERE idProducto ='%d'",id);
               ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);
                if (resultadoConsulta.next()) {
                    producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                    producto.setTipo(resultadoConsulta.getString("tipo"));
                    producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                    producto.setMarca(resultadoConsulta.getString("marca"));
                    producto.setModelo(resultadoConsulta.getString("modelo"));
                    producto.setAnio(resultadoConsulta.getInt("año"));
                    producto.setPrecio(resultadoConsulta.getFloat("precio"));
                }
            }
            return producto;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return producto;
        }
    }

    @Override
    public void eliminar(Long id) throws DAOException {
        try {
            int conteoRegistroAfectados;
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String eliminarSQL;
                eliminarSQL = String.format("DELETE FROM productos WHERE id=%d",
                        id);
                conteoRegistroAfectados = comando.executeUpdate(eliminarSQL);
            }
            if (conteoRegistroAfectados == 0) {
                throw new Exception("No se encontró el producto con el ID ingresado");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<Producto> consultar() throws DAOException {

        ArrayList<Producto>listaProductos = new ArrayList<>();
               
        try {
            try(Connection conexion = this.generarConexion()){
               Statement comando = conexion.createStatement();
               String consultaSQL;
               consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio FROM productos");
               ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);
                if (resultadoConsulta.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                    producto.setTipo(resultadoConsulta.getString("tipo"));
                    producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                    producto.setMarca(resultadoConsulta.getString("marca"));
                    producto.setModelo(resultadoConsulta.getString("modelo"));
                    producto.setAnio(resultadoConsulta.getInt("año"));
                    producto.setPrecio(resultadoConsulta.getFloat("precio"));
                    listaProductos.add(producto);
                }
            }
            return listaProductos;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaProductos;
        }
    }
    /**
     * Se pueden agregar otro consultar por medio de tipo, marca, modelo, año
     * como si fuera un filtro
     */
}
