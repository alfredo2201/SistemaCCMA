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

    private static final String CADENA_CONEXION = "jdbc:mysql://localhost/bd_ccma?autoReconnet=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USUARIO = "user";
    private static final String CONTRASEÑA ="1234";
    
    public Connection generarConexion()throws SQLException{
        return DriverManager.getConnection(CADENA_CONEXION,USUARIO, CONTRASEÑA);
    }
    
    public abstract void insertar(T entidad)throws Exception;
    public abstract void actualizar(T entidad)throws DAOException,Exception;
    public abstract T consultarById(Long id)throws DAOException, Exception;
    public abstract void eliminar(Long id)throws DAOException;
    public abstract ArrayList<T>consultar()throws DAOException;

}
