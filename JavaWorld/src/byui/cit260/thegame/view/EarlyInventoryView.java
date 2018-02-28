/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Erik Rybalkin
 */
class EarlyInventoryView {

    public static void earlyInventoryViewDisplay() {
        Random r = new Random();
        int randomInt = r.nextInt(50);

    System.out.println("Money from another country: "+randomInt+"$\n" +
        "What? How is it possible? I… got robbed!…");
    System.out.println("*The wagon was empty*"+
        "\nI need to use ‘I’ button to check my things often so it won’t happen again!");
    System.out.println(" ");
    System.out.println("1. Check Status");
    System.out.println("2. Look through the window");
 
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
            LookThroughTheWindowAfterInventory.lookThroughTheWindowAfterInventoryDisplay();
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
                StatusAfterInventoryView.StatusAfterInventoryViewDisplay();
                break;
            case '2':                                
                LookThroughTheWindowAfterInventory.lookThroughTheWindowAfterInventoryDisplay();
            break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

}
