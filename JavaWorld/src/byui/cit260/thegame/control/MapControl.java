
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.control;


import byui.cit260.thegame.model.Locations;
import byui.cit260.thegame.model.Map;


/**
 *
 * @author Erik Rybalkin
 */


public class MapControl {

    
    public static Map createMap(int noOfRows, int noOfColumns){
        //if noOfRows < 0 OR numOfColumns < 0
        if (noOfRows < 0 || noOfColumns < 0) {
        return null;
      }
        Map gameMap = new Map();
        gameMap.setRowCount(noOfRows);
        gameMap.setColCount(noOfColumns);
        
        Locations[][] locations = createLocations(noOfRows, noOfColumns);
        
        gameMap.setLocation(locations);

      
  
        return gameMap;
    } 

    private static Locations[][] createLocations(int noOfRows, int noOfColumns) {
        
        
        Locations[][] locations = null;
        
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
                    
}
        
