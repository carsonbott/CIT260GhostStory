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
class ActionMenuView extends View {


    public ActionMenuView() {
        super("\n"
                + "\n-----------"
                + "\nACTION MENU"
                + "\n-----------"  
                + "\nO = Open an unlocked door"
                + "\nT = Talk to someone next to you"
                + "\nP = Pick up an Item"
                + "\nA = interAct with the environment"
                + "\nH = Help Menu"
                + "\nQ = Quit back to GAME MENU");
    }


    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
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
                this.console.println("\n***Invalid selection, please enter a menu option***");
                break;
        }

        return false;

    }

    private void openDoor() {
        this.console.println("\n***openDoor called***");
    }

    private void talk() {
        this.console.println("\n***talk called***");
    }

    private void pickUpItem() {
        this.console.println("\n***pickUpItem called***");
    }

    private void interact() {
        this.console.println("\n***interact called");
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        //display the help menu
        helpMenuView.display();  
    }
    
}
