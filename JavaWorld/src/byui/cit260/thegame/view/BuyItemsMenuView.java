/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;
import byui.cit260.thegame.control.ShopControl;

/*import byui.cit260.thegame.control.InventoryControl;
import byui.cit260.thegame.model.Shop;*/

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
                //System.out.println("You have bought some Food");
                ShopControl.buyFood();
                afterShop();
                break;
            case 'M':
                System.out.println("You have bought some Microchips");
                afterShop();
                break;
            case 'Q':
                System.out.println("Exiting Buy Menu");
                break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Choice");
                buyMenuView();
                break;
        }
        return false;
    }

     public void buyMenuView(){
        BuyItemsMenuView buyItemsMenuView = new BuyItemsMenuView();
        buyItemsMenuView.display();
    }
     
    public void afterShop(){
        AfterShopMenuView afterShopMenuView = new AfterShopMenuView();
        afterShopMenuView.display();
    }
}
