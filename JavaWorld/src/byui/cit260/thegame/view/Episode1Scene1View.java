/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import static byui.cit260.thegame.view.HelpMenuView.displayHelpMenuView;
import java.util.Scanner;

/**
 *
 * @author Erik Rybalkin
 */
public class Episode1Scene1View {
    
  static void Episode1Scene1ViewDisplay(){
      System.out.println("*The rain is pouring on the roof of a moving wagon*");
         System.out.println("The train is arriving at platform… Logic Gate shortly."
                 + "\n Check your status and don’t forget your belongings.");
         System.out.println(" ");
         System.out.println("1. Check Status");
         System.out.println("2. Check Inventory");
         
      
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
            displayHelpMenuView();
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
                EarlyStatusView.earlyStatusViewDisplay();
                break;
            case '2':                
                EarlyInventoryView.earlyInventoryViewDisplay();
            break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }
}