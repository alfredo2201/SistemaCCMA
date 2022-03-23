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
 * @author Samuel Medellin
 */
public class ControlProducto {
    
    IDatos fachadaProduc = FabricaDatos.getInstance();

    public void agregar(Producto producto) {
        if (producto != null) {
            try {
                fachadaProduc.insertarProducto(producto);

            } catch (Exception e) {
                System.err.println(e.getMessage());

            }

        }
    }

    public void eliminar(Integer id) {
        if (id != null || id > 0) {
            try {
                fachadaProduc.eliminarProducto(id);

            } catch (Exception e) {
                System.err.println(e.getMessage());

            }
        }

    }

    public void actualizar(Producto producto) {
        if (producto != null) {
            try {
                fachadaProduc.actualizaProducto(producto);

            } catch (Exception e) {
                System.err.println(e.getMessage());

            }

        }

    }

    public ArrayList<Producto> consultarTodo() {
        try {
            return fachadaProduc.obtenerTodoProducto();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Producto> consultarProductoCompleto(String tipo, String marca, String modelo, int anio) {
        try {
            return fachadaProduc.consultarProductoByConjunto(tipo, marca, modelo, anio);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Producto> consultarProductoByTipo(String tipo) {

        try {
            return fachadaProduc.consultarProductoByTipo(tipo);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Producto> consultarProductoByMarca(String marca) {
        try {
            return fachadaProduc.consultarProductoByTipo(marca);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Producto> consultarProductoByModelo(String modelo) {
        try {
            return fachadaProduc.consultarProductoByTipo(modelo);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Producto> consultarProductoByAnio(int anio) {
        try {
            return fachadaProduc.consultarProductoByAño(anio);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    public Producto consultarProductoById(int id){
        try {
            return fachadaProduc.consultarProductoById(id);
        } catch (Exception ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
