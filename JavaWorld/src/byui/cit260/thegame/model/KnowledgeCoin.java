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
public class KnowledgeCoin implements Serializable{
    private int amount;

    public KnowledgeCoin() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "KnowledgeCoin{" + "amount=" + amount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.amount;
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
        final KnowledgeCoin other = (KnowledgeCoin) obj;
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    } 
    
}
