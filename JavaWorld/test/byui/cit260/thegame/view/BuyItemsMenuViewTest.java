/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raysh
 */
public class BuyItemsMenuViewTest {
    
    public BuyItemsMenuViewTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doAction method, of class BuyItemsMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String value = "";
        BuyItemsMenuView instance = new BuyItemsMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyMenuView method, of class BuyItemsMenuView.
     */
    @Test
    public void testBuyMenuView() {
        System.out.println("buyMenuView");
        BuyItemsMenuView instance = new BuyItemsMenuView();
        instance.buyMenuView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
