/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.model.Item;

/**
 *
 * @author Rayshorn Richardson
 */
public class ItemViews extends View{

    public Item items;
    int ID = items.getItemID();
    int cost = items.getCost();
    int quantity = items.getQuantityOfItem();
    public ItemViews(){
       System.out.println("Item ID: " + ID + "\nItem cost" + cost + "\nQuantity" + quantity);
    }
    
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
