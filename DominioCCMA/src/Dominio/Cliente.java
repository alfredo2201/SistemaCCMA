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
public class Cliente extends Persona{
    private Integer id_cliente;
    private String rfc;    
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String telefono) {
        super(nombre,apellidos);        
        this.telefono = telefono;
    }

    public Cliente(String nombre, String apellidos, String correo,String rfc, String telefono) {
        super(nombre, apellidos, correo);
        this.rfc = rfc;
        this.telefono = telefono;
    }
    
    public Cliente(Integer id_cliente, String nombre, String apellidos, String rfc, String correo, String telefono) {
        super(nombre, apellidos, correo);
        this.id_cliente = id_cliente;
        this.rfc = rfc;        
        this.telefono = telefono;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }


    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", rfc=" + rfc + ", telefono=" + telefono + '}';
    }
            
}
