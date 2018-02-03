/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;

/**
 *
 * @author Rayshorn Richardson
 */
public enum Scene{
    
    LogicGate("City"),
    MathPit("Town"),
    VariableVille("Village"),
    CompilerPass("City"),
    ArrayCity("City"),
    BytecodeSea("Ocean"),
    ClassyTown("Town"),
    FileSwamp("Swamp"),
    FunctionForest("Forest"),
    StaticVolcano("Mountain"),
    PublicMine("Mine");
    
    private String type;
    private Event event;

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
