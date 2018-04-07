/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.ShopControl;
import byui.cit260.thegame.model.Item;

/**
 *
 * @author Rayshorn Richardson
 */
public class ItemViews extends View{
    
    public ItemViews(){
       super("You have bought food");
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        
        switch(choice){
            case 'C':
                Item items = new Item();
                int ID = items.getItemID();
                int cost = items.getCost();
                int quantity = items.getQuantityOfItem();
                System.out.println("You have bought some Food");
                ShopControl.buyFood(ID, cost, quantity);
                break;
            case 'Q':
                System.out.println("You have exited the store");
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Choice");
                break;
        }
        return false;
    }

}
