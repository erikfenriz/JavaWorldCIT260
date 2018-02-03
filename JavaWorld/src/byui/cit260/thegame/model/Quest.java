/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;
import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author Erik Rybalkin
 */
public enum Quest {
    
    Quiz01("Quiz of Java souls", "Crack this quiz and you will step on a track of Java developer!", 400, new Point(1,4));
 
    
    private String name;
    private String description;
    private int reward;
    private Point coordinates;
    
    Quest(String name, String description, int reward, Point coordinates){
this.name = name;
this.description = description;
this.reward = reward;
this.coordinates = coordinates;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;

    }

    @Override
    public String toString() {
        return "Quest{" + "name=" + name + ", description=" + description + ", reward=" + reward + ", coordinates=" + coordinates + '}';
    }
    
    
}
