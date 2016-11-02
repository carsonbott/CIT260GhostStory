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
class ActionMenuView {

    private String menu;
    
    public void displayActionMenuView() {
        
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

    public ActionMenuView() {
        this.menu = "\n"
                + "\n-----------"
                + "\nACTION MENU"
                + "\n-----------"  
                + "\nO = Open an unlocked door"
                + "\nT = Talk to someone next to you"
                + "\nP = Pick up an Item"
                + "\nA = interAct with the environment"
                + "\nH = Help Menu"
                + "\nQ = Quit back to GAME MENU";
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
            case "O": //open an unlocked door
                this.openDoor();
                break;
            case "T": //talk to someone next to you
                this.talk();
                break;
            case "P": //Pick up an item
                this.pickUpItem();
                break;
            case "A": //interAct with the environement
                this.interact();
                break;
            case "H": //help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n***Invalid selection, please enter a menu option***");
                break;
        }

        return false;

    }

    private void openDoor() {
        System.out.println("\n***openDoor called***");
    }

    private void talk() {
        System.out.println("\n***talk called***");
    }

    private void pickUpItem() {
        System.out.println("\n***pickUpItem called***");
    }

    private void interact() {
        System.out.println("\n***interact called");
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        //display the help menu
        helpMenuView.displayHelpMenuView();  
    }
    
}
