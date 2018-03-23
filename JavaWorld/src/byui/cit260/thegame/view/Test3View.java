/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

/**
 *
 * @author user
 */
public class Test3View extends View{

       public double ParseDouble(){
        
        String anotherValue = "value"; 
        try {
    return Double.parseDouble(anotherValue);
} catch(NumberFormatException e) {
    e.printStackTrace(); //do something
       return -1;
   }
        
    
        
    }
    
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
