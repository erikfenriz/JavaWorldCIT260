/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class StatsTest {
    
    public StatsTest() {
    }

    /**
     * Test of increaseMood method, of class Stats.
     */
    @Test
    public void testIncreaseMood() {
        
        
        double position = 10.0;
        double item = 3.0;
        double mood = 10.0;
        double expResult = 50.0;
        double result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 1 " + result);
        assertEquals(expResult, result, 0.0001);
         
        position = 15.0;
        item = 2.0;
        mood = 20.0;
        expResult = 45.0;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 2 " + result);
        assertEquals(expResult, result, 0.0001);
       
        position = 1.0;
        item = 2.0;
        mood = 5.0;
        expResult = 46.0;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 3 " + result);
        assertEquals(expResult, result, 0.0001);
        
        position = 10.0;
        item = 5.0;
        mood = 80.0;
        expResult = 96.25;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 4 " + result);
        assertEquals(expResult, result, 0.0001);
        
        position = 5.0;
        item = 3.0;
        mood = 40.0;
        expResult = 52.5;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 5 " + result);
        assertEquals(expResult, result, 0.0001);
        
        position = -1.0;
        item = 3.0;
        mood = 40.0;
        expResult = 46.5;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 4 " + result);
        assertEquals(expResult, result, 0.0001);
        
        position = 10.0;
        item = 10.0;
        mood = 95.0;
        expResult = 100.0;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 5 " + result);
        assertEquals(expResult, result, 0.0001);
        
        position = 90.0;
        item = 10.0;
        mood = 100.0;
        expResult = 100.0;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 6 " + result);
        assertEquals(expResult, result, 0.0001);
        
        position = -40.0;
        item = 1.0;
        mood = 5.0;
        expResult = 0.0;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 7 " + result);
        assertEquals(expResult, result, 0.0001);

        position = -40.0;
        item = 1.0;
        mood = 5.0;
        expResult = 0.0;
        result = Stats.increaseMood(position, item, mood);
        System.out.println("increaseMood");
        System.out.println("\t Test 7 " + result);
        assertEquals(expResult, result, 0.0001);         
        
    }
    
}
