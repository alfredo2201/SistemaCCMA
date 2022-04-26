/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.EmpleadosDAO;
import Dominio.*;
import static Dominio.Permiso.EMPLEADO;
import Dominio.Venta;
import IDatos.FabricaDatos;
import IDatos.IDatos;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ControlVenta cv = new ControlVenta();
//        
//        ArrayList<Venta> lista = cv.consultaVentaPeriodoDeterminado(15);
//        
//        lista.forEach((venta) -> {
//            System.out.println(venta);
//        });
//
        Empleado emp = new Empleado("Alfredo gutierrez", "afgutierrez@hotmail.com", "afgutierrez", "alfreditog", EMPLEADO);
        EmpleadosDAO ed = new EmpleadosDAO();
        ed.insertar(emp);
   }

}
