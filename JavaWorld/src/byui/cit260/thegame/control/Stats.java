/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

/**
 *
=======
 * @author Erik Rybalkin
 */
public class Stats {
    public static double increaseMood(double position, double item, double mood) {
        // Calculate bonus
        double bonus = (position + (item/(mood/100)));
       
        if (bonus > 45) {
            bonus = 45;
        }
        // Add bonus to mood
        mood += bonus;
        // Ensure 0 < mood <= 100
        if (mood > 100) {
            mood = 100;
        } else if (mood < 0) {
            mood = 0;
        }        
        // Return mood
        return mood;
    }
}