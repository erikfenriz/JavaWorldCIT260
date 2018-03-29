/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.GameControl;
import byui.cit260.thegame.model.Game;
import javaworld.JavaWorld;

/**
 *
 * @author user
 */
public class SaveGameView extends View{

    public SaveGameView(){
    super("Save the Game Progress...");
}
    
    private String[] getInputs() {
        
        String[] inputs = new String[1];
        
        //????????????????????????????
// Display instructions to save the game
// input1 = getInput(thePromptMessage)
// save a reference to input1 in the inputs array
 return inputs;
} 
    
    
     @Override
    public boolean doAction(String value) {
        Game current = JavaWorld.getCurrentGame();
        try {
            GameControl.saveGame(current, value);

        } catch (Exception ex) {

            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        console.println("Game saved" + value);

        return true;
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
