/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;
import java.io.Serializable;
/**
 *
 * @author Rayshorn Richardson
 */
public class Inn implements Serializable{
    
    private boolean save;
    private boolean load;
    private boolean rest;
    private Location locations;

    public Inn() {
    }

    public Location getLocations() {
        return locations;
    }

    public void setLocations(Location locations) {
        this.locations = locations;
    }


    public boolean isSave() {
        return save;
    }

    public void setSave(boolean save) {
        this.save = save;
    }

    public boolean isLoad() {
        return load;
    }

    public void setLoad(boolean load) {
        this.load = load;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.save ? 1 : 0);
        hash = 41 * hash + (this.load ? 1 : 0);
        hash = 41 * hash + (this.rest ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Inn{" + "save=" + save + ", load=" + load + ", rest=" + rest + '}';
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
        final Inn other = (Inn) obj;
        if (this.save != other.save) {
            return false;
        }
        if (this.load != other.load) {
            return false;
        }
        if (this.rest != other.rest) {
            return false;
        }
        return true;
    }
    
    
}
