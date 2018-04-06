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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (this.requestHelp ? 1 : 0);
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
        final GuruPowder other = (GuruPowder) obj;
        if (this.requestHelp != other.requestHelp) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GuruPowder{" + "requestHelp=" + requestHelp + '}';
    }
    
}
