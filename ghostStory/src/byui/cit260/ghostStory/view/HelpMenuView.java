/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.view;

import byui.cit260.ghostStory.control.GameControl;
import ghoststory.GhostStory;
import java.util.Scanner;

/**
 *
 * @author carsonbott
 */
public class HelpMenuView {

    private String menu;
    
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for ang get PI's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
                    
        } while (!done);
    }

    public HelpMenuView() {
        this.menu = "\n"
                + "\n---------"
                + "\nHELP MENU"
                + "\n---------"  
                + "\nG = what is the Goal of the game"
                + "\nM = how to Move"
                + "\nC = how to investigate clues"
                + "\nT = how to Talk to ghosts"
                + "\nL = map Legend"
                + "\nQ = Quit back to MAIN MENU";
    }

    private String getMenuOption() {
    
        Scanner keyboard = new Scanner(System.in); // get keyboard imput
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            
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

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G": //goal of the game
                this.gameInfo();
                break;
            case "L": //map legend
                this.mapLegend();
                break;
            case "M": //how to move
                this.moveInfo();
                break;
            case "C": //how to investigate clues
                this.clueInfo();
                break;
            case "T": //how to talk
                this.talkInfo();
                break;
            default:
                System.out.println("\n***Invalid selection, please enter a menu option***");
                break;
        }

        return false;

    }

    private void gameInfo() {
        System.out.println("\n***GameInfo called");
    }

    private void mapLegend() {
        System.out.println("\n***mapLegend called");
    }

    private void moveInfo() {
        System.out.println("\n***moveInfo called");
    }

    private void clueInfo() {
        System.out.println("\n***clueInfo called");
    }

    private void talkInfo() {
        System.out.println("\n***TalkInfo called");
    }


    
}
