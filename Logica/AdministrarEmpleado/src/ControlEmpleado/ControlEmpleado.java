/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEmpleado;

import Dominio.Empleado;
import Exceptions.DAOException;
import IDatos.FabricaDatos;
import IDatos.IDatos;


/**
 *
 * @author Isai Perez
 */
public class ControlEmpleado {

    private IDatos iDatos = FabricaDatos.getInstance();

    public Empleado obtenEmpleado(String username, String password) {
        if (username != null || !username.isEmpty() && password != null || !password.isEmpty()) {
            try {
                return iDatos.consultarByCredenciales(username, username);
            } catch (DAOException ex) {
                System.err.println(ex.getMessage());                
            }
        }
        return null;
    }
    
    public String crearNuevoEmpleaedo(Empleado empleado){
        try {
            if (empleado != null) {
             iDatos.insertarEmpleado(empleado);   
             return "Empleado creado con éxito.";
            }            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());     
            return "Error al crear un nuevo empleado";
        }
        return null;
        
    }
}
