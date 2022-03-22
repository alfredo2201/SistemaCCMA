/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dominio.Cliente;
import IDatos.FabricaDatos;
import IDatos.IDatos;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Isai Perez
 */
public class ControlCliente {

    IDatos iDatos = FabricaDatos.getInstance();

    public String agregarCliente(Cliente cliente) {
        if (cliente != null) {
            try {
                iDatos.insertarCliente(cliente);
                return "Cliente nuevo guardado exitosamente";
            } catch (Exception ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "Error al crear cliente nuevo";
    }

    public String actualizarCliente(Cliente cliente) {
        if (cliente != null) {
            try {
                iDatos.actualizaCliente(cliente);
                return "Cliente actualizado correctamente";
            } catch (Exception ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "Error al actualizar cliente";
    }

    public String eliminarCliente(Integer id) {
        if (id != null || id > 0) {
            try {
                iDatos.eliminarCliente(id);
                return "Cliente eliminado correctamente";
            } catch (Exception ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "Error al eliminar cliente";
    }

    public ArrayList<Cliente> consultaTodoCliente() {
        try {
            return iDatos.obtenerTodoClientes();
        } catch (Exception ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Cliente consultaClienteById(Integer id) {
        if (id != null || id > 0) {
            try {
                return iDatos.consultarClienteById(id);
            } catch (Exception ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public Cliente consultarClienteByRFC(String rfc) {
        if (!rfc.isEmpty() && rfc != null) {
            Pattern pat = Pattern.compile("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}");
            Matcher mat = pat.matcher(rfc);
            if (mat.matches()) {
                try {
                    iDatos.consultarClienteByRFC(rfc);
                } catch (Exception ex) {
                    Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;

    }

    public ArrayList<Cliente> consultarClienteByNombre(String nombre) {
        if (nombre != null || !nombre.isEmpty()) {
            try {
               return iDatos.consultarCliente("nombre_completo", nombre);
            } catch (Exception ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
