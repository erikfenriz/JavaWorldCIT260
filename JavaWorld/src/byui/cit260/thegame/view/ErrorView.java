/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

import java.io.PrintWriter;

import javaworld.JavaWorld;

/**
 *
 * @author user
 */
public class ErrorView {
    
    private static PrintWriter errorFile =  JavaWorld.getOutFile();
    private static PrintWriter logFile =  JavaWorld.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
                "\n--- ERROR -----------------------------------------------"
                + "\n" + errorMessage
                + "\n------------------------");
    }
}
