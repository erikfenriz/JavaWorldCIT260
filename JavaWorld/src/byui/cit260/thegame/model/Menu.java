/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public class Menu implements Serializable{
    private String menu;
    private Map worldMap;

    public Menu() {
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Map getWorldMap() {
        return worldMap;
    }

    public void setWorldMap(Map worldMap) {
        this.worldMap = worldMap;
    }

    @Override
    public String toString() {
        return "Menu{" + "menu=" + menu + ", worldMap=" + worldMap + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.menu);
        hash = 79 * hash + Objects.hashCode(this.worldMap);
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
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        if (!Objects.equals(this.worldMap, other.worldMap)) {
            return false;
        }
        return true;
    }


    
    
    
}
