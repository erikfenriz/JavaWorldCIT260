/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaworld;

import byui.cit260.thegame.model.Actor;
import byui.cit260.thegame.model.Inn;
import byui.cit260.thegame.model.Location;
import byui.cit260.thegame.model.Player;
import byui.cit260.thegame.model.Quest;
import byui.cit260.thegame.model.QuizAndPuzzle;
import byui.cit260.thegame.model.Shop;

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
        
        Quest quest = new Quest();
        
        quest.setReward(true);
        quest.getCoordinate();
        
        System.out.println(quest.toString());
        
        Location locations = new Location();
        
        locations.setRow(3);
        locations.setCol(5);
        locations.setRequirement("Complete the Quest from Drill Mill");
        locations.setVisited(true);
        
        System.out.println(locations.toString());
        
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
    }
    
}
