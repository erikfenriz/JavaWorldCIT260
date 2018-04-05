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
public class GuruPowder extends Item{
    
    private boolean requestHelp;
    
    public GuruPowder(boolean requestHelp){
        this.requestHelp = requestHelp;
    }
    
    public boolean isRequestHelp(){
        return requestHelp;
    }
    
    public boolean setRequestHelp(boolean requestHelp){
        this.requestHelp = requestHelp;
        return true;
    }
    
}
