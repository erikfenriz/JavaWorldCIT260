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
public class PurposeHelpMenuView {
    

        static void displayPurposeHelpMenuView() {      
            
            System.out.println("Java World is an educational text based role-playing game.\n" 
                    + "\nIn this game, you will be taking on a role of a Padawan, a young student "
                    + "\nlearning Java programming language. You are a Padawan who starts "
                    + "\nhis journey as a developer. Studies will take you from one learning "
                    + "\nstation to the next.");
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
            displayPurposeHelpMenuView();
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