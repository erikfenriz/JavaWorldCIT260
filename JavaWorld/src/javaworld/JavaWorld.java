/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaworld;

import byui.cit260.thegame.view.StartProgramView;
import byui.cit260.thegame.model.Player;
import byui.cit260.thegame.model.Game;
/*import byui.cit260.thegame.model.Actor;
import byui.cit260.thegame.model.Inn;
import byui.cit260.thegame.model.QuizAndPuzzle;
import byui.cit260.thegame.model.Shop;
import byui.cit260.thegame.model.Item;
import byui.cit260.thegame.model.Location;
import byui.cit260.thegame.model.Map;
import byui.cit260.thegame.model.Menu;
import byui.cit260.thegame.model.Quest;*/

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
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        /*
        
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        System.out.println(playerOne.toString());
        
        
        Actor.Father.getName();
        Actor.Father.getDescription();
        System.out.println(Actor.Father.toString());
        
        QuizAndPuzzle quiz = new QuizAndPuzzle();
        
        quiz.setQuestion("What is does 'System.out.println' does?");
        quiz.setAnswer("It prints the result to the console");
        quiz.setReward(true);
        
        System.out.println(quiz.toString());
        
        Inn inns = new Inn();
        
        inns.setSave(true);
        inns.setLoad(false);
        inns.setRest(true);
        
        System.out.println(inns.toString());
        
        Shop shops = new Shop();
        
        shops.setBuy(true);
        shops.setSell(false);
        
        System.out.println(shops.toString());
        
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
        
        */
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
