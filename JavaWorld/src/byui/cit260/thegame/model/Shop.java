/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;
import java.io.Serializable;
/**
 *
 * @author Rayshorn Richardson
 */
public class Shop implements Serializable{
    
    private boolean buy;
    private boolean sell;

    public Shop() {
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
