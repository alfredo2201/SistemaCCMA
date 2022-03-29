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
                    "INSERT INTO productos(tipo,descripcion, marca, modelo, año, precio, disponible) "
                    + "VALUES('%s','%s','%s','%s','%d','%s','%d')",
                    producto.getTipo(),
                    producto.getDescripcion(),
                    producto.getMarca(),
                    producto.getModelo(),
                    producto.getAnio(),
                    producto.getPrecio(),
                    producto.getDisponible());
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
                    + "SET tipo='%s',descripcion='%s', marca='%s',modelo='%s',año='%d',precio='%s',disponible='%d' "
                    + "WHERE idProducto='%d'",
                    producto.getTipo(),
                    producto.getDescripcion(),
                    producto.getMarca(),
                    producto.getModelo(),
                    producto.getAnio(),
                    producto.getPrecio(),
                    producto.getDisponible(),
                    producto.getIdProducto());
            int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
            if (conteoRegistrosAfectados == 1) {
                System.out.println("Se ha actualizado un producto");
            } else {
                throw new DAOException("No existe el producto");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public Producto consultarById(Integer id) throws DAOException {
        if (id == null) {
            throw new DAOException("Id del producto no encontrado");
        }
        Producto producto = new Producto();

        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultaSQL;
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE idProducto ='%d'", id);
                ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);
                if (resultadoConsulta.next()) {
                    producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                    producto.setTipo(resultadoConsulta.getString("tipo"));
                    producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                    producto.setMarca(resultadoConsulta.getString("marca"));
                    producto.setModelo(resultadoConsulta.getString("modelo"));
                    producto.setAnio(resultadoConsulta.getInt("año"));
                    producto.setPrecio(resultadoConsulta.getFloat("precio"));
                    producto.setDisponible(resultadoConsulta.getInt("disponible"));
                }
            }
            return producto;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return producto;
        }
    }

    @Override
    public void eliminar(Integer id) throws DAOException {
        try {
            int conteoRegistroAfectados;
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String eliminarSQL;
                eliminarSQL = String.format("DELETE FROM productos WHERE idProducto=%d",
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
    public ArrayList<Producto> obtenerTodo() throws DAOException {

        ArrayList<Producto> listaProductos = new ArrayList<>();

        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultaSQL;
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos");
                ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);
                while (resultadoConsulta.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                    producto.setTipo(resultadoConsulta.getString("tipo"));
                    producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                    producto.setMarca(resultadoConsulta.getString("marca"));
                    producto.setModelo(resultadoConsulta.getString("modelo"));
                    producto.setAnio(resultadoConsulta.getInt("año"));
                    producto.setPrecio(resultadoConsulta.getFloat("precio"));
                    producto.setDisponible(resultadoConsulta.getInt("disponible"));
                    listaProductos.add(producto);
                }
            }
            return listaProductos;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaProductos;
        }
    }

    public ArrayList<Producto> consultarConjunto(String tipo, String marca, String modelo, int año) throws DAOException {

        Producto producto = new Producto();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultaSQL = null;
            if (tipo != null && marca != null && (modelo == null || modelo.isEmpty()) && año <= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE tipo ='%s' AND marca ='%s'", tipo, marca);
                //tipo y marca
            } else if (tipo != null && (marca == null || marca.isEmpty()) && modelo != null && año <= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE tipo ='%s' AND modelo ='%s' ", tipo, modelo);
                //tipo y modelo
            } else if (tipo != null && (marca == null || marca.isEmpty()) && (modelo == null || modelo.isEmpty()) && año >= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE tipo ='%s' AND año=='%s' ", tipo, año);
                //tipo y año
            } else if ((tipo == null || tipo.isEmpty()) && marca != null && modelo != null && año <= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE marca ='%s' AND modelo='%s' ", marca, modelo);
                //marca y modelo
            } else if (tipo == null && marca != null && (marca == null || marca.isEmpty()) && año >= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE marca ='%s' AND año='%s' ", marca, año);
                //marca y año
            } else if ((tipo == null || tipo.isEmpty()) && marca == null && modelo != null && año >= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE modelo ='%s' AND año='%s' ", modelo, año);
                //modelo y año
            } else if (tipo != null && marca != null && modelo != null && año <= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE tipo ='%s' AND marca ='%s' AND modelo='%s", tipo, marca, modelo);
                //tipo, marca y modelo
            } else if (tipo != null && (marca == null || marca.isEmpty()) && modelo != null && año >= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE tipo ='%s' AND modelo ='%s' AND año='%s", tipo, modelo, año);
                //tipo, modelo y año
            } else if (tipo != null && marca != null && (modelo == null || modelo.isEmpty()) && año >= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE tipo ='%s' AND marca ='%s' AND año='%s", tipo, marca, año);
                //tipo, marca y año
            } else if ((tipo == null || tipo.isEmpty()) && marca != null && modelo != null && año <= 0) {
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE marca ='%s' AND modelo ='%s' AND año='%s", marca, modelo, año);
                //marca, modelo y año
            } else {
                throw new DAOException("Año no disponible");
            }
            ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);
            if (resultadoConsulta.next()) {
                producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                producto.setTipo(resultadoConsulta.getString("tipo"));
                producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                producto.setMarca(resultadoConsulta.getString("marca"));
                producto.setModelo(resultadoConsulta.getString("modelo"));
                producto.setAnio(resultadoConsulta.getInt("año"));
                producto.setPrecio(resultadoConsulta.getFloat("precio"));
                    producto.setDisponible(resultadoConsulta.getInt("disponible"));
                listaProductos.add(producto);
            }

            return listaProductos;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaProductos;
        }
    }

    public ArrayList<Producto> consultarByTipo(String tipo) throws DAOException {
        if (tipo == null) {
            throw new DAOException("Tipo de producto no encontrado");
        }
        Producto producto = new Producto();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultaSQL;
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE tipo ='%s'", tipo);
                ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);
                if (resultadoConsulta.next()) {
                    producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                    producto.setTipo(resultadoConsulta.getString("tipo"));
                    producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                    producto.setMarca(resultadoConsulta.getString("marca"));
                    producto.setModelo(resultadoConsulta.getString("modelo"));
                    producto.setAnio(resultadoConsulta.getInt("año"));
                    producto.setPrecio(resultadoConsulta.getFloat("precio"));
                    producto.setDisponible(resultadoConsulta.getInt("disponible"));
                    listaProductos.add(producto);
                }
            }
            return listaProductos;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaProductos;
        }
    }

    public ArrayList<Producto> consultarByMarca(String marca) throws DAOException {
        if (marca == null) {
            throw new DAOException("Marca de producto no encontrado");
        }
        Producto producto = new Producto();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultaSQL;
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE marca ='%s'", marca);
                ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);                                                
                if (resultadoConsulta.next()) {
                    producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                    producto.setTipo(resultadoConsulta.getString("tipo"));
                    producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                    producto.setMarca(resultadoConsulta.getString("marca"));
                    producto.setModelo(resultadoConsulta.getString("modelo"));
                    producto.setAnio(resultadoConsulta.getInt("año"));
                    producto.setPrecio(resultadoConsulta.getFloat("precio"));
                    producto.setDisponible(resultadoConsulta.getInt("disponible"));
                    listaProductos.add(producto);
                }
            }
            return listaProductos;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaProductos;
        }
    }

    public ArrayList<Producto> consultarByModelo(String modelo) throws DAOException {
        if (modelo == null) {
            throw new DAOException("Tipo de modelo no encontrado");
        }
        Producto producto = new Producto();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultaSQL;
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE modelo ='%s'", modelo);
                ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);
                if (resultadoConsulta.next()) {
                    producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                    producto.setTipo(resultadoConsulta.getString("tipo"));
                    producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                    producto.setMarca(resultadoConsulta.getString("marca"));
                    producto.setModelo(resultadoConsulta.getString("modelo"));
                    producto.setAnio(resultadoConsulta.getInt("año"));
                    producto.setPrecio(resultadoConsulta.getFloat("precio"));
                    producto.setDisponible(resultadoConsulta.getInt("disponible"));
                    listaProductos.add(producto);
                }
            }
            return listaProductos;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaProductos;
        }
    }

    public ArrayList<Producto> consultarByAño(int año) throws DAOException {
        if (año <= 0) {
            throw new DAOException("Año no disponible");
        }
        Producto producto = new Producto();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultaSQL;
                consultaSQL = String.format("SELECT idProducto,tipo,descripcion,marca,modelo,año,precio,disponible FROM productos WHERE año ='%s'", año);
                ResultSet resultadoConsulta = comando.executeQuery(consultaSQL);
                if (resultadoConsulta.next()) {
                    producto.setIdProducto(resultadoConsulta.getInt("idProducto"));
                    producto.setTipo(resultadoConsulta.getString("tipo"));
                    producto.setDescripcion(resultadoConsulta.getString("descripcion"));
                    producto.setMarca(resultadoConsulta.getString("marca"));
                    producto.setModelo(resultadoConsulta.getString("modelo"));
                    producto.setAnio(resultadoConsulta.getInt("año"));
                    producto.setPrecio(resultadoConsulta.getFloat("precio"));
                    producto.setDisponible(resultadoConsulta.getInt("disponible"));
                    listaProductos.add(producto);
                }
            }
            return listaProductos;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaProductos;
        }
    }

}
