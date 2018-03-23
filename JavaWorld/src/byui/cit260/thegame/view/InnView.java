/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.InnController;
import byui.cit260.thegame.exceptions.InnControlException;

/**
 *
 * @author Rayshorn Richardson
 */
public class InnView extends View{
    
    public InnView(){
        super(
             "Welcome to the City Inn, what would you like to do?\n" +
                     "S - Save the Game\n" +
                     "R - Rest\n" +
                     "E - Exit the Inn"
        );
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        
        switch(choice){
            case 'S':
                System.out.println("You have save the game!");
                break;
            case 'R':
                System.out.println("Health has been restored");
                double stats = 30.0;
                try{
                InnController.increaseHunger(stats, 300);
                }catch(InnControlException e){
                    e.getMessage();
                }
                break;
            case 'E':
                System.out.println("Exiting the Inn");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        return false;
    }
}
