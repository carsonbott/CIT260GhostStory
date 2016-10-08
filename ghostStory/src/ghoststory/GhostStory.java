/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghoststory;

import byui.cit260.ghostStory.model.Player;

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
    }
    
}
