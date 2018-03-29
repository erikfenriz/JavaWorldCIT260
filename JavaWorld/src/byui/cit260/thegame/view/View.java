/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import javaworld.JavaWorld;

/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = JavaWorld.getInFile();
    protected final PrintWriter console = JavaWorld.getOutFile();
    
    public View(){
        
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
     public void display() {
        
        boolean done = false;
        do {
            
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        } while (!done);

    }
    
    @Override
    public String getInput() {
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
       
        try{
                   
            while(!valid){
                this.console.println("\n" + this.displayMessage);
            //System.out.println("\n" + this.displayMessage);
        value = this.keyboard.readLine();
        value = value.trim();
        
        if(value.length() < 1){
            ErrorView.display(this.getClass().getName(), "\n*** You must enter a value ***");
            continue;
        }
      break; 
            }
            }catch(Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
                    }
    
        return value;
}
    
}