/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaworld;

import byui.cit260.thegame.model.Actor;
import byui.cit260.thegame.model.Event;
import byui.cit260.thegame.model.Item;
import byui.cit260.thegame.model.Location;
import byui.cit260.thegame.model.Map;
import byui.cit260.thegame.model.Menu;
import byui.cit260.thegame.model.Player;
import byui.cit260.thegame.model.Quest;

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
        
        Quest.Quiz01.getName();
        Quest.Quiz01.getDescription();
        Quest.Quiz01.getReward();
        System.out.println(Quest.Quiz01.toString());
        
        Item guruPower = new Item();
        Item food = new Item();
        Item wisdomKey = new Item();
        Item microChip = new Item();
        
        food.setItemID(1);
        food.setCost(20);
        food.setCanBePurchased(true);
        guruPower.setItemID(2);
        guruPower.setCost(100);
        guruPower.setCanBePurchased(true);
        wisdomKey.setItemID(3);
        wisdomKey.setCost(40);
        wisdomKey.setCanBePurchased(false);
        microChip.setItemID(4);
        microChip.setCost(15);
        microChip.setCanBePurchased(true);
        
        System.out.println(food.toString());
        System.out.println(guruPower.toString());
        System.out.println(wisdomKey.toString());
        System.out.println(microChip.toString());
        
        Menu mainMenu = new Menu();
        
        mainMenu.setMenu("Main Menu");
        System.out.println(mainMenu.toString());
        
        Map worldMap = new Map();
        worldMap.setColCount(50);
        worldMap.setRowCount(50);
        worldMap.setDescription("The map of the Java Path");
        
        System.out.println(worldMap.toString());
        
        Location.LogicGate.getName();
        Location.LogicGate.getCol();
        Location.LogicGate.getRow();
        Location.LogicGate.getRequirements();
        Location.LogicGate.isVisited();
        System.out.println(Location.LogicGate.toString());
        
        
        Event.Start.getEventName();
        Event.Start.getEventType();
        Event.Start.isCompleted();
        Event.Start.getRewardReceived();
        System.out.println(Event.Start.toString());
        
    }
    
}
