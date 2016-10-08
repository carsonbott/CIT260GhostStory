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

/**
 *
 * @author carsonbott
 */
public class GhostStory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("PlayerOne McPlayerOneFace");
        playerOne.setBestTime(4.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        Ghost ghostOne = new Ghost();
        
        ghostOne.setName("Ghosty McGhostFace");
        ghostOne.setDescription("He is as dead as dead can be.");
        ghostOne.setCoordinates("(4,6)");
        
        String ghostInfo = ghostOne.toString();
        System.out.println(ghostInfo);
        
        
        Item itemOne = new Item();
        
        itemOne.setName("Key");
        itemOne.setDescription("An old rusty skeleton key.");
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.00);
        gameOne.setCasesSolved("1/13");
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(13);
        mapOne.setColumnCount(15);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        
        Location locationOne = new Location();
        
        locationOne.setRow(1);
        locationOne.setColumn(4);
        locationOne.setVisited("yes");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        Door doorOne = new Door();
        
        doorOne.setLocked("yes");
        
        String doorInfo = doorOne.toString();
        System.out.println(doorInfo);
        
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("The room is dark, but smells slightly of dreams...");
        sceneOne.setClue("One the table is a CLUE");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
    }
    
}
