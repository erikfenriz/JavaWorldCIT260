/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.exceptions.GameControlException;
import byui.cit260.thegame.model.Game;
import byui.cit260.thegame.model.Map;
import byui.cit260.thegame.model.Player;
import byui.cit260.thegame.view.SaveGameView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javaworld.JavaWorld;

/**
 *
 * @author Erik 
 */
public class GameControl {

    public static Player savePlayer(String name) {
        if(name == null || name.length() < 1 || name.length() == 0){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        JavaWorld.setCurrentPlayer(player);
        return player;
    }
    
    
    public static int createNewGame(Player player){
        String name = player.getName();
        System.out.println("See? This is Java World, "+ name 
                + "!\nThe only place where you achieve the goals that were envisioned in dreams!");
        
   
        
if(player == null) return -1;

    Game game = new Game();
    game.setPlayer(player);
    JavaWorld.setCurrentGame(game);
    
         int noOfColumns = 5;
        int noOfRows = 5;

//  //  Map map = MapControl.createMap(noOfRows, noOfColumns);
//        // make sure map was created.
//        if (map == null) {
//            return -1;
//        } else {
//            game.setMap(map);
//            return 1; // indicates success
//        }
//
//          }
        return 1;
  
}

     public static void saveGame(Game current, String value) throws GameControlException {
        final String path = System.getProperty("user.home") + File.separator + "JavaWorld";

        try (FileOutputStream fop = new FileOutputStream(path + File.separator + value)) {
            ObjectOutputStream output = new ObjectOutputStream(fop);

            output.writeObject(current);
        } catch (IOException e) {
            throw new GameControlException("Could not save your game.");
        }
    }
     
     public static Game loadGame(String value) throws GameControlException {
        final String path = System.getProperty("user.home") + File.separator + "JavaWorld";

        try (FileInputStream fop
                = new FileInputStream(path
                        + File.separator + value)) {
            ObjectInputStream input = new ObjectInputStream(fop);
            Game loaded = (Game) input.readObject();
            return loaded;

        } catch (IOException e) {
            throw new GameControlException("Could not save your game.");

        } catch (ClassNotFoundException ex) {
            throw new GameControlException("Could not save your game.");
        }
    }

}