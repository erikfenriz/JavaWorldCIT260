/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

import byui.cit260.thegame.model.InventoryItem;
import byui.cit260.thegame.model.Item;
import byui.cit260.thegame.model.KnowledgeCoin;
import byui.cit260.thegame.model.Shop;

/**
 *
 * @author Rayshorn Richardson
 */
public class Items {
    
    public KnowledgeCoin currentCurrency;
    public InventoryItem items;
    public Item item;
    public Shop shop;
    
    public static double IncreaseCurrency(Item item,Shop shop, InventoryItem items, KnowledgeCoin currentCurrency) {
        if(shop.isBuy() == false && shop.isSell() == false){
            return 0;
        }
        else if(shop.isBuy() == true && shop.isSell() == false){
            int itemID = item.getItemID();
            int cost = currentCurrency.getAmount() - item.getCost();
            currentCurrency.setAmount(cost);
        }
        else if(shop.isBuy() == false && shop.isSell() == true){
            int itemID = item.getItemID();
            int cost = currentCurrency.getAmount() + item.getCost();
            currentCurrency.setAmount(cost);
        }
        else if(shop.isBuy() == true && shop.isSell() == false && currentCurrency.getAmount() <= 0){
            return 0;
        }
        else if(shop.isBuy() == false && shop.isSell() == true && item.getCost() <= 0){
            return 0;
        }
        else{
            return 0;
        }
        
        return 1;
    }    
    
}

 /*calcIncreaseHunger(Item, Item cost, buy, Sell, currentCurrency): Int
BEGIN
IF (buy && sell == false)
RETURN “This item can’t increase currency”
ELSE IF (buy == true && sell == false)
	Inventory inventory =  new Inventory;
	Inventory.addItem = item;
	currentCurrency = currentCurrency – itemCost;
	RETURN currentCurrency;
ELSE IF (buy == false && sell == true)
 	Inventory inventory = new Inventory;
Inventory.removeItem = item;
currentCurrency = currentCurrency + itemCost;
 	RETURN currentCurrency;
ELSE IF (buy == true && sell == false && currentCurrency <= 0) 
 	RETURN “You don’t have any money to buy this item”
ELSE IF(buy == false && sell == true && itemCost <= 0)
 	Inventory inventory = new Inventory;
Inventory.removeItem = item;
RETURN “Item isn’t worth any currency”
ELSE
RETURN bug*/