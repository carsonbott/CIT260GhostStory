/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.control;

import byui.cit260.ghostStory.control.MapControl.SceneType;
import byui.cit260.ghostStory.exceptions.GameControlException;
import byui.cit260.ghostStory.model.Game;
import byui.cit260.ghostStory.model.Item;
import byui.cit260.ghostStory.model.Location;
import byui.cit260.ghostStory.model.Map;
import byui.cit260.ghostStory.model.Player;
import byui.cit260.ghostStory.model.Scene;
import ghoststory.GhostStory;

/**
 *
 * @author carsonbott
 */
public class GameControl {


    
    public static Player createPlayer(String name) throws GameControlException {
        
        if (name == null) {
            throw new GameControlException("You need to give the PI a name, yo!");
        }
        
        Player player = new Player();
        player.setName(name);
        
        GhostStory.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        GhostStory.setCurrentGame(game); // save in GhostStory
        
        game.setPlayer(player); // save player in game
        
        
        // create inventory and save in game
        Item[] inventory = GameControl.createInventory();
        game.setInventory(inventory);
        
        // create scenes and save in game
        Scene[] scenes = GameControl.createScenes();
        game.setScenes(scenes);
        
        Map map = new Map(); // create and intialize new map
        map.initilizeMap();
        
        game.setMap(map);
        //game.setMap(map); // save map in game
        
        // move everyone to their starting positions on the map
       // MapControl.moveToStartingLocation(map);
        
    }

    private static Item[] createInventory() {
        
        //created array (list) of inventory items
        Item[] inventory = new Item[3];
        
        Item key = new Item();
        key.setName("Key");
        key.setDescription("A old rusty skeleton key");
        key.setAmmount(0);
        inventory[ItemEnum.key.ordinal()] = key;
        
        Item sock = new Item();
        sock.setName("Sock");
        sock.setDescription("Old and crusty, this sock has not been worn (or washed) for years...");
        sock.setAmmount(0);
        inventory[ItemEnum.sock.ordinal()] = sock;
        
        Item book = new Item();
        book.setName("Book");
        book.setDescription("A dusty leather bound journal");
        book.setAmmount(0);
        inventory[ItemEnum.book.ordinal()] = book;
        
        return inventory;
        

    }

   /* static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getMatrix();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.room1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.room2.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.room3.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.end.ordinal()]);
        
    } */
    
        public enum ItemEnum {
        key,
        sock,
        book;
    }

    private static Scene[] createScenes() {
    System.out.println("**** called createScenes() in GameControl ****");
        return null;    
    }
    
  
}
