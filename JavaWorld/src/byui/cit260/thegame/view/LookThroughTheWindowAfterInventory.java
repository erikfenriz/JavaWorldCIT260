/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;
import java.util.Scanner;

/**
 *
 * @author Erik Rybalkin
 */
public class LookThroughTheWindowAfterInventory {

    static void lookThroughTheWindowAfterInventoryDisplay() {
        System.out.println
        ("Slightly visible lights of the tall buildings in a distance."
                + " The train is slowing its speed and soon will stop."
                + " I do not want to forget anything in here…");
        System.out.println(" ");
        System.out.println("1. Almost there...");
        boolean endOfView;
        endOfView = false;
        do{
            String[] inputs = getInputs();
            endOfView = doAction(inputs);
              if(inputs.length == 0 || inputs.length < 1){
                continue;
            }
        }while(!endOfView);
    }

    private static String[] getInputs() {
  String[] inputs = new String[1];
        System.out.println("Make a selection");
        String choice;
       
        boolean valid = false;
       
        while(valid == false){
        Scanner s =  new Scanner(System.in);
        choice = s.nextLine().trim();
        if(choice.length() < 1 || choice.length() == 0){
            System.out.println("**You need to enter a non-blank value**"); 
            FirstArrivalView.firstArrivalViewDisplay();
        }
        inputs[0] = choice;
        valid = true;
        }
        return inputs;      
    }

    private static boolean doAction(String[] inputs) {
char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch(choice){
            case '1':
                FirstArrivalView.firstArrivalViewDisplay();
                break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;    
    }
    
}
