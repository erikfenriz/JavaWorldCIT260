/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raysh
 */
public class StatsTest {
    
    public StatsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of increaseHunger method, of class Stats.
     */
    @Test
    public void testIncreaseHunger() {
       
        int item = 1;
        double itemPoints = 40;
        boolean innUsage = false;
        double innPoints = 0.0;
        double stat = 158;
        double increaseHungerPoints = 300;
        double expResult = 200;
        double result = Stats.increaseHunger(item, itemPoints, innUsage, innPoints, stat, increaseHungerPoints);
        System.out.println("increaseHunger");
        System.err.println("test1 " + result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        item = 1;
        itemPoints = 50;
        innUsage = false;
        innPoints = 0.0;
        stat = 145;
        increaseHungerPoints = 300;
        expResult = 200;
        result = Stats.increaseHunger(item, itemPoints, innUsage, innPoints, stat, increaseHungerPoints);
        System.out.println("increaseHunger");
        System.err.println("test2 " + result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        item = 0;
        itemPoints = 0.0;
        innUsage = true;
        innPoints = 55;
        stat = 145;
        increaseHungerPoints = 300;
        expResult = 200;
        result = Stats.increaseHunger(item, itemPoints, innUsage, innPoints, stat, increaseHungerPoints);
        System.out.println("increaseHunger");
        System.err.println("test3 " + result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        item = 1;
        itemPoints = 40;
        innUsage = false;
        innPoints = 0.0;
        stat = 300;
        increaseHungerPoints = 300;
        expResult = 300;
        result = Stats.increaseHunger(item, itemPoints, innUsage, innPoints, stat, increaseHungerPoints);
        System.out.println("increaseHunger");
        System.err.println("test4 " + result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        item = 2;
        itemPoints = 30;
        innUsage = false;
        innPoints = 0.0;
        stat = 168;
        increaseHungerPoints = 300;
        expResult = 2.0;
        result = Stats.increaseHunger(item, itemPoints, innUsage, innPoints, stat, increaseHungerPoints);
        System.out.println("increaseHunger");
        System.err.println("test4 " + result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
