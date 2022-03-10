/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Cliente;
import Exceptions.DAOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isai Perez
 */
public class ClienteDAO extends BaseDAO<Cliente> {

    @Override
    public void insertar(Cliente entidad) throws Exception {
        Cliente cliente = entidad;
        try {
            Connection conexion = this.generarConexion();
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

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Cliente entidad) throws DAOException, Exception {
        if (entidad.getId_cliente() == null) {
            throw new Exception("ID del cliente no encontrado");
        }
        Cliente cliente = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String actualizarSQL;
            actualizarSQL = String.format("UPDATE clientes SET nombre='%s', apellidos='%s',RFC='%s',correo='%s',telefono='%s' WHERE id = '%d' ",
                    cliente.getNombre(),
                    cliente.getApellidos(),
                    cliente.getRfc(),
                    cliente.getCorreo(),
                    cliente.getTelefono(),
                    cliente.getId_cliente());
            int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
            if (conteoRegistrosAfectados == 1) {
                System.out.println("Se ha actualizado al cliente");
            } else {
                throw new Exception("No existe el cliente");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Cliente consultarById(Long id) throws DAOException, Exception {
        if (id == null) {
            throw new Exception("ID del cliente no encontrado");
        }
        Cliente cliente=new Cliente();
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL=String.format("SELECT id, nombre, apellidos, RFC, correo, telefono FROM clientes WHERE id=%d",
                    id);
            ResultSet resultadoConsulta=comando.executeQuery(consultarSQL);
            if(resultadoConsulta.next()){
                cliente.setId_cliente(resultadoConsulta.getInt("id"));
                cliente.setNombre(resultadoConsulta.getString("nombre"));
                cliente.setApellidos(resultadoConsulta.getString("apellidos"));
                cliente.setRfc(resultadoConsulta.getString("RFC"));
                cliente.setCorreo(resultadoConsulta.getString("correo"));
                cliente.setTelefono(resultadoConsulta.getString("telefono"));
            }
            conexion.close();
            return cliente;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return cliente;
        }
    }

    public Cliente consultarByRFC(String RFC) throws DAOException, Exception {
        if (RFC == null) {
            throw new Exception("RFC del cliente no encontrado");
        }
        Cliente cliente=new Cliente();
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL=String.format("SELECT id, nombre, apellidos, RFC, correo, telefono FROM clientes WHERE RFC='%s'",
                    RFC);
            ResultSet resultadoConsulta=comando.executeQuery(consultarSQL);
            if(resultadoConsulta.next()){
                cliente.setId_cliente(resultadoConsulta.getInt("id"));
                cliente.setNombre(resultadoConsulta.getString("nombre"));
                cliente.setApellidos(resultadoConsulta.getString("apellidos"));
                cliente.setRfc(resultadoConsulta.getString("RFC"));
                cliente.setCorreo(resultadoConsulta.getString("correo"));
                cliente.setTelefono(resultadoConsulta.getString("telefono"));
            }
            conexion.close();
            return cliente;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return cliente;
        }
    }
    @Override
    public void eliminar(Long id) throws DAOException {
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String eliminarSQL;
            eliminarSQL = String.format("DELETE FROM clientes WHERE id=%d",
                    id);
            int conteoRegistroAfectados = comando.executeUpdate(eliminarSQL);
            conexion.close();
            if (conteoRegistroAfectados == 0) {
                throw new Exception("No se encontró el cliente con el ID ingresado");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    @Override
    public ArrayList<Cliente> consultar() throws DAOException {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL=String.format("SELECT id, nombre, apellidos, RFC, correo, telefono FROM clientes");
            ResultSet resultadoConsulta=comando.executeQuery(consultarSQL);
            while(resultadoConsulta.next()){
                Cliente cliente=new Cliente();
                cliente.setId_cliente(resultadoConsulta.getInt("id"));
                cliente.setNombre(resultadoConsulta.getString("nombre"));
                cliente.setApellidos(resultadoConsulta.getString("apellidos"));
                cliente.setRfc(resultadoConsulta.getString("RFC"));
                cliente.setCorreo(resultadoConsulta.getString("correo"));
                cliente.setTelefono(resultadoConsulta.getString("telefono"));
                listaClientes.add(cliente);
            }
            conexion.close();
            return listaClientes;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return listaClientes;
        }
    }

}
