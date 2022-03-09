/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author crist
 */
public class Venta {
    private Integer idVenta;
    private ArrayList<ProductoVenta>listaProductos;
    private Cliente cliente;
    private Date fecha;
    private Float subtotal;
    private Float total;
    private Usuario empleado;
    private Pago pago;

    public Venta() {
    }

    public Venta(ArrayList<ProductoVenta> listaProductos, Cliente cliente, Date fecha, Usuario empleado) {
        this.listaProductos = listaProductos;
        this.cliente = cliente;
        this.fecha = fecha;
        this.empleado = empleado;
    }

    public Venta(Integer idVenta, ArrayList<ProductoVenta> listaProductos, Cliente cliente, Date fecha, Float subtotal, Float total, Usuario empleado, Pago pago) {
        this.idVenta = idVenta;
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

    public ArrayList<ProductoVenta> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<ProductoVenta> listaProductos) {
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

    public Usuario getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Usuario empleado) {
        this.empleado = empleado;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
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
        return "Venta{" + "cliente=" + cliente + ", fecha=" + fecha + ", total=" + total + ", empleado=" + empleado + '}';
    }
    
    
}
