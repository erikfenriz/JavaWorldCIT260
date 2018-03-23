/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.TestCatch;
import byui.cit260.thegame.exceptions.TestClassException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author user
 */
public class TestView extends View{

    
    
    @Override
    public boolean doAction(String value) {
        
        try {
            TestCatch.TestControl();
        } catch (TestClassException ex) {
            Logger.getLogger(TestView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
}
