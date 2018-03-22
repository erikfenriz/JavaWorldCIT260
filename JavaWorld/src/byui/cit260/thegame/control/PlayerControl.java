/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;
import byui.cit260.thegame.model.Player;
import byui.cit260.thegame.control.Stats;
import byui.cit260.thegame.exceptions.InventoryControlException;
/**
 *
 * @author user
 */
public abstract class PlayerControl {

    public PlayerControl() {
    }
      
    public static Player createPlayer(String name){
      return new Player(name);
      
    }

    
    public static void buyItem(Player player, int num) throws InventoryControlException, PlayerControlException {
        int totalCost =1;
        if (totalCost < 0) {
            throw new PlayerControlException("The total cost cannot be negative");
        }
        else if (num > 10) {
            throw new PlayerControlException("Cannot purchase");
        }
    
        player.setAmountofMoney(player.getAmountofMoney() - totalCost);
        player.getInventory();
    }
    
}
