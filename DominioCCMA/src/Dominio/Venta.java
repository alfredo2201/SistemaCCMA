/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;
import java.util.ArrayList;
import java.util.Objects;

/** Clase de dominio que representa una venta del negocio.
 *
 * @author Isai Perez
 */
public class Venta {
    private Integer idVenta;
    private ArrayList<VentaProducto>listaProductos;
    private Cliente cliente;
    private Date fecha;
    private Float subtotal;
    private Float total;
    private Empleado empleado;
    private TipoPago pago;
    private Float servicio;

    public Venta() {
    }

    public Venta(ArrayList<VentaProducto> listaProductos, Cliente cliente, Date fecha, Empleado empleado) {
        this.listaProductos = listaProductos;
        this.cliente = cliente;
        this.fecha = fecha;
        this.empleado = empleado;
    }

    public Venta( ArrayList<VentaProducto> listaProductos, Cliente cliente, Date fecha, Float subtotal, Float total, Empleado empleado, TipoPago pago, Float servicio) {
        this.listaProductos = listaProductos;
        this.cliente = cliente;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.total = total;
        this.empleado = empleado;
        this.pago = pago;
        this.servicio = servicio;
    }



    public Venta(ArrayList<VentaProducto> listaProductos, Cliente cliente, Date fecha, Float subtotal, Float total, Empleado empleado, TipoPago pago) {
        this.listaProductos = listaProductos;
        this.cliente = cliente;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.total = total;
        this.empleado = empleado;
        this.pago = pago;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public ArrayList<VentaProducto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<VentaProducto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public TipoPago getPago() {
        return pago;
    }

    public void setPago(TipoPago pago) {
        this.pago = pago;
    }

    public Float getServicio() {
        return servicio;
    }

    public void setServicio(Float servicio) {
        this.servicio = servicio;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idVenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venta other = (Venta) obj;
        if (!Objects.equals(this.idVenta, other.idVenta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente.getNombre() + ", fecha=" + fecha + ", total=" + total + ", empleado=" + empleado.getNombre() + '}';
    }
    
    
}
