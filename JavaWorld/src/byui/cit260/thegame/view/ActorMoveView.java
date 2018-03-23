/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.model.Actor;
import byui.cit260.thegame.model.Player;
import javax.swing.JOptionPane;

/**
 *
 * @author Erik Rybalkin
 */
public class ActorMoveView extends View{

    
    private String[] getInputs() { 
        String[] inputs = new String[1];
        
        inputs[0] = getInput();
        
        inputs[1] = getInput();
        
        
        return inputs;
        
       
        
    }
    
    private boolean doAction(String [] inputs) { 
        
       String row = inputs[0];
        String column = inputs[1];
        
        
        try{
            int rowNumber = Integer.parseInt(row);
            int collumnNumber = Integer.parseInt(column);
        }catch (NumberFormatException nfe){
         JOptionPane.showMessageDialog(null, "The row and column must be a number.");
           return false;
            }
        
        Player player = new Player();
        String Player = player.getName();
        
        Actor Player1 = Actor.Player;
        
        
         try{
            int newLocation = moveActor(Player1, row, column);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error.");
            return false;
        }
         
  
        
        
        return true;
    }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int moveActor(Actor Player1, String row, String column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
