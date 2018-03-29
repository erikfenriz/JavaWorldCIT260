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
public class LookThroughTheWindowAfterInventory extends View{

    public LookThroughTheWindowAfterInventory(){
    super("Slightly visible lights of the tall buildings in a distance."
                + "\nThe train is slowing its speed and soon will stop."
                + "\nI do not want to forget anything in here…");
}

    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case '1':
                FirstArrivalView firstArrivalView = new FirstArrivalView();
                firstArrivalView.display();
                break;
            default: ErrorView.display(this.getClass().getName(), "Invalid Choice");
            break;
        }
        return false;    
    }

}
