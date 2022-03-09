/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author crist
 */
public class DAOException extends Exception{

    /**
     *  Crea una instancia vacia de la clase DAOException
     */
    public DAOException() {
    }

    /**
     * Crea una instancia de la clase DAOExcaption que recibe una cadena como mensaje de la excepcion.
     * @param message, mensaje a mostrar de la excepcion
     */
    public DAOException(String message) {
        super(message);
    }

    /**
     * Crea una instancia de la clase DAOException que recibe una cadena como mensaje 
     * y las causa por la que se provoco la excepcion.
     * @param message, mensaje a mostrar de la excepcion
     * @param cause, causa por la que se genero la excepcion.
     */
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Crea una instancia de la clase DAOException que recibe la causa por la que
     * se provoco la excepcion.
     * @param cause, causa por la que se genero la excepcion.
     */
    public DAOException(Throwable cause) {
        super(cause);
    }
    
}
