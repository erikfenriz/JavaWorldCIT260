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
public class sellItemsMenuView {
    
    public static void displaySellItemsMenuView(){
        System.out.println("This is the menu!\n" 
                +"F - Food\n" + "M - Microchip\n" + "Q - Quit");
        boolean sell = false;
        
        do{
            String[] inputs = getInputs();
            
            if(inputs.length == 0){
                continue;
            }else if(inputs[0].toUpperCase().equals('Q')){
                return;
            }
            sell = doAction(inputs);
        }while(sell != true);
                
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
                displaySellItemsMenuView();
            }
            inputs[0] = menuOptions;
            items = true;
        }
        return inputs;
    }

    private static boolean doAction(String[] inputs) {
        char options = Character.toUpperCase(inputs[0].charAt(0));
        
        switch (options){
            case 'F':
                System.out.println("You have sold some Food");
                break;
            case 'M':
                System.out.println("You have sold some Microchips");
                break;
            case 'Q':
                System.out.println("Exiting Buy Menu");
                ShopMenuView.displayShopMenuView();
                break;
        }
        return true;
    }

    
}
