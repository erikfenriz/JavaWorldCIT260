/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

/**
 *
 * @author user
 */
class MapControlException extends Exception{

    public MapControlException() {
    }

    public MapControlException(String message) {
        super(message);
    }

    public MapControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MapControlException(Throwable cause) {
        super(cause);
    }

    public MapControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
