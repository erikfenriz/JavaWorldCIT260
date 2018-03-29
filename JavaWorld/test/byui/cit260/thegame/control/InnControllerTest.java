/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.exceptions.InnControlException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raysh
 */
public class InnControllerTest {
    
    public InnControllerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of increaseHunger method, of class InnController.
     */
    @Test
    public void testIncreaseHunger() throws InnControlException {
    
        double stats = 50.0;
        double maxHunger = 300;
        double expResult = 250.0;
        double result = InnController.increaseHunger(stats, maxHunger);
        System.out.println("increaseHunger");
        System.out.println("Test 1 " + result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
       
        stats = 80.0;
        maxHunger = 300;
        expResult = 220.0;
        result = InnController.increaseHunger(stats, maxHunger);
        System.out.println("increaseHunger");
        System.out.println("Test 2 " + result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
       
        stats = 30.0;
        maxHunger = 300;
        expResult = 270.0;
        result = InnController.increaseHunger(stats, maxHunger);
        System.out.println("increaseHunger");
        System.out.println("Test 3 " + result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
