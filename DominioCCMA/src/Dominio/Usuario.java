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
public class Usuario extends Persona{
    private Integer idUsuario;
    private String username;
    private String password;
    private Permiso permiso;

    public Usuario() {
    }

    public Usuario(String nombre, String username, String password, Permiso permiso) {
        super(nombre, password);
        this.username = username;
        this.password = password;
        this.permiso = permiso;
    }

    public Usuario(Integer idUsuario, String nombre, String apellidos, String email, String username, String password, Permiso permiso) {
        super(nombre, apellidos, email);
        this.idUsuario = idUsuario;        
        this.username = username;
        this.password = password;
        this.permiso = permiso;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.idUsuario);
        hash = 17 * hash + Objects.hashCode(this.password);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + super.getNombre() + ", apellidos=" + super.getApellidos() + ", permiso=" + permiso + '}';
    }
    
}
