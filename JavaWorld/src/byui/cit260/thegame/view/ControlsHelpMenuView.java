/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;


/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
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
                + "*******************************************************\n"
                + "Q - go back"
        );
        
    }


       @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case 'Q':
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
            default: ErrorView.display(this.getClass().getName(), "Invalid Choice");
            break;
        }
        return false;
    }

}