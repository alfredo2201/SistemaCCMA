/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dominio.*;
import IDatos.FabricaDatos;
import IDatos.IDatos;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Isai Perez
 */
public class ControlVenta {

    private IDatos iDatos = FabricaDatos.getInstance();

    public String agregar(Venta venta, ArrayList<VentaProducto> listaProductos) {
        if (venta != null) {
            try {
                iDatos.insertarVenta(venta);
                ArrayList<Venta> ventas = iDatos.consultarVentaByFecha(venta.getFecha());
                Venta aux = ventas.get(0);
                Venta ventaAux = iDatos.consultarVentaById(aux.getIdVenta());
                for (VentaProducto producto : listaProductos) {
                    producto.setVenta(ventaAux);
                    iDatos.insertarVentaProducto(producto);
                }
                return "Se guardo correctamente.";
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return "Error al guardar venta";
            }
        }
        return "Venta invalida";
    }

    public String eliminar(Integer id) {
        if (id != null || id > 0) {
            try {
                iDatos.eliminarVenta(id);
                return "Venta eliminada";
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return "Error al eliminar venta";
            }
        }
        return "Venta eliminada.";
    }

    public ArrayList<Venta> consultarTodo() {
        try {
            return iDatos.obtenerTodoVenta();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public ArrayList<VentaProducto> consultarVentaProducto(Integer id) {
        try {
            return iDatos.consultarVentaProductoByIdVenta(id);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public ArrayList<Venta> consultaVentaPeriodoDeterminado(int dias) {
        LocalDate date = LocalDate.now();
        
        Date fechaFin = Date.from(date.minusDays(dias).atStartOfDay().toInstant(ZoneOffset.UTC));
        
        Date fechaInicio = Date.from(date.plusDays(dias).atStartOfDay().toInstant(ZoneOffset.UTC));
        try {
            return iDatos.consultarVentaByRangoFechas(fechaInicio, fechaFin);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public ArrayList<Venta> consultarVentaRangoFechas(Date inicio, Date fin) {
        try {
            return iDatos.consultarVentaByRangoFechas(inicio, fin);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }
    
    public Venta consultarVentaById(int id){
        try{
            return iDatos.consultarVentaById(id);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
