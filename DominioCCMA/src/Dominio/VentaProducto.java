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
public class VentaProducto {
    private Integer idProductoVenta;
    private Producto producto;
    private Venta venta;
    private Integer cantidad;
    private Float precioVenta;

    public VentaProducto() {
    }

    public VentaProducto(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public VentaProducto(Integer idProductoVenta, Producto producto, Venta venta, Integer cantidad, Float precioVenta) {
        this.idProductoVenta = idProductoVenta;
        this.producto = producto;
        this.venta = venta;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }



    public VentaProducto(Producto producto, Integer cantidad, Float precioVenta) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }
    

    public Integer getIdProductoVenta() {
        return idProductoVenta;
    }

    public void setIdProductoVenta(Integer idProductoVenta) {
        this.idProductoVenta = idProductoVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idProductoVenta);
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
        final VentaProducto other = (VentaProducto) obj;
        if (!Objects.equals(this.idProductoVenta, other.idProductoVenta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductoVenta{" + "producto=" + producto.getTipo() + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + '}';
    }
    
    
    
}
