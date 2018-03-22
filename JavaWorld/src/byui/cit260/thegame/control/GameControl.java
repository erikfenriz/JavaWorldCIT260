/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.model.Game;
import byui.cit260.thegame.model.Map;
import byui.cit260.thegame.model.Player;
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

    static void addDaysToCalendar(int daysToNext) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}