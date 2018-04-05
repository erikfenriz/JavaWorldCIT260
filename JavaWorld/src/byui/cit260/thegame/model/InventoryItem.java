/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;


/**
 *
 * @author user
 */
public class InventoryItem {

    public InventoryItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public Object getInventoryType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getQuantityInStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum Item {
    
    Food("Food", "Consume to stay alive", "5"),
    Microchip("Microchip", "Just another piece of metal", "100"),
    WisdomKeys("Wisdom Keys","Just like wisdom teeth.", "200"),
    GuruPowers("GuruPowers","Summons Guru powers.", "1000");
    
  private String item;
  private String description;
  private String price;

    Item(String name, String description, String price){
        this.item = name;
        this.description = description;
        this.price = price;

        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" + "item=" + item + ", description=" + description + ", price=" + price + '}';
        }
 
    }
}
