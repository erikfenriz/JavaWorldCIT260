/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;


/**
 *
 * @author user
 */
class ControlsHelpMenuView extends View{
    
       public ControlsHelpMenuView() {

        super("To progress through the game, use the keys that are\n"
                + "prompted by the game.\n" 
                + "The game is expecting the commands as numbers – 1,2,3,4,5,etc.\n"
                + "In some cases, the commands that the game expects are “yes”\n"
                + "and “no” for closed-ended questions.\n"
                + "Some screens wouldn’t prompt an input.\n"
                + "These screens are skippable with Space button\n"
                + "*******************************************************"
                + "Q - go back"
        );
        
    }


    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case 'Q':
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

}