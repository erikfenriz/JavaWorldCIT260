/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;
import byui.cit260.thegame.model.Player;
import byui.cit260.thegame.control.Stats;
/**
 *
 * @author user
 */
public abstract class PlayerControl {

    public PlayerControl() {
    }
      
    public static Player createPlayer(String name){
      return new Player(name);
      
    }
//   public static Player changeMood(Player player){
//      double mood = 0;
//       player.setMood(mood);
//       
//       return player;
   }
