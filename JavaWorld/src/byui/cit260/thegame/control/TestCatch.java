/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.exceptions.TestClassException;

/**
 *
 * @author Erik Rybalkin 
 */
public class TestCatch {
    
    public static double TestControl() throws TestClassException{
        
        String string = "value";
        int d = 0;
        int x = 42;
       
     d = Integer.parseInt(string);
     if(d == x){
          throw new TestClassException("Confusing");
     }
        return 0;
    
 
    }
}
   
   


