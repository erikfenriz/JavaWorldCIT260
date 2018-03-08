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
public class FirstArrivalView {

    static void firstArrivalViewDisplay() {
        System.out.println("You have arrived. Welcome to Java World.\n" +
                      "1.Exit train and try to find help\n" +
                      "2.Exit train and find the Guru\n" +
                      "3.Check the Map\n"
                        + "4. Visit Store");
                  boolean endOfView;
        endOfView = false;
        do{
            String[] inputs = getInputs();
            endOfView = doAction(inputs);
              if(inputs.length == 0 || inputs.length < 1){
                continue;
            }
        }while(!endOfView);
    }
    

    private static String[] getInputs() {
  String[] inputs = new String[1];
        System.out.println("Make a selection");
        String choice;
       
        boolean valid = false;
       
        while(valid == false){
        Scanner s =  new Scanner(System.in);
        choice = s.nextLine().trim();
        if(choice.length() < 1 || choice.length() == 0){
            System.out.println("**You need to enter a non-blank value**"); 
            firstArrivalViewDisplay();
        }
        inputs[0] = choice;
        valid = true;
        }
        return inputs;    
    }

    private static boolean doAction(String[] inputs) {
char choice = Character.toUpperCase(inputs[0].charAt(0)); 
           if(choice == '1'){
               CustomsView.CustomsViewDisplay();
           }else if(choice == '2'){
               System.out.println("method called"); 
           }else if(choice == '3'){
               System.out.println("method called");
           }else if(choice == '4'){
               ShopMenuView shopMenuView = new ShopMenuView();
               shopMenuView.display();
           }else{
               System.out.println("Invalid Choice");
        }
        return false;
    }
}


