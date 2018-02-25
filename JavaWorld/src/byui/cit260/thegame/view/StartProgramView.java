/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;
import java.util.Scanner;
import byui.cit260.thegame.control.GameControl;
import byui.cit260.thegame.model.Player;

/**
 *
 * @author Erik Rybalkin
 */
public class StartProgramView{

    public StartProgramView() {
    }
    
    public void displayStartProgramView(){
        System.out.println("Welcome to the JavaWorld");
        System.out.println("************************"); 
         boolean endOfView;
        endOfView = false;
        do{
            String[] inputs = getInputs();
            if(inputs.length == 0 || inputs.length < 1){
                continue;
            }else if(inputs[0].toUpperCase().equals("Q")){
                return;
            }
            endOfView = doAction(inputs);
        }while(!endOfView);
    }             
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("**Enter your name**");
        String name;
       
        boolean valid = false;
       
        while(valid == false){
        Scanner s =  new Scanner(System.in);
        name = s.nextLine().trim();
        if(name.length() < 1 || name.length() == 0){
            System.out.println("**You need to enter a non-blank value**"); 
            continue;
        }
        inputs[0] = name;
        valid = true;
        }  
        
        return inputs;
    }

    private boolean doAction(String[] inputs){
        
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        
        if(player == null){
            System.out.println("Could not create the player. " + "Enter a different name");
            return false;
        }
        System.out.println("=================================================" 
                + "\n Welcome to the JavaWorld, " 
                + playersName + "!" + "\n We hope you have a lot of fun!"
                +"\n=================================================");
        MainMenuView.displayMainMenuView();
        return true;
    }
}
