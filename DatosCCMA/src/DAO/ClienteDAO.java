/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Cliente;
import Exceptions.DAOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Isai Perez
 */
public class ClienteDAO extends BaseDAO<Cliente> {

    @Override
    public void insertar(Cliente entidad) throws Exception {
        Cliente cliente = (Cliente) entidad;
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String insertarSLQ;
                insertarSLQ = String.format(
                        "INSERT INTO clientes(nombre, apellidos, RFC, correo, telefono) "
                                + "VALUES('%s','%s','%s','%s','%s')",                        
                        cliente.getNombre(),
                        cliente.getApellidos(),
                        cliente.getRfc(),
                        cliente.getCorreo(),
                        cliente.getTelefono());
                comando.executeUpdate(insertarSLQ);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Cliente entidad) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente consultarById(Long id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Long id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> consultar() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
