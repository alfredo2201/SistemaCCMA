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
        ClienteDAO CDAO = new ClienteDAO();
        EmpleadosDAO EDAO = new EmpleadosDAO();
        PresupuestoDAO presupuestoDAO = new PresupuestoDAO();
        PresupuestoProductosDAO presupuestoProductosDAO = new PresupuestoProductosDAO();
        ProductosDAO productosDAO = new ProductosDAO();
        VentasDAO ventasDAO = new VentasDAO();
        VentasProductoDAO vpdao = new VentasProductoDAO();
//        String ent = "\"%" + "Nombre" + "%\"";
//        System.out.println(CDAO.consultar("nombre", ent));

//        Cliente c = new Cliente("Juan", "Bajeca", "juanBaca@gmail.com", "rfcsqwue2267s", "6682107900");
//        CDAO.insertar(c);
//        ArrayList<Producto>lista = productosDAO.consultarConjunto(null, "Volkswagen","Jetta A1", -1);
//        lista.forEach((producto) -> {
//            System.out.println(producto.toString());
//        });

    }

}
