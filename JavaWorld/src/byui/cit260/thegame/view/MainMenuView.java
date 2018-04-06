/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import byui.cit260.thegame.control.GameControl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaworld.JavaWorld;
import byui.cit260.thegame.model.Actor;
import byui.cit260.thegame.model.InventoryItem;
import byui.cit260.thegame.model.InventoryItem.Item;
import static java.lang.System.out;
/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public class MainMenuView extends View{

    
    public MainMenuView() {

        super("N - Start new game\n" +
              "R - Restart existing game\n" +
              "P - Print Actors \n" +
              "G - Print Items \n" + 
              "H - Get help on how to play the game\n" +
              "M - Display Game's Map\n" +  
              "S - Save Game\n" +
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
            case 'S':
                this.saveGame();
                break;
            case 'E':
                QuitGameView.displayQuitGameView();
            case 'M':
        {
            try {
                showMap();
            } catch (IOException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        break;
            case 'P':
                System.out.println("Writing Actors to a file...");
                printActors();
                break;
            case 'G':
                System.out.println("Writing Items to a file...");
                printItems();
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
        gameMenuView.display();
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

    private void showMap() throws IOException{
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
    
    //Scanner s = new Scanner(System.in);
    choice = this.keyboard.readLine();
    choice = choice.trim();
    switch(choice){
        case "Q":
            this.display();
        default:
            ErrorView.display(this.getClass().getName(), "Invalid Choice");
        }   
        
    }

    private void saveGame() {
        
    }

    private void printActors() {
        
        try{
          
            PrintWriter out = new PrintWriter("actors.txt");
            
            out.println("\n\n ENUM");
            out.printf("%n%-20s%10s%10s", "Actor", "Description", "Position");
            out.printf("%n%-20s%10s%10s", "-----------", "-----------", "-----------");
       
            for(Actor actor: Actor.values()){
                out.printf("%n%-20s%10s%10s", actor.getName()
                                            ,actor.getDescription()
                                             , actor.getCoordinates());
            }
            out.close();
            
        }catch(IOException e){
            System.out.println("I/O Error" + e.getMessage());
        }
    }

    private void printItems() {
      try{
          
            PrintWriter out = new PrintWriter("items.txt");
            
            out.println("\n\n ENUM");
            out.printf("%n%-20s%10s%10s", "Items", "Description", "                Price");
            out.printf("%n%-20s%10s%10s", "-----------", "-----------", "          -----------");
       
            for(InventoryItem.Item item: InventoryItem.Item.values()){
                out.printf("%n%-20s%10s%10s", item.getName()
                                            , item.getDescription()
                                            , item.getPrice());                                           
                        }
            out.close();
            
        }catch(IOException e){
            System.out.println("I/O Error" + e.getMessage());
        } 
    }
    
}
