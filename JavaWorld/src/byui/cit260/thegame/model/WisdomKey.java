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
public class WisdomKey extends Item{
    
    private boolean unlock;
    private boolean reveal;

    public WisdomKey(boolean unlock, boolean reveal) {
        this.unlock = unlock;
        this.reveal = reveal;
    }

    public boolean isUnlock() {
        return unlock;
    }

    public void setUnlock(boolean unlock) {
        this.unlock = unlock;
    }

    public boolean isReveal() {
        return reveal;
    }

    public void setReveal(boolean reveal) {
        this.reveal = reveal;
    }
    
    
    
}
