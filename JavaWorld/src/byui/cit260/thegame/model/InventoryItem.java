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
    public enum Item {
    
    Food("Food", "description"),
    Microchip("Microchip", "description"),
    WisdomKeys("Wisdom Keys","description."),
    GuruPowers("GuruPowers","description.");
    
  private String item;
  private String description;

    Item(String name, String description){
this.item = name;
this.description = description;

        }

        public String getName() {
            return item;
        }

        public void setName(String name) {
            this.item = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    
    
    }
}
