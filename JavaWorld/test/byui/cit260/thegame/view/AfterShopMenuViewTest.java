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
public class AfterShopMenuViewTest {
    
    public AfterShopMenuViewTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doAction method, of class AfterShopMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String value = "";
        AfterShopMenuView instance = new AfterShopMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shopMenu method, of class AfterShopMenuView.
     */
    @Test
    public void testShopMenu() {
        System.out.println("shopMenu");
        AfterShopMenuView instance = new AfterShopMenuView();
        instance.shopMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afterShopMenu method, of class AfterShopMenuView.
     */
    @Test
    public void testAfterShopMenu() {
        System.out.println("afterShopMenu");
        AfterShopMenuView instance = new AfterShopMenuView();
        instance.afterShopMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
