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
public class Producto {
    private Integer idProducto;
    private String tipo;
    private String descripcion;
    private String marca;
    private String modelo;
    private Integer anio;
    private Float precio;   

    public Producto() {
    }

    public Producto(String tipo, String descripcion, Integer anio, Float precio) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.anio = anio;
        this.precio = precio;
    }

    public Producto(Integer idProducto, String tipo, String descripcion, String marca, String modelo, Integer anio, Float precio) {
        this.idProducto = idProducto;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.idProducto);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + '}';
    }
    
}
