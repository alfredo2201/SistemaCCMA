/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dominio.Cliente;
import IDatos.FabricaDatos;
import IDatos.IDatos;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isai Perez
 */
public class ControlCliente {
    IDatos iDatos = FabricaDatos.getInstance();
    
    public void agregar(Cliente cliente){
        if (cliente != null) {
            try {
                iDatos.insertarCliente(cliente);
            } catch (Exception ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
