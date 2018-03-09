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
public class Episode1Scene1View extends View{

    
    public Episode1Scene1View() {
        
        
        super("*The rain is pouring on the roof of a moving wagon*" +
        "\nThe train is arriving at platform… Logic Gate shortly."+
                "\n Check your status and don’t forget your belongings."+
        "\nI need to use ‘I’ button to check my things often so it won’t happen again!"
                + "\n "
                + "\n1. Check Status"
                + "\n2. Check Inventory"
        );
        
    }
  
    @Override
    public boolean doAction(String value){
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case '1':
                EarlyStatusView earlyStatusView = new EarlyStatusView();
                earlyStatusView.display();
                break;
            case '2':     
                EarlyInventoryView earlyInventoryView = new EarlyInventoryView();
                earlyInventoryView.display();
            break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

}