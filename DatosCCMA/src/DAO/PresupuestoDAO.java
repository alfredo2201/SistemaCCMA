/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Dominio.Cliente;
import Dominio.Presupuesto;
import Exceptions.DAOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Isai Perez
 */
public class PresupuestoDAO extends BaseDAO<Presupuesto> {

    @Override
    public void insertar(Presupuesto entidad) throws Exception {
        Presupuesto presupuesto = entidad;
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String insertarSLQ;
            insertarSLQ = String.format(
                    "INSERT INTO presupuestos(idCliente, fecha, total) "
                    + "VALUES('%s','%s','%s')",
                    presupuesto.getCliente().getId_cliente(),
                    presupuesto.getFecha(),
                    presupuesto.getTotal());
            comando.executeUpdate(insertarSLQ);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Presupuesto entidad) throws DAOException, Exception {
        if (entidad.getIdPresupuesto() == null) {
            throw new Exception("ID del presupuesto no encontrado");
        }
        Presupuesto presupuesto = entidad;
        try {
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String actualizarSQL;
                actualizarSQL = String.format("UPDATE presupuestos "
                        + "SET idCliente='%s', fecha='%s',total='%s'"
                        + "WHERE id = '%d' ",
                        presupuesto.getCliente().getId_cliente(),
                        presupuesto.getFecha(),
                        presupuesto.getTotal(),
                        presupuesto.getIdPresupuesto());
                int conteoRegistrosAfectados = comando.executeUpdate(actualizarSQL);
                if (conteoRegistrosAfectados == 1) {
                    System.out.println("Se ha actualizado el presupuesto");
                } else {
                    throw new Exception("No existe el presupuesto");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public Presupuesto consultarById(Integer id) throws DAOException, Exception {
        if (id == null) {
            throw new Exception("ID del presupuesto no encontrado");
        }
        Presupuesto presupuesto = new Presupuesto();
        try {
            Connection conexion = this.generarConexion();
            ClienteDAO ctl = new ClienteDAO();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT idPresupuesto, idCliente, fecha, total FROM presupuestos WHERE id=%d",
                    id);
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            if (resultadoConsulta.next()) {
                presupuesto.setIdPresupuesto(resultadoConsulta.getInt("idPresupuesto"));
                presupuesto.setCliente(ctl.consultarById(resultadoConsulta.getInt("idCliente")));
                presupuesto.setFecha(resultadoConsulta.getDate("fecha"));
                presupuesto.setTotal(resultadoConsulta.getFloat("total"));
            }

            return presupuesto;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return presupuesto;
        }
    }

    @Override
    public void eliminar(Integer id) throws DAOException {
        try {
            int conteoRegistroAfectados;
            try (Connection conexion = this.generarConexion()) {
                Statement comando = conexion.createStatement();
                String eliminarSQL;
                eliminarSQL = String.format("DELETE FROM presupuestos WHERE id=%d",
                        id);
                conteoRegistroAfectados = comando.executeUpdate(eliminarSQL);
            }
            if (conteoRegistroAfectados == 0) {
                throw new Exception("No se encontró el presupuesto con el ID ingresado");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<Presupuesto> obtenerTodo() throws DAOException {
        ArrayList<Presupuesto> listaPresupuesto = new ArrayList<>();
        try {
            Connection conexion = this.generarConexion();
            ClienteDAO ctl = new ClienteDAO();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT idPresupuesto, idCliente, fecha, total FROM presupuestos");
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            while (resultadoConsulta.next()) {
                Presupuesto presupuesto = new Presupuesto();
                presupuesto.setIdPresupuesto(resultadoConsulta.getInt("idPresupuesto"));
                presupuesto.setCliente(ctl.consultarById(resultadoConsulta.getInt("idCliente")));
                presupuesto.setFecha(resultadoConsulta.getDate("fecha"));
                presupuesto.setTotal(resultadoConsulta.getFloat("total"));
                listaPresupuesto.add(presupuesto);
            }

            return listaPresupuesto;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return listaPresupuesto;
        }
    }

    public ArrayList<Presupuesto> consultarByFecha(String fecha) throws DAOException {
        ArrayList<Presupuesto> listaPresupuesto = new ArrayList<>();
        try {
            Connection conexion = this.generarConexion();
            ClienteDAO ctl = new ClienteDAO();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            consultarSQL = String.format("SELECT idPresupuesto, idCliente, fecha, total FROM presupuestos WHERE fecha='%s'", fecha);
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            while (resultadoConsulta.next()) {
                Presupuesto presupuesto = new Presupuesto();
                presupuesto.setIdPresupuesto(resultadoConsulta.getInt("idPresupuesto"));
                presupuesto.setCliente(ctl.consultarById(resultadoConsulta.getInt("idCliente")));
                presupuesto.setFecha(resultadoConsulta.getDate("fecha"));
                presupuesto.setTotal(resultadoConsulta.getFloat("total"));
                listaPresupuesto.add(presupuesto);
            }

            return listaPresupuesto;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return listaPresupuesto;
        }
    }

    public ArrayList<Presupuesto> consultarByRFC(String RFC) throws DAOException {
        ArrayList<Presupuesto> listaPresupuesto = new ArrayList<>();
        try {
            Connection conexion = this.generarConexion();
            ClienteDAO ctl = new ClienteDAO();
            Statement comando = conexion.createStatement();
            String consultarSQL;
            ClienteDAO cdao = new ClienteDAO();
            Cliente c = cdao.consultarByRFC(RFC);
            consultarSQL = String.format("SELECT idPresupuesto, idCliente, fecha, total FROM presupuestos WHERE idClienet='%d'", c.getId_cliente());
            ResultSet resultadoConsulta = comando.executeQuery(consultarSQL);
            while (resultadoConsulta.next()) {
                Presupuesto presupuesto = new Presupuesto();
                presupuesto.setIdPresupuesto(resultadoConsulta.getInt("idPresupuesto"));
                presupuesto.setCliente(ctl.consultarById(resultadoConsulta.getInt("idCliente")));
                presupuesto.setFecha(resultadoConsulta.getDate("fecha"));
                presupuesto.setTotal(resultadoConsulta.getFloat("total"));
                listaPresupuesto.add(presupuesto);
            }

            return listaPresupuesto;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return listaPresupuesto;
        }
    }

}
