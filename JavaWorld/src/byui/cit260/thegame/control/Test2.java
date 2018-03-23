/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

/**
 *
 * @author user
 */
public class Test2 {
    
    int x = 21;
    
    public static double test2(int x) throws Exception{
        
        System.out.println("Number!");
        
        if(x > 0){
            throw new Exception("Number must be > 0");
        }
        
        return 0;        
    }
    
}
