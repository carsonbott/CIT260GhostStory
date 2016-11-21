/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ghostStory.control;

import byui.cit260.ghostStory.model.Door;
import byui.cit260.ghostStory.model.Item;
import byui.cit260.ghostStory.model.Map;
import byui.cit260.ghostStory.model.Scene;

/**
 *
 * @author carsonbott
 */
public class MapControl {

   /* static Map createMap() {
        
        //create map
        Map map = new Map(20,20);
        
        // create the scenes
        Scene[] scenes = createScenes();
        
        // Assign scenes to locations
        //GameControl.assignScenesToLocations(map, scenes);        
        
        return map;
    } */
    
    /*
    private double doorLocation = 4;
    private double playerLocation = 4;
    
    public String openDoor(Door doorOne, double doorLocation, double playerLocation, Item itemOne){
    
        if (doorLocation != playerLocation) { // the player isn't close enough to unlock the door
            return "door remains locked";
        }
        
       // if (itemOne != "key") { // the player doesn't have a key
           // return "door remains locked";
       // }  I am not sure how to do this puppy.
    
       return "The door opens";
*/

    static void moveToStartingLocation(Map map) {
    System.out.println("**** called moveToStartingLocation() in MapControl ****");
          
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene start = new Scene();
        start.setDescription("Starting Scene....");
        start.setClue("Starting Scene Clue...?");
        scenes[SceneType.start.ordinal()] = start;
        
        Scene room1 = new Scene();
        room1.setDescription("Room 1 Scene....");
        room1.setClue("Room 1 Scene Clue...?");
        scenes[SceneType.room1.ordinal()] = room1;
        
        Scene room2 = new Scene();
        room2.setDescription("Room 2 Scene....");
        room2.setClue("Room 2 Scene Clue...?");
        scenes[SceneType.room2.ordinal()] = room2;
        
        Scene room3 = new Scene();
        room3.setDescription("Room 3 Scene....");
        room3.setClue("Room 3 Scene Clue...?");
        scenes[SceneType.room3.ordinal()] = room3;
        
        Scene end = new Scene();
        end.setDescription("End Scene....");
        end.setClue("End Scene Clue...?");
        scenes[SceneType.end.ordinal()] = end;
        
        
        return scenes;
        
    }
    
    public enum SceneType {
        start,
        room1,
        room2,
        room3,
        end;
    }
}
