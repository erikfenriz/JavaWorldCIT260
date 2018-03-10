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
public class PurposeHelpMenuView extends View{
    
       public PurposeHelpMenuView() {

        super("Java World is an educational text based role-playing game.\n" 
                    + "\nIn this game, you will be taking on a role of a Padawan, a young student "
                    + "\nlearning Java programming language. You are a Padawan who starts "
                    + "\nhis journey as a developer. Studies will take you from one learning "
                    + "\nstation to the next."
                    + "\n********************************************************"
                    + "\nQ - go back"
        );
        
    }

       @Override
        public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case 'Q':
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                return true;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }
        
}