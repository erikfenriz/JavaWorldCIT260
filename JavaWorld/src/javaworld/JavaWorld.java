/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaworld;

import byui.cit260.thegame.view.StartProgramView;
import byui.cit260.thegame.model.Player;
import byui.cit260.thegame.model.Game;
/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public class JavaWorld {
    private static Game currentGame = null;
    private static Player currentPlayer = null;
    /**
     * @param args the command line arguments
     */

      public static void main(String[] args) {
        //plays the game remove comments later
        try {
            StartProgramView view = new StartProgramView();
            view.display();
        }
        catch (Throwable er) {
            er.printStackTrace();
        }        
    }
      
    public static Game getCurrentGame() {
    return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
    JavaWorld.currentGame = currentGame;
    }
    
    public static Player getCurrentPlayer() {
    return currentPlayer;
    }
    
    public static void setCurrentPlayer(Player currentPlayer) {
    JavaWorld.currentPlayer = currentPlayer;
    }
}
