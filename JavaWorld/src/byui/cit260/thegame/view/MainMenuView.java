/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.GameControl;
import java.util.Scanner;
import javaworld.JavaWorld;
/**
 *
 * @author user
 */
public class MainMenuView {

    static void displayMainMenuView() {
         System.out.println("N - Start new game\n" +
                            "R - Restart existing game\n" +
                            "H - Get help on how to play the game\n" +
                            "E - Exit");
      
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
            System.out.println("**You need to enter a non-blank value or Q to exit**"); 
            displayMainMenuView();
        }
        inputs[0] = choice;
        valid = true;
        }
        return inputs;
    }

    private static boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch(choice){
            case 'N':
                System.out.println("New Game Selected");
                startNewGame();
                break;
            case 'R':
                System.out.println("Restarted");
                restartGame();
            break;
            case 'H':
                System.out.println("Get Help");
                getHelp();
            break;
            case 'E':
                QuitGameView.displayQuitGameView();
            case 'Q': 
                System.out.println("Exit");
            Runtime.getRuntime().exit(0);
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

    private static void startNewGame() {
        GameControl.createNewGame(JavaWorld.getCurrentPlayer());
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private static void restartGame() {
        StartExisitingGameView startExisitingGameView = new StartExisitingGameView();
        startExisitingGameView.displayStartExisitingGameView();
    }

    private static void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
}