/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.exceptions.InventoryControlException;
import byui.cit260.thegame.model.InventoryItem;

/**
 *
 * @author Erik Rybalkin
 */
public class InventoryControl {
    public static String displayInventoryQuantityPrice() throws InventoryControlException {
        
        
        String output = "";
        String name;
        double inStock;
        double price;
        double value;
        int i = 0;
        InventoryItem[] inventory = getItemDatabase();
        if (inventory == null) 
            throw new InventoryControlException("Can not display inventory because player inventory is null. "
                    + "Please start new game to fix problem.");
        for (InventoryItem item : inventory) {
                name = (String) item.getInventoryType();
                inStock = item.getQuantityInStock();
                price = (double) item.getInventoryType();
                price = calcBarterPrice(item.getInventoryType());
                value = inStock * price;
                output += "\n* " + i + " - " + name + ": Quantity owned: " + inStock + ", Price: $" + price ;
                i++;
        }
        return output;
        
     
    
    }

    private static InventoryItem[] getItemDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static double calcBarterPrice(Object inventoryType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
