/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dominio.Cliente;
import IDatos.FabricaDatos;
import IDatos.IDatos;

/**
 *
 * @author Isai Perez
 */
public class ControlCliente {
    IDatos iDatos = FabricaDatos.getInstance();
    
    public void agregar(Cliente cliente){
        if (cliente != null) {
            iDatos.insertarCliente(cliente);
        }
    }
    
}
