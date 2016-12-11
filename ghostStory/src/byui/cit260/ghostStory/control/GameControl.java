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
import byui.cit260.ghostStory.view.ErrorView;
import ghoststory.GhostStory;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
        Item[] inventory = InventoryControl.createInventory();
        game.setInventory(inventory);
        
        // create scenes and save in game
        Scene[] scenes = MapControl.createScenes();
        game.setScenes(scenes);
        
        Map map = new Map(); // create and intialize new map
        map.initilizeMap();
        
        game.setMap(map);
        //game.setMap(map); // save map in game
        
        // move everyone to their starting positions on the map
       // MapControl.moveToStartingLocation(map);
        
    

    
        

    }
    
    public static void saveGame(Game currentGame, String filePath)
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); // write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) {
        Game game = null;
      
      try {
          FileInputStream fips = new FileInputStream(filePath);
          ObjectInputStream ols = new ObjectInputStream(fips);
          
          game = (Game) ols.readObject();
          
          //GhostStory.setCurrentGame(currentGame);
         // GhostStory.setPlayer(game.getPlayer());
    } catch (Exception e) {
        ErrorView.display("GameControl", e.getMessage());
    }
      // close the output file
      GhostStory.setCurrentGame(game); // save in GhostStory
      
    }
    

  /*  public static void saveGame(Game currentGame, String filePath) {
        Game game = null;
      
      try {
          FileInputStream fis = new FileImputStream(filePath);
          ObjectInputStream ols = new ObjectInputStream(fips);
          
          game = (Game) ols.readObject();
          
          GhostStory.setCurrentGame(currentGame);
          GhostStory.setPlayer(game.getPlayer());
    } catch (Exception e) {
        ErrorView.display("GameControl", e.getMessage());
    } /*

   /* static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getMatrix();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.room1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.room2.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.room3.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.end.ordinal()]);
        
    } */
    


   // private static Scene[] createScenes() {
   // this.console.println("**** called createScenes() in GameControl ****");
   //     return null;    
   // }
    
  
  
}
