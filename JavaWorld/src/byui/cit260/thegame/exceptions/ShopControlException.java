/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.exceptions;

/**
 *
 * @author raysh
 */
public class ShopControlException extends Exception{

    public ShopControlException() {
    }

    public ShopControlException(String string) {
        super(string);
    }

    public ShopControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ShopControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ShopControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
