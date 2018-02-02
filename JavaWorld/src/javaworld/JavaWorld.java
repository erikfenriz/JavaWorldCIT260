/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaworld;

import byui.cit260.thegame.model.Actor;
import byui.cit260.thegame.model.Player;

/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public class JavaWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        System.out.println(playerOne.toString());
        
        
        Actor.Father.getName();
        Actor.Father.getDescription();
        System.out.println(Actor.Father.toString());
    }
    
}
