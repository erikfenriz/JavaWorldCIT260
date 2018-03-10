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
public class EarlyStatusView extends View{
    
    public EarlyStatusView(){
        super("Hunger: 30/100\n" +
"Tiredness: 20/100\n" +
"Mood: 60/100\n" +
"I have been traveling for so long to get to this place…\n"
                + " better be using ‘S’ button to check the status next time…"+
                " \n"
                +"1. Inventory\n"
                +"2. Look through the window"
        );
    }

    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case '1':
                InventoryAfterStatusView inventoryAfterStatusView = new InventoryAfterStatusView();
                inventoryAfterStatusView.display();
                break;
            case '2':      
                LookThroughTheWindowAfterStatus lookThroughTheWindowAfterStatus = new LookThroughTheWindowAfterStatus();
                lookThroughTheWindowAfterStatus.display();
            break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

}