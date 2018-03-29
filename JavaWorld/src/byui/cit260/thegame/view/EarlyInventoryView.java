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
class EarlyInventoryView extends View{
      
    public EarlyInventoryView() {
        
        
        super("Money from another country: 13$\n" +
        "What? How is it possible? I… got robbed!…\n"+
                "*The wagon was empty*\n"+
        "\nI need to use ‘I’ button to check my things often so it won’t happen again!\n"
                + " \n"
                + "1. Check Status\n"
                + "2. Look through the window"
        );
        
    }
    
     @Override
    public boolean doAction(String value)  {
        
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case '1':
                StatusAfterInventoryView statusAfterInventoryView = new StatusAfterInventoryView();
                statusAfterInventoryView.display();
                break;
            case '2':    
                LookThroughTheWindowAfterInventory lookThroughTheWindowAfterInventory = new LookThroughTheWindowAfterInventory();
                lookThroughTheWindowAfterInventory.display();
            break;
            default: ErrorView.display(this.getClass().getName(), "Invalid Choice");
            break;
        }
        return false;
    }

}
