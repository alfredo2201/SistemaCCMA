/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.*;
import Dominio.*;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        ProductosDAO pa = new ProductosDAO();
        System.out.println(pa.consultarByMarca("Nissan"));

    }

}
