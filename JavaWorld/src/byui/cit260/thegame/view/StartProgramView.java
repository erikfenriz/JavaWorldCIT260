/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;
import byui.cit260.thegame.control.GameControl;
import byui.cit260.thegame.model.Player;

/**
 *
 * @author Erik Rybalkin
 */
public class StartProgramView extends View{

  public StartProgramView() {

        super("Welcome to the JavaWorld\n"
                + "************************\n"
                + "What is your name?"
        );
        
    }
    
    public boolean doAction(String value){
        
        String playersName = value;
        Player player = GameControl.savePlayer(playersName);
        
        if(player == null){
            System.out.println("Could not create the player. " + "Enter a different name");
            return false;
        }
        System.out.println("=================================================" 
                + "\n Welcome to the JavaWorld, " 
                + playersName + "!" + "\n We hope you have a lot of fun!"
                +"\n=================================================");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;
    }

 
   
}