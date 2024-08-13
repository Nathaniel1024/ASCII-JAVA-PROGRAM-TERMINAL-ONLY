/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.java.program.terminal.only;

/**
 *
 * @author Client
 */
import java.util.Scanner; //import Scanner for user input
public class ASCIIJavaProgramTerminalOnly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);     // Create a Scanner object to read user input
       System.out.print("Enter a character: "); // Prompt the user to enter a character
       char input = in.next().charAt(0);        // Read the first character of the user's input
       int asciiValue = (int) input;            // Convert the character to its ASCII value
       System.out.println("The ASCII value of '" + input + "' is: " + asciiValue); //Outputing the ASCII Value
    }
    
}
