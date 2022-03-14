/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Empleado;
import Dominio.Permiso;
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
public class EmpleadosDAO extends BaseDAO<Empleado> {

    @Override
    public void insertar(Empleado entidad) throws Exception {
        
        Empleado empleado = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String insertarSLQ;
            insertarSLQ = String.format(
                    "INSERT INTO usuarios(nombre, apellido, email, username, password, permiso) "
                    + "VALUES('%s','%s','%s','%s','%s','%s')",
                    empleado.getNombre(),
                    empleado.getApellidos(),
                    empleado.getCorreo(),
                    empleado.getUsername(),
                    empleado.getPassword(),
                    empleado.getPermiso());
            comando.executeUpdate(insertarSLQ);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Empleado entidad) throws DAOException {
        if (entidad.getIdUsuario() == null) {
            throw new DAOException("ID del usuario no encontrado");
        }
        Empleado empleado = entidad;
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String actualizarSQL;
                actualizarSQL = String.format("UPDATE usuarios SET nombre='%s', apellido='%s',email='%s',username='%s',password='%s',permiso='%s' WHERE idUsuario = '%d' ",
                        empleado.getNombre(),
                        empleado.getApellidos(),
                        empleado.getCorreo(),
                        empleado.getUsername(),
                        empleado.getPassword(),
                        empleado.getPermiso(),
                        empleado.getIdUsuario());
                int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
                if (conteoRegistrosAfectados == 1) {
                    System.out.println("Se ha actualizado al usuario");
                } else {
                    throw new DAOException("No existe el usuario");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public Empleado consultarById(Long id) throws DAOException {
        if (id == null) {
            throw new DAOException("ID del empleado no encontrado");
        }
        Empleado empleado = new Empleado();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultarSQL;
                consultarSQL = String.format("SELECT idUsuario, nombre, apellido, email, username, password, permiso FROM usuarios WHERE idUsuario=%d",
                        id);
                ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
                if (resultadoConsulta.next()) {
                    empleado.setIdUsuario(resultadoConsulta.getInt("idUsuario"));
                    empleado.setNombre(resultadoConsulta.getString("nombre"));
                    empleado.setApellidos(resultadoConsulta.getString("apellido"));
                    empleado.setCorreo(resultadoConsulta.getString("email"));
                    empleado.setUsername(resultadoConsulta.getString("username"));
                    empleado.setPassword(resultadoConsulta.getString("password"));
                    empleado.setPermiso(Permiso.valueOf(resultadoConsulta.getString("permiso")));
                }
            }
            return empleado;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return empleado;
        }
    }

    @Override
    public void eliminar(Long id) throws DAOException {
        try {
            int conteoRegistroAfectados;
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String eliminarSQL;
                eliminarSQL = String.format("DELETE FROM usuarios WHERE idUsuario=%d",
                        id);
                conteoRegistroAfectados = comando.executeUpdate(eliminarSQL);
            }
            if (conteoRegistroAfectados == 0) {
                throw new Exception("No se encontró el empleado con el ID ingresado");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<Empleado> consultar() throws DAOException {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultarSQL;
                consultarSQL = String.format("SELECT idUsuario, nombre, apellido, email, username, password, permiso FROM usuarios");
                ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
                while (resultadoConsulta.next()) {
                    Empleado empleado = new Empleado();
                    empleado.setIdUsuario(resultadoConsulta.getInt("idUsuario"));
                    empleado.setNombre(resultadoConsulta.getString("nombre"));
                    empleado.setApellidos(resultadoConsulta.getString("apellido"));
                    empleado.setCorreo(resultadoConsulta.getString("email"));
                    empleado.setUsername(resultadoConsulta.getString("username"));
                    empleado.setPassword(resultadoConsulta.getString("password"));
                    empleado.setPermiso(Permiso.valueOf(resultadoConsulta.getString("permiso")));
                    listaEmpleados.add(empleado);
                }
            }
            return listaEmpleados;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return listaEmpleados;
        }
    }
public Empleado consultarByUsuarioContraseña(String usuario, String contraseña) throws DAOException {        
        Empleado empleado = new Empleado();
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String consultarSQL;
                consultarSQL = String.format("SELECT idUsuario, nombre, apellido, email, username, password, permiso FROM usuarios WHERE usuario='%s' AND password='%s'" ,
                        usuario,contraseña);
                ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
                if (resultadoConsulta.next()) {
                    empleado.setIdUsuario(resultadoConsulta.getInt("idUsuario"));
                    empleado.setNombre(resultadoConsulta.getString("nombre"));
                    empleado.setApellidos(resultadoConsulta.getString("apellido"));
                    empleado.setCorreo(resultadoConsulta.getString("email"));
                    empleado.setUsername(resultadoConsulta.getString("username"));
                    empleado.setPassword(resultadoConsulta.getString("password"));
                    empleado.setPermiso(Permiso.valueOf(resultadoConsulta.getString("permiso")));
                }
            }
            return empleado;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return empleado;
        }
    }
}
