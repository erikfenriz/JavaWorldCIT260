/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

/**
 *
 * @author user
 */
public class InnController {
    public int stats = 50;
    public int maxHunger = 300;
    
    public static int increaseHunger(int stats, int maxHunger){
        if(stats <= maxHunger){
            int stat = maxHunger;
            return stat;
        }
        else
            return stats;
    }
}
