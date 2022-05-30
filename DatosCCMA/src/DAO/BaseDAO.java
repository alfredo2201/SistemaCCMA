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
    private static final String CADENA_CONEXION = "jdbc:mysql://127.0.0.1:3306/bd_ccma?useSSL=false";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "1602";

    public Connection generarConexion() throws SQLException {
        return DriverManager.getConnection(CADENA_CONEXION, USUARIO, CONTRASENIA);
    }

    public abstract void insertar(T entidad) throws Exception;

    public abstract void actualizar(T entidad) throws DAOException, Exception;

    public abstract T consultarById(Integer id) throws DAOException, Exception;

    public abstract void eliminar(Integer id) throws DAOException;

    public abstract ArrayList<T> obtenerTodo() throws DAOException;

}
