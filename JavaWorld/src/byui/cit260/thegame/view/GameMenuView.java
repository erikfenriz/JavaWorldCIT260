/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import java.util.Scanner;

/**
 *
 * @author Erik Rybalkin
 */
public class GameMenuView{
    
    
    
    public static void displayGameMenuView(){
        
        System.out.println("Are you ready? Y/N");
        
        String choice;
        Scanner s = new Scanner(System.in);
        choice = s.nextLine().trim().toUpperCase();
        
        switch(choice){
        case "Y":
            Episode1Scene1View episode1Scene1View = new Episode1Scene1View();
            episode1Scene1View.display();
        case "N":
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();
            break;
        default:
            System.out.println("Invalid choice");
        }
    }

}