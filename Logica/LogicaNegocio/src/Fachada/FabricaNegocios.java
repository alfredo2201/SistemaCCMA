/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

/**
 *
 * @author crist
 */
public class FabricaNegocios { 
    /**
     * Obtiene la instancia existente de FachadanNegocios. Si no existe 
     * Crea una nueva.
     * @return Instance. Regresa la instancia actual, ya sea nueva o una 
     * ya creada.
     */
    public static INegocios getInstance(){
        return new FachadaNegocos();
    }
    
}
