/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;

import java.io.Serializable;
/**
 *
 * @author Erik Rybalkin
 */
public class Item implements Serializable{
    private int itemID;
    private int cost;
    private int quantityOfItem;
    private boolean canBePurchased;

    public Item() {
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        this.quantityOfItem = quantityOfItem;
    }

    public boolean isCanBePurchased() {
        return canBePurchased;
    }

    public void setCanBePurchased(boolean canBePurchased) {
        this.canBePurchased = canBePurchased;
    }

    @Override
    public String toString() {
        return "Item{" + "itemID=" + itemID + ", cost=" + cost + ", quantityOfItem=" + quantityOfItem + ", canBePurchased=" + canBePurchased + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.itemID;
        hash = 79 * hash + this.cost;
        hash = 79 * hash + this.quantityOfItem;
        hash = 79 * hash + (this.canBePurchased ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.itemID != other.itemID) {
            return false;
        }
        if (this.cost != other.cost) {
            return false;
        }
        if (this.quantityOfItem != other.quantityOfItem) {
            return false;
        }
        if (this.canBePurchased != other.canBePurchased) {
            return false;
        }
        return true;
    }
    
    
    
}
