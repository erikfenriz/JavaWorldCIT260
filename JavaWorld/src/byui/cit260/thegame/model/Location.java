/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;



/**
 *
 * @author Erik Rybalkin
 */
public enum Location {
    
    LogicGate("Logic Gate", 3, 5, "You need to be this tall to proceed", false);
   
   private String name;
   private int row;
   private int col;
   private String requirements;
   private boolean visited;
    
    Location(String name, int row, int col, String requirements, boolean visited){
this.row = row;
this.col = col;
this.requirements = requirements;
this.visited = visited;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", row=" + row + ", col=" + col + ", requirements=" + requirements + ", visited=" + visited + '}';
    }


}
