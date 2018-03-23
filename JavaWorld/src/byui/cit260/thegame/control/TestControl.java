/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.exceptions.TestClassException;

/**
 *
 * @author Erik Rybalkin
 */
public class TestControl extends TestClassException{

     public static int testControl(){
      int n, n2;
      try {
  
         n = 0;
         n2 = 62 / n;
         System.out.println(n2);

      }
      catch (ArithmeticException e) { 

         System.out.println("zero devides");
      }
      catch (Exception e) {

         System.out.println("Exception!");
      }
         return 0;
   }
}
