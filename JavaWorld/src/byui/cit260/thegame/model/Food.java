/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;

/**
 *
 * @author Rayshorn Richardson
 */
public class Food extends Item{
    
    private double hunger;
    private double strength;
    
    public Food(double hunger, double strength){
        this.hunger = hunger;
        this.strength = strength;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Food{" + "hunger=" + hunger + ", strength=" + strength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.hunger) ^ (Double.doubleToLongBits(this.hunger) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
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
        final Food other = (Food) obj;
        if (Double.doubleToLongBits(this.hunger) != Double.doubleToLongBits(other.hunger)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        return true;
    }
    
    
}
