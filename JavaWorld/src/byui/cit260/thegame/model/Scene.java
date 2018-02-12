/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;
import java.util.ArrayList;
/**
 *
 * @author Rayshorn Richardson
 */
public enum Scene{
    
    CityArea("City"),
    TownArea("Town"),
    VillageArea("Village"),
    OceanArea("Ocean"),
    SwampArea("Swamp"),
    ForestArea("Forest"),
    MountainArea("Mountain"),
    MineArea("Mine");
    
    private String type;
    private Event event;
    private ArrayList<Location> locations = new ArrayList<Location>();

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    private Scene(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Scene{" + "type=" + type + '}';
    }
    
}
