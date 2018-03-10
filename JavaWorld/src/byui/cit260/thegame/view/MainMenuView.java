/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.GameControl;
import javaworld.JavaWorld;
/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public class MainMenuView extends View{

    
    public MainMenuView() {

        super("N - Start new game\n" +
              "R - Restart existing game\n" +
              "H - Get help on how to play the game\n" +
              "E - Exit"
        );
        
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
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
        helpMenuView.display();
    }


}
