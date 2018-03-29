/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

/**
 *
 * @author Erik Rybalkin
 */
public class CustomsYesView extends View{

    public CustomsYesView(){
        super ("Did you like it? Welcome to Java World!"
                + "\n ******************************"
       +"\n1. Cool. Is that it?"
                + "\n2. Wow. It was fast. Thank you"
                );
    }
    
      @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case '1':
                System.out.println("Yes");
                break;
            case '2':     
                System.out.println("ahaha");
            break;
            default: ErrorView.display(this.getClass().getName(), "Invalid Choice");
            break;
        }
        return false;
    }
    
}
