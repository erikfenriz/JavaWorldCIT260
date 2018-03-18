/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;

/**
 *
 * @author user
 */
public enum InventoryControl {
        
    Food,
    Microchip;

   
    
    private double quantity;
    
    InventoryControl(double quant) {
        this.quantity = quant;
    }
/*public static Shop buyItems(double value){
System.out.println("You have bought" + value);
return new Shop();
} */   

    public double quantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
