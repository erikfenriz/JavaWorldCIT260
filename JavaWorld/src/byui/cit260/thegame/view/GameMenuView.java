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
 * @author Erik Rybalkin
 */
public class GameMenuView extends View{
    
    
    
    public GameMenuView() { 
        super("Welcome to the JavaWorld\n"
                + "************************\n"
                + "Are you ready to start the Journey? Y/N"
        );
        GameControl.createNewGame(JavaWorld.getCurrentPlayer());
    }

    @Override
    public boolean doAction(String value)  {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
        case 'Y':
            Episode1Scene1View episode1Scene1View = new Episode1Scene1View();
            episode1Scene1View.display();
        case 'N':
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();
            break;
        default:
            ErrorView.display(this.getClass().getName(), "Invalid Choice");
        }
        return false;
    }

}