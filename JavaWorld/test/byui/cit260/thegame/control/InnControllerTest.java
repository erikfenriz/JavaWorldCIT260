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
    public void testIncreaseHunger() {
        System.out.println("increaseHunger");
        double stats = 0.0;
        double maxHunger = 0.0;
        double expResult = 0.0;
        double result = InnController.increaseHunger(stats, maxHunger);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
