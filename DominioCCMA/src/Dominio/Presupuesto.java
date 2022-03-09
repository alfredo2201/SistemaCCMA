/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Isai Perez
 */
public class Presupuesto {
    private Integer idPresupuesto;
    private ArrayList<ProductoVenta>listaProducto;
    private Float total;
    private Cliente cliente;
    private Usuario empleado;
    private Date fecha;

    public Presupuesto() {
    }

    public Presupuesto(Integer idPresupuesto, ArrayList<ProductoVenta> listaProducto, Cliente cliente, Usuario empleado) {
        this.idPresupuesto = idPresupuesto;
        this.listaProducto = listaProducto;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public Presupuesto(Integer idPresupuesto, ArrayList<ProductoVenta> listaProducto, Float total, Cliente cliente, Usuario empleado, Date fecha) {
        this.idPresupuesto = idPresupuesto;
        this.listaProducto = listaProducto;
        this.total = total;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fecha = fecha;
    }

    public Integer getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(Integer idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public ArrayList<ProductoVenta> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<ProductoVenta> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Usuario empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.idPresupuesto);
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
        final Presupuesto other = (Presupuesto) obj;
        return Objects.equals(this.idPresupuesto, other.idPresupuesto);
    }

    @Override
    public String toString() {
        return "Presupuesto{" + "total=" + total + ", cliente=" + cliente + ", fecha=" + fecha + '}';
    }
    
    
}
