/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;

import java.io.Serializable;
/**
 *
 * @author Erik Rybalkin
 */
public class Menu implements Serializable{
    private String menu;

    public Menu() {
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Menu{" + "menu=" + menu + '}';
    }
    
    
    
}
