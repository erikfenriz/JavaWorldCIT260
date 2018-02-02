/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;


import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;


/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public class Event implements Serializable{

  
    private String eventName;
    private String eventType;
    private boolean completed;
    private int rewardReceived;
    private ArrayList<Item> items = new ArrayList<Item>();
    
        public Event() {
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
        

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getRewardReceived() {
        return rewardReceived;
    }

    public void setRewardReceived(int rewardReceived) {
        this.rewardReceived = rewardReceived;
    }

    @Override
    public String toString() {
        return "Event{" + "eventName=" + eventName + ", eventType=" + eventType + ", completed=" + completed + ", rewardReceived=" + rewardReceived + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.eventName);
        hash = 47 * hash + Objects.hashCode(this.eventType);
        hash = 47 * hash + (this.completed ? 1 : 0);
        hash = 47 * hash + this.rewardReceived;
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
        final Event other = (Event) obj;
        if (this.completed != other.completed) {
            return false;
        }
        if (this.rewardReceived != other.rewardReceived) {
            return false;
        }
        if (!Objects.equals(this.eventName, other.eventName)) {
            return false;
        }
        if (!Objects.equals(this.eventType, other.eventType)) {
            return false;
        }
        return true;
    }
    
    
        
}
