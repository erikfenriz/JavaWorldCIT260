/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.exceptions;

/**
 *
 * @author Erik Rybalkin
 */
public class TestClassException extends Exception{

    public TestClassException() {
    }

    public TestClassException(String message) {
        super(message);
    }

    public TestClassException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestClassException(Throwable cause) {
        super(cause);
    }

    public TestClassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
