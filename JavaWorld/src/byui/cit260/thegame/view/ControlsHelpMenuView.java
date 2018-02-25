/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import java.util.Scanner;

/**
 *
 * @author user
 */
class ControlsHelpMenuView {

    static void displayControlsHelpMenuView() {
         System.out.println("To progress through the game, use the keys that are\n"
                + "prompted by the game.\n" 
                + "The game is expecting the commands as numbers – 1,2,3,4,5,etc.\n"
                + "In some cases, the commands that the game expects are “yes”\n"
                + "and “no” for closed-ended questions.\n"
                + "Some screens wouldn’t prompt an input.\n"
                + "These screens are skippable with Space button");
            System.out.println("********************************************************");
            System.out.println("Q - go back");
            
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
            displayControlsHelpMenuView();
        }
        inputs[0] = choice;
        valid = true;
        }
        return inputs;
    }

    private static boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch(choice){
            case 'Q':
                HelpMenuView.displayHelpMenuView();
                break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }
    }
    

