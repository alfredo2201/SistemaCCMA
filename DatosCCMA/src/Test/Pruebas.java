/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.ClienteDAO;
import Dominio.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Isai","Borbon", "isailol2201@gmail.com","CFRE0987251L3", "6682107900");
        ClienteDAO CDAO = new ClienteDAO();
        try {
            CDAO.insertar(c1);
            System.out.println("Se agrego correctamente");
        } catch (Exception ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
