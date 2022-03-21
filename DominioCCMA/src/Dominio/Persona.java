/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author crist
 */
public class Persona {

    private String nombre_completo;
    private String correo;

    public Persona() {
    }

    public Persona(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public Persona(String nombre_completo, String correo) {
        this.nombre_completo = nombre_completo;

        this.correo = correo;
    }

    public String getNombre() {
        return nombre_completo;
    }

    public void setNombre(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
