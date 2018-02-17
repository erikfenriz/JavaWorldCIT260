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
public class Stats {
    public int item = 1;
    public double itemPoints = 20;
    public boolean innUsage = true;
    public double innPoints = 142;
    public double stat = 158;
    public double increaseHungerPoints = 300;
    
    public static double increaseHunger(int item, double itemPoints, boolean innUsage, double innPoints, double stat, double increaseHungerPoints){
        double hungerIncrease;
        int food = 1;
        if (innUsage){
            hungerIncrease = stat + innPoints;
            return Math.round(hungerIncrease);
        }
        else if (stat == increaseHungerPoints){
            return increaseHungerPoints;
        }
        else if (item == food){
            if (itemPoints <= 0 && stat < 300){
                return Math.round(stat);
            }
            else if (itemPoints <= 40 && stat < 300){
                hungerIncrease = ((itemPoints * 0.05) + itemPoints) + stat;
                return Math.round(hungerIncrease);
            }
            else if (itemPoints <=60 && stat < 300){
                hungerIncrease = ((itemPoints * 0.10) + itemPoints) + stat;
                return Math.round(hungerIncrease);
            }
            else if (itemPoints > 60 && stat < 300){
                hungerIncrease = ((itemPoints * 0.15) + itemPoints) + stat;
                return Math.round(hungerIncrease);
            }       
        }
        else if (item != food){
            return 2;
        }
        return 0;
    }
    
}
