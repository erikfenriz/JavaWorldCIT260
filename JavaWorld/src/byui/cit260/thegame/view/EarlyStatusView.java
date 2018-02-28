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
class EarlyStatusView {

    public static void earlyStatusViewDisplay() {
        System.out.println("Hunger: 30/100\n" +
"Tiredness: 20/100\n" +
"Mood: 60/100\n" +
"I have been traveling for so long to get to this place…\n"
                + " better be using ‘S’ button to check the status next time…");
        System.out.println(" ");
        System.out.println("1. Inventory");
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
            System.out.println("**You need to enter a non-blank value**"); 
            earlyStatusViewDisplay();
        }
        inputs[0] = choice;
        valid = true;
        }
        return inputs;    }

    private static boolean doAction(String[] inputs) {
char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch(choice){
            case '1':
                InventoryAfterStatusView.inventoryAfterStatusViewDisplay();
                break;
            case '2':                                
                LookThroughTheWindowAfterStatus.lookThroughTheWindowAfterStatusDisplay();
            break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

}