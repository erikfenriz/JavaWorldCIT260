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
public class Microchip extends Item{
 
    double luck;
    
    public Microchip(double luck){
        this.luck = luck;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }
    
    
}
