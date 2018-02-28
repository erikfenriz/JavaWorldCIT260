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
public class buyItemsMenuView {
    
    public static void displayBuyItemsMenuView(){
        System.out.println("This is the menu!\n" 
                +"F - Food\n" + "M - Microchip\n" + "Q - Quit");
        
        boolean buy = false;
        
        do{
            String[] inputs = getInputs();
            
            if(inputs.length == 0){
                continue;
            }else if(inputs[0].toUpperCase().equals('Q')){
                return;
            }
            buy = doActions(inputs);
        }while(buy != true);
    }

    private static String[] getInputs() {
        System.out.println("this works");
        
        String[] inputs = new String[1];
        boolean items = false;
        while(items == false){
            System.out.println("");
            Scanner enter;
            enter = new Scanner(System.in);
            
            String picker = enter.nextLine().trim();
            if(picker.length() == 0 || picker.length() < 1){
                System.out.println("Please pick from our options");
                displayBuyItemsMenuView();
            }
            inputs[0] = picker;
            items = true;
        }
        return inputs;
    }

    private static boolean doActions(String[] inputs) {
        char options = Character.toUpperCase(inputs[0].charAt(0));
        
        switch(options){
            case 'F':
                System.out.println("You have bought some Food");
                break;
            case 'M':
                System.out.println("You have bought some Microchips");
                break;
            case 'Q':
                System.out.println("Exiting Buy Menu");
            ShopMenuView.displayShopMenuView();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        return false;
    }
}
