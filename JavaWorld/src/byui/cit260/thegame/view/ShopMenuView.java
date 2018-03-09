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
                            + "B - Buy\n" + "S - Sell\n" + "Q - Quit\n"
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
                case 'Q':
                    System.out.println("Thanks for shopping");
                    Runtime.getRuntime().exit(0);
                break;
                default:
                    System.out.println("Invalid Selection");
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
