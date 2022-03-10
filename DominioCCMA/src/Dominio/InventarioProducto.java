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
public class InventarioProducto {
    private Integer idInventarioProducto;
    private Producto producto;
    private Integer disponible;

    public InventarioProducto(Producto producto) {
        this.producto = producto;
    }

    public InventarioProducto() {
    }

    public InventarioProducto(Integer idInventarioProducto, Producto producto, Integer disponible) {
        this.idInventarioProducto = idInventarioProducto;
        this.producto = producto;
        this.disponible = disponible;
    }

    public InventarioProducto(Producto producto, Integer disponible) {
        this.producto = producto;
        this.disponible = disponible;
    }
    

    public Integer getIdInventarioProducto() {
        return idInventarioProducto;
    }

    public void setIdInventarioProducto(Integer idInventarioProducto) {
        this.idInventarioProducto = idInventarioProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getDisponible() {
        return disponible;
    }

    public void setDisponible(Integer disponible) {
        this.disponible = disponible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idInventarioProducto);
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
        final InventarioProducto other = (InventarioProducto) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return true;
    }
    
    
}
