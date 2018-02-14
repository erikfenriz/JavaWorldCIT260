/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

/**
 *
 * @author Rayshorn Richardson
 */
public class InnController {
    public double stats = 50.50;
    public double maxHunger = 300;
    
    public static double increaseHunger(double stats, double maxHunger){
        double innPoints;
        double stat = stats;
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
