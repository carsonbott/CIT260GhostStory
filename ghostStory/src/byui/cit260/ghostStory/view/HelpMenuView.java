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
public class HelpMenuView extends View {


    public HelpMenuView() {
        super("\n"
                + "\n---------"
                + "\nHELP MENU"
                + "\n---------"  
                + "\nG = what is the Goal of the game"
                + "\nM = how to Move"
                + "\nC = how to investigate clues"
                + "\nT = how to Talk to ghosts"
                + "\nL = map Legend"
                + "\nQ = Quit back to the last menu you were at");
    }

    

    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
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
                this.console.println("\n***Invalid selection, please enter a menu option***");
                break;
        }

        return false;

    }

    private void gameInfo() {
        this.console.println("\n***GameInfo called");
    }

    private void mapLegend() {
        this.console.println("\n***mapLegend called");
    }

    private void moveInfo() {
        this.console.println("\n***moveInfo called");
    }

    private void clueInfo() {
        this.console.println("\n***clueInfo called");
    }

    private void talkInfo() {
        this.console.println("\n***TalkInfo called");
    }


    
}
