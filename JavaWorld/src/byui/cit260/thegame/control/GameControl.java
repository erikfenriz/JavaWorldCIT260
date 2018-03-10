/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.model.Player;
import javaworld.JavaWorld;

/**
 *
 * @author user
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
    public static void createNewGame(Player player) {
        String name = player.getName();
        System.out.println("See? This is Java World, "+ name 
                + "!\nThe only place where you achieve the goals that were envisioned in dreams!");
    }
}