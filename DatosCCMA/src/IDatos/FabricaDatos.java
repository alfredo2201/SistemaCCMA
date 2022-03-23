/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDatos;

/**
 *
 * @author Isai Perez
 */
public class FabricaDatos {

    private static FachadaDatos instance;

    private FabricaDatos() {
    }

    public static IDatos getInstance() {
        if (instance == null) {
            instance = new FachadaDatos();
        }
        return instance;
    }

}
