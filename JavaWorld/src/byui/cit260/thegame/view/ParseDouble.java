/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;


/**
 *
 * @author Erik
 */
public class ParseDouble extends View{

    
    public double ParseDouble(){
        
        String str = "value"; 
        try {
    return Double.parseDouble(str);
} catch(NumberFormatException e) {
    e.printStackTrace(); //do something
       return -1;
   }
        
    }
    
      @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case 'Q':
            FirstArrivalView firstArrivalView = new FirstArrivalView();
            firstArrivalView.display();
            break;
            default: ErrorView.display(this.getClass().getName(), "Invalid Choice");
            break;
        }
        return false;
    }
    
}
