/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Producto;
import Exceptions.DAOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crist
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
    public void actualizar(Producto entidad) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto consultarById(Long id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Long id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> consultar() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
