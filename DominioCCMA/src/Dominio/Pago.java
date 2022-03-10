/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Isai Perez
 */
public class Pago {
    private Float cantidad;
    private TipoPago tipo;

    public Pago() {
    }

    public Pago(Float cantidad, TipoPago tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    
    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public TipoPago getTipo() {
        return tipo;
    }

    public void setTipo(TipoPago tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pago{" + "cantidad=" + cantidad + ", tipo=" + tipo + '}';
    }
    
    
    
}
