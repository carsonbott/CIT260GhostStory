/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.view;

import byui.cit260.ghostStory.control.GameControl;
import byui.cit260.ghostStory.model.Game;
import byui.cit260.ghostStory.model.Item;
import byui.cit260.ghostStory.model.Map;
import ghoststory.GhostStory;
import java.io.PrintWriter;
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
            case "IO": //output
                this.InventoryOutput();
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
                this.console.println("\n***Invalid selection, please enter a menu option***");
                break;
        }

        return false;

    }

    private void displayMap() {
        Map map = GhostStory.getCurrentGame().getMap();
        
       for(int row = 0; row < Map.ROW; row++) {
            for(int column = 0; column < Map.COLUMN; column++) {
                char locationType = map.getLocationAt(row, column).getLocationType().toString().charAt(0);
                this.console.print(locationType + " ");
            }
            this.console.println("|");
        }
    }

    private void moveMenu() {
        this.console.println("\n***moveMenu called");
    }

    private void displayActionMenu() {
        // Create ActionMenuView object
        ActionMenuView actionMenuView = new ActionMenuView();
                
        //display the action menu
        actionMenuView.display();  
    }

    private void investigateClues() {
        this.console.println("\n***investigate clues called");
    }

    private void displayInventoryList() {
        StringBuilder line;
        
        Game game = GhostStory.getCurrentGame();
        Item[] inventory = game.getInventory();
        
        this.console.println("\nINVENTORY"
                + "======================");
        line = new StringBuilder("                                                              ");
        line.insert(0, "NAME");
        line.insert(10, "AMMOUNT");
        line.insert(20, "DESCRIPTION");
        this.console.println(line.toString());
        
        // for each item
        for (Item item : inventory) {
            line = new StringBuilder("                                                                 ");
            line.insert(0, item.getName());
            line.insert(13, item.getAmmount());
            line.insert(23, item.getDescription());
            
            //DISPLAY the line
            this.console.println(line.toString());
        }
        
        
        
    }

    private void progress() {
        this.console.println("\n***progress called");
    }
    
    private void saveGame() {
        //get name of the file to save game in
        this.console.println("\n\nPlease enter the file path for where you want the game to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the file
            GameControl.saveGame(GhostStory.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }  
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        //display the help menu
        helpMenuView.display();  
    }

    private void InventoryOutput() {
        try {
            String filePath = "inventory.txt";
            PrintWriter output = new PrintWriter(filePath);
            
            StringBuilder line;
        
        Game game = GhostStory.getCurrentGame();
        Item[] inventory = game.getInventory();
        
        output.println("\nINVENTORY"
                + "======================");
        line = new StringBuilder("                                                              ");
        line.insert(0, "NAME");
        line.insert(10, "AMMOUNT");
        line.insert(20, "DESCRIPTION");
        output.println(line.toString());
        
        // for each item
        for (Item item : inventory) {
            line = new StringBuilder("                                                                 ");
            line.insert(0, item.getName());
            line.insert(13, item.getAmmount());
            line.insert(23, item.getDescription());
            
            //DISPLAY the line
            output.println(line.toString());
        }
            
        } catch (Exception e) {
            ErrorView.display("GameMenuView", displayMessage);
        }
    }
    
}
