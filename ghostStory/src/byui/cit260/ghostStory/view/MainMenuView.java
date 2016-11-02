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
class MainMenuView {
    private String menu;
    
    public void displayMainMenuView() {
        
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

    public MainMenuView() {
        this.menu = "\n"
                + "\n---------"
                + "\nMAIN MENU"
                + "\n---------"  
                + "\nN = New Game"
                + "\nL = Load a saved Game"
                + "\nS = Save game"
                + "\nH = Help menu"
                + "\nQ = Quit";
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
            case "N": //new game
                this.startNewGame();
                break;
            case "L": //Load
                this.startExistingGame();
                break;
            case "S": //Save
                this.saveGame();
                break;
            case "H": //Help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n***Invalid selection, please enter a menu option***");
                break;
        }

        return false;

    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(GhostStory.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called***");    
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


