/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Rayshorn Richardson
 */
public class Shop implements Serializable{
    
    private boolean buy;
    private boolean sell;
    private Location locations;
    private ArrayList<Item> items = new ArrayList<>();
    private double quantity;

    public Shop() {
    }

    public Location getLocations() {
        return locations;
    }

    public void setLocations(Location locations) {
        this.locations = locations;
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public boolean isBuy() {
        return buy;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    public boolean isSell() {
        return sell;
    }

    public void setSell(boolean sell) {
        this.sell = sell;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.buy ? 1 : 0);
        hash = 41 * hash + (this.sell ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Shop{" + "buy=" + buy + ", sell=" + sell + '}';
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
        final Shop other = (Shop) obj;
        if (this.buy != other.buy) {
            return false;
        }
        if (this.sell != other.sell) {
            return false;
        }
        return true;
    }
    
}
