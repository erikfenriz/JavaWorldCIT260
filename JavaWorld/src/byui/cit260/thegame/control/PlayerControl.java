/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;
import byui.cit260.thegame.model.Player;
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
}
  

