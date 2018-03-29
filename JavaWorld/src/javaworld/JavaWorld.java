/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaworld;

import byui.cit260.thegame.view.StartProgramView;
import byui.cit260.thegame.model.Player;
import byui.cit260.thegame.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Erik Rybalkin & Rayshorn Richardson
 */
public class JavaWorld {
    private static Game currentGame = null;
    private static Player currentPlayer = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        JavaWorld.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        JavaWorld.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        JavaWorld.logFile = logFile;
    }


      public static void main(String[] args) {
          
        try{
            JavaWorld.inFile = new BufferedReader(new InputStreamReader(System.in));
            JavaWorld.outFile = new PrintWriter(System.out, true);
            JavaWorld.logFile = new PrintWriter("logFile.txt");
            
            StartProgramView view = new StartProgramView();
            view.display();
        }
        catch (Throwable er) {
            System.out.println("Exception: "+ er.toString() +
                    "\nCause: " + er.getCause() +
                    "\nMessage: " + er.getMessage());
            er.printStackTrace();
        }finally{
            try {
                if(JavaWorld.inFile != null)
                JavaWorld.inFile.close();
                if(JavaWorld.outFile != null)
                JavaWorld.outFile.close();
                if(JavaWorld.logFile != null)
                    JavaWorld.logFile.close();
            } catch (IOException ex) {
            System.out.println("The operation wasn't successfull");            }
            return;
        }
    }

    public static Game getCurrentGame() {
    return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
    JavaWorld.currentGame = currentGame;
    }
    
    public static Player getCurrentPlayer() {
    return currentPlayer;
    }
    
    public static void setCurrentPlayer(Player currentPlayer) {
    JavaWorld.currentPlayer = currentPlayer;
    }
}
