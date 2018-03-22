
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;


import byui.cit260.thegame.model.InventoryItem;
import byui.cit260.thegame.model.Location;
import byui.cit260.thegame.model.Locations;
import byui.cit260.thegame.model.Map;
import byui.cit260.thegame.model.Scene;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaworld.JavaWorld;


/**
 *
 * @author Erik Rybalkin
 */


public class MapControl {

    
    
    
    public static Map createMap(int noOfRows, int noOfColumns){
       
        try {
                throw new MapControlException("111212121212");
            } catch (MapControlException ex) {
                Logger.getLogger(MapControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        if (noOfRows < 0 || noOfColumns < 0) {
        return null;
      }
        Map gameMap = new Map();
        gameMap.setRowCount(noOfRows);
        gameMap.setColCount(noOfColumns);
        
        Locations[][] locations = createLocations();
        
        gameMap.setLocation(locations);

        return gameMap;
    }

    
    
    private static void assign(Map gameMap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Locations[][] createLocations() {
        
        
        Locations[][] locations = null;
        int noOfRows = 10;
        int noOfColumns = 10;
       for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                
                Locations location = new Locations();
                location.setRows(i);
                location.setColumns(j);
                location.setVisited(false);
          
               
               locations[i][j] = location; 
            }
           
        }
            return locations;

    }

    private Scene[] createScenes(InventoryItem[] inventory) {
        System.out.println("method");
        return null;
    }

    private void assignScenesToLoctions(Map gameMap) {
           System.out.println("method");
    }
                    
}
        
