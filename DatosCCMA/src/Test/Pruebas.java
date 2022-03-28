/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.*;
import Dominio.*;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
//           ClienteDAO c = new ClienteDAO();
//           ArrayList<Cliente> clientes = c.obtenerTodo();
//           clientes.forEach((cliente) -> {
//               System.out.println(cliente);
////        });
//    VentasDAO v = new VentasDAO();
////    Venta venta = v.consultarById(2);
////        System.out.println(venta);
//    ArrayList<Venta> ventas = v.obtenerTodo();
//        for (Venta venta : ventas) {
//            System.out.println(venta);
//        }

        // Producto p = new Producto("hola", "como", "estas", "bro", 2000, 150f);
//    p.setDisponible(3);
        ProductosDAO pa = new ProductosDAO();
//    pa.insertar(p);
        pa.eliminar(1);

    }

}
