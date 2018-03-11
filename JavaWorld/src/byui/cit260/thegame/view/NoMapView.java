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
public class NoMapView extends View{

    public NoMapView() {

        super("I need to find a map!"
                +"\n"
                +"Q - continue"
        );
        
    }
    
      @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case 'Q':
            FirstArrivalView firstArrivalView = new FirstArrivalView();
            firstArrivalView.display();
            break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }
    
}
