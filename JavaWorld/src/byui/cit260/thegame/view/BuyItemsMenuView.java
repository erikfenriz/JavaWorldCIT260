/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;
/**
 *
 * @author Rayshorn Richardson
 */
public class BuyItemsMenuView extends View{
    
    public BuyItemsMenuView() {

        super("This is the menu!\n" 
                +"F - Food\n" + "M - Microchip\n" + "Q - Quit"
        );
        
    }
    
    
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        
        switch(choice){
            case 'F':
                System.out.println("You have bought some Food");
                break;
            case 'M':
                System.out.println("You have bought some Microchips");
                break;
            case 'Q':
                System.out.println("Exiting Buy Menu");
                ShopMenuView shopMenuView = new ShopMenuView();
            shopMenuView.display();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        return false;
    }

}
