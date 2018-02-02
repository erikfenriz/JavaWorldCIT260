/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;

import java.util.ArrayList;

/**
 *
 * @author Erik Rybalkin
 */
public enum Event {

    
    Start("Game Launch Sequence", "Scenario", false, 0);
  
    private String eventName;
    private String eventType;
    private boolean completed;
    private int rewardReceived;
    private ArrayList<Item> items = new ArrayList<Item>();
    
        Event(String eventName,String eventType,boolean completed,int rewardReceived) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.completed = completed;
        this.rewardReceived = rewardReceived;
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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Event{" + "eventName=" + eventName + ", eventType=" + eventType + ", completed=" + completed + ", rewardReceived=" + rewardReceived + ", items=" + items + '}';
    }
        
        
        
}
