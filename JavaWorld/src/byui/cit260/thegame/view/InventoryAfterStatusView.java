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
public class InventoryAfterStatusView extends View{

    
    public InventoryAfterStatusView(){
        super("Money from another country: 13$\n" +
        "What? How is it possible? I… got robbed!…"+
                "*The wagon was empty*\n"+
        "\nI need to use ‘I’ button to check my things often so it won’t happen again!\n"+
                " \n"
        + "1. Look through the window");
    }

     @Override
    public boolean doAction(String value)  {
  
            char choice = Character.toUpperCase(value.charAt(0));
        
            if(choice == '1'){
                StatusAfterInventoryView statusAfterInventoryView = new StatusAfterInventoryView();
                statusAfterInventoryView.display();
            }else{
                System.out.println("Invalid Choice");
            }
        return false;
        }
        
}