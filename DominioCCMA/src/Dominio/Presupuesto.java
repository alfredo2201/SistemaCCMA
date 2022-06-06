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
    private ArrayList<VentaProducto>listaProducto;
    private Float total;
    private Cliente cliente;
    private Float servicio;
    private Empleado empleado;
    private Date fecha;

    public Presupuesto() {
    }

    public Presupuesto(Integer idPresupuesto, ArrayList<VentaProducto> listaProducto, Cliente cliente, Empleado empleado) {
        this.idPresupuesto = idPresupuesto;
        this.listaProducto = listaProducto;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public Presupuesto(Integer idPresupuesto, ArrayList<VentaProducto> listaProducto, Float total, Cliente cliente, Float servicio, Empleado empleado, Date fecha) {
        this.idPresupuesto = idPresupuesto;
        this.listaProducto = listaProducto;
        this.total = total;
        this.cliente = cliente;
        this.servicio = servicio;
        this.empleado = empleado;
        this.fecha = fecha;
    }


    public Presupuesto(ArrayList<VentaProducto> listaProducto, Float total, Cliente cliente, Empleado empleado, Date fecha) {
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

    public ArrayList<VentaProducto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<VentaProducto> listaProducto) {
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
