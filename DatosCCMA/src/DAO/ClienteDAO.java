/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Cliente;
import Exceptions.DAOException;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author Isai Perez
 */
public class ClienteDAO extends BaseDAO<Cliente>{

    @Override
    public void insertar(Cliente entidad) throws Exception {
        
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
