/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghoststory;

import byui.cit260.ghostStory.model.Door;
import byui.cit260.ghostStory.model.Game;
import byui.cit260.ghostStory.model.Ghost;
import byui.cit260.ghostStory.model.Item;
import byui.cit260.ghostStory.model.Location;
import byui.cit260.ghostStory.model.Map;
import byui.cit260.ghostStory.model.Player;
import byui.cit260.ghostStory.model.Scene;
import byui.cit260.ghostStory.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carsonbott
 */
public class GhostStory {
            
        private static Game currentGame = null;
        private static Player player = null;
        
        private static PrintWriter outFile = null;
        private static BufferedReader inFile = null;
        
        private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        GhostStory.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        GhostStory.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        GhostStory.inFile = inFile;
    }


    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        try {
            
            // open character stream files for end user input and output
            GhostStory.inFile =
                    new BufferedReader(new InputStreamReader (System.in));
            
            GhostStory.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            GhostStory.logFile = new PrintWriter(filePath);
            
            // create StartProgramViewOrig and display the start program view
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;
     
        } catch (Throwable e) {
            
            System.out.println("Exception: " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
            
            e.printStackTrace();;
        } 
        
        finally {
            
            try {
                if (GhostStory.inFile != null)
                    GhostStory.inFile.close();
                
                if (GhostStory.outFile != null)
                    GhostStory.outFile.close();
                
                if (GhostStory.logFile != null)
                    GhostStory.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
        
        // create StartProgramViewOrig and display the start program view
       /* StartProgramView startProgramView = new StartProgramView();
        try {
            // create startProgramView and start proram
            startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            this.console.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        } */
        

        
        
       /* Player playerOne = new Player();
        
        playerOne.setName("PlayerOne McPlayerOneFace");
        playerOne.setBestTime(4.00);
        
        String playerInfo = playerOne.toString();
        this.console.println(playerInfo);
        
        
        Ghost ghostOne = new Ghost();
        
        ghostOne.setName("Ghosty McGhostFace");
        ghostOne.setDescription("He is as dead as dead can be.");
        ghostOne.setCoordinates("(4,6)");
        
        String ghostInfo = ghostOne.toString();
        this.console.println(ghostInfo);
        
        
        Item itemOne = new Item();
        
        itemOne.setName("Key");
        itemOne.setDescription("An old rusty skeleton key.");
        
        String itemInfo = itemOne.toString();
        this.console.println(itemInfo);
        
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.00);
        gameOne.setCasesSolved("1/13");
        
        String gameInfo = gameOne.toString();
        this.console.println(gameInfo);
        
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(13);
        mapOne.setColumnCount(15);
        
        String mapInfo = mapOne.toString();
        this.console.println(mapInfo);
        
        
        Location locationOne = new Location();
        
        locationOne.setRow(1);
        locationOne.setColumn(4);
        locationOne.setVisited("yes");
        
        String locationInfo = locationOne.toString();
        this.console.println(locationInfo);
        
        
        Door doorOne = new Door();
        
        doorOne.setLocked("yes");
        
        String doorInfo = doorOne.toString();
        this.console.println(doorInfo);
        
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("The room is dark, but smells slightly of dreams...");
        sceneOne.setClue("One the table is a CLUE");
        
        String sceneInfo = sceneOne.toString();
        this.console.println(sceneInfo); */
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        GhostStory.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        GhostStory.player = player;
    }
    
    
}
