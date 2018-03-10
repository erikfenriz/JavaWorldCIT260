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
public class ShopMenuView {
    
    public static void displayShopMenuView(){
        System.out.println("Welcome to the Logic Gate Store!\n" 
                            + "B - Buy\n" + "S - Sell\n" + "Q - Quit\n");
        
        boolean shopping = false;
        do{
            String[] inputs = getInputs();
            
            if(inputs.length == 0){
                continue;
            }
            else if(inputs[0].toUpperCase().equals('Q')){
                return;
            }
            shopping = doAction(inputs);
        }while(shopping != true);
    }

    private static String[] getInputs() {
        System.out.println("Pick from our Menu, What do you want to do");
        String[] inputs = new String[1];
        boolean items = false;
        while (items == false){
            System.out.println("");
            Scanner enter;
            enter = new Scanner(System.in);
            //Enter the character for the options
            String menuOptions = enter.nextLine().trim();
            if(menuOptions.length() < 1 || menuOptions.length() == 0){
                System.out.println("Please pick from our options");
                displayShopMenuView();
            }
            inputs[0] = menuOptions;
            items = true;
        }
        return inputs;
    }

    private static boolean doAction(String[] inputs) {
        char input = Character.toUpperCase(inputs[0].charAt(0));
        
        switch(input){
                case 'B':
                    System.out.println("What will you buy?");
                    buyItems();
                break;
                case 'S':
                    System.out.println("What will you sell?");
                    sellItems();
                break;
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

    private static void buyItems() {
        buyItemsMenuView buyItemsMenu = new buyItemsMenuView();
        buyItemsMenuView.displayBuyItemsMenuView();
    }

    private static void sellItems() {
        sellItemsMenuView sellItemsMenu = new sellItemsMenuView();
        sellItemsMenuView.displaySellItemsMenuView();
    }

}
