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
public class MainMenuView extends View {
   
    public MainMenuView() {
        super("\n"
                + "\n---------"
                + "\nMAIN MENU"
                + "\n---------"  
                + "\nN = New Game"
                + "\nL = Load a saved Game"
                + "\nS = Save game"
                + "\nH = Help menu"
                + "\nQ = Quit");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
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
        gameMenu.display();
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
        helpMenuView.display();  
    }
    
}


