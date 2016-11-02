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
public class GameMenuView {

    private String menu;
    
    public void displayGameMenuView() {
        
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

    public GameMenuView() {
        this.menu = "\n"
                + "\n---------"
                + "\nGAME MENU"
                + "\n---------"  
                + "\nV = View map"
                + "\nM = Move"
                + "\nC = investigate clues"
                + "\nA = Action menu"
                + "\nI = Inventory"
                + "\nP = Progress"
                + "\nH = Help Menu"
                + "\nS = Save Game"
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
            case "V": //view Map
                this.mapView();
                break;
            case "A": //action menu
                this.displayActionMenu();
                break;
            case "M": //move
                this.moveMenu();
                break;
            case "C": //investigate clues
                this.investigateClues();
                break;
            case "I": //inventory
                this.displayInventoryList();
                break;
            case "P": //Progress
                this.progress();
                break;
            case "H": //Help menu
                this.displayHelpMenu();
                break;
            case "S": //Save
                this.saveGame();
                break;
            default:
                System.out.println("\n***Invalid selection, please enter a menu option***");
                break;
        }

        return false;

    }

    private void mapView() {
        System.out.println("\n***mapView called");
    }

    private void moveMenu() {
        System.out.println("\n***moveMenu called");
    }

    private void displayActionMenu() {
        // Create ActionMenuView object
        ActionMenuView actionMenuView = new ActionMenuView();
                
        //display the action menu
        actionMenuView.displayActionMenuView();  
    }

    private void investigateClues() {
        System.out.println("\n***investigate clues called");
    }

    private void displayInventoryList() {
        System.out.println("\n***displayInventoryList called");
    }

    private void progress() {
        System.out.println("\n***progress called");
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called***");  
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        //display the help menu
        helpMenuView.displayHelpMenuView();  
    }
    
}
