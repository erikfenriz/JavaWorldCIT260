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



public class ShopControl {
    public int day = 4;
    public int price = 50;
    public double mood = 13.4;
    
    public static double calcShopDiscount(double mood, int day,double price){
    
        double discount;
    
    if((day <= 4 && day >= 0) && (mood >= 90 && mood <= 100)){
    discount = price * 0.1;     
    return Math.round(discount);
        }else if ((day <= 4 && day >= 0) && (mood >= 40 && mood <= 89)){
        discount = price;
        return discount;
    }else if ((day <= 4 && day >= 0) && (mood >= 1 && mood <= 39)){
        
    }

discount = price + 10%
return round(discount) : double
ELSE IF (day 5 to 6 AND (mood 90-100))
discount = price - 15%
return round(discount) : double
ELSE IF (day 5-6 AND (mood 40-89))
discount = price - 15%
return round(discount) : double
ELSE IF (day 5-6 AND (mood 1-39))
discount = price - 5%
return round(discount) : double
ELSE IF (any day AND (MOOD < 0  or > 100))
return "error": string
else 
return "bug": string
END
        }
}
