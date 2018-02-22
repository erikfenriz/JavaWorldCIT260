/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

/**
 *
 * @author Erik Rybalkin and Rayshorn Richardson
 */
public class ShopControl {
    public int day = 4;
    public int price = 50;
    public double mood = 13.4;
    
    public static double calcShopDiscount(double mood, int day,double price){
    
        double discount;
    
    if((day <= 4 && day >= 0) && (mood >= 90 && mood <= 100)){
    discount = price * 0.9; 
    return Math.round(discount);
    //if the day is 0 to 4 and mood more than 90 and less than 100 THEN price -10%
        }else if ((day <= 4 && day >= 0) && (mood >= 40 && mood <= 89)){
        discount = price;
        return discount;
    //if the day is 0 to 4 and mood more than 40 and less than 89 THEN price is same
    }else if ((day <= 4 && day >= 0) && (mood >= 1 && mood <= 39)){
        discount = price * 1.1;
        return Math.round(discount);
    //if the day is 0 to 4 and mood more than 1 and less than 39 THEN price +10%
    }else if ((day == 5 || day == 6) && (mood >= 90 && mood <= 100)){
        discount = price * 0.85;
        return Math.round(discount);
    //if the day is 0 to 4 and mood more than 90 and less than 100 THEN price -10%
    }else if ((day == 5 || day == 6) &&  (mood >= 40 && mood <= 89)){
        discount = price * 0.85;
        return Math.round(discount);
    }else if ((day == 5 || day == 6) &&  (mood >= 1 && mood <= 39)){
        discount = price * 0.95;
        return Math.round(discount);
    }else
          return price;
    
        }
}
