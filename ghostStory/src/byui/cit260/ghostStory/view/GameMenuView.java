/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.view;

import byui.cit260.ghostStory.model.Game;
import byui.cit260.ghostStory.model.Item;
import byui.cit260.ghostStory.model.Map;
import ghoststory.GhostStory;
import java.util.Scanner;

/**
 *
 * @author carsonbott
 */
public class GameMenuView extends View {


    public GameMenuView() {
        super("\n"
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
                + "\nQ = Quit back to MAIN MENU");
    }


    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "V": //view Map
                this.displayMap();
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

    private void displayMap() {
        Map map = GhostStory.getCurrentGame().getMap();
        
       for(int row = 0; row < Map.ROW; row++) {
            for(int column = 0; column < Map.COLUMN; column++) {
                char locationType = map.getLocationAt(row, column).getLocationType().toString().charAt(0);
                System.out.print(locationType + " ");
            }
            System.out.println("|");
        }
    }

    private void moveMenu() {
        System.out.println("\n***moveMenu called");
    }

    private void displayActionMenu() {
        // Create ActionMenuView object
        ActionMenuView actionMenuView = new ActionMenuView();
                
        //display the action menu
        actionMenuView.display();  
    }

    private void investigateClues() {
        System.out.println("\n***investigate clues called");
    }

    private void displayInventoryList() {
        StringBuilder line;
        
        Game game = GhostStory.getCurrentGame();
        Item[] inventory = game.getInventory();
        
        System.out.println("\nINVENTORY"
                + "==========");
        line = new StringBuilder("                               ");
        line.insert(0, "NAME");
        line.insert(20, "AMMOUNT");
        line.insert(40, "DESCRIPTION");
        System.out.println(line.toString());
        
        // for each item
        for (Item item : inventory) {
            line = new StringBuilder("                             ");
            line.insert(0, item.getName());
            line.insert(23, item.getAmmount());
            line.insert(43, item.getDescription());
            
            //DISPLAY the line
            System.out.println(line.toString());
        }
        
        
        
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
        helpMenuView.display();  
    }
    
}
