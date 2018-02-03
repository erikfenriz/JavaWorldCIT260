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
 * @author Rayshorn Richardson
 */
public class Location implements Serializable{
    
    private String requirement;
    private int row;
    private int col;
    private boolean visited;
    private Scene scenes;
    private Shop shops;
    private Inn inns;

    public Location() {
    }

    public Scene getScenes() {
        return scenes;
    }

    public void setScenes(Scene scenes) {
        this.scenes = scenes;
    }

    public Shop getShops() {
        return shops;
    }

    public void setShops(Shop shops) {
        this.shops = shops;
    }

    public Inn getInns() {
        return inns;
    }

    public void setInns(Inn inns) {
        this.inns = inns;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.requirement);
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.col;
        hash = 53 * hash + (this.visited ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "requirement=" + requirement + ", row=" + row + ", col=" + col + ", visited=" + visited + '}';
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.requirement, other.requirement)) {
            return false;
        }
        return true;
    }
    
    
}
