package Control;

import Dominio.Producto;
import java.util.ArrayList;
import IDatos.FabricaDatos;
import IDatos.IDatos;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isai Perez
 */
public class ControlProducto {
    
    private IDatos iDatos = FabricaDatos.getInstance();
    
    public ArrayList<Producto> consultaTodoProducto() {
        try {
            return iDatos.obtenerTodoProducto();
        } catch (Exception ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
