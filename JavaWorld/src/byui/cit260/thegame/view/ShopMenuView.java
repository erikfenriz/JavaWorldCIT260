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
public class ShopMenuView extends View{
    
     public ShopMenuView() {

        super("Hello! Welcome to the Logic Gate Store!\n" 
                            + "B - Buy\n" + "S - Sell\n" + "H - Excuse me...\n"
        );
        
    }
    @Override
      public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        
        switch(choice){
                case 'B':
                    System.out.println("What will you buy?");
                    buyItems();
                break;
                case 'S':
                    System.out.println("What will you sell?");
                    sellItems();
                break;
                case 'H':          
                    HelpShop helpShop = new HelpShop();                    
                    helpShop.display();
                break;
                default:
                    ErrorView.display(this.getClass().getName(), "Invalid Choice");
                break;
        }
        return false;
    }

    public void buyItems() {
        BuyItemsMenuView buyItemsMenu = new BuyItemsMenuView();
        buyItemsMenu.display();
    }

    public void sellItems() {
        SellItemsMenuView sellItemsMenu = new SellItemsMenuView();
        sellItemsMenu.display();
    }

}
