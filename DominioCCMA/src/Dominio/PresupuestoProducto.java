/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Objects;

/**
 *
 * @author Isai Perez
 */
public class PresupuestoProducto {
    private Integer idPresupuestoProducto;
    private Producto producto;
    private Presupuesto presupuesto;
    private Integer cantidad;  
    private Float precioUnitario;

    public PresupuestoProducto() {
    }

    public PresupuestoProducto(Producto producto, Presupuesto presupuesto, Integer cantidad, Float precioUnitario) {
        this.producto = producto;
        this.presupuesto = presupuesto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public PresupuestoProducto(Integer idPresupuestoProducto, Producto producto, Presupuesto presupuesto, Integer cantidad, Float precioUnitario) {
        this.idPresupuestoProducto = idPresupuestoProducto;
        this.producto = producto;
        this.presupuesto = presupuesto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public Integer getIdPresupuestoProducto() {
        return idPresupuestoProducto;
    }

    public void setIdPresupuestoProducto(Integer idPresupuestoProducto) {
        this.idPresupuestoProducto = idPresupuestoProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.idPresupuestoProducto);
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
        final PresupuestoProducto other = (PresupuestoProducto) obj;
        if (Objects.equals(this.idPresupuestoProducto, other.idPresupuestoProducto)) {
        } else {
            return false;
        }
        return true;
    }
    
    
    
}
