/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.BubbleSort;
import java.util.Arrays;

/**
 *
 * @author Erik Rybalkin
 */
public class HelpShop extends View{
    
    public HelpShop() {

        super("Excuse me! Could you please help us?\n" +
                            "We want to sort the items in our store and\n" +
                            "get a sum of all items. Do you know how to do it?\n" +
                "We have 23,12,34,21,23 in one pile and 32,42,8,2,84 in another\n" +
                "---------------------------------------------------------------\n" +
                            "1. Use  could use sorting methods!\n"+
                            "2. I do not know..."
                            
        );
                
     
        
}
    
    
    @Override
    public boolean doAction(String value) {
        
        char choice = Character.toUpperCase(value.charAt(0));
                                
        switch(choice){
            case '1':
              
         
        BubbleSort sorter = new BubbleSort();
        int[] input = {23,12,34,21,23,32,42,8,2,84};
        sorter.sort(input);
   
                break;
                case '2':
                System.out.println("Please, help us!");
                this.display();
                break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;    
    }
    
}



