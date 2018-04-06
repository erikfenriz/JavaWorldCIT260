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
public class CustomsNoView extends View{

    public CustomsNoView() {
        
        
        super("Oh you are from JavaScript World. We have no Visa pass for you!"
                + "\n ****************************"
                + "\n1.What is JavaScript?"
                + "\n2.Visa?"
        );
        
    }

    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case '1':
               JavaScriptExplained js = new JavaScriptExplained();
               js.display();
                break;
            case '2':      
               System.out.println("Don't hold the queue. and I love JS anyway...");
               JavaScriptExplained js2 = new JavaScriptExplained();
               js2.display();
            break;
            default: ErrorView.display(this.getClass().getName(), "Invalid Choice");
            break;
        }
        return false;
    }
    
   
    
}
