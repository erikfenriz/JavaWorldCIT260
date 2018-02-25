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
public class HelpMenuView {

    static void displayHelpMenuView() {
         System.out.println("P - Game's purpose\n" +
                            "C - Game's controls\n" +
                            "Q - Exit");
      
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
            case 'P':
                PurposeHelpMenuView.displayPurposeHelpMenuView();
                break;
            case 'C':                
                ControlsHelpMenuView.displayControlsHelpMenuView();
            break;
            case 'Q':
            MainMenuView.displayMainMenuView();
            break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

}
