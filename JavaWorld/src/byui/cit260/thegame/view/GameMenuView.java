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
class GameMenuView {
    public static void displayGameMenuView(){
        System.out.println("Are you ready? Y/N");
        String choice;
        Scanner s = new Scanner(System.in);
    choice = s.nextLine().trim().toUpperCase();
    switch(choice){
        case "Y":
            Episode1Scene1View.Episode1Scene1ViewDisplay();
        case "N":
            MainMenuView.displayMainMenuView();
            break;
        default:
            System.out.println("Invalid choice");
        }
    }
}