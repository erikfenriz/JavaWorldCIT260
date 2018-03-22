/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.exceptions;

/**
 *
 * @author user
 */
public class StatException extends Exception{

    public StatException() {
    }

    public StatException(String message) {
        super(message);
    }

    public StatException(String message, Throwable cause) {
        super(message, cause);
    }

    public StatException(Throwable cause) {
        super(cause);
    }

    public StatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
