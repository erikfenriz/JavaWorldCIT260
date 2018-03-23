/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.exceptions;

/**
 *
 * @author Rayshorn Richardson
 */
public class InnControlException extends Exception{

    public InnControlException() {
    }

    public InnControlException(String string) {
        super(string);
    }

    public InnControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InnControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public InnControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
