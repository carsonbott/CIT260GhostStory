/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.view;

import java.util.Scanner;

/**
 *
 * @author carsonbott
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for ang get PI's name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit game
            
            // do the requested action and display the next view
            done = this.doAction(value);
                    
        } while (!done);
    }
    
    @Override
    public String getInput() {
    
        Scanner keyboard = new Scanner(System.in); // get keyboard imput
        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and traling blanks (spaces)
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nPlease enter a menu option");
                continue;
            }
            break; // end loop
        }
        return value; // return the value entered
    }
    
}
