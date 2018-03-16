/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;
    import java.io.Serializable;
/**
 *
 * @author user
 */
public class Locations {


public int rows;
public int columns;
public boolean visited;

    public Locations() {
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
        
public enum LocationsEnum implements Serializable {
   
    LogicGate("Logic Gate", "Town"),
    MathPit("Math Pit", "Town"),
    VariableVille("VariableVille", "Town"),
    CompilerPass("Compiler Pass", "Town"),
    ArrayCity("Array City", "Town"),
    ClassyTown("Classy Town", "Town"),
    BytecodeSea("Bytecode Sea", "Town"),
    IfFork("If Fork", "Town"),
    LoopMountain("Loop Mountain", "Town"),
    ImportHarbor("Import Harbor", "Town"),
    LibraryGarden("Library Garden", "Town"),
    SwitchCross("Switch Cross", "Town"),
    RunInn("Run Inn", "Town"),
    NetBeansFarm("NetBeans Farm", "Town"),
    MathRiver("Math River", "Town"),
    SystemCreek("System Creek", "Town"),
    FileSwamp("File Swamp", "Town"),
    FunctionForest("Function Forest", "Town"),
    GitLake("Git Lake", "Town"),
    GitHubMud("GitHub Mud", "Town"),
    ConstantHeights("Constant Heights", "Town"),
    StaticVolcano("Static Volcano", "Town"),
    PublicMine("Public Mine", "Town"),
    MainTrack("MainTrack", "Town"),
    DukesHeaven("Duke’s Heaven", "Town"),
    DrillMill("Drill Mill", "Town");
    
        private final String locationName;
        private final String locationType;

        
    LocationsEnum(String locationName, String locationType) { 
        
        this.locationName = locationName;
        this.locationType = locationType;
    }
        
        public String getLocationName() {
            return this.locationName;
        }

        public String getLocationType() {
            return this.locationType;
        }
        
 }

}
