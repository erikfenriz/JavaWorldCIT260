/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;
import java.util.Scanner;
/**
 *
 * @author Rayshorn Richardson
 */
public class ShopMenuView extends View{
    
     public ShopMenuView() {

        super("Welcome to the Logic Gate Store!\n" 
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
        buyItemsMenuView buyItemsMenu = new buyItemsMenuView();
        buyItemsMenu.display();
    }

    public void sellItems() {
        sellItemsMenuView sellItemsMenu = new sellItemsMenuView();
        sellItemsMenu.display();
    }

//    @Override
//    public boolean doAction(String value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
