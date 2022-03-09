package DAO;

import Exceptions.DAOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Isai Perez
 * @param <T>
 */
public abstract class BaseDAO<T> {

    private static final String CADENA_CONEXION = "bd_ccma";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA ="1602";
    
    public Connection generarConexion()throws SQLException{
        return DriverManager.getConnection(CADENA_CONEXION,USUARIO, CONTRASEÑA);
    }
    
    public abstract void insertar(T entidad)throws DAOException;
    public abstract void actualizar(T entidad)throws DAOException;
    public abstract T consultarById(Long id)throws DAOException;
    public abstract void eliminar(Long id)throws DAOException;
    public abstract ArrayList<T>consultar()throws DAOException;

}
