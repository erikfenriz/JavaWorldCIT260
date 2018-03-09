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
public class HelpMenuView extends View{

    public HelpMenuView() {

        super("P - Game's purpose\n" +
                            "C - Game's controls\n" +
                            "Q - Exit"
        );
        
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case 'P':
                PurposeHelpMenuView purposeHelpMenuView = new PurposeHelpMenuView();
                purposeHelpMenuView.display();
                break;
            case 'C':     
                ControlsHelpMenuView controlsHelpMenuView = new ControlsHelpMenuView();
                controlsHelpMenuView.display();
            break;
            case 'Q':
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();
            break;
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

}
