/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

/**
 *
 * @author Erik Rybalkin
 */
public class CustomsView extends View{

    public CustomsView() {
        
        
        super("Hello! Is it your first time in Java World? Y/N"
        );
        
    }
    
        @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case 'Y':
                CustomsYesView customsYesView = new CustomsYesView();
                customsYesView.display();
                break;
            case 'N':      
                CustomsNoView customsNoView = new CustomsNoView();
                customsNoView.display();
            break;
            default: ErrorView.display(this.getClass().getName(), "Invalid Choice");
            break;
        }
        return false;
    }
    
}
