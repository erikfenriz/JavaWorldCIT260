/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.GameControl;
import java.util.Scanner;
import javaworld.JavaWorld;
/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public class MainMenuView extends View{

    
    public MainMenuView() {

        super("N - Start new game\n" +
              "R - Restart existing game\n" +
              "H - Get help on how to play the game\n" +
              "M - Display Game's Map\n" +  
              "E - Exit"
        );
        
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        switch(choice){
            case 'N':
                System.out.println("New Game Selected");
                startNewGame();
                break;
            case 'R':
                System.out.println("Restarted");
                restartGame();
            break;
            case 'H':
                System.out.println("Get Help");
                getHelp();
            break;
            case 'E':
                QuitGameView.displayQuitGameView();
            case 'M':
                showMap();
            case 'Q': 
                System.out.println("Exit");
            Runtime.getRuntime().exit(0);
            default: System.out.println("Invalid Choice");
            break;
        }
        return false;
    }

    private static void startNewGame() {
            GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
        try{
            GameControl.createNewGame(JavaWorld.getCurrentPlayer());
        }catch(Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            return;
        }finally{
            System.out.close();
        }
    
    }
    
    

    private static void restartGame() {
        StartExisitingGameView startExisitingGameView = new StartExisitingGameView();
        startExisitingGameView.displayStartExisitingGameView();
    }

    private static void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void showMap(){
          System.out.println("*You are here---​​           | | Classy Town =======^^^^=^^^Loop Mountain=^^^= = == = = = =Library Garden ++\n" +
"     ~ || ~                     | |​​​^^^^  ||​^^^                      + + + + + + + +\n" +
"               ~  ||  ~                     | |​​​   ^^ ^||​^^\n" +
"​    ~  ||  ~                     | | Array city​​               ||\n" +
"​    ~   ||  ~                    | |                                             ||\n" +
"​      ~  ||  ~                   | |         ​​​           ||                                                |\n" +
"Logic Gate ============= Compiler Path                                              |  ===========Switch Cross============||\n" +
"    ~  ||  ~                    }}                                            ||                     ||                          |\n" +
"​    ~   ||  ~                    }|}}                                         ||                      ||\n" +
"​      Import Harbor​​}}}}                                                              ||​           ||\n" +
"    ~  ||  ~                  | }}}}                                         ||                     NetBeans Farm\n" +
"                ~  ||  ~                   } }Bytecode sea                                         ||\n" +
"​    ~   ||  ~                    } }}}}                                     ||\n" +
"​      ~  ||  ~                   }}​​​​*Run INN///////////////////////Math River//////////////\n" +
"Math Pit                                 | |​​​​​​​/////////////////////////////// \n" +
"​           []========== | | Variable Ville-------Constant Heights​​​//////////////////////// \n" +
"     ~ || ~                     | |​​​​​​//////////////\n" +
"               ~  ||  ~                     | |​​​​​​////////////\n" +
"​    ~  ||  ~                     | | IF Fork​​​​​​/////////////\n" +
"​    ~   ||  ~                    | |​​​​​​//////\n" +
"​      ~  ||  ~                   | |​​​​​​////      ~~~~~~~~~\n" +
"Logic Gate ============= Error Purgatory   ====================System Creek //////////////////File Swamp~~~~~~\n" +
"    ~  ||  ~​​​​​​​​​~~~~~~~\n" +
"​    ~   ||  ~ ​​​​​​​​​~~~~~~\n" +
"​      ~  ||  ~​​​​​​​​​~~~~~~\n" +
"                ~  ||  ~\n" +
"​    ~   ||  ~​​**************​​​​~~~~~~~~~~~~\n" +
"​      ~  ||  ~​​**************​​​    ~~~~~~~~~~~~~~~~~~\n" +
"Math Pit ==============******Function Forest*****----Public Mine​          ~~~~~~~Git Lake~~~####GitHub Mud \n" +
"​​​​||||\n" +
"​​​​||||||\n" +
"​​​​​|||||| ​​​​​------------------------\n" +
"​​​​​|||||||||||||||||Static Volcano======Main Track=======Duke’s Heaven                 |\n" +
"​​​​​​​​​​------------------------------------"+
                  "\nQ - continue");
    String choice;
    
    Scanner s = new Scanner(System.in);
    choice = s.nextLine().trim().toUpperCase();
    switch(choice){
        case "Q":
            this.display();
        default:
            System.out.println("Invalid choice");
        }   
        
    }
    
}
