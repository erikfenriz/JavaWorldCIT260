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
 * @author Erik Rybalkin and Rayshorn Richardson
 */
public class ShopControlTest {
    
    public ShopControlTest() {
    }

    /**
     * Test of calcShopDiscount method, of class ShopControl.
     */
    @Test
    public void testCalcShopDiscount() {
        
        double mood = 95.5;
        int day = 1;
        double price = 400.0;
        double expResult = 360.0;
        double result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 1 " + result);
        assertEquals(expResult, result, 0.0001);
               
        mood = 56;
        day = 2;
        price = 400.0;
        expResult = 400.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 2 " + result);
        assertEquals(expResult, result, 0.0001);
        
        mood = 22;
        day = 3;
        price = 400.0;
        expResult = 440.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 3 " + result);
        assertEquals(expResult, result, 0.0001);
        
        mood = 95;
        day = 5;
        price = 400.0;
        expResult = 340.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 4 " + result);
        assertEquals(expResult, result, 0.0001);
        
        mood = 41;
        day = 6;
        price = 400.0;
        expResult = 340.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 5 " + result);
        assertEquals(expResult, result, 0.0001);
        
        mood = 3;
        day = 6;
        price = 400.0;
        expResult = 380.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 6 " + result);
        assertEquals(expResult, result, 0.0001);
        
        mood = 95;
        day = 5;
        price = 400.0;
        expResult = 340.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 7 " + result);
        assertEquals(expResult, result, 0.0001);
        
        mood = 105;
        day = 10;
        price = 400.0;
        expResult = 400.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 8 " + result);
        assertEquals(expResult, result, 0.0001);
        
        mood = -23;
        day = 7;
        price = 400.0;
        expResult = 400.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 9 " + result);
        assertEquals(expResult, result, 0.0001);
        
        mood = 0;
        day = 5;
        price = 400.0;
        expResult = 400.0;
        result = ShopControl.calcShopDiscount(mood, day, price);
        System.out.println("calcShopDiscount");
        System.out.println("\t Test 10 " + result);
        assertEquals(expResult, result, 0.0001);
        
        
    }
}
