/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class QuitGameView {
    
    static void displayQuitGameView(){
    System.out.println("Are you sure you want to quit? Y/N");
    String choice;
    
    Scanner s = new Scanner(System.in);
    choice = s.nextLine().trim().toUpperCase();
    switch(choice){
        case "Y":
            Runtime.getRuntime().exit(0);
        case "N":
            MainMenuView.displayMainMenuView();
            break;
        default:
            System.out.println("Invalid choice");
            
        }    
    }
}
