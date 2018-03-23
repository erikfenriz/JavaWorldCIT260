/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.exceptions.InnControlException;

/**
 *
 * @author Rayshorn Richardson
 */
public class InnController {
    /*public double stats = 50.50;
    public double maxHunger = 300;*/
    
    public static double increaseHunger(double stats, double maxHunger) throws InnControlException{
        double innPoints;
        double stat = stats;
        
        if((stats <= 0)){
            throw new InnControlException("Stats can't be below '0'");
        }
        if((maxHunger != 300)){
            throw new InnControlException("Max Hunger is below 300 this shouldn't be");
        }
        if(stats < maxHunger && !(stats > maxHunger)){
            innPoints = maxHunger - stats;
            return innPoints;
        }
        else if(stats < 0){
            Math.abs(stats);
            innPoints = maxHunger - stats;
            return innPoints;
        }
        else
            return stat;
    }
}
